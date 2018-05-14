/**
 * Type_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Type_code_enum implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3735259318024353401L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected Type_code_enum(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _RIV = "RIV";
	public static final java.lang.String _CAN = "CAN";
	public static final java.lang.String _LAK = "LAK";
	public static final java.lang.String _FWY = "FWY";
	public static final java.lang.String _LCK = "LCK";
	public static final java.lang.String _BRI = "BRI";
	public static final java.lang.String _RMP = "RMP";
	public static final java.lang.String _BAR = "BAR";
	public static final java.lang.String _BNK = "BNK";
	public static final java.lang.String _GAU = "GAU";
	public static final java.lang.String _BUO = "BUO";
	public static final java.lang.String _BEA = "BEA";
	public static final java.lang.String _ANC = "ANC";
	public static final java.lang.String _BER = "BER";
	public static final java.lang.String _MOO = "MOO";
	public static final java.lang.String _TER = "TER";
	public static final java.lang.String _HAR = "HAR";
	public static final java.lang.String _FDO = "FDO";
	public static final java.lang.String _CAB = "CAB";
	public static final java.lang.String _FER = "FER";
	public static final java.lang.String _PIP = "PIP";
	public static final java.lang.String _PPO = "PPO";
	public static final java.lang.String _HFA = "HFA";
	public static final java.lang.String _HMO = "HMO";
	public static final java.lang.String _SHY = "SHY";
	public static final java.lang.String _REF = "REF";
	public static final java.lang.String _MAR = "MAR";
	public static final java.lang.String _LIG = "LIG";
	public static final java.lang.String _SIG = "SIG";
	public static final java.lang.String _TUR = "TUR";
	public static final java.lang.String _CBR = "CBR";
	public static final java.lang.String _TUN = "TUN";
	public static final java.lang.String _BCO = "BCO";
	public static final java.lang.String _REP = "REP";
	public static final java.lang.String _FLO = "FLO";
	public static final java.lang.String _SLI = "SLI";
	public static final java.lang.String _DUK = "DUK";
	public static final java.lang.String _VTC = "VTC";
	public static final java.lang.String _RES = "RES";
	public static final java.lang.String _LKB = "LKB";
	public static final java.lang.String _BRO = "BRO";
	public static final java.lang.String _BNS = "BNS";
	public static final Type_code_enum RIV = new Type_code_enum(_RIV);
	public static final Type_code_enum CAN = new Type_code_enum(_CAN);
	public static final Type_code_enum LAK = new Type_code_enum(_LAK);
	public static final Type_code_enum FWY = new Type_code_enum(_FWY);
	public static final Type_code_enum LCK = new Type_code_enum(_LCK);
	public static final Type_code_enum BRI = new Type_code_enum(_BRI);
	public static final Type_code_enum RMP = new Type_code_enum(_RMP);
	public static final Type_code_enum BAR = new Type_code_enum(_BAR);
	public static final Type_code_enum BNK = new Type_code_enum(_BNK);
	public static final Type_code_enum GAU = new Type_code_enum(_GAU);
	public static final Type_code_enum BUO = new Type_code_enum(_BUO);
	public static final Type_code_enum BEA = new Type_code_enum(_BEA);
	public static final Type_code_enum ANC = new Type_code_enum(_ANC);
	public static final Type_code_enum BER = new Type_code_enum(_BER);
	public static final Type_code_enum MOO = new Type_code_enum(_MOO);
	public static final Type_code_enum TER = new Type_code_enum(_TER);
	public static final Type_code_enum HAR = new Type_code_enum(_HAR);
	public static final Type_code_enum FDO = new Type_code_enum(_FDO);
	public static final Type_code_enum CAB = new Type_code_enum(_CAB);
	public static final Type_code_enum FER = new Type_code_enum(_FER);
	public static final Type_code_enum PIP = new Type_code_enum(_PIP);
	public static final Type_code_enum PPO = new Type_code_enum(_PPO);
	public static final Type_code_enum HFA = new Type_code_enum(_HFA);
	public static final Type_code_enum HMO = new Type_code_enum(_HMO);
	public static final Type_code_enum SHY = new Type_code_enum(_SHY);
	public static final Type_code_enum REF = new Type_code_enum(_REF);
	public static final Type_code_enum MAR = new Type_code_enum(_MAR);
	public static final Type_code_enum LIG = new Type_code_enum(_LIG);
	public static final Type_code_enum SIG = new Type_code_enum(_SIG);
	public static final Type_code_enum TUR = new Type_code_enum(_TUR);
	public static final Type_code_enum CBR = new Type_code_enum(_CBR);
	public static final Type_code_enum TUN = new Type_code_enum(_TUN);
	public static final Type_code_enum BCO = new Type_code_enum(_BCO);
	public static final Type_code_enum REP = new Type_code_enum(_REP);
	public static final Type_code_enum FLO = new Type_code_enum(_FLO);
	public static final Type_code_enum SLI = new Type_code_enum(_SLI);
	public static final Type_code_enum DUK = new Type_code_enum(_DUK);
	public static final Type_code_enum VTC = new Type_code_enum(_VTC);
	public static final Type_code_enum RES = new Type_code_enum(_RES);
	public static final Type_code_enum LKB = new Type_code_enum(_LKB);
	public static final Type_code_enum BRO = new Type_code_enum(_BRO);
	public static final Type_code_enum BNS = new Type_code_enum(_BNS);

	public java.lang.String getValue() {
		return _value_;
	}

	public static Type_code_enum fromValue(java.lang.String value) throws java.lang.IllegalArgumentException {
		Type_code_enum enumeration = (Type_code_enum) _table_.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static Type_code_enum fromString(java.lang.String value) throws java.lang.IllegalArgumentException {
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
			Type_code_enum.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "type_code_enum"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
