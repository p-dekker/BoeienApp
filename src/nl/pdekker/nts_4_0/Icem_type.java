/**
 * Icem_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Icem_type implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8593572170232707670L;

	/* Internal ID */
	private java.lang.String internal_id;

	/* NtS Number */
	private nl.pdekker.nts_4_0.Nts_number_type nts_number;

	/* Overall period of validity */
	private nl.pdekker.nts_4_0.Validity_period_type validity_period;

	/*
	 * Fairway section - the limitation inside the fairway section cannot be used in
	 * the ICEM
	 */
	private nl.pdekker.nts_4_0.Fairway_section_type fairway_section;

	/* Ice conditions */
	private nl.pdekker.nts_4_0.Ice_condition_type[] ice_condition;

	public Icem_type() {
	}

	public Icem_type(java.lang.String internal_id, nl.pdekker.nts_4_0.Nts_number_type nts_number,
			nl.pdekker.nts_4_0.Validity_period_type validity_period,
			nl.pdekker.nts_4_0.Fairway_section_type fairway_section,
			nl.pdekker.nts_4_0.Ice_condition_type[] ice_condition) {
		this.internal_id = internal_id;
		this.nts_number = nts_number;
		this.validity_period = validity_period;
		this.fairway_section = fairway_section;
		this.ice_condition = ice_condition;
	}

	/**
	 * Gets the internal_id value for this Icem_type.
	 * 
	 * @return internal_id * Internal ID
	 */
	public java.lang.String getInternal_id() {
		return internal_id;
	}

	/**
	 * Sets the internal_id value for this Icem_type.
	 * 
	 * @param internal_id
	 *            * Internal ID
	 */
	public void setInternal_id(java.lang.String internal_id) {
		this.internal_id = internal_id;
	}

	/**
	 * Gets the nts_number value for this Icem_type.
	 * 
	 * @return nts_number * NtS Number
	 */
	public nl.pdekker.nts_4_0.Nts_number_type getNts_number() {
		return nts_number;
	}

	/**
	 * Sets the nts_number value for this Icem_type.
	 * 
	 * @param nts_number
	 *            * NtS Number
	 */
	public void setNts_number(nl.pdekker.nts_4_0.Nts_number_type nts_number) {
		this.nts_number = nts_number;
	}

	/**
	 * Gets the validity_period value for this Icem_type.
	 * 
	 * @return validity_period * Overall period of validity
	 */
	public nl.pdekker.nts_4_0.Validity_period_type getValidity_period() {
		return validity_period;
	}

	/**
	 * Sets the validity_period value for this Icem_type.
	 * 
	 * @param validity_period
	 *            * Overall period of validity
	 */
	public void setValidity_period(nl.pdekker.nts_4_0.Validity_period_type validity_period) {
		this.validity_period = validity_period;
	}

	/**
	 * Gets the fairway_section value for this Icem_type.
	 * 
	 * @return fairway_section * Fairway section - the limitation inside the fairway
	 *         section cannot be used in the ICEM
	 */
	public nl.pdekker.nts_4_0.Fairway_section_type getFairway_section() {
		return fairway_section;
	}

	/**
	 * Sets the fairway_section value for this Icem_type.
	 * 
	 * @param fairway_section
	 *            * Fairway section - the limitation inside the fairway section
	 *            cannot be used in the ICEM
	 */
	public void setFairway_section(nl.pdekker.nts_4_0.Fairway_section_type fairway_section) {
		this.fairway_section = fairway_section;
	}

	/**
	 * Gets the ice_condition value for this Icem_type.
	 * 
	 * @return ice_condition * Ice conditions
	 */
	public nl.pdekker.nts_4_0.Ice_condition_type[] getIce_condition() {
		return ice_condition;
	}

	/**
	 * Sets the ice_condition value for this Icem_type.
	 * 
	 * @param ice_condition
	 *            * Ice conditions
	 */
	public void setIce_condition(nl.pdekker.nts_4_0.Ice_condition_type[] ice_condition) {
		this.ice_condition = ice_condition;
	}

	public nl.pdekker.nts_4_0.Ice_condition_type getIce_condition(int i) {
		return this.ice_condition[i];
	}

	public void setIce_condition(int i, nl.pdekker.nts_4_0.Ice_condition_type _value) {
		this.ice_condition[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Icem_type)) {
			return false;
		}
		Icem_type other = (Icem_type) obj;
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
				&& ((this.ice_condition == null && other.getIce_condition() == null) || (this.ice_condition != null
						&& java.util.Arrays.equals(this.ice_condition, other.getIce_condition())));
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
		if (getIce_condition() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getIce_condition()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getIce_condition(), i);
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
			Icem_type.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "icem_type"));
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
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "fairway_section_type"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ice_condition");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "ice_condition"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "ice_condition_type"));
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
