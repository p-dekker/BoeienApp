/**
 * Error_code_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts.ms_2_0_4_0;

import java.util.Map;

public class Error_code_type implements java.io.Serializable {
	private static final long serialVersionUID = 881397345783518107L;
	private String _value_;
	private static Map<String, Error_code_type> _table_ = new java.util.HashMap<>();

	// Constructor
	protected Error_code_type(String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final String _e010 = "e010";
	public static final String _e030 = "e030";
	public static final String _e100 = "e100";
	public static final String _e110 = "e110";
	public static final String _e120 = "e120";
	public static final String _e130 = "e130";
	public static final String _e200 = "e200";
	public static final String _e300 = "e300";
	public static final String _e310 = "e310";
	public static final Error_code_type e010 = new Error_code_type(_e010);
	public static final Error_code_type e030 = new Error_code_type(_e030);
	public static final Error_code_type e100 = new Error_code_type(_e100);
	public static final Error_code_type e110 = new Error_code_type(_e110);
	public static final Error_code_type e120 = new Error_code_type(_e120);
	public static final Error_code_type e130 = new Error_code_type(_e130);
	public static final Error_code_type e200 = new Error_code_type(_e200);
	public static final Error_code_type e300 = new Error_code_type(_e300);
	public static final Error_code_type e310 = new Error_code_type(_e310);

	public String getValue() {
		return _value_;
	}

	public static Error_code_type fromValue(String value) throws IllegalArgumentException {
		Error_code_type enumeration = _table_.get(value);
		if (enumeration == null) {
			throw new IllegalArgumentException();
		}
		return enumeration;
	}

	public static Error_code_type fromString(String value) throws IllegalArgumentException {
		return fromValue(value);
	}

	@Override
	public boolean equals(Object obj) {
		return (obj == this);
	}

	@Override
	public int hashCode() {
		return _value_.hashCode();
	}

	@Override
	public String toString() {
		return _value_;
	}

	public Object readResolve() throws java.io.ObjectStreamException {
		return fromValue(_value_);
	}

	public static org.apache.axis.encoding.Serializer getSerializer(String mechType,
			Class<?> _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumSerializer(_javaType, _xmlType);
	}

	public static org.apache.axis.encoding.Deserializer getDeserializer(String mechType,
			Class<?> _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumDeserializer(_javaType, _xmlType);
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Error_code_type.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "error_code_type"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
