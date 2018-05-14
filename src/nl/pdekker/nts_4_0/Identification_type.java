/**
 * Identification_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Identification_type implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7188378011367681432L;

	/* Internal ID */
	private java.lang.String internal_id;

	/* Sender (System) of the message */
	private java.lang.String from;

	/* Originator (initiator) of the information in this message */
	private java.lang.String originator;

	/* Country where message is valid */
	private nl.pdekker.nts_4_0.Country_code_enum country_code;

	/* Original language used in the textual info. (contents) */
	private nl.pdekker.nts_4_0.Language_code_enum language_code;

	/*
	 * District / Region within the specified country, where the message is
	 * applicable
	 */
	private java.lang.String district;

	/* Date and time of publication including time zone */
	private java.util.Calendar date_issue;

	public Identification_type() {
	}

	public Identification_type(java.lang.String internal_id, java.lang.String from, java.lang.String originator,
			nl.pdekker.nts_4_0.Country_code_enum country_code,
			nl.pdekker.nts_4_0.Language_code_enum language_code, java.lang.String district,
			java.util.Calendar date_issue) {
		this.internal_id = internal_id;
		this.from = from;
		this.originator = originator;
		this.country_code = country_code;
		this.language_code = language_code;
		this.district = district;
		this.date_issue = date_issue;
	}

	@Override
	public String toString() {
		return "Identification_type [internal_id=" + internal_id + ", from=" + from + ", originator=" + originator
				+ ", country_code=" + country_code + ", language_code=" + language_code + ", district=" + district
				+ ", date_issue=" + date_issue.getTime().toString() + "]";
	}

	/**
	 * Gets the internal_id value for this Identification_type.
	 * 
	 * @return internal_id * Internal ID
	 */
	public java.lang.String getInternal_id() {
		return internal_id;
	}

	/**
	 * Sets the internal_id value for this Identification_type.
	 * 
	 * @param internal_id
	 *            * Internal ID
	 */
	public void setInternal_id(java.lang.String internal_id) {
		this.internal_id = internal_id;
	}

	/**
	 * Gets the from value for this Identification_type.
	 * 
	 * @return from * Sender (System) of the message
	 */
	public java.lang.String getFrom() {
		return from;
	}

	/**
	 * Sets the from value for this Identification_type.
	 * 
	 * @param from
	 *            * Sender (System) of the message
	 */
	public void setFrom(java.lang.String from) {
		this.from = from;
	}

	/**
	 * Gets the originator value for this Identification_type.
	 * 
	 * @return originator * Originator (initiator) of the information in this
	 *         message
	 */
	public java.lang.String getOriginator() {
		return originator;
	}

	/**
	 * Sets the originator value for this Identification_type.
	 * 
	 * @param originator
	 *            * Originator (initiator) of the information in this message
	 */
	public void setOriginator(java.lang.String originator) {
		this.originator = originator;
	}

	/**
	 * Gets the country_code value for this Identification_type.
	 * 
	 * @return country_code * Country where message is valid
	 */
	public nl.pdekker.nts_4_0.Country_code_enum getCountry_code() {
		return country_code;
	}

	/**
	 * Sets the country_code value for this Identification_type.
	 * 
	 * @param country_code
	 *            * Country where message is valid
	 */
	public void setCountry_code(nl.pdekker.nts_4_0.Country_code_enum country_code) {
		this.country_code = country_code;
	}

	/**
	 * Gets the language_code value for this Identification_type.
	 * 
	 * @return language_code * Original language used in the textual info.
	 *         (contents)
	 */
	public nl.pdekker.nts_4_0.Language_code_enum getLanguage_code() {
		return language_code;
	}

	/**
	 * Sets the language_code value for this Identification_type.
	 * 
	 * @param language_code
	 *            * Original language used in the textual info. (contents)
	 */
	public void setLanguage_code(nl.pdekker.nts_4_0.Language_code_enum language_code) {
		this.language_code = language_code;
	}

	/**
	 * Gets the district value for this Identification_type.
	 * 
	 * @return district * District / Region within the specified country, where the
	 *         message is applicable
	 */
	public java.lang.String getDistrict() {
		return district;
	}

	/**
	 * Sets the district value for this Identification_type.
	 * 
	 * @param district
	 *            * District / Region within the specified country, where the
	 *            message is applicable
	 */
	public void setDistrict(java.lang.String district) {
		this.district = district;
	}

	/**
	 * Gets the date_issue value for this Identification_type.
	 * 
	 * @return date_issue * Date and time of publication including time zone
	 */
	public java.util.Calendar getDate_issue() {
		return date_issue;
	}

	/**
	 * Sets the date_issue value for this Identification_type.
	 * 
	 * @param date_issue
	 *            * Date and time of publication including time zone
	 */
	public void setDate_issue(java.util.Calendar date_issue) {
		this.date_issue = date_issue;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Identification_type)) {
			return false;
		}
		Identification_type other = (Identification_type) obj;
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
				&& ((this.from == null && other.getFrom() == null)
						|| (this.from != null && this.from.equals(other.getFrom())))
				&& ((this.originator == null && other.getOriginator() == null)
						|| (this.originator != null && this.originator.equals(other.getOriginator())))
				&& ((this.country_code == null && other.getCountry_code() == null)
						|| (this.country_code != null && this.country_code.equals(other.getCountry_code())))
				&& ((this.language_code == null && other.getLanguage_code() == null)
						|| (this.language_code != null && this.language_code.equals(other.getLanguage_code())))
				&& ((this.district == null && other.getDistrict() == null)
						|| (this.district != null && this.district.equals(other.getDistrict())))
				&& ((this.date_issue == null && other.getDate_issue() == null)
						|| (this.date_issue != null && this.date_issue.equals(other.getDate_issue())));
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
		if (getFrom() != null) {
			_hashCode += getFrom().hashCode();
		}
		if (getOriginator() != null) {
			_hashCode += getOriginator().hashCode();
		}
		if (getCountry_code() != null) {
			_hashCode += getCountry_code().hashCode();
		}
		if (getLanguage_code() != null) {
			_hashCode += getLanguage_code().hashCode();
		}
		if (getDistrict() != null) {
			_hashCode += getDistrict().hashCode();
		}
		if (getDate_issue() != null) {
			_hashCode += getDate_issue().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Identification_type.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "identification_type"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("internal_id");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "internal_id"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("from");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "from"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("originator");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "originator"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("country_code");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "country_code"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "country_code_enum"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("language_code");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "language_code"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "language_code_enum"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("district");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "district"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("date_issue");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "date_issue"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
