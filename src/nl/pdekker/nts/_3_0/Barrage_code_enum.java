/**
 * Barrage_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Barrage_code_enum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Barrage_code_enum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CLD = "CLD";
    public static final java.lang.String _OPG = "OPG";
    public static final java.lang.String _CLG = "CLG";
    public static final java.lang.String _OPD = "OPD";
    public static final java.lang.String _OPN = "OPN";
    public static final Barrage_code_enum CLD = new Barrage_code_enum(_CLD);
    public static final Barrage_code_enum OPG = new Barrage_code_enum(_OPG);
    public static final Barrage_code_enum CLG = new Barrage_code_enum(_CLG);
    public static final Barrage_code_enum OPD = new Barrage_code_enum(_OPD);
    public static final Barrage_code_enum OPN = new Barrage_code_enum(_OPN);
    public java.lang.String getValue() { return _value_;}
    public static Barrage_code_enum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Barrage_code_enum enumeration = (Barrage_code_enum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Barrage_code_enum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Barrage_code_enum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "barrage_code_enum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
