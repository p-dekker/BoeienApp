/**
 * Subject_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Subject_code_enum implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4533805485308548606L;
	private java.lang.String _value_;
	private static java.util.HashMap<String,Subject_code_enum> _table_ = new java.util.HashMap<>();

	// Constructor
	protected Subject_code_enum(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _ANNOUN = "ANNOUN";
	public static final java.lang.String _WARNIN = "WARNIN";
	public static final java.lang.String _CANCEL = "CANCEL";
	public static final java.lang.String _INFSER = "INFSER";
	public static final java.lang.String _OBSTRU = "OBSTRU";
	public static final java.lang.String _PAROBS = "PAROBS";
	public static final java.lang.String _DELAY = "DELAY";
	public static final java.lang.String _VESLEN = "VESLEN";
	public static final java.lang.String _VESHEI = "VESHEI";
	public static final java.lang.String _VESBRE = "VESBRE";
	public static final java.lang.String _VESDRA = "VESDRA";
	public static final java.lang.String _AVALEN = "AVALEN";
	public static final java.lang.String _CLEHEI = "CLEHEI";
	public static final java.lang.String _CLEWID = "CLEWID";
	public static final java.lang.String _AVADEP = "AVADEP";
	public static final java.lang.String _NOMOOR = "NOMOOR";
	public static final java.lang.String _SERVIC = "SERVIC";
	public static final java.lang.String _NOSERV = "NOSERV";
	public static final java.lang.String _SPEED = "SPEED";
	public static final java.lang.String _WAVWAS = "WAVWAS";
	public static final java.lang.String _PASSIN = "PASSIN";
	public static final java.lang.String _ANCHOR = "ANCHOR";
	public static final java.lang.String _OVRTAK = "OVRTAK";
	public static final java.lang.String _MINPWR = "MINPWR";
	public static final java.lang.String _DREDGE = "DREDGE";
	public static final java.lang.String _WORK = "WORK";
	public static final java.lang.String _EVENT = "EVENT";
	public static final java.lang.String _CHGMAR = "CHGMAR";
	public static final java.lang.String _CHGSER = "CHGSER";
	public static final java.lang.String _SPCMAR = "SPCMAR";
	public static final java.lang.String _EXERC = "EXERC";
	public static final java.lang.String _LEADEP = "LEADEP";
	public static final java.lang.String _LEVDEC = "LEVDEC";
	public static final java.lang.String _LEVRIS = "LEVRIS";
	public static final java.lang.String _LIMITA = "LIMITA";
	public static final java.lang.String _MISECH = "MISECH";
	public static final java.lang.String _ECDISU = "ECDISU";
	public static final java.lang.String _NEWOBJ = "NEWOBJ";
	public static final java.lang.String _CHWWY = "CHWWY";
	public static final java.lang.String _CONWWY = "CONWWY";
	public static final java.lang.String _DIVER = "DIVER";
	public static final java.lang.String _SPECTR = "SPECTR";
	public static final java.lang.String _LOCRUL = "LOCRUL";
	public static final java.lang.String _VHFCOV = "VHFCOV";
	public static final java.lang.String _HIGVOL = "HIGVOL";
	public static final java.lang.String _TURNIN = "TURNIN";
	public static final java.lang.String _CONBRE = "CONBRE";
	public static final java.lang.String _CONLEN = "CONLEN";
	public static final java.lang.String _REMOBJ = "REMOBJ";
	public static final Subject_code_enum ANNOUN = new Subject_code_enum(_ANNOUN);
	public static final Subject_code_enum WARNIN = new Subject_code_enum(_WARNIN);
	public static final Subject_code_enum CANCEL = new Subject_code_enum(_CANCEL);
	public static final Subject_code_enum INFSER = new Subject_code_enum(_INFSER);
	public static final Subject_code_enum OBSTRU = new Subject_code_enum(_OBSTRU);
	public static final Subject_code_enum PAROBS = new Subject_code_enum(_PAROBS);
	public static final Subject_code_enum DELAY = new Subject_code_enum(_DELAY);
	public static final Subject_code_enum VESLEN = new Subject_code_enum(_VESLEN);
	public static final Subject_code_enum VESHEI = new Subject_code_enum(_VESHEI);
	public static final Subject_code_enum VESBRE = new Subject_code_enum(_VESBRE);
	public static final Subject_code_enum VESDRA = new Subject_code_enum(_VESDRA);
	public static final Subject_code_enum AVALEN = new Subject_code_enum(_AVALEN);
	public static final Subject_code_enum CLEHEI = new Subject_code_enum(_CLEHEI);
	public static final Subject_code_enum CLEWID = new Subject_code_enum(_CLEWID);
	public static final Subject_code_enum AVADEP = new Subject_code_enum(_AVADEP);
	public static final Subject_code_enum NOMOOR = new Subject_code_enum(_NOMOOR);
	public static final Subject_code_enum SERVIC = new Subject_code_enum(_SERVIC);
	public static final Subject_code_enum NOSERV = new Subject_code_enum(_NOSERV);
	public static final Subject_code_enum SPEED = new Subject_code_enum(_SPEED);
	public static final Subject_code_enum WAVWAS = new Subject_code_enum(_WAVWAS);
	public static final Subject_code_enum PASSIN = new Subject_code_enum(_PASSIN);
	public static final Subject_code_enum ANCHOR = new Subject_code_enum(_ANCHOR);
	public static final Subject_code_enum OVRTAK = new Subject_code_enum(_OVRTAK);
	public static final Subject_code_enum MINPWR = new Subject_code_enum(_MINPWR);
	public static final Subject_code_enum DREDGE = new Subject_code_enum(_DREDGE);
	public static final Subject_code_enum WORK = new Subject_code_enum(_WORK);
	public static final Subject_code_enum EVENT = new Subject_code_enum(_EVENT);
	public static final Subject_code_enum CHGMAR = new Subject_code_enum(_CHGMAR);
	public static final Subject_code_enum CHGSER = new Subject_code_enum(_CHGSER);
	public static final Subject_code_enum SPCMAR = new Subject_code_enum(_SPCMAR);
	public static final Subject_code_enum EXERC = new Subject_code_enum(_EXERC);
	public static final Subject_code_enum LEADEP = new Subject_code_enum(_LEADEP);
	public static final Subject_code_enum LEVDEC = new Subject_code_enum(_LEVDEC);
	public static final Subject_code_enum LEVRIS = new Subject_code_enum(_LEVRIS);
	public static final Subject_code_enum LIMITA = new Subject_code_enum(_LIMITA);
	public static final Subject_code_enum MISECH = new Subject_code_enum(_MISECH);
	public static final Subject_code_enum ECDISU = new Subject_code_enum(_ECDISU);
	public static final Subject_code_enum NEWOBJ = new Subject_code_enum(_NEWOBJ);
	public static final Subject_code_enum CHWWY = new Subject_code_enum(_CHWWY);
	public static final Subject_code_enum CONWWY = new Subject_code_enum(_CONWWY);
	public static final Subject_code_enum DIVER = new Subject_code_enum(_DIVER);
	public static final Subject_code_enum SPECTR = new Subject_code_enum(_SPECTR);
	public static final Subject_code_enum LOCRUL = new Subject_code_enum(_LOCRUL);
	public static final Subject_code_enum VHFCOV = new Subject_code_enum(_VHFCOV);
	public static final Subject_code_enum HIGVOL = new Subject_code_enum(_HIGVOL);
	public static final Subject_code_enum TURNIN = new Subject_code_enum(_TURNIN);
	public static final Subject_code_enum CONBRE = new Subject_code_enum(_CONBRE);
	public static final Subject_code_enum CONLEN = new Subject_code_enum(_CONLEN);
	public static final Subject_code_enum REMOBJ = new Subject_code_enum(_REMOBJ);

	public java.lang.String getValue() {
		return _value_;
	}

	public static Subject_code_enum fromValue(java.lang.String value) throws java.lang.IllegalArgumentException {
		Subject_code_enum enumeration = (Subject_code_enum) _table_.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static Subject_code_enum fromString(java.lang.String value) throws java.lang.IllegalArgumentException {
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
			Subject_code_enum.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "subject_code_enum"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
