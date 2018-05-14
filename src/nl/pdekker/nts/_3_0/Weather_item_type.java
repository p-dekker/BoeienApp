/**
 * Weather_item_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Weather_item_type  implements java.io.Serializable {
    /* Weather item: Wind, Wave, Visibility, Rain, Snow, Airtemp,
     * Watertemp */
    private java.lang.String weather_item_code;

    /* Actual value or min value. Units depending on item type */
    private float value_min;

    /* Max value units depending on itemtype */
    private java.lang.Float value_max;

    private java.lang.Float value_gusts;

    private java.lang.String weather_category_code;

    private java.lang.String direction_code_min;

    private java.lang.String direction_code_max;

    public Weather_item_type() {
    }

    public Weather_item_type(
           java.lang.String weather_item_code,
           float value_min,
           java.lang.Float value_max,
           java.lang.Float value_gusts,
           java.lang.String weather_category_code,
           java.lang.String direction_code_min,
           java.lang.String direction_code_max) {
           this.weather_item_code = weather_item_code;
           this.value_min = value_min;
           this.value_max = value_max;
           this.value_gusts = value_gusts;
           this.weather_category_code = weather_category_code;
           this.direction_code_min = direction_code_min;
           this.direction_code_max = direction_code_max;
    }


    /**
     * Gets the weather_item_code value for this Weather_item_type.
     * 
     * @return weather_item_code   * Weather item: Wind, Wave, Visibility, Rain, Snow, Airtemp,
     * Watertemp
     */
    public java.lang.String getWeather_item_code() {
        return weather_item_code;
    }


    /**
     * Sets the weather_item_code value for this Weather_item_type.
     * 
     * @param weather_item_code   * Weather item: Wind, Wave, Visibility, Rain, Snow, Airtemp,
     * Watertemp
     */
    public void setWeather_item_code(java.lang.String weather_item_code) {
        this.weather_item_code = weather_item_code;
    }


    /**
     * Gets the value_min value for this Weather_item_type.
     * 
     * @return value_min   * Actual value or min value. Units depending on item type
     */
    public float getValue_min() {
        return value_min;
    }


    /**
     * Sets the value_min value for this Weather_item_type.
     * 
     * @param value_min   * Actual value or min value. Units depending on item type
     */
    public void setValue_min(float value_min) {
        this.value_min = value_min;
    }


    /**
     * Gets the value_max value for this Weather_item_type.
     * 
     * @return value_max   * Max value units depending on itemtype
     */
    public java.lang.Float getValue_max() {
        return value_max;
    }


    /**
     * Sets the value_max value for this Weather_item_type.
     * 
     * @param value_max   * Max value units depending on itemtype
     */
    public void setValue_max(java.lang.Float value_max) {
        this.value_max = value_max;
    }


    /**
     * Gets the value_gusts value for this Weather_item_type.
     * 
     * @return value_gusts
     */
    public java.lang.Float getValue_gusts() {
        return value_gusts;
    }


    /**
     * Sets the value_gusts value for this Weather_item_type.
     * 
     * @param value_gusts
     */
    public void setValue_gusts(java.lang.Float value_gusts) {
        this.value_gusts = value_gusts;
    }


    /**
     * Gets the weather_category_code value for this Weather_item_type.
     * 
     * @return weather_category_code
     */
    public java.lang.String getWeather_category_code() {
        return weather_category_code;
    }


    /**
     * Sets the weather_category_code value for this Weather_item_type.
     * 
     * @param weather_category_code
     */
    public void setWeather_category_code(java.lang.String weather_category_code) {
        this.weather_category_code = weather_category_code;
    }


    /**
     * Gets the direction_code_min value for this Weather_item_type.
     * 
     * @return direction_code_min
     */
    public java.lang.String getDirection_code_min() {
        return direction_code_min;
    }


    /**
     * Sets the direction_code_min value for this Weather_item_type.
     * 
     * @param direction_code_min
     */
    public void setDirection_code_min(java.lang.String direction_code_min) {
        this.direction_code_min = direction_code_min;
    }


    /**
     * Gets the direction_code_max value for this Weather_item_type.
     * 
     * @return direction_code_max
     */
    public java.lang.String getDirection_code_max() {
        return direction_code_max;
    }


    /**
     * Sets the direction_code_max value for this Weather_item_type.
     * 
     * @param direction_code_max
     */
    public void setDirection_code_max(java.lang.String direction_code_max) {
        this.direction_code_max = direction_code_max;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Weather_item_type)) return false;
        Weather_item_type other = (Weather_item_type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.weather_item_code==null && other.getWeather_item_code()==null) || 
             (this.weather_item_code!=null &&
              this.weather_item_code.equals(other.getWeather_item_code()))) &&
            this.value_min == other.getValue_min() &&
            ((this.value_max==null && other.getValue_max()==null) || 
             (this.value_max!=null &&
              this.value_max.equals(other.getValue_max()))) &&
            ((this.value_gusts==null && other.getValue_gusts()==null) || 
             (this.value_gusts!=null &&
              this.value_gusts.equals(other.getValue_gusts()))) &&
            ((this.weather_category_code==null && other.getWeather_category_code()==null) || 
             (this.weather_category_code!=null &&
              this.weather_category_code.equals(other.getWeather_category_code()))) &&
            ((this.direction_code_min==null && other.getDirection_code_min()==null) || 
             (this.direction_code_min!=null &&
              this.direction_code_min.equals(other.getDirection_code_min()))) &&
            ((this.direction_code_max==null && other.getDirection_code_max()==null) || 
             (this.direction_code_max!=null &&
              this.direction_code_max.equals(other.getDirection_code_max())));
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
        if (getWeather_item_code() != null) {
            _hashCode += getWeather_item_code().hashCode();
        }
        _hashCode += new Float(getValue_min()).hashCode();
        if (getValue_max() != null) {
            _hashCode += getValue_max().hashCode();
        }
        if (getValue_gusts() != null) {
            _hashCode += getValue_gusts().hashCode();
        }
        if (getWeather_category_code() != null) {
            _hashCode += getWeather_category_code().hashCode();
        }
        if (getDirection_code_min() != null) {
            _hashCode += getDirection_code_min().hashCode();
        }
        if (getDirection_code_max() != null) {
            _hashCode += getDirection_code_max().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Weather_item_type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "weather_item_type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weather_item_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "weather_item_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value_min");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "value_min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value_max");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "value_max"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value_gusts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "value_gusts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weather_category_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "weather_category_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction_code_min");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "direction_code_min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction_code_max");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "direction_code_max"));
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
