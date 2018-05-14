/**
 * Weather_report_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Weather_report_type  implements java.io.Serializable {
    /* Forecast (true) OR Actual report (false) */
    private boolean forecast;

    /* Classification of weather report */
    private java.lang.String[] weather_class_code;

    private nl.pdekker.nts._3_0.Weather_item_type[] weather_item;

    public Weather_report_type() {
    }

    public Weather_report_type(
           boolean forecast,
           java.lang.String[] weather_class_code,
           nl.pdekker.nts._3_0.Weather_item_type[] weather_item) {
           this.forecast = forecast;
           this.weather_class_code = weather_class_code;
           this.weather_item = weather_item;
    }


    /**
     * Gets the forecast value for this Weather_report_type.
     * 
     * @return forecast   * Forecast (true) OR Actual report (false)
     */
    public boolean isForecast() {
        return forecast;
    }


    /**
     * Sets the forecast value for this Weather_report_type.
     * 
     * @param forecast   * Forecast (true) OR Actual report (false)
     */
    public void setForecast(boolean forecast) {
        this.forecast = forecast;
    }


    /**
     * Gets the weather_class_code value for this Weather_report_type.
     * 
     * @return weather_class_code   * Classification of weather report
     */
    public java.lang.String[] getWeather_class_code() {
        return weather_class_code;
    }


    /**
     * Sets the weather_class_code value for this Weather_report_type.
     * 
     * @param weather_class_code   * Classification of weather report
     */
    public void setWeather_class_code(java.lang.String[] weather_class_code) {
        this.weather_class_code = weather_class_code;
    }

    public java.lang.String getWeather_class_code(int i) {
        return this.weather_class_code[i];
    }

    public void setWeather_class_code(int i, java.lang.String _value) {
        this.weather_class_code[i] = _value;
    }


    /**
     * Gets the weather_item value for this Weather_report_type.
     * 
     * @return weather_item
     */
    public nl.pdekker.nts._3_0.Weather_item_type[] getWeather_item() {
        return weather_item;
    }


    /**
     * Sets the weather_item value for this Weather_report_type.
     * 
     * @param weather_item
     */
    public void setWeather_item(nl.pdekker.nts._3_0.Weather_item_type[] weather_item) {
        this.weather_item = weather_item;
    }

    public nl.pdekker.nts._3_0.Weather_item_type getWeather_item(int i) {
        return this.weather_item[i];
    }

    public void setWeather_item(int i, nl.pdekker.nts._3_0.Weather_item_type _value) {
        this.weather_item[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Weather_report_type)) return false;
        Weather_report_type other = (Weather_report_type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.forecast == other.isForecast() &&
            ((this.weather_class_code==null && other.getWeather_class_code()==null) || 
             (this.weather_class_code!=null &&
              java.util.Arrays.equals(this.weather_class_code, other.getWeather_class_code()))) &&
            ((this.weather_item==null && other.getWeather_item()==null) || 
             (this.weather_item!=null &&
              java.util.Arrays.equals(this.weather_item, other.getWeather_item())));
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
        _hashCode += (isForecast() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getWeather_class_code() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWeather_class_code());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWeather_class_code(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWeather_item() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWeather_item());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWeather_item(), i);
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
        new org.apache.axis.description.TypeDesc(Weather_report_type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "weather_report_type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecast");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "forecast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weather_class_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "weather_class_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", ">weather_report_type>weather_class_code"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weather_item");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "weather_item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "weather_item_type"));
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
