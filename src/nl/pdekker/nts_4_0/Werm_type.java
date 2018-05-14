/**
 * Werm_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

import java.util.Arrays;

public class Werm_type implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1642401565515225489L;

	/* Internal ID */
	private java.lang.String internal_id;

	/* NtS Number */
	private nl.pdekker.nts_4_0.Nts_number_type nts_number;

	/* Overall period of validity */
	private nl.pdekker.nts_4_0.Validity_period_type validity_period;

	/* Fairway section */
	private nl.pdekker.nts_4_0.Fairway_section_werm_type fairway_section;

	/* Actual or Forecast report sections */
	private nl.pdekker.nts_4_0.Weather_report_type[] weather_report;

	public Werm_type() {
	}

	@Override
	public String toString() {
		return "Werm_type [internal_id=" + internal_id + ", nts_number=" + nts_number + ", validity_period="
				+ validity_period + ", fairway_section=" + fairway_section + ", weather_report="
				+ Arrays.toString(weather_report) + "]";
	}

	public Werm_type(java.lang.String internal_id, nl.pdekker.nts_4_0.Nts_number_type nts_number,
			nl.pdekker.nts_4_0.Validity_period_type validity_period,
			nl.pdekker.nts_4_0.Fairway_section_werm_type fairway_section,
			nl.pdekker.nts_4_0.Weather_report_type[] weather_report) {
		this.internal_id = internal_id;
		this.nts_number = nts_number;
		this.validity_period = validity_period;
		this.fairway_section = fairway_section;
		this.weather_report = weather_report;
	}

	/**
	 * Gets the internal_id value for this Werm_type.
	 * 
	 * @return internal_id * Internal ID
	 */
	public java.lang.String getInternal_id() {
		return internal_id;
	}

	/**
	 * Sets the internal_id value for this Werm_type.
	 * 
	 * @param internal_id
	 *            * Internal ID
	 */
	public void setInternal_id(java.lang.String internal_id) {
		this.internal_id = internal_id;
	}

	/**
	 * Gets the nts_number value for this Werm_type.
	 * 
	 * @return nts_number * NtS Number
	 */
	public nl.pdekker.nts_4_0.Nts_number_type getNts_number() {
		return nts_number;
	}

	/**
	 * Sets the nts_number value for this Werm_type.
	 * 
	 * @param nts_number
	 *            * NtS Number
	 */
	public void setNts_number(nl.pdekker.nts_4_0.Nts_number_type nts_number) {
		this.nts_number = nts_number;
	}

	/**
	 * Gets the validity_period value for this Werm_type.
	 * 
	 * @return validity_period * Overall period of validity
	 */
	public nl.pdekker.nts_4_0.Validity_period_type getValidity_period() {
		return validity_period;
	}

	/**
	 * Sets the validity_period value for this Werm_type.
	 * 
	 * @param validity_period
	 *            * Overall period of validity
	 */
	public void setValidity_period(nl.pdekker.nts_4_0.Validity_period_type validity_period) {
		this.validity_period = validity_period;
	}

	/**
	 * Gets the fairway_section value for this Werm_type.
	 * 
	 * @return fairway_section * Fairway section
	 */
	public nl.pdekker.nts_4_0.Fairway_section_werm_type getFairway_section() {
		return fairway_section;
	}

	/**
	 * Sets the fairway_section value for this Werm_type.
	 * 
	 * @param fairway_section
	 *            * Fairway section
	 */
	public void setFairway_section(nl.pdekker.nts_4_0.Fairway_section_werm_type fairway_section) {
		this.fairway_section = fairway_section;
	}

	/**
	 * Gets the weather_report value for this Werm_type.
	 * 
	 * @return weather_report * Actual or Forecast report sections
	 */
	public nl.pdekker.nts_4_0.Weather_report_type[] getWeather_report() {
		return weather_report;
	}

	/**
	 * Sets the weather_report value for this Werm_type.
	 * 
	 * @param weather_report
	 *            * Actual or Forecast report sections
	 */
	public void setWeather_report(nl.pdekker.nts_4_0.Weather_report_type[] weather_report) {
		this.weather_report = weather_report;
	}

	public nl.pdekker.nts_4_0.Weather_report_type getWeather_report(int i) {
		return this.weather_report[i];
	}

	public void setWeather_report(int i, nl.pdekker.nts_4_0.Weather_report_type _value) {
		this.weather_report[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Werm_type)) {
			return false;
		}
		Werm_type other = (Werm_type) obj;
		if (this == obj) {
			return true;
		}
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.internal_id == null && other.getInternal_id() == null)
						|| (this.internal_id != null && this.internal_id.equals(other.getInternal_id())))
				&& ((this.nts_number == null && other.getNts_number() == null)
						|| (this.nts_number != null && this.nts_number.equals(other.getNts_number())))
				&& ((this.validity_period == null && other.getValidity_period() == null)
						|| (this.validity_period != null && this.validity_period.equals(other.getValidity_period())))
				&& ((this.fairway_section == null && other.getFairway_section() == null)
						|| (this.fairway_section != null && this.fairway_section.equals(other.getFairway_section())))
				&& ((this.weather_report == null && other.getWeather_report() == null) || (this.weather_report != null
						&& java.util.Arrays.equals(this.weather_report, other.getWeather_report())));
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
		if (getInternal_id() != null) {
			_hashCode += getInternal_id().hashCode();
		}
		if (getNts_number() != null) {
			_hashCode += getNts_number().hashCode();
		}
		if (getValidity_period() != null) {
			_hashCode += getValidity_period().hashCode();
		}
		if (getFairway_section() != null) {
			_hashCode += getFairway_section().hashCode();
		}
		if (getWeather_report() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getWeather_report()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getWeather_report(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Werm_type.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "werm_type"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("internal_id");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "internal_id"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nts_number");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "nts_number"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "nts_number_type"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("validity_period");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "validity_period"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "validity_period_type"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fairway_section");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "fairway_section"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "fairway_section_werm_type"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("weather_report");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_report"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "weather_report_type"));
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
