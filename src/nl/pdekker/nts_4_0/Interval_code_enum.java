/**
 * Interval_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Interval_code_enum implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7935059716660110040L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected Interval_code_enum(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _CON = "CON";
	public static final java.lang.String _DAY = "DAY";
	public static final java.lang.String _WRK = "WRK";
	public static final java.lang.String _WKN = "WKN";
	public static final java.lang.String _SUN = "SUN";
	public static final java.lang.String _MON = "MON";
	public static final java.lang.String _TUE = "TUE";
	public static final java.lang.String _WED = "WED";
	public static final java.lang.String _THU = "THU";
	public static final java.lang.String _FRI = "FRI";
	public static final java.lang.String _SAT = "SAT";
	public static final java.lang.String _DTI = "DTI";
	public static final java.lang.String _NTI = "NTI";
	public static final java.lang.String _RVI = "RVI";
	public static final java.lang.String _EXC = "EXC";
	public static final java.lang.String _WRD = "WRD";
	public static final Interval_code_enum CON = new Interval_code_enum(_CON);
	public static final Interval_code_enum DAY = new Interval_code_enum(_DAY);
	public static final Interval_code_enum WRK = new Interval_code_enum(_WRK);
	public static final Interval_code_enum WKN = new Interval_code_enum(_WKN);
	public static final Interval_code_enum SUN = new Interval_code_enum(_SUN);
	public static final Interval_code_enum MON = new Interval_code_enum(_MON);
	public static final Interval_code_enum TUE = new Interval_code_enum(_TUE);
	public static final Interval_code_enum WED = new Interval_code_enum(_WED);
	public static final Interval_code_enum THU = new Interval_code_enum(_THU);
	public static final Interval_code_enum FRI = new Interval_code_enum(_FRI);
	public static final Interval_code_enum SAT = new Interval_code_enum(_SAT);
	public static final Interval_code_enum DTI = new Interval_code_enum(_DTI);
	public static final Interval_code_enum NTI = new Interval_code_enum(_NTI);
	public static final Interval_code_enum RVI = new Interval_code_enum(_RVI);
	public static final Interval_code_enum EXC = new Interval_code_enum(_EXC);
	public static final Interval_code_enum WRD = new Interval_code_enum(_WRD);

	public java.lang.String getValue() {
		return _value_;
	}

	public static Interval_code_enum fromValue(java.lang.String value) throws java.lang.IllegalArgumentException {
		Interval_code_enum enumeration = (Interval_code_enum) _table_.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static Interval_code_enum fromString(java.lang.String value) throws java.lang.IllegalArgumentException {
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
			Interval_code_enum.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "interval_code_enum"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
