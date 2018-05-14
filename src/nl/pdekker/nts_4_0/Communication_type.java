/**
 * Communication_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Communication_type implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4384631552819745198L;

	/* Reporting regime (information, or duty to report) */
	private nl.pdekker.nts_4_0.Reporting_code_enum reporting_code;

	/* Communication code (telephone, VHF etc.) */
	private nl.pdekker.nts_4_0.Communication_code_enum communication_code;

	/*
	 * Telephone, VHF number (including callsign), e-mail address, URL or teletext
	 */
	private java.lang.String number;

	/* Name of the attachment or additional information */
	private java.lang.String label;

	/* Additional remarks concerning the communication */
	private java.lang.String remark;

	public Communication_type() {
	}

	public Communication_type(nl.pdekker.nts_4_0.Reporting_code_enum reporting_code,
			nl.pdekker.nts_4_0.Communication_code_enum communication_code, java.lang.String number,
			java.lang.String label, java.lang.String remark) {
		this.reporting_code = reporting_code;
		this.communication_code = communication_code;
		this.number = number;
		this.label = label;
		this.remark = remark;
	}

	/**
	 * Gets the reporting_code value for this Communication_type.
	 * 
	 * @return reporting_code * Reporting regime (information, or duty to report)
	 */
	public nl.pdekker.nts_4_0.Reporting_code_enum getReporting_code() {
		return reporting_code;
	}

	/**
	 * Sets the reporting_code value for this Communication_type.
	 * 
	 * @param reporting_code
	 *            * Reporting regime (information, or duty to report)
	 */
	public void setReporting_code(nl.pdekker.nts_4_0.Reporting_code_enum reporting_code) {
		this.reporting_code = reporting_code;
	}

	/**
	 * Gets the communication_code value for this Communication_type.
	 * 
	 * @return communication_code * Communication code (telephone, VHF etc.)
	 */
	public nl.pdekker.nts_4_0.Communication_code_enum getCommunication_code() {
		return communication_code;
	}

	/**
	 * Sets the communication_code value for this Communication_type.
	 * 
	 * @param communication_code
	 *            * Communication code (telephone, VHF etc.)
	 */
	public void setCommunication_code(nl.pdekker.nts_4_0.Communication_code_enum communication_code) {
		this.communication_code = communication_code;
	}

	/**
	 * Gets the number value for this Communication_type.
	 * 
	 * @return number * Telephone, VHF number (including callsign), e-mail address,
	 *         URL or teletext
	 */
	public java.lang.String getNumber() {
		return number;
	}

	/**
	 * Sets the number value for this Communication_type.
	 * 
	 * @param number
	 *            * Telephone, VHF number (including callsign), e-mail address, URL
	 *            or teletext
	 */
	public void setNumber(java.lang.String number) {
		this.number = number;
	}

	/**
	 * Gets the label value for this Communication_type.
	 * 
	 * @return label * Name of the attachment or additional information
	 */
	public java.lang.String getLabel() {
		return label;
	}

	/**
	 * Sets the label value for this Communication_type.
	 * 
	 * @param label
	 *            * Name of the attachment or additional information
	 */
	public void setLabel(java.lang.String label) {
		this.label = label;
	}

	/**
	 * Gets the remark value for this Communication_type.
	 * 
	 * @return remark * Additional remarks concerning the communication
	 */
	public java.lang.String getRemark() {
		return remark;
	}

	/**
	 * Sets the remark value for this Communication_type.
	 * 
	 * @param remark
	 *            * Additional remarks concerning the communication
	 */
	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Communication_type)) {
			return false;
		}
		Communication_type other = (Communication_type) obj;
		if (this == obj) {
			return true;
		}
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.reporting_code == null && other.getReporting_code() == null)
						|| (this.reporting_code != null && this.reporting_code.equals(other.getReporting_code())))
				&& ((this.communication_code == null && other.getCommunication_code() == null)
						|| (this.communication_code != null
								&& this.communication_code.equals(other.getCommunication_code())))
				&& ((this.number == null && other.getNumber() == null)
						|| (this.number != null && this.number.equals(other.getNumber())))
				&& ((this.label == null && other.getLabel() == null)
						|| (this.label != null && this.label.equals(other.getLabel())))
				&& ((this.remark == null && other.getRemark() == null)
						|| (this.remark != null && this.remark.equals(other.getRemark())));
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
		if (getReporting_code() != null) {
			_hashCode += getReporting_code().hashCode();
		}
		if (getCommunication_code() != null) {
			_hashCode += getCommunication_code().hashCode();
		}
		if (getNumber() != null) {
			_hashCode += getNumber().hashCode();
		}
		if (getLabel() != null) {
			_hashCode += getLabel().hashCode();
		}
		if (getRemark() != null) {
			_hashCode += getRemark().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Communication_type.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "communication_type"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reporting_code");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "reporting_code"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "reporting_code_enum"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("communication_code");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "communication_code"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "communication_code_enum"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("number");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "number"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("label");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "label"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("remark");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "remark"));
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
