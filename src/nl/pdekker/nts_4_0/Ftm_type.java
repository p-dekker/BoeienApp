/**
 * Ftm_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

import java.util.Arrays;

public class Ftm_type implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2719990835451370780L;

	/* Internal ID */
	private java.lang.String internal_id;

	/* NtS Number */
	private nl.pdekker.nts_4_0.Nts_number_type nts_number;

	/* Target group information */
	private nl.pdekker.nts_4_0.Target_group_type[] target_group;

	/*
	 * Subject code must contain one of the following: Announcement (ANNOUN),
	 * Warning (WARNIN), Notice withdrawn (CANCEL) or Information service (INFSER).
	 * More information on the use of codes can be found in the NtS Encoding Guide.
	 */
	private nl.pdekker.nts_4_0.Subject_code_enum subject_code;

	/* Overall period of validity */
	private nl.pdekker.nts_4_0.Validity_period_type validity_period;

	/* Additional information in local language */
	private java.lang.String contents;

	/* Notice source (name of authority) */
	private java.lang.String source;

	/* Reason / justification of the notice */
	private nl.pdekker.nts_4_0.Reason_code_enum reason_code;

	/* Communication channel information */
	private nl.pdekker.nts_4_0.Communication_type[] communication;

	/* Fairway section */
	private nl.pdekker.nts_4_0.Fairway_section_type fairway_section;

	/* Object section */
	private nl.pdekker.nts_4_0.Object_type object;

	public Ftm_type() {
	}

	@Override
	public String toString() {
		return "Ftm_type [internal_id=" + internal_id + ", nts_number=" + nts_number + ", target_group="
				+ Arrays.toString(target_group) + ", subject_code=" + subject_code + ", validity_period="
				+ validity_period + ", contents=" + contents + ", source=" + source + ", reason_code=" + reason_code
				+ ", communication=" + Arrays.toString(communication) + ", fairway_section=" + fairway_section
				+ ", object=" + object + "]";
	}

	public Ftm_type(java.lang.String internal_id, nl.pdekker.nts_4_0.Nts_number_type nts_number,
			nl.pdekker.nts_4_0.Target_group_type[] target_group,
			nl.pdekker.nts_4_0.Subject_code_enum subject_code,
			nl.pdekker.nts_4_0.Validity_period_type validity_period, java.lang.String contents,
			java.lang.String source, nl.pdekker.nts_4_0.Reason_code_enum reason_code,
			nl.pdekker.nts_4_0.Communication_type[] communication,
			nl.pdekker.nts_4_0.Fairway_section_type fairway_section, nl.pdekker.nts_4_0.Object_type object) {
		this.internal_id = internal_id;
		this.nts_number = nts_number;
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
	 * Gets the internal_id value for this Ftm_type.
	 * 
	 * @return internal_id * Internal ID
	 */
	public java.lang.String getInternal_id() {
		return internal_id;
	}

	/**
	 * Sets the internal_id value for this Ftm_type.
	 * 
	 * @param internal_id
	 *            * Internal ID
	 */
	public void setInternal_id(java.lang.String internal_id) {
		this.internal_id = internal_id;
	}

	/**
	 * Gets the nts_number value for this Ftm_type.
	 * 
	 * @return nts_number * NtS Number
	 */
	public nl.pdekker.nts_4_0.Nts_number_type getNts_number() {
		return nts_number;
	}

	/**
	 * Sets the nts_number value for this Ftm_type.
	 * 
	 * @param nts_number
	 *            * NtS Number
	 */
	public void setNts_number(nl.pdekker.nts_4_0.Nts_number_type nts_number) {
		this.nts_number = nts_number;
	}

	/**
	 * Gets the target_group value for this Ftm_type.
	 * 
	 * @return target_group * Target group information
	 */
	public nl.pdekker.nts_4_0.Target_group_type[] getTarget_group() {
		return target_group;
	}

	/**
	 * Sets the target_group value for this Ftm_type.
	 * 
	 * @param target_group
	 *            * Target group information
	 */
	public void setTarget_group(nl.pdekker.nts_4_0.Target_group_type[] target_group) {
		this.target_group = target_group;
	}

	public nl.pdekker.nts_4_0.Target_group_type getTarget_group(int i) {
		return this.target_group[i];
	}

	public void setTarget_group(int i, nl.pdekker.nts_4_0.Target_group_type _value) {
		this.target_group[i] = _value;
	}

	/**
	 * Gets the subject_code value for this Ftm_type.
	 * 
	 * @return subject_code * Subject code must contain one of the following:
	 *         Announcement (ANNOUN), Warning (WARNIN), Notice withdrawn (CANCEL) or
	 *         Information service (INFSER). More information on the use of codes
	 *         can be found in the NtS Encoding Guide.
	 */
	public nl.pdekker.nts_4_0.Subject_code_enum getSubject_code() {
		return subject_code;
	}

	/**
	 * Sets the subject_code value for this Ftm_type.
	 * 
	 * @param subject_code
	 *            * Subject code must contain one of the following: Announcement
	 *            (ANNOUN), Warning (WARNIN), Notice withdrawn (CANCEL) or
	 *            Information service (INFSER). More information on the use of codes
	 *            can be found in the NtS Encoding Guide.
	 */
	public void setSubject_code(nl.pdekker.nts_4_0.Subject_code_enum subject_code) {
		this.subject_code = subject_code;
	}

	/**
	 * Gets the validity_period value for this Ftm_type.
	 * 
	 * @return validity_period * Overall period of validity
	 */
	public nl.pdekker.nts_4_0.Validity_period_type getValidity_period() {
		return validity_period;
	}

	/**
	 * Sets the validity_period value for this Ftm_type.
	 * 
	 * @param validity_period
	 *            * Overall period of validity
	 */
	public void setValidity_period(nl.pdekker.nts_4_0.Validity_period_type validity_period) {
		this.validity_period = validity_period;
	}

	/**
	 * Gets the contents value for this Ftm_type.
	 * 
	 * @return contents * Additional information in local language
	 */
	public java.lang.String getContents() {
		return contents;
	}

	/**
	 * Sets the contents value for this Ftm_type.
	 * 
	 * @param contents
	 *            * Additional information in local language
	 */
	public void setContents(java.lang.String contents) {
		this.contents = contents;
	}

	/**
	 * Gets the source value for this Ftm_type.
	 * 
	 * @return source * Notice source (name of authority)
	 */
	public java.lang.String getSource() {
		return source;
	}

	/**
	 * Sets the source value for this Ftm_type.
	 * 
	 * @param source
	 *            * Notice source (name of authority)
	 */
	public void setSource(java.lang.String source) {
		this.source = source;
	}

	/**
	 * Gets the reason_code value for this Ftm_type.
	 * 
	 * @return reason_code * Reason / justification of the notice
	 */
	public nl.pdekker.nts_4_0.Reason_code_enum getReason_code() {
		return reason_code;
	}

	/**
	 * Sets the reason_code value for this Ftm_type.
	 * 
	 * @param reason_code
	 *            * Reason / justification of the notice
	 */
	public void setReason_code(nl.pdekker.nts_4_0.Reason_code_enum reason_code) {
		this.reason_code = reason_code;
	}

	/**
	 * Gets the communication value for this Ftm_type.
	 * 
	 * @return communication * Communication channel information
	 */
	public nl.pdekker.nts_4_0.Communication_type[] getCommunication() {
		return communication;
	}

	/**
	 * Sets the communication value for this Ftm_type.
	 * 
	 * @param communication
	 *            * Communication channel information
	 */
	public void setCommunication(nl.pdekker.nts_4_0.Communication_type[] communication) {
		this.communication = communication;
	}

	public nl.pdekker.nts_4_0.Communication_type getCommunication(int i) {
		return this.communication[i];
	}

	public void setCommunication(int i, nl.pdekker.nts_4_0.Communication_type _value) {
		this.communication[i] = _value;
	}

	/**
	 * Gets the fairway_section value for this Ftm_type.
	 * 
	 * @return fairway_section * Fairway section
	 */
	public nl.pdekker.nts_4_0.Fairway_section_type getFairway_section() {
		return fairway_section;
	}

	/**
	 * Sets the fairway_section value for this Ftm_type.
	 * 
	 * @param fairway_section
	 *            * Fairway section
	 */
	public void setFairway_section(nl.pdekker.nts_4_0.Fairway_section_type fairway_section) {
		this.fairway_section = fairway_section;
	}

	/**
	 * Gets the object value for this Ftm_type.
	 * 
	 * @return object * Object section
	 */
	public nl.pdekker.nts_4_0.Object_type getObject() {
		return object;
	}

	/**
	 * Sets the object value for this Ftm_type.
	 * 
	 * @param object
	 *            * Object section
	 */
	public void setObject(nl.pdekker.nts_4_0.Object_type object) {
		this.object = object;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Ftm_type)) {
			return false;
		}
		Ftm_type other = (Ftm_type) obj;
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
				&& ((this.target_group == null && other.getTarget_group() == null) || (this.target_group != null
						&& java.util.Arrays.equals(this.target_group, other.getTarget_group())))
				&& ((this.subject_code == null && other.getSubject_code() == null)
						|| (this.subject_code != null && this.subject_code.equals(other.getSubject_code())))
				&& ((this.validity_period == null && other.getValidity_period() == null)
						|| (this.validity_period != null && this.validity_period.equals(other.getValidity_period())))
				&& ((this.contents == null && other.getContents() == null)
						|| (this.contents != null && this.contents.equals(other.getContents())))
				&& ((this.source == null && other.getSource() == null)
						|| (this.source != null && this.source.equals(other.getSource())))
				&& ((this.reason_code == null && other.getReason_code() == null)
						|| (this.reason_code != null && this.reason_code.equals(other.getReason_code())))
				&& ((this.communication == null && other.getCommunication() == null) || (this.communication != null
						&& java.util.Arrays.equals(this.communication, other.getCommunication())))
				&& ((this.fairway_section == null && other.getFairway_section() == null)
						|| (this.fairway_section != null && this.fairway_section.equals(other.getFairway_section())))
				&& ((this.object == null && other.getObject() == null)
						|| (this.object != null && this.object.equals(other.getObject())));
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
		if (getTarget_group() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getTarget_group()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getTarget_group(), i);
				if (obj != null && !obj.getClass().isArray()) {
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
			for (int i = 0; i < java.lang.reflect.Array.getLength(getCommunication()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getCommunication(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getFairway_section() != null) {
			_hashCode += getFairway_section().hashCode();
		}
		if (getObject() != null) {
			_hashCode += getObject().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Ftm_type.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "ftm_type"));
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
		elemField.setFieldName("target_group");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "target_group"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "target_group_type"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("subject_code");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "subject_code"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "subject_code_enum"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("validity_period");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "validity_period"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "validity_period_type"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("contents");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "contents"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("source");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "source"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reason_code");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "reason_code"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "reason_code_enum"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("communication");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "communication"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "communication_type"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fairway_section");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "fairway_section"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "fairway_section_type"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("object");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "object"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "object_type"));
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
