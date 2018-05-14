/**
 * NtS_message_service_soap_bindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts.ms_2_0_4_0;

import javax.xml.namespace.QName;

public class NtS_message_service_soap_bindingStub extends org.apache.axis.client.Stub
		implements nl.pdekker.nts.ms_2_0_4_0.NtS_message_service {
	private java.util.Vector<Object> cachedSerClasses = new java.util.Vector<>();
	private java.util.Vector<Object> cachedSerQNames = new java.util.Vector<>();
	private java.util.Vector<Object> cachedSerFactories = new java.util.Vector<>();
	private java.util.Vector<Object> cachedDeserFactories = new java.util.Vector<>();

	static org.apache.axis.description.OperationDesc[] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[1];
		_initOperationDesc1();
	}

	private static void _initOperationDesc1() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("get_messages");
		param = new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "get_messages_query"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", ">get_messages_query"),
				nl.pdekker.nts.ms_2_0_4_0.Get_messages_query.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", ">get_messages_result"));
		oper.setReturnClass(nl.pdekker.nts.ms_2_0_4_0.Get_messages_result.class);
		oper.setReturnQName(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "get_messages_result"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		_operations[0] = oper;

	}

	public NtS_message_service_soap_bindingStub() throws org.apache.axis.AxisFault {
		this(null);
	}

	public NtS_message_service_soap_bindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service)
			throws org.apache.axis.AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public NtS_message_service_soap_bindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		if (service == null) {
			super.service = new org.apache.axis.client.Service();
		} else {
			super.service = service;
		}
		((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
		Class<?> cls;
		QName qName;
		QName qName2;
		Class<?> beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		Class<?> beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		Class<?> enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		Class<?> enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", ">get_messages_query");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts.ms_2_0_4_0.Get_messages_query.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", ">get_messages_result");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts.ms_2_0_4_0.Get_messages_result.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "date_pair");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts.ms_2_0_4_0.Date_pair.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "error_code_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts.ms_2_0_4_0.Error_code_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "id_pair");
		cachedSerQNames.add(qName);
		cls = java.lang.String[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "isrs_code_type");
		qName2 = new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "id");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "message_type_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts.ms_2_0_4_0.Message_type_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "paging_request_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts.ms_2_0_4_0.Paging_request_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "paging_result_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts.ms_2_0_4_0.Paging_result_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", ">communication_type>label");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", ">communication_type>number");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", ">communication_type>remark");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", ">coordinate_type>lat");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", ">coordinate_type>long");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", ">ftm_type>contents");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", ">ftm_type>source");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", ">geo_object_type>fairway_name");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", ">geo_object_type>name");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", ">identification_type>district");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", ">identification_type>from");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", ">identification_type>originator");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", ">nts_number_type>number");
		cachedSerQNames.add(qName);
		cls = java.math.BigInteger.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", ">nts_number_type>organisation");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", ">nts_number_type>serial_number");
		cachedSerQNames.add(qName);
		cls = java.math.BigInteger.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", ">nts_number_type>year");
		cachedSerQNames.add(qName);
		cls = org.apache.axis.types.Year.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "barrage_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Barrage_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "communication_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Communication_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "communication_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Communication_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "coordinate_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Coordinate_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "country_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Country_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "difference_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Difference_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "direction_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Direction_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "fairway_section_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Fairway_section_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "fairway_section_werm_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Fairway_section_werm_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "ftm_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Ftm_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "geo_object_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Geo_object_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "ice_accessibility_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Ice_accessibility_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "ice_classification_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Ice_classification_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "ice_condition_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Ice_condition_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "ice_condition_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Ice_condition_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "ice_situation_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Ice_situation_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "icem_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Icem_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "identification_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Identification_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "indication_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Indication_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "internal_id_type");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "interval_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Interval_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "isrs_code_type");
		cachedSerQNames.add(qName);
		cls = java.lang.String.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
		cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory
				.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "language_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Language_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "limitation_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Limitation_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "limitation_period_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Limitation_period_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "limitation_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Limitation_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "measure_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Measure_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "measure_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Measure_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "nts_number_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Nts_number_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "object_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Object_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "position_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Position_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "reason_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Reason_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "reference_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Reference_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "regime_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Regime_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "reporting_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Reporting_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "RIS_Message_Type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.RIS_Message_Type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "subject_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Subject_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "target_group_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Target_group_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "target_group_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Target_group_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "type_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Type_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "unit_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Unit_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "validity_period_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Validity_period_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_category_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Weather_category_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_class_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Weather_class_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_direction_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Weather_direction_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_item_code_enum");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Weather_item_code_enum.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_item_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Weather_item_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_report_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Weather_report_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "werm_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Werm_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "wrm_type");
		cachedSerQNames.add(qName);
		cls = nl.pdekker.nts_4_0.Wrm_type.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

	}

	protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
		try {
			org.apache.axis.client.Call _call = super._createCall();
			if (super.maintainSessionSet) {
				_call.setMaintainSession(super.maintainSession);
			}
			if (super.cachedUsername != null) {
				_call.setUsername(super.cachedUsername);
			}
			if (super.cachedPassword != null) {
				_call.setPassword(super.cachedPassword);
			}
			if (super.cachedEndpoint != null) {
				_call.setTargetEndpointAddress(super.cachedEndpoint);
			}
			if (super.cachedTimeout != null) {
				_call.setTimeout(super.cachedTimeout);
			}
			if (super.cachedPortName != null) {
				_call.setPortName(super.cachedPortName);
			}
			java.util.Enumeration<?> keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				java.lang.String key = (java.lang.String) keys.nextElement();
				_call.setProperty(key, super.cachedProperties.get(key));
			}
			// All the type mapping information is registered
			// when the first call is made.
			// The type mapping information is actually registered in
			// the TypeMappingRegistry of the service, which
			// is the reason why registration is only needed for the first call.
			synchronized (this) {
				if (firstCall()) {
					// must set encoding style before registering serializers
					_call.setEncodingStyle(null);
					for (int i = 0; i < cachedSerFactories.size(); ++i) {
						java.lang.Class<?> cls = (java.lang.Class<?>) cachedSerClasses.get(i);
						javax.xml.namespace.QName qName = (javax.xml.namespace.QName) cachedSerQNames.get(i);
						java.lang.Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							java.lang.Class<?> sf = (java.lang.Class<?>) cachedSerFactories.get(i);
							java.lang.Class<?> df = (java.lang.Class<?>) cachedDeserFactories.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						} else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
							org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory) cachedSerFactories
									.get(i);
							org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory) cachedDeserFactories
									.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
					}
				}
			}
			return _call;
		} catch (java.lang.Throwable _t) {
			throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
		}
	}

	@Override
	public nl.pdekker.nts.ms_2_0_4_0.Get_messages_result get_messages(
			nl.pdekker.nts.ms_2_0_4_0.Get_messages_query parameters) throws java.rmi.RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("http://www.ris.eu/nts.ms/get_messages");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "get_messages"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] { parameters });

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (nl.pdekker.nts.ms_2_0_4_0.Get_messages_result) _resp;
				} catch (java.lang.Exception _exception) {
					return (nl.pdekker.nts.ms_2_0_4_0.Get_messages_result) org.apache.axis.utils.JavaUtils
							.convert(_resp, nl.pdekker.nts.ms_2_0_4_0.Get_messages_result.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

}
