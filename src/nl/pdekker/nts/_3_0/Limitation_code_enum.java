/**
 * Limitation_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Limitation_code_enum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Limitation_code_enum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

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
    public static final java.lang.String _ALTER = "ALTER";
    public static final java.lang.String _CAUTIO = "CAUTIO";
    public static final java.lang.String _NOLIM = "NOLIM";
    public static final java.lang.String _TURNIN = "TURNIN";
    public static final java.lang.String _NOSHORE = "NOSHORE";
    public static final java.lang.String _CONBRE = "CONBRE";
    public static final java.lang.String _CONLEN = "CONLEN";
    public static final Limitation_code_enum OBSTRU = new Limitation_code_enum(_OBSTRU);
    public static final Limitation_code_enum PAROBS = new Limitation_code_enum(_PAROBS);
    public static final Limitation_code_enum DELAY = new Limitation_code_enum(_DELAY);
    public static final Limitation_code_enum VESLEN = new Limitation_code_enum(_VESLEN);
    public static final Limitation_code_enum VESHEI = new Limitation_code_enum(_VESHEI);
    public static final Limitation_code_enum VESBRE = new Limitation_code_enum(_VESBRE);
    public static final Limitation_code_enum VESDRA = new Limitation_code_enum(_VESDRA);
    public static final Limitation_code_enum AVALEN = new Limitation_code_enum(_AVALEN);
    public static final Limitation_code_enum CLEHEI = new Limitation_code_enum(_CLEHEI);
    public static final Limitation_code_enum CLEWID = new Limitation_code_enum(_CLEWID);
    public static final Limitation_code_enum AVADEP = new Limitation_code_enum(_AVADEP);
    public static final Limitation_code_enum NOMOOR = new Limitation_code_enum(_NOMOOR);
    public static final Limitation_code_enum SERVIC = new Limitation_code_enum(_SERVIC);
    public static final Limitation_code_enum NOSERV = new Limitation_code_enum(_NOSERV);
    public static final Limitation_code_enum SPEED = new Limitation_code_enum(_SPEED);
    public static final Limitation_code_enum WAVWAS = new Limitation_code_enum(_WAVWAS);
    public static final Limitation_code_enum PASSIN = new Limitation_code_enum(_PASSIN);
    public static final Limitation_code_enum ANCHOR = new Limitation_code_enum(_ANCHOR);
    public static final Limitation_code_enum OVRTAK = new Limitation_code_enum(_OVRTAK);
    public static final Limitation_code_enum MINPWR = new Limitation_code_enum(_MINPWR);
    public static final Limitation_code_enum ALTER = new Limitation_code_enum(_ALTER);
    public static final Limitation_code_enum CAUTIO = new Limitation_code_enum(_CAUTIO);
    public static final Limitation_code_enum NOLIM = new Limitation_code_enum(_NOLIM);
    public static final Limitation_code_enum TURNIN = new Limitation_code_enum(_TURNIN);
    public static final Limitation_code_enum NOSHORE = new Limitation_code_enum(_NOSHORE);
    public static final Limitation_code_enum CONBRE = new Limitation_code_enum(_CONBRE);
    public static final Limitation_code_enum CONLEN = new Limitation_code_enum(_CONLEN);
    public java.lang.String getValue() { return _value_;}
    public static Limitation_code_enum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Limitation_code_enum enumeration = (Limitation_code_enum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Limitation_code_enum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Limitation_code_enum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "limitation_code_enum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
