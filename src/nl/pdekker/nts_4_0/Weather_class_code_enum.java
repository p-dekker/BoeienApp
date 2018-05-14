/**
 * Weather_class_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Weather_class_code_enum implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9036723634102357548L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected Weather_class_code_enum(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _CLR = "CLR";
	public static final java.lang.String _CLDY = "CLDY";
	public static final java.lang.String _OCST = "OCST";
	public static final java.lang.String _DZZL = "DZZL";
	public static final java.lang.String _RAIN = "RAIN";
	public static final java.lang.String _LRAIN = "LRAIN";
	public static final java.lang.String _ORAIN = "ORAIN";
	public static final java.lang.String _HRAIN = "HRAIN";
	public static final java.lang.String _SLEET = "SLEET";
	public static final java.lang.String _SNOW = "SNOW";
	public static final java.lang.String _SNFALL = "SNFALL";
	public static final java.lang.String _HAIL = "HAIL";
	public static final java.lang.String _SHWRS = "SHWRS";
	public static final java.lang.String _THSTRM = "THSTRM";
	public static final java.lang.String _HAZY = "HAZY";
	public static final java.lang.String _FOG = "FOG";
	public static final java.lang.String _FOGPAT = "FOGPAT";
	public static final java.lang.String _GALE = "GALE";
	public static final java.lang.String _STRM = "STRM";
	public static final java.lang.String _HURRC = "HURRC";
	public static final java.lang.String _FZRA = "FZRA";
	public static final Weather_class_code_enum CLR = new Weather_class_code_enum(_CLR);
	public static final Weather_class_code_enum CLDY = new Weather_class_code_enum(_CLDY);
	public static final Weather_class_code_enum OCST = new Weather_class_code_enum(_OCST);
	public static final Weather_class_code_enum DZZL = new Weather_class_code_enum(_DZZL);
	public static final Weather_class_code_enum RAIN = new Weather_class_code_enum(_RAIN);
	public static final Weather_class_code_enum LRAIN = new Weather_class_code_enum(_LRAIN);
	public static final Weather_class_code_enum ORAIN = new Weather_class_code_enum(_ORAIN);
	public static final Weather_class_code_enum HRAIN = new Weather_class_code_enum(_HRAIN);
	public static final Weather_class_code_enum SLEET = new Weather_class_code_enum(_SLEET);
	public static final Weather_class_code_enum SNOW = new Weather_class_code_enum(_SNOW);
	public static final Weather_class_code_enum SNFALL = new Weather_class_code_enum(_SNFALL);
	public static final Weather_class_code_enum HAIL = new Weather_class_code_enum(_HAIL);
	public static final Weather_class_code_enum SHWRS = new Weather_class_code_enum(_SHWRS);
	public static final Weather_class_code_enum THSTRM = new Weather_class_code_enum(_THSTRM);
	public static final Weather_class_code_enum HAZY = new Weather_class_code_enum(_HAZY);
	public static final Weather_class_code_enum FOG = new Weather_class_code_enum(_FOG);
	public static final Weather_class_code_enum FOGPAT = new Weather_class_code_enum(_FOGPAT);
	public static final Weather_class_code_enum GALE = new Weather_class_code_enum(_GALE);
	public static final Weather_class_code_enum STRM = new Weather_class_code_enum(_STRM);
	public static final Weather_class_code_enum HURRC = new Weather_class_code_enum(_HURRC);
	public static final Weather_class_code_enum FZRA = new Weather_class_code_enum(_FZRA);

	public java.lang.String getValue() {
		return _value_;
	}

	public static Weather_class_code_enum fromValue(java.lang.String value) throws java.lang.IllegalArgumentException {
		Weather_class_code_enum enumeration = (Weather_class_code_enum) _table_.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static Weather_class_code_enum fromString(java.lang.String value) throws java.lang.IllegalArgumentException {
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
			Weather_class_code_enum.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_class_code_enum"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
