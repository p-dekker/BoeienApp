/**
 * Message_type_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_ms_1_0_3_0;

public class Message_type_type implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5839713641330526568L;
	private java.lang.String _value_;
    private static java.util.HashMap<String,Message_type_type> _table_ = new java.util.HashMap<>();

    // Constructor
    protected Message_type_type(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FTM = "FTM";
    public static final java.lang.String _WRM = "WRM";
    public static final java.lang.String _ICEM = "ICEM";
    public static final java.lang.String _WERM = "WERM";
    public static final Message_type_type FTM = new Message_type_type(_FTM);
    public static final Message_type_type WRM = new Message_type_type(_WRM);
    public static final Message_type_type ICEM = new Message_type_type(_ICEM);
    public static final Message_type_type WERM = new Message_type_type(_WERM);
    public java.lang.String getValue() { return _value_;}
    public static Message_type_type fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Message_type_type enumeration = (Message_type_type)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Message_type_type fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class<?> _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class<?>_javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Message_type_type.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", "message_type_type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
