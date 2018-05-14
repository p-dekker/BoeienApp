/**
 * Weather_category_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Weather_category_code_enum implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7091561017869531310L;
	private java.lang.String _value_;
	private static java.util.HashMap<String, Weather_category_code_enum>_table_ = new java.util.HashMap<>();

	// Constructor
	protected Weather_category_code_enum(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _value1 = "0";
	public static final java.lang.String _value2 = "1";
	public static final java.lang.String _value3 = "2";
	public static final java.lang.String _value4 = "3";
	public static final java.lang.String _value5 = "4";
	public static final java.lang.String _value6 = "5";
	public static final java.lang.String _value7 = "6";
	public static final java.lang.String _value8 = "7";
	public static final java.lang.String _value9 = "8";
	public static final java.lang.String _value10 = "9";
	public static final java.lang.String _value11 = "10";
	public static final java.lang.String _value12 = "11";
	public static final java.lang.String _value13 = "12";
	public static final java.lang.String _value14 = "13";
	public static final java.lang.String _value15 = "14";
	public static final java.lang.String _value16 = "15";
	public static final java.lang.String _value17 = "16";
	public static final java.lang.String _value18 = "17";
	public static final java.lang.String _value19 = "18";
	public static final java.lang.String _value20 = "19";
	public static final java.lang.String _value21 = "20";
	public static final java.lang.String _value22 = "21";
	public static final java.lang.String _value23 = "22";
	public static final Weather_category_code_enum value1 = new Weather_category_code_enum(_value1);
	public static final Weather_category_code_enum value2 = new Weather_category_code_enum(_value2);
	public static final Weather_category_code_enum value3 = new Weather_category_code_enum(_value3);
	public static final Weather_category_code_enum value4 = new Weather_category_code_enum(_value4);
	public static final Weather_category_code_enum value5 = new Weather_category_code_enum(_value5);
	public static final Weather_category_code_enum value6 = new Weather_category_code_enum(_value6);
	public static final Weather_category_code_enum value7 = new Weather_category_code_enum(_value7);
	public static final Weather_category_code_enum value8 = new Weather_category_code_enum(_value8);
	public static final Weather_category_code_enum value9 = new Weather_category_code_enum(_value9);
	public static final Weather_category_code_enum value10 = new Weather_category_code_enum(_value10);
	public static final Weather_category_code_enum value11 = new Weather_category_code_enum(_value11);
	public static final Weather_category_code_enum value12 = new Weather_category_code_enum(_value12);
	public static final Weather_category_code_enum value13 = new Weather_category_code_enum(_value13);
	public static final Weather_category_code_enum value14 = new Weather_category_code_enum(_value14);
	public static final Weather_category_code_enum value15 = new Weather_category_code_enum(_value15);
	public static final Weather_category_code_enum value16 = new Weather_category_code_enum(_value16);
	public static final Weather_category_code_enum value17 = new Weather_category_code_enum(_value17);
	public static final Weather_category_code_enum value18 = new Weather_category_code_enum(_value18);
	public static final Weather_category_code_enum value19 = new Weather_category_code_enum(_value19);
	public static final Weather_category_code_enum value20 = new Weather_category_code_enum(_value20);
	public static final Weather_category_code_enum value21 = new Weather_category_code_enum(_value21);
	public static final Weather_category_code_enum value22 = new Weather_category_code_enum(_value22);
	public static final Weather_category_code_enum value23 = new Weather_category_code_enum(_value23);

	public java.lang.String getValue() {
		return _value_;
	}

	public static Weather_category_code_enum fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		Weather_category_code_enum enumeration = (Weather_category_code_enum) _table_.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static Weather_category_code_enum fromString(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		return fromValue(value);
	}

	@Override
	public boolean equals(java.lang.Object obj) {
		return (obj == this);
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public java.lang.String toString() {
		return _value_;
	}

	public java.lang.Object readResolve() throws java.io.ObjectStreamException {
		return fromValue(_value_);
	}

	public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType,
			java.lang.Class<?> _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumSerializer(_javaType, _xmlType);
	}

	public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType,
			java.lang.Class<?> _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumDeserializer(_javaType, _xmlType);
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Weather_category_code_enum.class);

	static {
		typeDesc.setXmlType(
				new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_category_code_enum"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
