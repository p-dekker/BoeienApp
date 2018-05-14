/**
 * Reason_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Reason_code_enum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Reason_code_enum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EVENT = "EVENT";
    public static final java.lang.String _WORK = "WORK";
    public static final java.lang.String _DREDGE = "DREDGE";
    public static final java.lang.String _EXERC = "EXERC";
    public static final java.lang.String _HIGWAT = "HIGWAT";
    public static final java.lang.String _HIWAI = "HIWAI";
    public static final java.lang.String _HIWAII = "HIWAII";
    public static final java.lang.String _LOWWAT = "LOWWAT";
    public static final java.lang.String _SHALLO = "SHALLO";
    public static final java.lang.String _CALAMI = "CALAMI";
    public static final java.lang.String _LAUNCH = "LAUNCH";
    public static final java.lang.String _DECLEV = "DECLEV";
    public static final java.lang.String _FLOMEA = "FLOMEA";
    public static final java.lang.String _BLDWRK = "BLDWRK";
    public static final java.lang.String _REPAIR = "REPAIR";
    public static final java.lang.String _INSPEC = "INSPEC";
    public static final java.lang.String _FIRWRK = "FIRWRK";
    public static final java.lang.String _LIMITA = "LIMITA";
    public static final java.lang.String _CHGFWY = "CHGFWY";
    public static final java.lang.String _CONSTR = "CONSTR";
    public static final java.lang.String _DIVING = "DIVING";
    public static final java.lang.String _SPECTR = "SPECTR";
    public static final java.lang.String _EXT = "EXT";
    public static final java.lang.String _MIN = "MIN";
    public static final java.lang.String _SOUND = "SOUND";
    public static final java.lang.String _OTHER = "OTHER";
    public static final java.lang.String _INFSER = "INFSER";
    public static final java.lang.String _STRIKE = "STRIKE";
    public static final java.lang.String _FLOMAT = "FLOMAT";
    public static final java.lang.String _EXPLOS = "EXPLOS";
    public static final Reason_code_enum EVENT = new Reason_code_enum(_EVENT);
    public static final Reason_code_enum WORK = new Reason_code_enum(_WORK);
    public static final Reason_code_enum DREDGE = new Reason_code_enum(_DREDGE);
    public static final Reason_code_enum EXERC = new Reason_code_enum(_EXERC);
    public static final Reason_code_enum HIGWAT = new Reason_code_enum(_HIGWAT);
    public static final Reason_code_enum HIWAI = new Reason_code_enum(_HIWAI);
    public static final Reason_code_enum HIWAII = new Reason_code_enum(_HIWAII);
    public static final Reason_code_enum LOWWAT = new Reason_code_enum(_LOWWAT);
    public static final Reason_code_enum SHALLO = new Reason_code_enum(_SHALLO);
    public static final Reason_code_enum CALAMI = new Reason_code_enum(_CALAMI);
    public static final Reason_code_enum LAUNCH = new Reason_code_enum(_LAUNCH);
    public static final Reason_code_enum DECLEV = new Reason_code_enum(_DECLEV);
    public static final Reason_code_enum FLOMEA = new Reason_code_enum(_FLOMEA);
    public static final Reason_code_enum BLDWRK = new Reason_code_enum(_BLDWRK);
    public static final Reason_code_enum REPAIR = new Reason_code_enum(_REPAIR);
    public static final Reason_code_enum INSPEC = new Reason_code_enum(_INSPEC);
    public static final Reason_code_enum FIRWRK = new Reason_code_enum(_FIRWRK);
    public static final Reason_code_enum LIMITA = new Reason_code_enum(_LIMITA);
    public static final Reason_code_enum CHGFWY = new Reason_code_enum(_CHGFWY);
    public static final Reason_code_enum CONSTR = new Reason_code_enum(_CONSTR);
    public static final Reason_code_enum DIVING = new Reason_code_enum(_DIVING);
    public static final Reason_code_enum SPECTR = new Reason_code_enum(_SPECTR);
    public static final Reason_code_enum EXT = new Reason_code_enum(_EXT);
    public static final Reason_code_enum MIN = new Reason_code_enum(_MIN);
    public static final Reason_code_enum SOUND = new Reason_code_enum(_SOUND);
    public static final Reason_code_enum OTHER = new Reason_code_enum(_OTHER);
    public static final Reason_code_enum INFSER = new Reason_code_enum(_INFSER);
    public static final Reason_code_enum STRIKE = new Reason_code_enum(_STRIKE);
    public static final Reason_code_enum FLOMAT = new Reason_code_enum(_FLOMAT);
    public static final Reason_code_enum EXPLOS = new Reason_code_enum(_EXPLOS);
    public java.lang.String getValue() { return _value_;}
    public static Reason_code_enum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Reason_code_enum enumeration = (Reason_code_enum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Reason_code_enum fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Reason_code_enum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "reason_code_enum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
