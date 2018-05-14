/**
 * Communication_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Communication_type  implements java.io.Serializable {
    /* Reporting regime (information, or duty to report) */
    private nl.pdekker.nts._3_0.Reporting_code_enum reporting_code;

    /* Communication type code */
    private nl.pdekker.nts._3_0.Communication_code_enum communication_code;

    /* Communication number, Telephone number, VHF channel, e-mail
     * address, URL, teletext page number */
    private java.lang.String number;

    public Communication_type() {
    }

    public Communication_type(
           nl.pdekker.nts._3_0.Reporting_code_enum reporting_code,
           nl.pdekker.nts._3_0.Communication_code_enum communication_code,
           java.lang.String number) {
           this.reporting_code = reporting_code;
           this.communication_code = communication_code;
           this.number = number;
    }


    /**
     * Gets the reporting_code value for this Communication_type.
     * 
     * @return reporting_code   * Reporting regime (information, or duty to report)
     */
    public nl.pdekker.nts._3_0.Reporting_code_enum getReporting_code() {
        return reporting_code;
    }


    /**
     * Sets the reporting_code value for this Communication_type.
     * 
     * @param reporting_code   * Reporting regime (information, or duty to report)
     */
    public void setReporting_code(nl.pdekker.nts._3_0.Reporting_code_enum reporting_code) {
        this.reporting_code = reporting_code;
    }


    /**
     * Gets the communication_code value for this Communication_type.
     * 
     * @return communication_code   * Communication type code
     */
    public nl.pdekker.nts._3_0.Communication_code_enum getCommunication_code() {
        return communication_code;
    }


    /**
     * Sets the communication_code value for this Communication_type.
     * 
     * @param communication_code   * Communication type code
     */
    public void setCommunication_code(nl.pdekker.nts._3_0.Communication_code_enum communication_code) {
        this.communication_code = communication_code;
    }


    /**
     * Gets the number value for this Communication_type.
     * 
     * @return number   * Communication number, Telephone number, VHF channel, e-mail
     * address, URL, teletext page number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Communication_type.
     * 
     * @param number   * Communication number, Telephone number, VHF channel, e-mail
     * address, URL, teletext page number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Communication_type)) return false;
        Communication_type other = (Communication_type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reporting_code==null && other.getReporting_code()==null) || 
             (this.reporting_code!=null &&
              this.reporting_code.equals(other.getReporting_code()))) &&
            ((this.communication_code==null && other.getCommunication_code()==null) || 
             (this.communication_code!=null &&
              this.communication_code.equals(other.getCommunication_code()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber())));
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
        if (getReporting_code() != null) {
            _hashCode += getReporting_code().hashCode();
        }
        if (getCommunication_code() != null) {
            _hashCode += getCommunication_code().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Communication_type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "communication_type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reporting_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "reporting_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "reporting_code_enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communication_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "communication_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "communication_code_enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
