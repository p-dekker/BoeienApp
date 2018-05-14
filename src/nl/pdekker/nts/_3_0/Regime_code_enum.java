/**
 * Regime_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Regime_code_enum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Regime_code_enum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NO = "NO";
    public static final java.lang.String _HI = "HI";
    public static final java.lang.String _II = "II";
    public static final java.lang.String _I = "I";
    public static final java.lang.String _NN = "NN";
    public static final java.lang.String _LO = "LO";
    public static final Regime_code_enum NO = new Regime_code_enum(_NO);
    public static final Regime_code_enum HI = new Regime_code_enum(_HI);
    public static final Regime_code_enum II = new Regime_code_enum(_II);
    public static final Regime_code_enum I = new Regime_code_enum(_I);
    public static final Regime_code_enum NN = new Regime_code_enum(_NN);
    public static final Regime_code_enum LO = new Regime_code_enum(_LO);
    public java.lang.String getValue() { return _value_;}
    public static Regime_code_enum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Regime_code_enum enumeration = (Regime_code_enum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Regime_code_enum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Regime_code_enum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "regime_code_enum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
