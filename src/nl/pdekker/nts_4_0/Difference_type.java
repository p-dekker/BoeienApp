/**
 * Difference_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Difference_type implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8685238582714304688L;

	/* Difference with comparative value */
	private float value_difference;

	/* Time difference with measuredata of comparative measurement */
	private org.apache.axis.types.Duration time_difference;

	public Difference_type() {
	}

	public Difference_type(float value_difference, org.apache.axis.types.Duration time_difference) {
		this.value_difference = value_difference;
		this.time_difference = time_difference;
	}

	/**
	 * Gets the value_difference value for this Difference_type.
	 * 
	 * @return value_difference * Difference with comparative value
	 */
	public float getValue_difference() {
		return value_difference;
	}

	/**
	 * Sets the value_difference value for this Difference_type.
	 * 
	 * @param value_difference
	 *            * Difference with comparative value
	 */
	public void setValue_difference(float value_difference) {
		this.value_difference = value_difference;
	}

	/**
	 * Gets the time_difference value for this Difference_type.
	 * 
	 * @return time_difference * Time difference with measuredata of comparative
	 *         measurement
	 */
	public org.apache.axis.types.Duration getTime_difference() {
		return time_difference;
	}

	/**
	 * Sets the time_difference value for this Difference_type.
	 * 
	 * @param time_difference
	 *            * Time difference with measuredata of comparative measurement
	 */
	public void setTime_difference(org.apache.axis.types.Duration time_difference) {
		this.time_difference = time_difference;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Difference_type)) {
			return false;
		}
		Difference_type other = (Difference_type) obj;
		if (this == obj) {
			return true;
		}
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && this.value_difference == other.getValue_difference()
				&& ((this.time_difference == null && other.getTime_difference() == null)
						|| (this.time_difference != null && this.time_difference.equals(other.getTime_difference())));
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
		_hashCode += new Float(getValue_difference()).hashCode();
		if (getTime_difference() != null) {
			_hashCode += getTime_difference().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Difference_type.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "difference_type"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("value_difference");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "value_difference"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("time_difference");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "time_difference"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "duration"));
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
