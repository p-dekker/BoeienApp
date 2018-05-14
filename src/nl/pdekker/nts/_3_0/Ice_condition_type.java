/**
 * Ice_condition_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Ice_condition_type  implements java.io.Serializable {
    /* Date of measurement */
    private java.util.Date measuredate;

    /* Time of measurement */
    private org.apache.axis.types.Time measuretime;

    /* Coded ice condition */
    private nl.pdekker.nts._3_0.Ice_condition_code_enum ice_condition_code;

    /* Coded accessibility */
    private nl.pdekker.nts._3_0.Ice_accessibility_code_enum ice_accessibility_code;

    /* Coded classification */
    private nl.pdekker.nts._3_0.Ice_classification_code_enum ice_classification_code;

    /* Coded situation */
    private nl.pdekker.nts._3_0.Ice_situation_code_enum ice_situation_code;

    public Ice_condition_type() {
    }

    public Ice_condition_type(
           java.util.Date measuredate,
           org.apache.axis.types.Time measuretime,
           nl.pdekker.nts._3_0.Ice_condition_code_enum ice_condition_code,
           nl.pdekker.nts._3_0.Ice_accessibility_code_enum ice_accessibility_code,
           nl.pdekker.nts._3_0.Ice_classification_code_enum ice_classification_code,
           nl.pdekker.nts._3_0.Ice_situation_code_enum ice_situation_code) {
           this.measuredate = measuredate;
           this.measuretime = measuretime;
           this.ice_condition_code = ice_condition_code;
           this.ice_accessibility_code = ice_accessibility_code;
           this.ice_classification_code = ice_classification_code;
           this.ice_situation_code = ice_situation_code;
    }


    /**
     * Gets the measuredate value for this Ice_condition_type.
     * 
     * @return measuredate   * Date of measurement
     */
    public java.util.Date getMeasuredate() {
        return measuredate;
    }


    /**
     * Sets the measuredate value for this Ice_condition_type.
     * 
     * @param measuredate   * Date of measurement
     */
    public void setMeasuredate(java.util.Date measuredate) {
        this.measuredate = measuredate;
    }


    /**
     * Gets the measuretime value for this Ice_condition_type.
     * 
     * @return measuretime   * Time of measurement
     */
    public org.apache.axis.types.Time getMeasuretime() {
        return measuretime;
    }


    /**
     * Sets the measuretime value for this Ice_condition_type.
     * 
     * @param measuretime   * Time of measurement
     */
    public void setMeasuretime(org.apache.axis.types.Time measuretime) {
        this.measuretime = measuretime;
    }


    /**
     * Gets the ice_condition_code value for this Ice_condition_type.
     * 
     * @return ice_condition_code   * Coded ice condition
     */
    public nl.pdekker.nts._3_0.Ice_condition_code_enum getIce_condition_code() {
        return ice_condition_code;
    }


    /**
     * Sets the ice_condition_code value for this Ice_condition_type.
     * 
     * @param ice_condition_code   * Coded ice condition
     */
    public void setIce_condition_code(nl.pdekker.nts._3_0.Ice_condition_code_enum ice_condition_code) {
        this.ice_condition_code = ice_condition_code;
    }


    /**
     * Gets the ice_accessibility_code value for this Ice_condition_type.
     * 
     * @return ice_accessibility_code   * Coded accessibility
     */
    public nl.pdekker.nts._3_0.Ice_accessibility_code_enum getIce_accessibility_code() {
        return ice_accessibility_code;
    }


    /**
     * Sets the ice_accessibility_code value for this Ice_condition_type.
     * 
     * @param ice_accessibility_code   * Coded accessibility
     */
    public void setIce_accessibility_code(nl.pdekker.nts._3_0.Ice_accessibility_code_enum ice_accessibility_code) {
        this.ice_accessibility_code = ice_accessibility_code;
    }


    /**
     * Gets the ice_classification_code value for this Ice_condition_type.
     * 
     * @return ice_classification_code   * Coded classification
     */
    public nl.pdekker.nts._3_0.Ice_classification_code_enum getIce_classification_code() {
        return ice_classification_code;
    }


    /**
     * Sets the ice_classification_code value for this Ice_condition_type.
     * 
     * @param ice_classification_code   * Coded classification
     */
    public void setIce_classification_code(nl.pdekker.nts._3_0.Ice_classification_code_enum ice_classification_code) {
        this.ice_classification_code = ice_classification_code;
    }


    /**
     * Gets the ice_situation_code value for this Ice_condition_type.
     * 
     * @return ice_situation_code   * Coded situation
     */
    public nl.pdekker.nts._3_0.Ice_situation_code_enum getIce_situation_code() {
        return ice_situation_code;
    }


    /**
     * Sets the ice_situation_code value for this Ice_condition_type.
     * 
     * @param ice_situation_code   * Coded situation
     */
    public void setIce_situation_code(nl.pdekker.nts._3_0.Ice_situation_code_enum ice_situation_code) {
        this.ice_situation_code = ice_situation_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ice_condition_type)) return false;
        Ice_condition_type other = (Ice_condition_type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.measuredate==null && other.getMeasuredate()==null) || 
             (this.measuredate!=null &&
              this.measuredate.equals(other.getMeasuredate()))) &&
            ((this.measuretime==null && other.getMeasuretime()==null) || 
             (this.measuretime!=null &&
              this.measuretime.equals(other.getMeasuretime()))) &&
            ((this.ice_condition_code==null && other.getIce_condition_code()==null) || 
             (this.ice_condition_code!=null &&
              this.ice_condition_code.equals(other.getIce_condition_code()))) &&
            ((this.ice_accessibility_code==null && other.getIce_accessibility_code()==null) || 
             (this.ice_accessibility_code!=null &&
              this.ice_accessibility_code.equals(other.getIce_accessibility_code()))) &&
            ((this.ice_classification_code==null && other.getIce_classification_code()==null) || 
             (this.ice_classification_code!=null &&
              this.ice_classification_code.equals(other.getIce_classification_code()))) &&
            ((this.ice_situation_code==null && other.getIce_situation_code()==null) || 
             (this.ice_situation_code!=null &&
              this.ice_situation_code.equals(other.getIce_situation_code())));
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
        if (getMeasuredate() != null) {
            _hashCode += getMeasuredate().hashCode();
        }
        if (getMeasuretime() != null) {
            _hashCode += getMeasuretime().hashCode();
        }
        if (getIce_condition_code() != null) {
            _hashCode += getIce_condition_code().hashCode();
        }
        if (getIce_accessibility_code() != null) {
            _hashCode += getIce_accessibility_code().hashCode();
        }
        if (getIce_classification_code() != null) {
            _hashCode += getIce_classification_code().hashCode();
        }
        if (getIce_situation_code() != null) {
            _hashCode += getIce_situation_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ice_condition_type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "ice_condition_type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measuredate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "measuredate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measuretime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "measuretime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ice_condition_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "ice_condition_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "ice_condition_code_enum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ice_accessibility_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "ice_accessibility_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "ice_accessibility_code_enum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ice_classification_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "ice_classification_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "ice_classification_code_enum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ice_situation_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "ice_situation_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "ice_situation_code_enum"));
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
