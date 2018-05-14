/**
 * Communication_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Communication_code_enum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Communication_code_enum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TEL = "TEL";
    public static final java.lang.String _VHF = "VHF";
    public static final java.lang.String _EM = "EM";
    public static final java.lang.String _INT = "INT";
    public static final java.lang.String _TXT = "TXT";
    public static final java.lang.String _FAX = "FAX";
    public static final java.lang.String _LIG = "LIG";
    public static final java.lang.String _FLA = "FLA";
    public static final java.lang.String _SOU = "SOU";
    public static final Communication_code_enum TEL = new Communication_code_enum(_TEL);
    public static final Communication_code_enum VHF = new Communication_code_enum(_VHF);
    public static final Communication_code_enum EM = new Communication_code_enum(_EM);
    public static final Communication_code_enum INT = new Communication_code_enum(_INT);
    public static final Communication_code_enum TXT = new Communication_code_enum(_TXT);
    public static final Communication_code_enum FAX = new Communication_code_enum(_FAX);
    public static final Communication_code_enum LIG = new Communication_code_enum(_LIG);
    public static final Communication_code_enum FLA = new Communication_code_enum(_FLA);
    public static final Communication_code_enum SOU = new Communication_code_enum(_SOU);
    public java.lang.String getValue() { return _value_;}
    public static Communication_code_enum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Communication_code_enum enumeration = (Communication_code_enum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Communication_code_enum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Communication_code_enum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "communication_code_enum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
