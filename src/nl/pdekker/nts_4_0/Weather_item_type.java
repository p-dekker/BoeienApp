/**
 * Weather_item_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Weather_item_type implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8693075407848908500L;

	/* Weather item type (Wind, Wave etc) */
	private nl.pdekker.nts_4_0.Weather_item_code_enum weather_item_code;

	/* Actual or Minimum value */
	private float value_min;

	/* Maximum value */
	private java.lang.Float value_max;

	/* Gusts value (Wind) */
	private java.lang.Float value_gusts;

	/* Unit of the value */
	private nl.pdekker.nts_4_0.Unit_enum unit;

	/* Classification of wind report */
	private nl.pdekker.nts_4_0.Weather_category_code_enum weather_category_code;

	/* Direction of wind or wave */
	private nl.pdekker.nts_4_0.Weather_direction_code_enum direction_code_min;

	/* Direction of wind or wave */
	private nl.pdekker.nts_4_0.Weather_direction_code_enum direction_code_max;

	public Weather_item_type() {
	}

	@Override
	public String toString() {
		return "Weather_item_type [weather_item_code=" + weather_item_code + ", value_min=" + value_min + ", value_max="
				+ value_max + ", value_gusts=" + value_gusts + ", unit=" + unit + ", weather_category_code="
				+ weather_category_code + ", direction_code_min=" + direction_code_min + ", direction_code_max="
				+ direction_code_max + "]";
	}

	public Weather_item_type(nl.pdekker.nts_4_0.Weather_item_code_enum weather_item_code, float value_min,
			java.lang.Float value_max, java.lang.Float value_gusts, nl.pdekker.nts_4_0.Unit_enum unit,
			nl.pdekker.nts_4_0.Weather_category_code_enum weather_category_code,
			nl.pdekker.nts_4_0.Weather_direction_code_enum direction_code_min,
			nl.pdekker.nts_4_0.Weather_direction_code_enum direction_code_max) {
		this.weather_item_code = weather_item_code;
		this.value_min = value_min;
		this.value_max = value_max;
		this.value_gusts = value_gusts;
		this.unit = unit;
		this.weather_category_code = weather_category_code;
		this.direction_code_min = direction_code_min;
		this.direction_code_max = direction_code_max;
	}

	/**
	 * Gets the weather_item_code value for this Weather_item_type.
	 * 
	 * @return weather_item_code * Weather item type (Wind, Wave etc)
	 */
	public nl.pdekker.nts_4_0.Weather_item_code_enum getWeather_item_code() {
		return weather_item_code;
	}

	/**
	 * Sets the weather_item_code value for this Weather_item_type.
	 * 
	 * @param weather_item_code
	 *            * Weather item type (Wind, Wave etc)
	 */
	public void setWeather_item_code(nl.pdekker.nts_4_0.Weather_item_code_enum weather_item_code) {
		this.weather_item_code = weather_item_code;
	}

	/**
	 * Gets the value_min value for this Weather_item_type.
	 * 
	 * @return value_min * Actual or Minimum value
	 */
	public float getValue_min() {
		return value_min;
	}

	/**
	 * Sets the value_min value for this Weather_item_type.
	 * 
	 * @param value_min
	 *            * Actual or Minimum value
	 */
	public void setValue_min(float value_min) {
		this.value_min = value_min;
	}

	/**
	 * Gets the value_max value for this Weather_item_type.
	 * 
	 * @return value_max * Maximum value
	 */
	public java.lang.Float getValue_max() {
		return value_max;
	}

	/**
	 * Sets the value_max value for this Weather_item_type.
	 * 
	 * @param value_max
	 *            * Maximum value
	 */
	public void setValue_max(java.lang.Float value_max) {
		this.value_max = value_max;
	}

	/**
	 * Gets the value_gusts value for this Weather_item_type.
	 * 
	 * @return value_gusts * Gusts value (Wind)
	 */
	public java.lang.Float getValue_gusts() {
		return value_gusts;
	}

	/**
	 * Sets the value_gusts value for this Weather_item_type.
	 * 
	 * @param value_gusts
	 *            * Gusts value (Wind)
	 */
	public void setValue_gusts(java.lang.Float value_gusts) {
		this.value_gusts = value_gusts;
	}

	/**
	 * Gets the unit value for this Weather_item_type.
	 * 
	 * @return unit * Unit of the value
	 */
	public nl.pdekker.nts_4_0.Unit_enum getUnit() {
		return unit;
	}

	/**
	 * Sets the unit value for this Weather_item_type.
	 * 
	 * @param unit
	 *            * Unit of the value
	 */
	public void setUnit(nl.pdekker.nts_4_0.Unit_enum unit) {
		this.unit = unit;
	}

	/**
	 * Gets the weather_category_code value for this Weather_item_type.
	 * 
	 * @return weather_category_code * Classification of wind report
	 */
	public nl.pdekker.nts_4_0.Weather_category_code_enum getWeather_category_code() {
		return weather_category_code;
	}

	/**
	 * Sets the weather_category_code value for this Weather_item_type.
	 * 
	 * @param weather_category_code
	 *            * Classification of wind report
	 */
	public void setWeather_category_code(nl.pdekker.nts_4_0.Weather_category_code_enum weather_category_code) {
		this.weather_category_code = weather_category_code;
	}

	/**
	 * Gets the direction_code_min value for this Weather_item_type.
	 * 
	 * @return direction_code_min * Direction of wind or wave
	 */
	public nl.pdekker.nts_4_0.Weather_direction_code_enum getDirection_code_min() {
		return direction_code_min;
	}

	/**
	 * Sets the direction_code_min value for this Weather_item_type.
	 * 
	 * @param direction_code_min
	 *            * Direction of wind or wave
	 */
	public void setDirection_code_min(nl.pdekker.nts_4_0.Weather_direction_code_enum direction_code_min) {
		this.direction_code_min = direction_code_min;
	}

	/**
	 * Gets the direction_code_max value for this Weather_item_type.
	 * 
	 * @return direction_code_max * Direction of wind or wave
	 */
	public nl.pdekker.nts_4_0.Weather_direction_code_enum getDirection_code_max() {
		return direction_code_max;
	}

	/**
	 * Sets the direction_code_max value for this Weather_item_type.
	 * 
	 * @param direction_code_max
	 *            * Direction of wind or wave
	 */
	public void setDirection_code_max(nl.pdekker.nts_4_0.Weather_direction_code_enum direction_code_max) {
		this.direction_code_max = direction_code_max;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Weather_item_type)) {
			return false;
		}
		Weather_item_type other = (Weather_item_type) obj;
		if (this == obj) {
			return true;
		}
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.weather_item_code == null && other.getWeather_item_code() == null)
				|| (this.weather_item_code != null && this.weather_item_code.equals(other.getWeather_item_code())))
				&& this.value_min == other.getValue_min()
				&& ((this.value_max == null && other.getValue_max() == null)
						|| (this.value_max != null && this.value_max.equals(other.getValue_max())))
				&& ((this.value_gusts == null && other.getValue_gusts() == null)
						|| (this.value_gusts != null && this.value_gusts.equals(other.getValue_gusts())))
				&& ((this.unit == null && other.getUnit() == null)
						|| (this.unit != null && this.unit.equals(other.getUnit())))
				&& ((this.weather_category_code == null && other.getWeather_category_code() == null)
						|| (this.weather_category_code != null
								&& this.weather_category_code.equals(other.getWeather_category_code())))
				&& ((this.direction_code_min == null && other.getDirection_code_min() == null)
						|| (this.direction_code_min != null
								&& this.direction_code_min.equals(other.getDirection_code_min())))
				&& ((this.direction_code_max == null && other.getDirection_code_max() == null)
						|| (this.direction_code_max != null
								&& this.direction_code_max.equals(other.getDirection_code_max())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	@Override
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
		if (getUnit() != null) {
			_hashCode += getUnit().hashCode();
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
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Weather_item_type.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_item_type"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("weather_item_code");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_item_code"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_item_code_enum"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("value_min");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "value_min"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("value_max");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "value_max"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("value_gusts");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "value_gusts"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("unit");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "unit"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "unit_enum"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("weather_category_code");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_category_code"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_category_code_enum"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("direction_code_min");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "direction_code_min"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_direction_code_enum"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("direction_code_max");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "direction_code_max"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_direction_code_enum"));
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
	public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType,
			java.lang.Class<?> _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType,
			java.lang.Class<?> _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

}
