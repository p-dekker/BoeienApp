/**
 * Date_pair.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_ms_1_0_3_0;

public class Date_pair  implements java.io.Serializable {
    private java.util.Date date_start;

    private java.util.Date date_end;

    public Date_pair() {
    }

    public Date_pair(
           java.util.Date date_start,
           java.util.Date date_end) {
           this.date_start = date_start;
           this.date_end = date_end;
    }


    /**
     * Gets the date_start value for this Date_pair.
     * 
     * @return date_start
     */
    public java.util.Date getDate_start() {
        return date_start;
    }


    /**
     * Sets the date_start value for this Date_pair.
     * 
     * @param date_start
     */
    public void setDate_start(java.util.Date date_start) {
        this.date_start = date_start;
    }


    /**
     * Gets the date_end value for this Date_pair.
     * 
     * @return date_end
     */
    public java.util.Date getDate_end() {
        return date_end;
    }


    /**
     * Sets the date_end value for this Date_pair.
     * 
     * @param date_end
     */
    public void setDate_end(java.util.Date date_end) {
        this.date_end = date_end;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Date_pair)) return false;
        Date_pair other = (Date_pair) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date_start==null && other.getDate_start()==null) || 
             (this.date_start!=null &&
              this.date_start.equals(other.getDate_start()))) &&
            ((this.date_end==null && other.getDate_end()==null) || 
             (this.date_end!=null &&
              this.date_end.equals(other.getDate_end())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDate_start() != null) {
            _hashCode += getDate_start().hashCode();
        }
        if (getDate_end() != null) {
            _hashCode += getDate_end().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Date_pair.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", "date_pair"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", "date_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_end");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", "date_end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
