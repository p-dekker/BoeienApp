/**
 * Ice_accessibility_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Ice_accessibility_code_enum implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1070641933837079035L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected Ice_accessibility_code_enum(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _A = "A";
	public static final java.lang.String _B = "B";
	public static final java.lang.String _F = "F";
	public static final java.lang.String _L = "L";
	public static final java.lang.String _C = "C";
	public static final java.lang.String _D = "D";
	public static final java.lang.String _E = "E";
	public static final java.lang.String _G = "G";
	public static final java.lang.String _H = "H";
	public static final java.lang.String _M = "M";
	public static final java.lang.String _K = "K";
	public static final java.lang.String _T = "T";
	public static final java.lang.String _P = "P";
	public static final java.lang.String _V = "V";
	public static final java.lang.String _X = "X";
	public static final Ice_accessibility_code_enum A = new Ice_accessibility_code_enum(_A);
	public static final Ice_accessibility_code_enum B = new Ice_accessibility_code_enum(_B);
	public static final Ice_accessibility_code_enum F = new Ice_accessibility_code_enum(_F);
	public static final Ice_accessibility_code_enum L = new Ice_accessibility_code_enum(_L);
	public static final Ice_accessibility_code_enum C = new Ice_accessibility_code_enum(_C);
	public static final Ice_accessibility_code_enum D = new Ice_accessibility_code_enum(_D);
	public static final Ice_accessibility_code_enum E = new Ice_accessibility_code_enum(_E);
	public static final Ice_accessibility_code_enum G = new Ice_accessibility_code_enum(_G);
	public static final Ice_accessibility_code_enum H = new Ice_accessibility_code_enum(_H);
	public static final Ice_accessibility_code_enum M = new Ice_accessibility_code_enum(_M);
	public static final Ice_accessibility_code_enum K = new Ice_accessibility_code_enum(_K);
	public static final Ice_accessibility_code_enum T = new Ice_accessibility_code_enum(_T);
	public static final Ice_accessibility_code_enum P = new Ice_accessibility_code_enum(_P);
	public static final Ice_accessibility_code_enum V = new Ice_accessibility_code_enum(_V);
	public static final Ice_accessibility_code_enum X = new Ice_accessibility_code_enum(_X);

	public java.lang.String getValue() {
		return _value_;
	}

	public static Ice_accessibility_code_enum fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		Ice_accessibility_code_enum enumeration = (Ice_accessibility_code_enum) _table_.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static Ice_accessibility_code_enum fromString(java.lang.String value)
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
			Ice_accessibility_code_enum.class);

	static {
		typeDesc.setXmlType(
				new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "ice_accessibility_code_enum"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
