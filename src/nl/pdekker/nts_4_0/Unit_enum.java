/**
 * Unit_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Unit_enum implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8503703324858584485L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected Unit_enum(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _value1 = "cm";
	public static final java.lang.String _value2 = "m³/s";
	public static final java.lang.String _value3 = "h";
	public static final java.lang.String _value4 = "km/h";
	public static final java.lang.String _value5 = "kW";
	public static final java.lang.String _value6 = "m/s";
	public static final java.lang.String _value7 = "mm/h";
	public static final java.lang.String _value8 = "°C";
	public static final Unit_enum value1 = new Unit_enum(_value1);
	public static final Unit_enum value2 = new Unit_enum(_value2);
	public static final Unit_enum value3 = new Unit_enum(_value3);
	public static final Unit_enum value4 = new Unit_enum(_value4);
	public static final Unit_enum value5 = new Unit_enum(_value5);
	public static final Unit_enum value6 = new Unit_enum(_value6);
	public static final Unit_enum value7 = new Unit_enum(_value7);
	public static final Unit_enum value8 = new Unit_enum(_value8);

	public java.lang.String getValue() {
		return _value_;
	}

	public static Unit_enum fromValue(java.lang.String value) throws java.lang.IllegalArgumentException {
		Unit_enum enumeration = (Unit_enum) _table_.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static Unit_enum fromString(java.lang.String value) throws java.lang.IllegalArgumentException {
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
			Unit_enum.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "unit_enum"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
