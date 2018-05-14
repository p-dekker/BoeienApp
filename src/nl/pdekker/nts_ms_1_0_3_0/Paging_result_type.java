/**
 * Paging_result_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_ms_1_0_3_0;

public class Paging_result_type  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger offset;

    private org.apache.axis.types.NonNegativeInteger count;

    private org.apache.axis.types.NonNegativeInteger total_count;

    public Paging_result_type() {
    }

    public Paging_result_type(
           org.apache.axis.types.NonNegativeInteger offset,
           org.apache.axis.types.NonNegativeInteger count,
           org.apache.axis.types.NonNegativeInteger total_count) {
           this.offset = offset;
           this.count = count;
           this.total_count = total_count;
    }


    /**
     * Gets the offset value for this Paging_result_type.
     * 
     * @return offset
     */
    public org.apache.axis.types.NonNegativeInteger getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this Paging_result_type.
     * 
     * @param offset
     */
    public void setOffset(org.apache.axis.types.NonNegativeInteger offset) {
        this.offset = offset;
    }


    /**
     * Gets the count value for this Paging_result_type.
     * 
     * @return count
     */
    public org.apache.axis.types.NonNegativeInteger getCount() {
        return count;
    }


    /**
     * Sets the count value for this Paging_result_type.
     * 
     * @param count
     */
    public void setCount(org.apache.axis.types.NonNegativeInteger count) {
        this.count = count;
    }


    /**
     * Gets the total_count value for this Paging_result_type.
     * 
     * @return total_count
     */
    public org.apache.axis.types.NonNegativeInteger getTotal_count() {
        return total_count;
    }


    /**
     * Sets the total_count value for this Paging_result_type.
     * 
     * @param total_count
     */
    public void setTotal_count(org.apache.axis.types.NonNegativeInteger total_count) {
        this.total_count = total_count;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paging_result_type)) return false;
        Paging_result_type other = (Paging_result_type) obj;
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
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.total_count==null && other.getTotal_count()==null) || 
             (this.total_count!=null &&
              this.total_count.equals(other.getTotal_count())));
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
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getTotal_count() != null) {
            _hashCode += getTotal_count().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Paging_result_type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", "paging_result_type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", "total_count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
