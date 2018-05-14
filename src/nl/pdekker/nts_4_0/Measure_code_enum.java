/**
 * Measure_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Measure_code_enum implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5933290878475619270L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected Measure_code_enum(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _DIS = "DIS";
	public static final java.lang.String _REG = "REG";
	public static final java.lang.String _BAR = "BAR";
	public static final java.lang.String _VER = "VER";
	public static final java.lang.String _LSD = "LSD";
	public static final java.lang.String _WAL = "WAL";
	public static final java.lang.String _NOM = "NOM";
	public static final Measure_code_enum DIS = new Measure_code_enum(_DIS);
	public static final Measure_code_enum REG = new Measure_code_enum(_REG);
	public static final Measure_code_enum BAR = new Measure_code_enum(_BAR);
	public static final Measure_code_enum VER = new Measure_code_enum(_VER);
	public static final Measure_code_enum LSD = new Measure_code_enum(_LSD);
	public static final Measure_code_enum WAL = new Measure_code_enum(_WAL);
	public static final Measure_code_enum NOM = new Measure_code_enum(_NOM);

	public java.lang.String getValue() {
		return _value_;
	}

	public static Measure_code_enum fromValue(java.lang.String value) throws java.lang.IllegalArgumentException {
		Measure_code_enum enumeration = (Measure_code_enum) _table_.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static Measure_code_enum fromString(java.lang.String value) throws java.lang.IllegalArgumentException {
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
			Measure_code_enum.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "measure_code_enum"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
