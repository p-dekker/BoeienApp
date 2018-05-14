/**
 * Limitation_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Limitation_type  implements java.io.Serializable {
    /* Limitation periods / intervals */
    private nl.pdekker.nts._3_0.Limitation_period_type[] limitation_period;

    /* Limitation code */
    private nl.pdekker.nts._3_0.Limitation_code_enum limitation_code;

    /* Side of the fairway */
    private nl.pdekker.nts._3_0.Position_code_enum position_code;

    private java.lang.Float value;

    /* Code of the reference used in the value */
    private nl.pdekker.nts._3_0.Reference_code_enum reference_code;

    private nl.pdekker.nts._3_0.Indication_code_enum indication_code;

    public Limitation_type() {
    }

    public Limitation_type(
           nl.pdekker.nts._3_0.Limitation_period_type[] limitation_period,
           nl.pdekker.nts._3_0.Limitation_code_enum limitation_code,
           nl.pdekker.nts._3_0.Position_code_enum position_code,
           java.lang.Float value,
           nl.pdekker.nts._3_0.Reference_code_enum reference_code,
           nl.pdekker.nts._3_0.Indication_code_enum indication_code) {
           this.limitation_period = limitation_period;
           this.limitation_code = limitation_code;
           this.position_code = position_code;
           this.value = value;
           this.reference_code = reference_code;
           this.indication_code = indication_code;
    }


    /**
     * Gets the limitation_period value for this Limitation_type.
     * 
     * @return limitation_period   * Limitation periods / intervals
     */
    public nl.pdekker.nts._3_0.Limitation_period_type[] getLimitation_period() {
        return limitation_period;
    }


    /**
     * Sets the limitation_period value for this Limitation_type.
     * 
     * @param limitation_period   * Limitation periods / intervals
     */
    public void setLimitation_period(nl.pdekker.nts._3_0.Limitation_period_type[] limitation_period) {
        this.limitation_period = limitation_period;
    }

    public nl.pdekker.nts._3_0.Limitation_period_type getLimitation_period(int i) {
        return this.limitation_period[i];
    }

    public void setLimitation_period(int i, nl.pdekker.nts._3_0.Limitation_period_type _value) {
        this.limitation_period[i] = _value;
    }


    /**
     * Gets the limitation_code value for this Limitation_type.
     * 
     * @return limitation_code   * Limitation code
     */
    public nl.pdekker.nts._3_0.Limitation_code_enum getLimitation_code() {
        return limitation_code;
    }


    /**
     * Sets the limitation_code value for this Limitation_type.
     * 
     * @param limitation_code   * Limitation code
     */
    public void setLimitation_code(nl.pdekker.nts._3_0.Limitation_code_enum limitation_code) {
        this.limitation_code = limitation_code;
    }


    /**
     * Gets the position_code value for this Limitation_type.
     * 
     * @return position_code   * Side of the fairway
     */
    public nl.pdekker.nts._3_0.Position_code_enum getPosition_code() {
        return position_code;
    }


    /**
     * Sets the position_code value for this Limitation_type.
     * 
     * @param position_code   * Side of the fairway
     */
    public void setPosition_code(nl.pdekker.nts._3_0.Position_code_enum position_code) {
        this.position_code = position_code;
    }


    /**
     * Gets the value value for this Limitation_type.
     * 
     * @return value
     */
    public java.lang.Float getValue() {
        return value;
    }


    /**
     * Sets the value value for this Limitation_type.
     * 
     * @param value
     */
    public void setValue(java.lang.Float value) {
        this.value = value;
    }


    /**
     * Gets the reference_code value for this Limitation_type.
     * 
     * @return reference_code   * Code of the reference used in the value
     */
    public nl.pdekker.nts._3_0.Reference_code_enum getReference_code() {
        return reference_code;
    }


    /**
     * Sets the reference_code value for this Limitation_type.
     * 
     * @param reference_code   * Code of the reference used in the value
     */
    public void setReference_code(nl.pdekker.nts._3_0.Reference_code_enum reference_code) {
        this.reference_code = reference_code;
    }


    /**
     * Gets the indication_code value for this Limitation_type.
     * 
     * @return indication_code
     */
    public nl.pdekker.nts._3_0.Indication_code_enum getIndication_code() {
        return indication_code;
    }


    /**
     * Sets the indication_code value for this Limitation_type.
     * 
     * @param indication_code
     */
    public void setIndication_code(nl.pdekker.nts._3_0.Indication_code_enum indication_code) {
        this.indication_code = indication_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Limitation_type)) return false;
        Limitation_type other = (Limitation_type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.limitation_period==null && other.getLimitation_period()==null) || 
             (this.limitation_period!=null &&
              java.util.Arrays.equals(this.limitation_period, other.getLimitation_period()))) &&
            ((this.limitation_code==null && other.getLimitation_code()==null) || 
             (this.limitation_code!=null &&
              this.limitation_code.equals(other.getLimitation_code()))) &&
            ((this.position_code==null && other.getPosition_code()==null) || 
             (this.position_code!=null &&
              this.position_code.equals(other.getPosition_code()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.reference_code==null && other.getReference_code()==null) || 
             (this.reference_code!=null &&
              this.reference_code.equals(other.getReference_code()))) &&
            ((this.indication_code==null && other.getIndication_code()==null) || 
             (this.indication_code!=null &&
              this.indication_code.equals(other.getIndication_code())));
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
        if (getLimitation_period() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLimitation_period());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLimitation_period(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLimitation_code() != null) {
            _hashCode += getLimitation_code().hashCode();
        }
        if (getPosition_code() != null) {
            _hashCode += getPosition_code().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getReference_code() != null) {
            _hashCode += getReference_code().hashCode();
        }
        if (getIndication_code() != null) {
            _hashCode += getIndication_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Limitation_type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "limitation_type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitation_period");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "limitation_period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "limitation_period_type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitation_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "limitation_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "limitation_code_enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "position_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "position_code_enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "reference_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "reference_code_enum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indication_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "indication_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "indication_code_enum"));
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
