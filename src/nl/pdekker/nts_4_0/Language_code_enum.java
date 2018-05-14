/**
 * Language_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;


import java.util.HashMap;
import java.util.Map;

public class Language_code_enum implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1646302726138601685L;
	private java.lang.String _value_;
	private static Map<String,Language_code_enum> _table_ = new HashMap<>();

	// Constructor
	protected Language_code_enum(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _DE = "DE";
	public static final java.lang.String _EN = "EN";
	public static final java.lang.String _FR = "FR";
	public static final java.lang.String _NL = "NL";
	public static final java.lang.String _SK = "SK";
	public static final java.lang.String _HU = "HU";
	public static final java.lang.String _HR = "HR";
	public static final java.lang.String _SR = "SR";
	public static final java.lang.String _BG = "BG";
	public static final java.lang.String _RO = "RO";
	public static final java.lang.String _RU = "RU";
	public static final java.lang.String _CS = "CS";
	public static final java.lang.String _PL = "PL";
	public static final java.lang.String _PT = "PT";
	public static final java.lang.String _ES = "ES";
	public static final java.lang.String _SV = "SV";
	public static final java.lang.String _FI = "FI";
	public static final java.lang.String _DA = "DA";
	public static final java.lang.String _ET = "ET";
	public static final java.lang.String _LV = "LV";
	public static final java.lang.String _LT = "LT";
	public static final java.lang.String _IT = "IT";
	public static final java.lang.String _MT = "MT";
	public static final java.lang.String _EL = "EL";
	public static final java.lang.String _SL = "SL";
	public static final Language_code_enum DE = new Language_code_enum(_DE);
	public static final Language_code_enum EN = new Language_code_enum(_EN);
	public static final Language_code_enum FR = new Language_code_enum(_FR);
	public static final Language_code_enum NL = new Language_code_enum(_NL);
	public static final Language_code_enum SK = new Language_code_enum(_SK);
	public static final Language_code_enum HU = new Language_code_enum(_HU);
	public static final Language_code_enum HR = new Language_code_enum(_HR);
	public static final Language_code_enum SR = new Language_code_enum(_SR);
	public static final Language_code_enum BG = new Language_code_enum(_BG);
	public static final Language_code_enum RO = new Language_code_enum(_RO);
	public static final Language_code_enum RU = new Language_code_enum(_RU);
	public static final Language_code_enum CS = new Language_code_enum(_CS);
	public static final Language_code_enum PL = new Language_code_enum(_PL);
	public static final Language_code_enum PT = new Language_code_enum(_PT);
	public static final Language_code_enum ES = new Language_code_enum(_ES);
	public static final Language_code_enum SV = new Language_code_enum(_SV);
	public static final Language_code_enum FI = new Language_code_enum(_FI);
	public static final Language_code_enum DA = new Language_code_enum(_DA);
	public static final Language_code_enum ET = new Language_code_enum(_ET);
	public static final Language_code_enum LV = new Language_code_enum(_LV);
	public static final Language_code_enum LT = new Language_code_enum(_LT);
	public static final Language_code_enum IT = new Language_code_enum(_IT);
	public static final Language_code_enum MT = new Language_code_enum(_MT);
	public static final Language_code_enum EL = new Language_code_enum(_EL);
	public static final Language_code_enum SL = new Language_code_enum(_SL);

	public java.lang.String getValue() {
		return _value_;
	}

	public static Language_code_enum fromValue(java.lang.String value) throws java.lang.IllegalArgumentException {
		Language_code_enum enumeration = _table_.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static Language_code_enum fromString(java.lang.String value) throws java.lang.IllegalArgumentException {
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
			Language_code_enum.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "language_code_enum"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
