/**
 * Country_code_enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Country_code_enum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Country_code_enum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AT = "AT";
    public static final java.lang.String _BE = "BE";
    public static final java.lang.String _BG = "BG";
    public static final java.lang.String _CH = "CH";
    public static final java.lang.String _CS = "CS";
    public static final java.lang.String _CY = "CY";
    public static final java.lang.String _CZ = "CZ";
    public static final java.lang.String _DE = "DE";
    public static final java.lang.String _DK = "DK";
    public static final java.lang.String _EE = "EE";
    public static final java.lang.String _ES = "ES";
    public static final java.lang.String _FI = "FI";
    public static final java.lang.String _FR = "FR";
    public static final java.lang.String _GB = "GB";
    public static final java.lang.String _GR = "GR";
    public static final java.lang.String _HR = "HR";
    public static final java.lang.String _HU = "HU";
    public static final java.lang.String _IE = "IE";
    public static final java.lang.String _IT = "IT";
    public static final java.lang.String _LT = "LT";
    public static final java.lang.String _LU = "LU";
    public static final java.lang.String _LV = "LV";
    public static final java.lang.String _MD = "MD";
    public static final java.lang.String _MT = "MT";
    public static final java.lang.String _NL = "NL";
    public static final java.lang.String _PL = "PL";
    public static final java.lang.String _PT = "PT";
    public static final java.lang.String _RO = "RO";
    public static final java.lang.String _SE = "SE";
    public static final java.lang.String _SI = "SI";
    public static final java.lang.String _SK = "SK";
    public static final java.lang.String _RU = "RU";
    public static final java.lang.String _UA = "UA";
    public static final Country_code_enum AT = new Country_code_enum(_AT);
    public static final Country_code_enum BE = new Country_code_enum(_BE);
    public static final Country_code_enum BG = new Country_code_enum(_BG);
    public static final Country_code_enum CH = new Country_code_enum(_CH);
    public static final Country_code_enum CS = new Country_code_enum(_CS);
    public static final Country_code_enum CY = new Country_code_enum(_CY);
    public static final Country_code_enum CZ = new Country_code_enum(_CZ);
    public static final Country_code_enum DE = new Country_code_enum(_DE);
    public static final Country_code_enum DK = new Country_code_enum(_DK);
    public static final Country_code_enum EE = new Country_code_enum(_EE);
    public static final Country_code_enum ES = new Country_code_enum(_ES);
    public static final Country_code_enum FI = new Country_code_enum(_FI);
    public static final Country_code_enum FR = new Country_code_enum(_FR);
    public static final Country_code_enum GB = new Country_code_enum(_GB);
    public static final Country_code_enum GR = new Country_code_enum(_GR);
    public static final Country_code_enum HR = new Country_code_enum(_HR);
    public static final Country_code_enum HU = new Country_code_enum(_HU);
    public static final Country_code_enum IE = new Country_code_enum(_IE);
    public static final Country_code_enum IT = new Country_code_enum(_IT);
    public static final Country_code_enum LT = new Country_code_enum(_LT);
    public static final Country_code_enum LU = new Country_code_enum(_LU);
    public static final Country_code_enum LV = new Country_code_enum(_LV);
    public static final Country_code_enum MD = new Country_code_enum(_MD);
    public static final Country_code_enum MT = new Country_code_enum(_MT);
    public static final Country_code_enum NL = new Country_code_enum(_NL);
    public static final Country_code_enum PL = new Country_code_enum(_PL);
    public static final Country_code_enum PT = new Country_code_enum(_PT);
    public static final Country_code_enum RO = new Country_code_enum(_RO);
    public static final Country_code_enum SE = new Country_code_enum(_SE);
    public static final Country_code_enum SI = new Country_code_enum(_SI);
    public static final Country_code_enum SK = new Country_code_enum(_SK);
    public static final Country_code_enum RU = new Country_code_enum(_RU);
    public static final Country_code_enum UA = new Country_code_enum(_UA);
    public java.lang.String getValue() { return _value_;}
    public static Country_code_enum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Country_code_enum enumeration = (Country_code_enum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Country_code_enum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Country_code_enum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "country_code_enum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
