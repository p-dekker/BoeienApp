/**
 * Target_group_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Target_group_code_enum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Target_group_code_enum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALL = "ALL";
    public static final java.lang.String _CDG = "CDG";
    public static final java.lang.String _COM = "COM";
    public static final java.lang.String _PAX = "PAX";
    public static final java.lang.String _PLE = "PLE";
    public static final java.lang.String _CNV = "CNV";
    public static final java.lang.String _PUS = "PUS";
    public static final java.lang.String _NNU = "NNU";
    public static final java.lang.String _LOA = "LOA";
    public static final java.lang.String _SMA = "SMA";
    public static final java.lang.String _CND = "CND";
    public static final Target_group_code_enum ALL = new Target_group_code_enum(_ALL);
    public static final Target_group_code_enum CDG = new Target_group_code_enum(_CDG);
    public static final Target_group_code_enum COM = new Target_group_code_enum(_COM);
    public static final Target_group_code_enum PAX = new Target_group_code_enum(_PAX);
    public static final Target_group_code_enum PLE = new Target_group_code_enum(_PLE);
    public static final Target_group_code_enum CNV = new Target_group_code_enum(_CNV);
    public static final Target_group_code_enum PUS = new Target_group_code_enum(_PUS);
    public static final Target_group_code_enum NNU = new Target_group_code_enum(_NNU);
    public static final Target_group_code_enum LOA = new Target_group_code_enum(_LOA);
    public static final Target_group_code_enum SMA = new Target_group_code_enum(_SMA);
    public static final Target_group_code_enum CND = new Target_group_code_enum(_CND);
    public java.lang.String getValue() { return _value_;}
    public static Target_group_code_enum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Target_group_code_enum enumeration = (Target_group_code_enum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Target_group_code_enum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Target_group_code_enum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "target_group_code_enum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
