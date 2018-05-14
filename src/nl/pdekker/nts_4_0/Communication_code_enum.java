/**
 * Communication_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

import java.util.Map;

public class Communication_code_enum implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6389642281099906133L;
	private java.lang.String _value_;
	private static Map<String,Communication_code_enum> _table_ = new java.util.HashMap<>();

	// Constructor
	protected Communication_code_enum(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _TE = "TE";
	public static final java.lang.String _AP = "AP";
	public static final java.lang.String _EM = "EM";
	public static final java.lang.String _AH = "AH";
	public static final java.lang.String _TT = "TT";
	public static final java.lang.String _FX = "FX";
	public static final java.lang.String _LS = "LS";
	public static final java.lang.String _FS = "FS";
	public static final java.lang.String _SO = "SO";
	public static final java.lang.String _EI = "EI";
	public static final Communication_code_enum TE = new Communication_code_enum(_TE);
	public static final Communication_code_enum AP = new Communication_code_enum(_AP);
	public static final Communication_code_enum EM = new Communication_code_enum(_EM);
	public static final Communication_code_enum AH = new Communication_code_enum(_AH);
	public static final Communication_code_enum TT = new Communication_code_enum(_TT);
	public static final Communication_code_enum FX = new Communication_code_enum(_FX);
	public static final Communication_code_enum LS = new Communication_code_enum(_LS);
	public static final Communication_code_enum FS = new Communication_code_enum(_FS);
	public static final Communication_code_enum SO = new Communication_code_enum(_SO);
	public static final Communication_code_enum EI = new Communication_code_enum(_EI);

	public java.lang.String getValue() {
		return _value_;
	}

	public static Communication_code_enum fromValue(java.lang.String value) throws java.lang.IllegalArgumentException {
		Communication_code_enum enumeration = (Communication_code_enum) _table_.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static Communication_code_enum fromString(java.lang.String value) throws java.lang.IllegalArgumentException {
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
			Communication_code_enum.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "communication_code_enum"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
