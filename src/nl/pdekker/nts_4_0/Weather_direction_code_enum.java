/**
 * Weather_direction_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Weather_direction_code_enum implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -371329321046786053L;
	private java.lang.String _value_;
	private static java.util.HashMap<String,Weather_direction_code_enum> _table_ = new java.util.HashMap();

	// Constructor
	protected Weather_direction_code_enum(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _N = "N";
	public static final java.lang.String _NE = "NE";
	public static final java.lang.String _E = "E";
	public static final java.lang.String _SE = "SE";
	public static final java.lang.String _S = "S";
	public static final java.lang.String _SW = "SW";
	public static final java.lang.String _W = "W";
	public static final java.lang.String _NW = "NW";
	public static final java.lang.String _WRB = "WRB";
	public static final Weather_direction_code_enum N = new Weather_direction_code_enum(_N);
	public static final Weather_direction_code_enum NE = new Weather_direction_code_enum(_NE);
	public static final Weather_direction_code_enum E = new Weather_direction_code_enum(_E);
	public static final Weather_direction_code_enum SE = new Weather_direction_code_enum(_SE);
	public static final Weather_direction_code_enum S = new Weather_direction_code_enum(_S);
	public static final Weather_direction_code_enum SW = new Weather_direction_code_enum(_SW);
	public static final Weather_direction_code_enum W = new Weather_direction_code_enum(_W);
	public static final Weather_direction_code_enum NW = new Weather_direction_code_enum(_NW);
	public static final Weather_direction_code_enum WRB = new Weather_direction_code_enum(_WRB);

	public java.lang.String getValue() {
		return _value_;
	}

	public static Weather_direction_code_enum fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		Weather_direction_code_enum enumeration = (Weather_direction_code_enum) _table_.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static Weather_direction_code_enum fromString(java.lang.String value)
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
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumSerializer(_javaType, _xmlType);
	}

	public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumDeserializer(_javaType, _xmlType);
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Weather_direction_code_enum.class);

	static {
		typeDesc.setXmlType(
				new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_direction_code_enum"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
