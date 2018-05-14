/**
 * Ftm_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Ftm_type  implements java.io.Serializable {
    /* Year of the notice */
    private org.apache.axis.types.Year year;

    /* Sequence number of the notice in given year */
    private java.math.BigInteger number;

    /* Serial number for replacements and withdrawals */
    private java.math.BigInteger serial_number;

    /* Target group information */
    private nl.pdekker.nts._3_0.Target_group_type[] target_group;

    /* Subject code contains the most important limitation code, if
     * multiple limitations are valid, the subject code is the limitation
     * code with the highest impact on shipping traffic */
    private nl.pdekker.nts._3_0.Subject_code_enum subject_code;

    private nl.pdekker.nts._3_0.Validity_period_type validity_period;

    /* Textual contents in the original language */
    private java.lang.String contents;

    /* Notice source (authority) */
    private java.lang.String source;

    /* Reason / justification of the notice */
    private nl.pdekker.nts._3_0.Reason_code_enum reason_code;

    /* Communication channel information */
    private nl.pdekker.nts._3_0.Communication_type[] communication;

    /* Fairway section */
    private nl.pdekker.nts._3_0.Fairway_section_type[] fairway_section;

    private nl.pdekker.nts._3_0.Object_type[] object;

    public Ftm_type() {
    }

    public Ftm_type(
           org.apache.axis.types.Year year,
           java.math.BigInteger number,
           java.math.BigInteger serial_number,
           nl.pdekker.nts._3_0.Target_group_type[] target_group,
           nl.pdekker.nts._3_0.Subject_code_enum subject_code,
           nl.pdekker.nts._3_0.Validity_period_type validity_period,
           java.lang.String contents,
           java.lang.String source,
           nl.pdekker.nts._3_0.Reason_code_enum reason_code,
           nl.pdekker.nts._3_0.Communication_type[] communication,
           nl.pdekker.nts._3_0.Fairway_section_type[] fairway_section,
           nl.pdekker.nts._3_0.Object_type[] object) {
           this.year = year;
           this.number = number;
           this.serial_number = serial_number;
           this.target_group = target_group;
           this.subject_code = subject_code;
           this.validity_period = validity_period;
           this.contents = contents;
           this.source = source;
           this.reason_code = reason_code;
           this.communication = communication;
           this.fairway_section = fairway_section;
           this.object = object;
    }


    /**
     * Gets the year value for this Ftm_type.
     * 
     * @return year   * Year of the notice
     */
    public org.apache.axis.types.Year getYear() {
        return year;
    }


    /**
     * Sets the year value for this Ftm_type.
     * 
     * @param year   * Year of the notice
     */
    public void setYear(org.apache.axis.types.Year year) {
        this.year = year;
    }


    /**
     * Gets the number value for this Ftm_type.
     * 
     * @return number   * Sequence number of the notice in given year
     */
    public java.math.BigInteger getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Ftm_type.
     * 
     * @param number   * Sequence number of the notice in given year
     */
    public void setNumber(java.math.BigInteger number) {
        this.number = number;
    }


    /**
     * Gets the serial_number value for this Ftm_type.
     * 
     * @return serial_number   * Serial number for replacements and withdrawals
     */
    public java.math.BigInteger getSerial_number() {
        return serial_number;
    }


    /**
     * Sets the serial_number value for this Ftm_type.
     * 
     * @param serial_number   * Serial number for replacements and withdrawals
     */
    public void setSerial_number(java.math.BigInteger serial_number) {
        this.serial_number = serial_number;
    }


    /**
     * Gets the target_group value for this Ftm_type.
     * 
     * @return target_group   * Target group information
     */
    public nl.pdekker.nts._3_0.Target_group_type[] getTarget_group() {
        return target_group;
    }


    /**
     * Sets the target_group value for this Ftm_type.
     * 
     * @param target_group   * Target group information
     */
    public void setTarget_group(nl.pdekker.nts._3_0.Target_group_type[] target_group) {
        this.target_group = target_group;
    }

    public nl.pdekker.nts._3_0.Target_group_type getTarget_group(int i) {
        return this.target_group[i];
    }

    public void setTarget_group(int i, nl.pdekker.nts._3_0.Target_group_type _value) {
        this.target_group[i] = _value;
    }


    /**
     * Gets the subject_code value for this Ftm_type.
     * 
     * @return subject_code   * Subject code contains the most important limitation code, if
     * multiple limitations are valid, the subject code is the limitation
     * code with the highest impact on shipping traffic
     */
    public nl.pdekker.nts._3_0.Subject_code_enum getSubject_code() {
        return subject_code;
    }


    /**
     * Sets the subject_code value for this Ftm_type.
     * 
     * @param subject_code   * Subject code contains the most important limitation code, if
     * multiple limitations are valid, the subject code is the limitation
     * code with the highest impact on shipping traffic
     */
    public void setSubject_code(nl.pdekker.nts._3_0.Subject_code_enum subject_code) {
        this.subject_code = subject_code;
    }


    /**
     * Gets the validity_period value for this Ftm_type.
     * 
     * @return validity_period
     */
    public nl.pdekker.nts._3_0.Validity_period_type getValidity_period() {
        return validity_period;
    }


    /**
     * Sets the validity_period value for this Ftm_type.
     * 
     * @param validity_period
     */
    public void setValidity_period(nl.pdekker.nts._3_0.Validity_period_type validity_period) {
        this.validity_period = validity_period;
    }


    /**
     * Gets the contents value for this Ftm_type.
     * 
     * @return contents   * Textual contents in the original language
     */
    public java.lang.String getContents() {
        return contents;
    }


    /**
     * Sets the contents value for this Ftm_type.
     * 
     * @param contents   * Textual contents in the original language
     */
    public void setContents(java.lang.String contents) {
        this.contents = contents;
    }


    /**
     * Gets the source value for this Ftm_type.
     * 
     * @return source   * Notice source (authority)
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this Ftm_type.
     * 
     * @param source   * Notice source (authority)
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the reason_code value for this Ftm_type.
     * 
     * @return reason_code   * Reason / justification of the notice
     */
    public nl.pdekker.nts._3_0.Reason_code_enum getReason_code() {
        return reason_code;
    }


    /**
     * Sets the reason_code value for this Ftm_type.
     * 
     * @param reason_code   * Reason / justification of the notice
     */
    public void setReason_code(nl.pdekker.nts._3_0.Reason_code_enum reason_code) {
        this.reason_code = reason_code;
    }


    /**
     * Gets the communication value for this Ftm_type.
     * 
     * @return communication   * Communication channel information
     */
    public nl.pdekker.nts._3_0.Communication_type[] getCommunication() {
        return communication;
    }


    /**
     * Sets the communication value for this Ftm_type.
     * 
     * @param communication   * Communication channel information
     */
    public void setCommunication(nl.pdekker.nts._3_0.Communication_type[] communication) {
        this.communication = communication;
    }

    public nl.pdekker.nts._3_0.Communication_type getCommunication(int i) {
        return this.communication[i];
    }

    public void setCommunication(int i, nl.pdekker.nts._3_0.Communication_type _value) {
        this.communication[i] = _value;
    }


    /**
     * Gets the fairway_section value for this Ftm_type.
     * 
     * @return fairway_section   * Fairway section
     */
    public nl.pdekker.nts._3_0.Fairway_section_type[] getFairway_section() {
        return fairway_section;
    }


    /**
     * Sets the fairway_section value for this Ftm_type.
     * 
     * @param fairway_section   * Fairway section
     */
    public void setFairway_section(nl.pdekker.nts._3_0.Fairway_section_type[] fairway_section) {
        this.fairway_section = fairway_section;
    }

    public nl.pdekker.nts._3_0.Fairway_section_type getFairway_section(int i) {
        return this.fairway_section[i];
    }

    public void setFairway_section(int i, nl.pdekker.nts._3_0.Fairway_section_type _value) {
        this.fairway_section[i] = _value;
    }


    /**
     * Gets the object value for this Ftm_type.
     * 
     * @return object
     */
    public nl.pdekker.nts._3_0.Object_type[] getObject() {
        return object;
    }


    /**
     * Sets the object value for this Ftm_type.
     * 
     * @param object
     */
    public void setObject(nl.pdekker.nts._3_0.Object_type[] object) {
        this.object = object;
    }

    public nl.pdekker.nts._3_0.Object_type getObject(int i) {
        return this.object[i];
    }

    public void setObject(int i, nl.pdekker.nts._3_0.Object_type _value) {
        this.object[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ftm_type)) return false;
        Ftm_type other = (Ftm_type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.year==null && other.getYear()==null) || 
             (this.year!=null &&
              this.year.equals(other.getYear()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.serial_number==null && other.getSerial_number()==null) || 
             (this.serial_number!=null &&
              this.serial_number.equals(other.getSerial_number()))) &&
            ((this.target_group==null && other.getTarget_group()==null) || 
             (this.target_group!=null &&
              java.util.Arrays.equals(this.target_group, other.getTarget_group()))) &&
            ((this.subject_code==null && other.getSubject_code()==null) || 
             (this.subject_code!=null &&
              this.subject_code.equals(other.getSubject_code()))) &&
            ((this.validity_period==null && other.getValidity_period()==null) || 
             (this.validity_period!=null &&
              this.validity_period.equals(other.getValidity_period()))) &&
            ((this.contents==null && other.getContents()==null) || 
             (this.contents!=null &&
              this.contents.equals(other.getContents()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.reason_code==null && other.getReason_code()==null) || 
             (this.reason_code!=null &&
              this.reason_code.equals(other.getReason_code()))) &&
            ((this.communication==null && other.getCommunication()==null) || 
             (this.communication!=null &&
              java.util.Arrays.equals(this.communication, other.getCommunication()))) &&
            ((this.fairway_section==null && other.getFairway_section()==null) || 
             (this.fairway_section!=null &&
              java.util.Arrays.equals(this.fairway_section, other.getFairway_section()))) &&
            ((this.object==null && other.getObject()==null) || 
             (this.object!=null &&
              java.util.Arrays.equals(this.object, other.getObject())));
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
        if (getYear() != null) {
            _hashCode += getYear().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getSerial_number() != null) {
            _hashCode += getSerial_number().hashCode();
        }
        if (getTarget_group() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTarget_group());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTarget_group(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubject_code() != null) {
            _hashCode += getSubject_code().hashCode();
        }
        if (getValidity_period() != null) {
            _hashCode += getValidity_period().hashCode();
        }
        if (getContents() != null) {
            _hashCode += getContents().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getReason_code() != null) {
            _hashCode += getReason_code().hashCode();
        }
        if (getCommunication() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommunication());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommunication(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFairway_section() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFairway_section());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFairway_section(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getObject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObject(), i);
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
        new org.apache.axis.description.TypeDesc(Ftm_type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "ftm_type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "serial_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target_group");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "target_group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "target_group_type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "subject_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "subject_code_enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validity_period");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "validity_period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "validity_period_type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "contents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "reason_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "reason_code_enum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "communication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "communication_type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fairway_section");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "fairway_section"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "fairway_section_type"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "object"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "object_type"));
        elemField.setMinOccurs(0);
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
