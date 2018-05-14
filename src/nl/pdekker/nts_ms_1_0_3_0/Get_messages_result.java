/**
 * Get_messages_result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_ms_1_0_3_0;

public class Get_messages_result  implements java.io.Serializable {
    private nl.pdekker.nts._3_0.RIS_Message_Type[] result_message;

    private nl.pdekker.nts_ms_1_0_3_0.Error_code_type[] result_error;

    private nl.pdekker.nts_ms_1_0_3_0.Paging_result_type paging_result;

    public Get_messages_result() {
    }

    public Get_messages_result(
           nl.pdekker.nts._3_0.RIS_Message_Type[] result_message,
           nl.pdekker.nts_ms_1_0_3_0.Error_code_type[] result_error,
           nl.pdekker.nts_ms_1_0_3_0.Paging_result_type paging_result) {
           this.result_message = result_message;
           this.result_error = result_error;
           this.paging_result = paging_result;
    }


    /**
     * Gets the result_message value for this Get_messages_result.
     * 
     * @return result_message
     */
    public nl.pdekker.nts._3_0.RIS_Message_Type[] getResult_message() {
        return result_message;
    }


    /**
     * Sets the result_message value for this Get_messages_result.
     * 
     * @param result_message
     */
    public void setResult_message(nl.pdekker.nts._3_0.RIS_Message_Type[] result_message) {
        this.result_message = result_message;
    }

    public nl.pdekker.nts._3_0.RIS_Message_Type getResult_message(int i) {
        return this.result_message[i];
    }

    public void setResult_message(int i, nl.pdekker.nts._3_0.RIS_Message_Type _value) {
        this.result_message[i] = _value;
    }


    /**
     * Gets the result_error value for this Get_messages_result.
     * 
     * @return result_error
     */
    public nl.pdekker.nts_ms_1_0_3_0.Error_code_type[] getResult_error() {
        return result_error;
    }


    /**
     * Sets the result_error value for this Get_messages_result.
     * 
     * @param result_error
     */
    public void setResult_error(nl.pdekker.nts_ms_1_0_3_0.Error_code_type[] result_error) {
        this.result_error = result_error;
    }

    public nl.pdekker.nts_ms_1_0_3_0.Error_code_type getResult_error(int i) {
        return this.result_error[i];
    }

    public void setResult_error(int i, nl.pdekker.nts_ms_1_0_3_0.Error_code_type _value) {
        this.result_error[i] = _value;
    }


    /**
     * Gets the paging_result value for this Get_messages_result.
     * 
     * @return paging_result
     */
    public nl.pdekker.nts_ms_1_0_3_0.Paging_result_type getPaging_result() {
        return paging_result;
    }


    /**
     * Sets the paging_result value for this Get_messages_result.
     * 
     * @param paging_result
     */
    public void setPaging_result(nl.pdekker.nts_ms_1_0_3_0.Paging_result_type paging_result) {
        this.paging_result = paging_result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_messages_result)) return false;
        Get_messages_result other = (Get_messages_result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.result_message==null && other.getResult_message()==null) || 
             (this.result_message!=null &&
              java.util.Arrays.equals(this.result_message, other.getResult_message()))) &&
            ((this.result_error==null && other.getResult_error()==null) || 
             (this.result_error!=null &&
              java.util.Arrays.equals(this.result_error, other.getResult_error()))) &&
            ((this.paging_result==null && other.getPaging_result()==null) || 
             (this.paging_result!=null &&
              this.paging_result.equals(other.getPaging_result())));
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
        if (getResult_message() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResult_message());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResult_message(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResult_error() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResult_error());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResult_error(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaging_result() != null) {
            _hashCode += getPaging_result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_messages_result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", ">get_messages_result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result_message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", "result_message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "RIS_Message_Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result_error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", "result_error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", "error_code_type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paging_result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", "paging_result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/1.0.3.0", "paging_result_type"));
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
