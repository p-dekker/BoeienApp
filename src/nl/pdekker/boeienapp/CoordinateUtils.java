package nl.pdekker.boeienapp;

import com.gluonhq.maps.MapPoint;

public class CoordinateUtils {

	private CoordinateUtils() {
		// left empty
	}

	/**
	 * @param one
	 *            of the following formats± GG.MM.SS.ss (Degrees, minute, seconds
	 *            and hunderds of second GG.MM.mmmm (Degrees. minutes);
	 * 
	 * IMPORTANT this will only work on western hemisphere...
	 * @return double value.
	 */
	public static double parse(String coord) {
		final String[] gms = coord.split("\\.");

		if (gms.length < 3 || gms.length > 4) {
			throw new IllegalArgumentException(coord + "can't be parsed as coordinate");
		}
		final double gr = Double.valueOf(gms[0]);
		if (gms.length == 4) {
			final double m = Double.valueOf(gms[1]);
			final double s = Double.parseDouble(gms[3]) / 100.0 + Integer.valueOf(gms[2]);
			return gr + (m / 60.0) + (s / 3600);
		} else {
			final double m = Double.valueOf(gms[1] + "." + gms[2]);
			return gr + (m / 60.0);
		}
	}
	
	public static MapPoint parse(String lat, String lon) {
		return new MapPoint(parse(lat), parse(lon));
	}
	
}
