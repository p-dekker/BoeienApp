/**
 * Measure_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Measure_type implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 536329338673196499L;

	/*
	 * Predicted measurement (1 or true) or real measurement (0 or false)
	 */
	private boolean predicted;

	/* Kind of water related information */
	private nl.pdekker.nts_4_0.Measure_code_enum measure_code;

	/* Measured or predicted value */
	private java.lang.Float value;

	/* Lowest value of confidence interval */
	private java.lang.Float value_min;

	/* Highest value of confidence interval */
	private java.lang.Float value_max;

	/* Unit of the water related value */
	private nl.pdekker.nts_4_0.Unit_enum unit;

	/* Barrage status */
	private nl.pdekker.nts_4_0.Barrage_code_enum barrage_code;

	/* Regime applicable */
	private nl.pdekker.nts_4_0.Regime_code_enum regime_code;

	/*
	 * Date and Time of measurement or predicted value including time zone
	 */
	private java.util.Calendar measuredate;

	/* Difference with comparative value */
	private nl.pdekker.nts_4_0.Difference_type difference;

	public Measure_type() {
	}

	public Measure_type(boolean predicted, nl.pdekker.nts_4_0.Measure_code_enum measure_code,
			java.lang.Float value, java.lang.Float value_min, java.lang.Float value_max,
			nl.pdekker.nts_4_0.Unit_enum unit, nl.pdekker.nts_4_0.Barrage_code_enum barrage_code,
			nl.pdekker.nts_4_0.Regime_code_enum regime_code, java.util.Calendar measuredate,
			nl.pdekker.nts_4_0.Difference_type difference) {
		this.predicted = predicted;
		this.measure_code = measure_code;
		this.value = value;
		this.value_min = value_min;
		this.value_max = value_max;
		this.unit = unit;
		this.barrage_code = barrage_code;
		this.regime_code = regime_code;
		this.measuredate = measuredate;
		this.difference = difference;
	}

	/**
	 * Gets the predicted value for this Measure_type.
	 * 
	 * @return predicted * Predicted measurement (1 or true) or real measurement (0
	 *         or false)
	 */
	public boolean isPredicted() {
		return predicted;
	}

	/**
	 * Sets the predicted value for this Measure_type.
	 * 
	 * @param predicted
	 *            * Predicted measurement (1 or true) or real measurement (0 or
	 *            false)
	 */
	public void setPredicted(boolean predicted) {
		this.predicted = predicted;
	}

	/**
	 * Gets the measure_code value for this Measure_type.
	 * 
	 * @return measure_code * Kind of water related information
	 */
	public nl.pdekker.nts_4_0.Measure_code_enum getMeasure_code() {
		return measure_code;
	}

	/**
	 * Sets the measure_code value for this Measure_type.
	 * 
	 * @param measure_code
	 *            * Kind of water related information
	 */
	public void setMeasure_code(nl.pdekker.nts_4_0.Measure_code_enum measure_code) {
		this.measure_code = measure_code;
	}

	/**
	 * Gets the value value for this Measure_type.
	 * 
	 * @return value * Measured or predicted value
	 */
	public java.lang.Float getValue() {
		return value;
	}

	/**
	 * Sets the value value for this Measure_type.
	 * 
	 * @param value
	 *            * Measured or predicted value
	 */
	public void setValue(java.lang.Float value) {
		this.value = value;
	}

	/**
	 * Gets the value_min value for this Measure_type.
	 * 
	 * @return value_min * Lowest value of confidence interval
	 */
	public java.lang.Float getValue_min() {
		return value_min;
	}

	/**
	 * Sets the value_min value for this Measure_type.
	 * 
	 * @param value_min
	 *            * Lowest value of confidence interval
	 */
	public void setValue_min(java.lang.Float value_min) {
		this.value_min = value_min;
	}

	/**
	 * Gets the value_max value for this Measure_type.
	 * 
	 * @return value_max * Highest value of confidence interval
	 */
	public java.lang.Float getValue_max() {
		return value_max;
	}

	/**
	 * Sets the value_max value for this Measure_type.
	 * 
	 * @param value_max
	 *            * Highest value of confidence interval
	 */
	public void setValue_max(java.lang.Float value_max) {
		this.value_max = value_max;
	}

	/**
	 * Gets the unit value for this Measure_type.
	 * 
	 * @return unit * Unit of the water related value
	 */
	public nl.pdekker.nts_4_0.Unit_enum getUnit() {
		return unit;
	}

	/**
	 * Sets the unit value for this Measure_type.
	 * 
	 * @param unit
	 *            * Unit of the water related value
	 */
	public void setUnit(nl.pdekker.nts_4_0.Unit_enum unit) {
		this.unit = unit;
	}

	/**
	 * Gets the barrage_code value for this Measure_type.
	 * 
	 * @return barrage_code * Barrage status
	 */
	public nl.pdekker.nts_4_0.Barrage_code_enum getBarrage_code() {
		return barrage_code;
	}

	/**
	 * Sets the barrage_code value for this Measure_type.
	 * 
	 * @param barrage_code
	 *            * Barrage status
	 */
	public void setBarrage_code(nl.pdekker.nts_4_0.Barrage_code_enum barrage_code) {
		this.barrage_code = barrage_code;
	}

	/**
	 * Gets the regime_code value for this Measure_type.
	 * 
	 * @return regime_code * Regime applicable
	 */
	public nl.pdekker.nts_4_0.Regime_code_enum getRegime_code() {
		return regime_code;
	}

	/**
	 * Sets the regime_code value for this Measure_type.
	 * 
	 * @param regime_code
	 *            * Regime applicable
	 */
	public void setRegime_code(nl.pdekker.nts_4_0.Regime_code_enum regime_code) {
		this.regime_code = regime_code;
	}

	/**
	 * Gets the measuredate value for this Measure_type.
	 * 
	 * @return measuredate * Date and Time of measurement or predicted value
	 *         including time zone
	 */
	public java.util.Calendar getMeasuredate() {
		return measuredate;
	}

	/**
	 * Sets the measuredate value for this Measure_type.
	 * 
	 * @param measuredate
	 *            * Date and Time of measurement or predicted value including time
	 *            zone
	 */
	public void setMeasuredate(java.util.Calendar measuredate) {
		this.measuredate = measuredate;
	}

	/**
	 * Gets the difference value for this Measure_type.
	 * 
	 * @return difference * Difference with comparative value
	 */
	public nl.pdekker.nts_4_0.Difference_type getDifference() {
		return difference;
	}

	/**
	 * Sets the difference value for this Measure_type.
	 * 
	 * @param difference
	 *            * Difference with comparative value
	 */
	public void setDifference(nl.pdekker.nts_4_0.Difference_type difference) {
		this.difference = difference;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Measure_type)) {
			return false;
		}
		Measure_type other = (Measure_type) obj;
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && this.predicted == other.isPredicted()
				&& ((this.measure_code == null && other.getMeasure_code() == null)
						|| (this.measure_code != null && this.measure_code.equals(other.getMeasure_code())))
				&& ((this.value == null && other.getValue() == null)
						|| (this.value != null && this.value.equals(other.getValue())))
				&& ((this.value_min == null && other.getValue_min() == null)
						|| (this.value_min != null && this.value_min.equals(other.getValue_min())))
				&& ((this.value_max == null && other.getValue_max() == null)
						|| (this.value_max != null && this.value_max.equals(other.getValue_max())))
				&& ((this.unit == null && other.getUnit() == null)
						|| (this.unit != null && this.unit.equals(other.getUnit())))
				&& ((this.barrage_code == null && other.getBarrage_code() == null)
						|| (this.barrage_code != null && this.barrage_code.equals(other.getBarrage_code())))
				&& ((this.regime_code == null && other.getRegime_code() == null)
						|| (this.regime_code != null && this.regime_code.equals(other.getRegime_code())))
				&& ((this.measuredate == null && other.getMeasuredate() == null)
						|| (this.measuredate != null && this.measuredate.equals(other.getMeasuredate())))
				&& ((this.difference == null && other.getDifference() == null)
						|| (this.difference != null && this.difference.equals(other.getDifference())));
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
		_hashCode += (isPredicted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getMeasure_code() != null) {
			_hashCode += getMeasure_code().hashCode();
		}
		if (getValue() != null) {
			_hashCode += getValue().hashCode();
		}
		if (getValue_min() != null) {
			_hashCode += getValue_min().hashCode();
		}
		if (getValue_max() != null) {
			_hashCode += getValue_max().hashCode();
		}
		if (getUnit() != null) {
			_hashCode += getUnit().hashCode();
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
		if (getDifference() != null) {
			_hashCode += getDifference().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Measure_type.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "measure_type"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("predicted");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "predicted"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("measure_code");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "measure_code"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "measure_code_enum"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("value");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "value"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("value_min");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "value_min"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
		elemField.setMinOccurs(0);
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
		elemField.setFieldName("unit");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "unit"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "unit_enum"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("barrage_code");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "barrage_code"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "barrage_code_enum"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("regime_code");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "regime_code"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "regime_code_enum"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("measuredate");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "measuredate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("difference");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "difference"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "difference_type"));
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
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

}
