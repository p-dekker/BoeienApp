/**
 * Position_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Position_code_enum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Position_code_enum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AL = "AL";
    public static final java.lang.String _LE = "LE";
    public static final java.lang.String _MI = "MI";
    public static final java.lang.String _RI = "RI";
    public static final java.lang.String _LB = "LB";
    public static final java.lang.String _RB = "RB";
    public static final java.lang.String _N = "N";
    public static final java.lang.String _NE = "NE";
    public static final java.lang.String _E = "E";
    public static final java.lang.String _SE = "SE";
    public static final java.lang.String _S = "S";
    public static final java.lang.String _SW = "SW";
    public static final java.lang.String _W = "W";
    public static final java.lang.String _NW = "NW";
    public static final java.lang.String _BI = "BI";
    public static final java.lang.String _SM = "SM";
    public static final java.lang.String _OL = "OL";
    public static final java.lang.String _EW = "EW";
    public static final java.lang.String _MP = "MP";
    public static final java.lang.String _FP = "FP";
    public static final java.lang.String _VA = "VA";
    public static final Position_code_enum AL = new Position_code_enum(_AL);
    public static final Position_code_enum LE = new Position_code_enum(_LE);
    public static final Position_code_enum MI = new Position_code_enum(_MI);
    public static final Position_code_enum RI = new Position_code_enum(_RI);
    public static final Position_code_enum LB = new Position_code_enum(_LB);
    public static final Position_code_enum RB = new Position_code_enum(_RB);
    public static final Position_code_enum N = new Position_code_enum(_N);
    public static final Position_code_enum NE = new Position_code_enum(_NE);
    public static final Position_code_enum E = new Position_code_enum(_E);
    public static final Position_code_enum SE = new Position_code_enum(_SE);
    public static final Position_code_enum S = new Position_code_enum(_S);
    public static final Position_code_enum SW = new Position_code_enum(_SW);
    public static final Position_code_enum W = new Position_code_enum(_W);
    public static final Position_code_enum NW = new Position_code_enum(_NW);
    public static final Position_code_enum BI = new Position_code_enum(_BI);
    public static final Position_code_enum SM = new Position_code_enum(_SM);
    public static final Position_code_enum OL = new Position_code_enum(_OL);
    public static final Position_code_enum EW = new Position_code_enum(_EW);
    public static final Position_code_enum MP = new Position_code_enum(_MP);
    public static final Position_code_enum FP = new Position_code_enum(_FP);
    public static final Position_code_enum VA = new Position_code_enum(_VA);
    public java.lang.String getValue() { return _value_;}
    public static Position_code_enum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Position_code_enum enumeration = (Position_code_enum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Position_code_enum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Position_code_enum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "position_code_enum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
