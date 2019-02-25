/*
 * Copyright (c) 2016, Gluon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL GLUON BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package nl.pdekker.boeienapp;

import java.io.File;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.gluonhq.charm.down.Platform;
import com.gluonhq.charm.down.ServiceFactory;
import com.gluonhq.charm.down.Services;
import com.gluonhq.charm.down.plugins.StorageService;
import com.gluonhq.maps.MapView;
import com.sun.javafx.PlatformUtil;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxListCell;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import nl.pdekker.boeienapp.boeienbestand.BoeienBestanden;
import nl.pdekker.boeienapp.boeienbestand.BoeienLayer;
import nl.pdekker.boeienapp.boeienbestand.RWSBestand;
import nl.pdekker.boeienapp.boeienbestand.Vaarwegen;
import nl.pdekker.boeienapp.kaarten.KaartenBestand;
import nl.pdekker.boeienapp.kaarten.KaartenLayer;
import nl.pdekker.boeienapp.ntmsg.NtMsgLayer_2_0_4_0;

/**
 *
 * Demo class showing a simple map app
 */
@SuppressWarnings("restriction")
public class BoeienMap extends Application {

	private static final Logger LOGGER = Logger.getLogger(BoeienMap.class.getName());
	private static final Proxy PROXY = createProxy();

	static {
		try {
			LogManager.getLogManager().readConfiguration(BoeienMap.class.getResourceAsStream("/logging.properties"));
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Error reading logging properties file", e);
		}
	}

	@Override
	public void start(Stage stage) throws Exception {

		KaartenBestand kaarten = new KaartenBestand();
		BoeienBestanden files = new BoeienBestanden(PROXY);

		MapView view = new MapView();
		
		Vaarwegen vaarwegen = new Vaarwegen();
		BoeienLayer layerDrijvend = BoeienLayer.createInstance(RWSBestand.DRIJVEND, files.getUrl(RWSBestand.DRIJVEND), vaarwegen);
		BoeienLayer layerVast = BoeienLayer.createInstance(RWSBestand.VAST, files.getUrl(RWSBestand.VAST),vaarwegen);

		KaartenLayer layerKaart = KaartenLayer.createInstance(kaarten.asList());
		view.addLayer(layerKaart);
		
		NtMsgLayer_2_0_4_0 layerMsg = NtMsgLayer_2_0_4_0
				.createInstance(new URL("https://www.vaarweginformatie.nl/fdd/nts40"));
		// NtMsgLayer_2_0_4_0 layerMsgBe = NtMsgLayer_2_0_4_0.createInstance(new
		// URL("https://nts.flaris.be/services/NtsMessageService_v2_0_4_0.svc"));
		// NtMsgLayer_2_0_4_0 layerMsgAT = NtMsgLayer_2_0_4_0.createInstance(new
		// URL("http://nts.doris.bmvit.gv.at/NtSMessageService/getMessages"));
		// NtMsgLayer_1_0_3_0 layerMsgDE = NtMsgLayer_1_0_3_0.createInstance(new
		// URL("http://nts.elwis.de/server/MessageServer.php"));

		view.addLayer(layerDrijvend);
		view.addLayer(layerVast);
		view.addLayer(layerMsg);
		// view.addLayer(layerMsgBe);
		// view.addLayer(layerMsgAT);
		// view.addLayer(layerMsgDE);

		view.setZoom(8);
		Scene scene;
		if (Platform.isDesktop()) {
			BorderPane bp = new BorderPane();
			bp.setCenter(view);
			bp.setLeft(createSettingsView(Arrays.asList(layerDrijvend, layerVast), kaarten, vaarwegen));
			scene = new Scene(bp, 800, 700);
			stage.setTitle("Boeien In Nederland");
		} else {
			BorderPane bp = new BorderPane();
			bp.setCenter(view);
			final Label label = new Label("Boeien In Nederland");
			label.setAlignment(Pos.CENTER);
			label.setMaxWidth(Double.MAX_VALUE);
			label.setStyle("-fx-background-color: dimgrey; -fx-text-fill: white;");
			bp.setTop(label);
			Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
			scene = new Scene(bp, bounds.getWidth(), bounds.getHeight());
		}
		stage.setScene(scene);
		stage.show();
		view.flyTo(1., layerDrijvend.getCenter(), 2.);
	}

	private Pane createSettingsView(List<BoeienLayer> boeienLayers, KaartenBestand kaarten, Vaarwegen vaarwegen) {
		final VBox vbox = new VBox();
		vbox.setPadding(new Insets(10));
		vbox.setSpacing(8);
		
		CheckBox boeienVanaf = new CheckBox("Boeien vanaf");
		vbox.getChildren().add(boeienVanaf);

		final DatePicker datePicker = new DatePicker();
		datePicker.setValue(LocalDate.now().minusMonths(1));
		boeienLayers.stream().forEach(l -> l.bind(datePicker, boeienVanaf));
		vbox.getChildren().add(datePicker);

		CheckBox kaartenSelect = new CheckBox("Kaarten");
		vbox.getChildren().add(kaartenSelect);
        TreeView<String> treeView = new TreeView<String>(kaarten.asTree());
        treeView.setCellFactory(CheckBoxTreeCell.forTreeView());
        treeView.setShowRoot(false);
        vbox.getChildren().add(treeView);
 
        CheckBox vaarwegenSelect = new CheckBox("Vaarwegen");
        vbox.getChildren().add(vaarwegenSelect);
        ListView<Vaarwegen.SelectableVaarweg> listView = new ListView<>();
        listView.getItems().addAll(0, vaarwegen.list);
        listView.setCellFactory(CheckBoxListCell.forListView( v -> v.selectedProperty()));
        vbox.getChildren().add(listView);
		return vbox;
	}

	private static Proxy createProxy() {
		return Proxy.NO_PROXY;
	}

	public static void main(String[] args) {

		if (PlatformUtil.isWindows() || PlatformUtil.isMac() || PlatformUtil.isUnix()) {
			System.setProperty("javafx.platform", "Desktop");
		}

		StorageService storageService = new StorageService() {
			@Override
			public Optional<File> getPrivateStorage() {
				return Optional.of(new File(System.getProperty("user.home")));
			}

			@Override
			public Optional<File> getPublicStorage(String subdirectory) {
				return getPrivateStorage();
			}

			@Override
			public boolean isExternalStorageWritable() {
				return getPrivateStorage().get().canWrite();
			}

			@Override
			public boolean isExternalStorageReadable() {
				return getPrivateStorage().get().canRead();
			}
		};

		ServiceFactory<StorageService> storageServiceFactory = new ServiceFactory<StorageService>() {

			@Override
			public Class<StorageService> getServiceType() {
				return StorageService.class;
			}

			@Override
			public Optional<StorageService> getInstance() {
				return Optional.of(storageService);
			}

		};
		// register service
		Services.registerServiceFactory(storageServiceFactory);
		launch(args);
	}
}
