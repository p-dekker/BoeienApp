/**
 * RIS_Message_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class RIS_Message_Type  implements java.io.Serializable {
    /* Identification section */
    private nl.pdekker.nts._3_0.Identification_type identification;

    /* Fairway and traffic related message section */
    private nl.pdekker.nts._3_0.Ftm_type[] ftm;

    /* Water related message section */
    private nl.pdekker.nts._3_0.Wrm_type[] wrm;

    /* Ice related message section */
    private nl.pdekker.nts._3_0.Icem_type[] icem;

    /* Weather related message section */
    private nl.pdekker.nts._3_0.Werm_type[] werm;

    public RIS_Message_Type() {
    }

    public RIS_Message_Type(
           nl.pdekker.nts._3_0.Identification_type identification,
           nl.pdekker.nts._3_0.Ftm_type[] ftm,
           nl.pdekker.nts._3_0.Wrm_type[] wrm,
           nl.pdekker.nts._3_0.Icem_type[] icem,
           nl.pdekker.nts._3_0.Werm_type[] werm) {
           this.identification = identification;
           this.ftm = ftm;
           this.wrm = wrm;
           this.icem = icem;
           this.werm = werm;
    }


    /**
     * Gets the identification value for this RIS_Message_Type.
     * 
     * @return identification   * Identification section
     */
    public nl.pdekker.nts._3_0.Identification_type getIdentification() {
        return identification;
    }


    /**
     * Sets the identification value for this RIS_Message_Type.
     * 
     * @param identification   * Identification section
     */
    public void setIdentification(nl.pdekker.nts._3_0.Identification_type identification) {
        this.identification = identification;
    }


    /**
     * Gets the ftm value for this RIS_Message_Type.
     * 
     * @return ftm   * Fairway and traffic related message section
     */
    public nl.pdekker.nts._3_0.Ftm_type[] getFtm() {
        return ftm;
    }


    /**
     * Sets the ftm value for this RIS_Message_Type.
     * 
     * @param ftm   * Fairway and traffic related message section
     */
    public void setFtm(nl.pdekker.nts._3_0.Ftm_type[] ftm) {
        this.ftm = ftm;
    }

    public nl.pdekker.nts._3_0.Ftm_type getFtm(int i) {
        return this.ftm[i];
    }

    public void setFtm(int i, nl.pdekker.nts._3_0.Ftm_type _value) {
        this.ftm[i] = _value;
    }


    /**
     * Gets the wrm value for this RIS_Message_Type.
     * 
     * @return wrm   * Water related message section
     */
    public nl.pdekker.nts._3_0.Wrm_type[] getWrm() {
        return wrm;
    }


    /**
     * Sets the wrm value for this RIS_Message_Type.
     * 
     * @param wrm   * Water related message section
     */
    public void setWrm(nl.pdekker.nts._3_0.Wrm_type[] wrm) {
        this.wrm = wrm;
    }

    public nl.pdekker.nts._3_0.Wrm_type getWrm(int i) {
        return this.wrm[i];
    }

    public void setWrm(int i, nl.pdekker.nts._3_0.Wrm_type _value) {
        this.wrm[i] = _value;
    }


    /**
     * Gets the icem value for this RIS_Message_Type.
     * 
     * @return icem   * Ice related message section
     */
    public nl.pdekker.nts._3_0.Icem_type[] getIcem() {
        return icem;
    }


    /**
     * Sets the icem value for this RIS_Message_Type.
     * 
     * @param icem   * Ice related message section
     */
    public void setIcem(nl.pdekker.nts._3_0.Icem_type[] icem) {
        this.icem = icem;
    }

    public nl.pdekker.nts._3_0.Icem_type getIcem(int i) {
        return this.icem[i];
    }

    public void setIcem(int i, nl.pdekker.nts._3_0.Icem_type _value) {
        this.icem[i] = _value;
    }


    /**
     * Gets the werm value for this RIS_Message_Type.
     * 
     * @return werm   * Weather related message section
     */
    public nl.pdekker.nts._3_0.Werm_type[] getWerm() {
        return werm;
    }


    /**
     * Sets the werm value for this RIS_Message_Type.
     * 
     * @param werm   * Weather related message section
     */
    public void setWerm(nl.pdekker.nts._3_0.Werm_type[] werm) {
        this.werm = werm;
    }

    public nl.pdekker.nts._3_0.Werm_type getWerm(int i) {
        return this.werm[i];
    }

    public void setWerm(int i, nl.pdekker.nts._3_0.Werm_type _value) {
        this.werm[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RIS_Message_Type)) return false;
        RIS_Message_Type other = (RIS_Message_Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identification==null && other.getIdentification()==null) || 
             (this.identification!=null &&
              this.identification.equals(other.getIdentification()))) &&
            ((this.ftm==null && other.getFtm()==null) || 
             (this.ftm!=null &&
              java.util.Arrays.equals(this.ftm, other.getFtm()))) &&
            ((this.wrm==null && other.getWrm()==null) || 
             (this.wrm!=null &&
              java.util.Arrays.equals(this.wrm, other.getWrm()))) &&
            ((this.icem==null && other.getIcem()==null) || 
             (this.icem!=null &&
              java.util.Arrays.equals(this.icem, other.getIcem()))) &&
            ((this.werm==null && other.getWerm()==null) || 
             (this.werm!=null &&
              java.util.Arrays.equals(this.werm, other.getWerm())));
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
        if (getIdentification() != null) {
            _hashCode += getIdentification().hashCode();
        }
        if (getFtm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFtm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFtm(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWrm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWrm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWrm(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIcem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIcem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIcem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWerm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWerm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWerm(), i);
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
        new org.apache.axis.description.TypeDesc(RIS_Message_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "RIS_Message_Type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "identification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "identification_type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "ftm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "ftm_type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wrm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "wrm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "wrm_type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "icem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "icem_type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("werm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "werm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "werm_type"));
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
