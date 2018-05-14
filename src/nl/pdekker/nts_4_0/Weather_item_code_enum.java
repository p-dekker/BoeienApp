/**
 * Weather_item_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

import java.util.HashMap;
import java.util.Map;

public class Weather_item_code_enum implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2776968043901704258L;
	private java.lang.String _value_;
	private static Map<String,Weather_item_code_enum> _table_ = new HashMap<>();

	// Constructor
	protected Weather_item_code_enum(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _WI = "WI";
	public static final java.lang.String _WA = "WA";
	public static final java.lang.String _FG = "FG";
	public static final java.lang.String _RN = "RN";
	public static final java.lang.String _SN = "SN";
	public static final java.lang.String _AT = "AT";
	public static final java.lang.String _WT = "WT";
	public static final Weather_item_code_enum WI = new Weather_item_code_enum(_WI);
	public static final Weather_item_code_enum WA = new Weather_item_code_enum(_WA);
	public static final Weather_item_code_enum FG = new Weather_item_code_enum(_FG);
	public static final Weather_item_code_enum RN = new Weather_item_code_enum(_RN);
	public static final Weather_item_code_enum SN = new Weather_item_code_enum(_SN);
	public static final Weather_item_code_enum AT = new Weather_item_code_enum(_AT);
	public static final Weather_item_code_enum WT = new Weather_item_code_enum(_WT);

	public java.lang.String getValue() {
		return _value_;
	}

	public static Weather_item_code_enum fromValue(java.lang.String value) throws java.lang.IllegalArgumentException {
		Weather_item_code_enum enumeration = (Weather_item_code_enum) _table_.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static Weather_item_code_enum fromString(java.lang.String value) throws java.lang.IllegalArgumentException {
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
			Weather_item_code_enum.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_item_code_enum"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
