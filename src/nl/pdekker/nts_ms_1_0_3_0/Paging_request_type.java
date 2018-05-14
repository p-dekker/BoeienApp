/**
 * Paging_request_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_ms_1_0_3_0;

public class Paging_request_type  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger offset;

    private org.apache.axis.types.NonNegativeInteger limit;

    private boolean total_count;

    public Paging_request_type() {
    }

    public Paging_request_type(
           org.apache.axis.types.NonNegativeInteger offset,
           org.apache.axis.types.NonNegativeInteger limit,
           boolean total_count) {
           this.offset = offset;
           this.limit = limit;
           this.total_count = total_count;
    }


    /**
     * Gets the offset value for this Paging_request_type.
     * 
     * @return offset
     */
    public org.apache.axis.types.NonNegativeInteger getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this Paging_request_type.
     * 
     * @param offset
     */
    public void setOffset(org.apache.axis.types.NonNegativeInteger offset) {
        this.offset = offset;
    }


    /**
     * Gets the limit value for this Paging_request_type.
     * 
     * @return limit
     */
    public org.apache.axis.types.NonNegativeInteger getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this Paging_request_type.
     * 
     * @param limit
     */
    public void setLimit(org.apache.axis.types.NonNegativeInteger limit) {
        this.limit = limit;
    }


    /**
     * Gets the total_count value for this Paging_request_type.
     * 
     * @return total_count
     */
    public boolean isTotal_count() {
        return total_count;
    }


    /**
     * Sets the total_count value for this Paging_request_type.
     * 
     * @param total_count
     */
    public void setTotal_count(boolean total_count) {
        this.total_count = total_count;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paging_request_type)) return false;
        Paging_request_type other = (Paging_request_type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit()))) &&
            this.total_count == other.isTotal_count();
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
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        _hashCode += (isTotal_count() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Paging_request_type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", "paging_request_type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", "total_count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
