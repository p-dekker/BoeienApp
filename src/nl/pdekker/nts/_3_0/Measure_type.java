/**
 * Measure_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Measure_type  implements java.io.Serializable {
    /* Predicted or actual measurement */
    private boolean predicted;

    /* Kind of water related information the message shows */
    private nl.pdekker.nts._3_0.Measure_code_enum measure_code;

    /* Measured or predicted value */
    private java.lang.Float value;

    /* Difference with previous measurement */
    private java.lang.Float difference;

    /* Status of the barrage */
    private nl.pdekker.nts._3_0.Barrage_code_enum barrage_code;

    /* Applicable regime */
    private nl.pdekker.nts._3_0.Regime_code_enum regime_code;

    /* Date of measurement */
    private java.util.Date measuredate;

    /* Time of measurement */
    private org.apache.axis.types.Time measuretime;

    public Measure_type() {
    }

    public Measure_type(
           boolean predicted,
           nl.pdekker.nts._3_0.Measure_code_enum measure_code,
           java.lang.Float value,
           java.lang.Float difference,
           nl.pdekker.nts._3_0.Barrage_code_enum barrage_code,
           nl.pdekker.nts._3_0.Regime_code_enum regime_code,
           java.util.Date measuredate,
           org.apache.axis.types.Time measuretime) {
           this.predicted = predicted;
           this.measure_code = measure_code;
           this.value = value;
           this.difference = difference;
           this.barrage_code = barrage_code;
           this.regime_code = regime_code;
           this.measuredate = measuredate;
           this.measuretime = measuretime;
    }


    /**
     * Gets the predicted value for this Measure_type.
     * 
     * @return predicted   * Predicted or actual measurement
     */
    public boolean isPredicted() {
        return predicted;
    }


    /**
     * Sets the predicted value for this Measure_type.
     * 
     * @param predicted   * Predicted or actual measurement
     */
    public void setPredicted(boolean predicted) {
        this.predicted = predicted;
    }


    /**
     * Gets the measure_code value for this Measure_type.
     * 
     * @return measure_code   * Kind of water related information the message shows
     */
    public nl.pdekker.nts._3_0.Measure_code_enum getMeasure_code() {
        return measure_code;
    }


    /**
     * Sets the measure_code value for this Measure_type.
     * 
     * @param measure_code   * Kind of water related information the message shows
     */
    public void setMeasure_code(nl.pdekker.nts._3_0.Measure_code_enum measure_code) {
        this.measure_code = measure_code;
    }


    /**
     * Gets the value value for this Measure_type.
     * 
     * @return value   * Measured or predicted value
     */
    public java.lang.Float getValue() {
        return value;
    }


    /**
     * Sets the value value for this Measure_type.
     * 
     * @param value   * Measured or predicted value
     */
    public void setValue(java.lang.Float value) {
        this.value = value;
    }


    /**
     * Gets the difference value for this Measure_type.
     * 
     * @return difference   * Difference with previous measurement
     */
    public java.lang.Float getDifference() {
        return difference;
    }


    /**
     * Sets the difference value for this Measure_type.
     * 
     * @param difference   * Difference with previous measurement
     */
    public void setDifference(java.lang.Float difference) {
        this.difference = difference;
    }


    /**
     * Gets the barrage_code value for this Measure_type.
     * 
     * @return barrage_code   * Status of the barrage
     */
    public nl.pdekker.nts._3_0.Barrage_code_enum getBarrage_code() {
        return barrage_code;
    }


    /**
     * Sets the barrage_code value for this Measure_type.
     * 
     * @param barrage_code   * Status of the barrage
     */
    public void setBarrage_code(nl.pdekker.nts._3_0.Barrage_code_enum barrage_code) {
        this.barrage_code = barrage_code;
    }


    /**
     * Gets the regime_code value for this Measure_type.
     * 
     * @return regime_code   * Applicable regime
     */
    public nl.pdekker.nts._3_0.Regime_code_enum getRegime_code() {
        return regime_code;
    }


    /**
     * Sets the regime_code value for this Measure_type.
     * 
     * @param regime_code   * Applicable regime
     */
    public void setRegime_code(nl.pdekker.nts._3_0.Regime_code_enum regime_code) {
        this.regime_code = regime_code;
    }


    /**
     * Gets the measuredate value for this Measure_type.
     * 
     * @return measuredate   * Date of measurement
     */
    public java.util.Date getMeasuredate() {
        return measuredate;
    }


    /**
     * Sets the measuredate value for this Measure_type.
     * 
     * @param measuredate   * Date of measurement
     */
    public void setMeasuredate(java.util.Date measuredate) {
        this.measuredate = measuredate;
    }


    /**
     * Gets the measuretime value for this Measure_type.
     * 
     * @return measuretime   * Time of measurement
     */
    public org.apache.axis.types.Time getMeasuretime() {
        return measuretime;
    }


    /**
     * Sets the measuretime value for this Measure_type.
     * 
     * @param measuretime   * Time of measurement
     */
    public void setMeasuretime(org.apache.axis.types.Time measuretime) {
        this.measuretime = measuretime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Measure_type)) return false;
        Measure_type other = (Measure_type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.predicted == other.isPredicted() &&
            ((this.measure_code==null && other.getMeasure_code()==null) || 
             (this.measure_code!=null &&
              this.measure_code.equals(other.getMeasure_code()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.difference==null && other.getDifference()==null) || 
             (this.difference!=null &&
              this.difference.equals(other.getDifference()))) &&
            ((this.barrage_code==null && other.getBarrage_code()==null) || 
             (this.barrage_code!=null &&
              this.barrage_code.equals(other.getBarrage_code()))) &&
            ((this.regime_code==null && other.getRegime_code()==null) || 
             (this.regime_code!=null &&
              this.regime_code.equals(other.getRegime_code()))) &&
            ((this.measuredate==null && other.getMeasuredate()==null) || 
             (this.measuredate!=null &&
              this.measuredate.equals(other.getMeasuredate()))) &&
            ((this.measuretime==null && other.getMeasuretime()==null) || 
             (this.measuretime!=null &&
              this.measuretime.equals(other.getMeasuretime())));
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
        _hashCode += (isPredicted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMeasure_code() != null) {
            _hashCode += getMeasure_code().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getDifference() != null) {
            _hashCode += getDifference().hashCode();
        }
        if (getBarrage_code() != null) {
            _hashCode += getBarrage_code().hashCode();
        }
        if (getRegime_code() != null) {
            _hashCode += getRegime_code().hashCode();
        }
        if (getMeasuredate() != null) {
            _hashCode += getMeasuredate().hashCode();
        }
        if (getMeasuretime() != null) {
            _hashCode += getMeasuretime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Measure_type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "measure_type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predicted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "predicted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measure_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "measure_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "measure_code_enum"));
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
        elemField.setFieldName("difference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "difference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barrage_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "barrage_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "barrage_code_enum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regime_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "regime_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "regime_code_enum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
