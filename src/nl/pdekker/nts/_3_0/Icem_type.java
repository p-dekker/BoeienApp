/**
 * Icem_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Icem_type  implements java.io.Serializable {
    private nl.pdekker.nts._3_0.Validity_period_type validity_period;

    private nl.pdekker.nts._3_0.Fairway_section_type fairway_section;

    private nl.pdekker.nts._3_0.Ice_condition_type[] ice_condition;

    public Icem_type() {
    }

    public Icem_type(
           nl.pdekker.nts._3_0.Validity_period_type validity_period,
           nl.pdekker.nts._3_0.Fairway_section_type fairway_section,
           nl.pdekker.nts._3_0.Ice_condition_type[] ice_condition) {
           this.validity_period = validity_period;
           this.fairway_section = fairway_section;
           this.ice_condition = ice_condition;
    }


    /**
     * Gets the validity_period value for this Icem_type.
     * 
     * @return validity_period
     */
    public nl.pdekker.nts._3_0.Validity_period_type getValidity_period() {
        return validity_period;
    }


    /**
     * Sets the validity_period value for this Icem_type.
     * 
     * @param validity_period
     */
    public void setValidity_period(nl.pdekker.nts._3_0.Validity_period_type validity_period) {
        this.validity_period = validity_period;
    }


    /**
     * Gets the fairway_section value for this Icem_type.
     * 
     * @return fairway_section
     */
    public nl.pdekker.nts._3_0.Fairway_section_type getFairway_section() {
        return fairway_section;
    }


    /**
     * Sets the fairway_section value for this Icem_type.
     * 
     * @param fairway_section
     */
    public void setFairway_section(nl.pdekker.nts._3_0.Fairway_section_type fairway_section) {
        this.fairway_section = fairway_section;
    }


    /**
     * Gets the ice_condition value for this Icem_type.
     * 
     * @return ice_condition
     */
    public nl.pdekker.nts._3_0.Ice_condition_type[] getIce_condition() {
        return ice_condition;
    }


    /**
     * Sets the ice_condition value for this Icem_type.
     * 
     * @param ice_condition
     */
    public void setIce_condition(nl.pdekker.nts._3_0.Ice_condition_type[] ice_condition) {
        this.ice_condition = ice_condition;
    }

    public nl.pdekker.nts._3_0.Ice_condition_type getIce_condition(int i) {
        return this.ice_condition[i];
    }

    public void setIce_condition(int i, nl.pdekker.nts._3_0.Ice_condition_type _value) {
        this.ice_condition[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Icem_type)) return false;
        Icem_type other = (Icem_type) obj;
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
            ((this.fairway_section==null && other.getFairway_section()==null) || 
             (this.fairway_section!=null &&
              this.fairway_section.equals(other.getFairway_section()))) &&
            ((this.ice_condition==null && other.getIce_condition()==null) || 
             (this.ice_condition!=null &&
              java.util.Arrays.equals(this.ice_condition, other.getIce_condition())));
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
        if (getFairway_section() != null) {
            _hashCode += getFairway_section().hashCode();
        }
        if (getIce_condition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIce_condition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIce_condition(), i);
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
        new org.apache.axis.description.TypeDesc(Icem_type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "icem_type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validity_period");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "validity_period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "validity_period_type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fairway_section");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "fairway_section"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "fairway_section_type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ice_condition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "ice_condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "ice_condition_type"));
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
