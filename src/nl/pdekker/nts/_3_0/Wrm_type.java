/**
 * Wrm_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Wrm_type  implements java.io.Serializable {
    private nl.pdekker.nts._3_0.Validity_period_type validity_period;

    private nl.pdekker.nts._3_0.Geo_object_type geo_object;

    /* Code of the reference used in the value */
    private nl.pdekker.nts._3_0.Reference_code_enum reference_code;

    private nl.pdekker.nts._3_0.Measure_type[] measure;

    public Wrm_type() {
    }

    public Wrm_type(
           nl.pdekker.nts._3_0.Validity_period_type validity_period,
           nl.pdekker.nts._3_0.Geo_object_type geo_object,
           nl.pdekker.nts._3_0.Reference_code_enum reference_code,
           nl.pdekker.nts._3_0.Measure_type[] measure) {
           this.validity_period = validity_period;
           this.geo_object = geo_object;
           this.reference_code = reference_code;
           this.measure = measure;
    }


    /**
     * Gets the validity_period value for this Wrm_type.
     * 
     * @return validity_period
     */
    public nl.pdekker.nts._3_0.Validity_period_type getValidity_period() {
        return validity_period;
    }


    /**
     * Sets the validity_period value for this Wrm_type.
     * 
     * @param validity_period
     */
    public void setValidity_period(nl.pdekker.nts._3_0.Validity_period_type validity_period) {
        this.validity_period = validity_period;
    }


    /**
     * Gets the geo_object value for this Wrm_type.
     * 
     * @return geo_object
     */
    public nl.pdekker.nts._3_0.Geo_object_type getGeo_object() {
        return geo_object;
    }


    /**
     * Sets the geo_object value for this Wrm_type.
     * 
     * @param geo_object
     */
    public void setGeo_object(nl.pdekker.nts._3_0.Geo_object_type geo_object) {
        this.geo_object = geo_object;
    }


    /**
     * Gets the reference_code value for this Wrm_type.
     * 
     * @return reference_code   * Code of the reference used in the value
     */
    public nl.pdekker.nts._3_0.Reference_code_enum getReference_code() {
        return reference_code;
    }


    /**
     * Sets the reference_code value for this Wrm_type.
     * 
     * @param reference_code   * Code of the reference used in the value
     */
    public void setReference_code(nl.pdekker.nts._3_0.Reference_code_enum reference_code) {
        this.reference_code = reference_code;
    }


    /**
     * Gets the measure value for this Wrm_type.
     * 
     * @return measure
     */
    public nl.pdekker.nts._3_0.Measure_type[] getMeasure() {
        return measure;
    }


    /**
     * Sets the measure value for this Wrm_type.
     * 
     * @param measure
     */
    public void setMeasure(nl.pdekker.nts._3_0.Measure_type[] measure) {
        this.measure = measure;
    }

    public nl.pdekker.nts._3_0.Measure_type getMeasure(int i) {
        return this.measure[i];
    }

    public void setMeasure(int i, nl.pdekker.nts._3_0.Measure_type _value) {
        this.measure[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Wrm_type)) return false;
        Wrm_type other = (Wrm_type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.validity_period==null && other.getValidity_period()==null) || 
             (this.validity_period!=null &&
              this.validity_period.equals(other.getValidity_period()))) &&
            ((this.geo_object==null && other.getGeo_object()==null) || 
             (this.geo_object!=null &&
              this.geo_object.equals(other.getGeo_object()))) &&
            ((this.reference_code==null && other.getReference_code()==null) || 
             (this.reference_code!=null &&
              this.reference_code.equals(other.getReference_code()))) &&
            ((this.measure==null && other.getMeasure()==null) || 
             (this.measure!=null &&
              java.util.Arrays.equals(this.measure, other.getMeasure())));
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
        if (getValidity_period() != null) {
            _hashCode += getValidity_period().hashCode();
        }
        if (getGeo_object() != null) {
            _hashCode += getGeo_object().hashCode();
        }
        if (getReference_code() != null) {
            _hashCode += getReference_code().hashCode();
        }
        if (getMeasure() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMeasure());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMeasure(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Wrm_type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "wrm_type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validity_period");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "validity_period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "validity_period_type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geo_object");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "geo_object"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "geo_object_type"));
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
        elemField.setFieldName("measure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "measure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "measure_type"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
