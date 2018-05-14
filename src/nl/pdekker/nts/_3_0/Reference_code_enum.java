/**
 * Reference_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Reference_code_enum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Reference_code_enum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NAP = "NAP";
    public static final java.lang.String _KP = "KP";
    public static final java.lang.String _FZP = "FZP";
    public static final java.lang.String _ADR = "ADR";
    public static final java.lang.String _TAW = "TAW";
    public static final java.lang.String _PUL = "PUL";
    public static final java.lang.String _NGM = "NGM";
    public static final java.lang.String _ETRS = "ETRS";
    public static final java.lang.String _POT = "POT";
    public static final java.lang.String _LDC = "LDC";
    public static final java.lang.String _HDC = "HDC";
    public static final java.lang.String _ZPG = "ZPG";
    public static final java.lang.String _GLW = "GLW";
    public static final java.lang.String _HSW = "HSW";
    public static final java.lang.String _LNW = "LNW";
    public static final java.lang.String _HNW = "HNW";
    public static final java.lang.String _IGN = "IGN";
    public static final java.lang.String _WGS = "WGS";
    public static final java.lang.String _RN = "RN";
    public static final Reference_code_enum NAP = new Reference_code_enum(_NAP);
    public static final Reference_code_enum KP = new Reference_code_enum(_KP);
    public static final Reference_code_enum FZP = new Reference_code_enum(_FZP);
    public static final Reference_code_enum ADR = new Reference_code_enum(_ADR);
    public static final Reference_code_enum TAW = new Reference_code_enum(_TAW);
    public static final Reference_code_enum PUL = new Reference_code_enum(_PUL);
    public static final Reference_code_enum NGM = new Reference_code_enum(_NGM);
    public static final Reference_code_enum ETRS = new Reference_code_enum(_ETRS);
    public static final Reference_code_enum POT = new Reference_code_enum(_POT);
    public static final Reference_code_enum LDC = new Reference_code_enum(_LDC);
    public static final Reference_code_enum HDC = new Reference_code_enum(_HDC);
    public static final Reference_code_enum ZPG = new Reference_code_enum(_ZPG);
    public static final Reference_code_enum GLW = new Reference_code_enum(_GLW);
    public static final Reference_code_enum HSW = new Reference_code_enum(_HSW);
    public static final Reference_code_enum LNW = new Reference_code_enum(_LNW);
    public static final Reference_code_enum HNW = new Reference_code_enum(_HNW);
    public static final Reference_code_enum IGN = new Reference_code_enum(_IGN);
    public static final Reference_code_enum WGS = new Reference_code_enum(_WGS);
    public static final Reference_code_enum RN = new Reference_code_enum(_RN);
    public java.lang.String getValue() { return _value_;}
    public static Reference_code_enum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Reference_code_enum enumeration = (Reference_code_enum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Reference_code_enum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Reference_code_enum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "reference_code_enum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
