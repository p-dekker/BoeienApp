/**
 * Nts_number_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Nts_number_type implements java.io.Serializable {
	@Override
	public String toString() {
		return "Nts_number_type [organisation=" + organisation + ", year=" + year + ", number=" + number
				+ ", serial_number=" + serial_number + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2285361643745207344L;

	/* Name of the publishing organisation (NtS Provider) */
	private java.lang.String organisation;

	/* Year of first issuing of the notice */
	private org.apache.axis.types.Year year;

	/*
	 * Number of the notice (per year, starting with: 1, 0 shall not be used for
	 * published notices)
	 */
	private java.math.BigInteger number;

	/*
	 * Serial number of notice (replacements and withdrawals), original notice: 0
	 */
	private java.math.BigInteger serial_number;

	public Nts_number_type() {
	}

	public Nts_number_type(java.lang.String organisation, org.apache.axis.types.Year year, java.math.BigInteger number,
			java.math.BigInteger serial_number) {
		this.organisation = organisation;
		this.year = year;
		this.number = number;
		this.serial_number = serial_number;
	}

	/**
	 * Gets the organisation value for this Nts_number_type.
	 * 
	 * @return organisation * Name of the publishing organisation (NtS Provider)
	 */
	public java.lang.String getOrganisation() {
		return organisation;
	}

	/**
	 * Sets the organisation value for this Nts_number_type.
	 * 
	 * @param organisation
	 *            * Name of the publishing organisation (NtS Provider)
	 */
	public void setOrganisation(java.lang.String organisation) {
		this.organisation = organisation;
	}

	/**
	 * Gets the year value for this Nts_number_type.
	 * 
	 * @return year * Year of first issuing of the notice
	 */
	public org.apache.axis.types.Year getYear() {
		return year;
	}

	/**
	 * Sets the year value for this Nts_number_type.
	 * 
	 * @param year
	 *            * Year of first issuing of the notice
	 */
	public void setYear(org.apache.axis.types.Year year) {
		this.year = year;
	}

	/**
	 * Gets the number value for this Nts_number_type.
	 * 
	 * @return number * Number of the notice (per year, starting with: 1, 0 shall
	 *         not be used for published notices)
	 */
	public java.math.BigInteger getNumber() {
		return number;
	}

	/**
	 * Sets the number value for this Nts_number_type.
	 * 
	 * @param number
	 *            * Number of the notice (per year, starting with: 1, 0 shall not be
	 *            used for published notices)
	 */
	public void setNumber(java.math.BigInteger number) {
		this.number = number;
	}

	/**
	 * Gets the serial_number value for this Nts_number_type.
	 * 
	 * @return serial_number * Serial number of notice (replacements and
	 *         withdrawals), original notice: 0
	 */
	public java.math.BigInteger getSerial_number() {
		return serial_number;
	}

	/**
	 * Sets the serial_number value for this Nts_number_type.
	 * 
	 * @param serial_number
	 *            * Serial number of notice (replacements and withdrawals), original
	 *            notice: 0
	 */
	public void setSerial_number(java.math.BigInteger serial_number) {
		this.serial_number = serial_number;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Nts_number_type)) {
			return false;
		}
		Nts_number_type other = (Nts_number_type) obj;
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
		_equals = true
				&& ((this.organisation == null && other.getOrganisation() == null)
						|| (this.organisation != null && this.organisation.equals(other.getOrganisation())))
				&& ((this.year == null && other.getYear() == null)
						|| (this.year != null && this.year.equals(other.getYear())))
				&& ((this.number == null && other.getNumber() == null)
						|| (this.number != null && this.number.equals(other.getNumber())))
				&& ((this.serial_number == null && other.getSerial_number() == null)
						|| (this.serial_number != null && this.serial_number.equals(other.getSerial_number())));
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
		if (getOrganisation() != null) {
			_hashCode += getOrganisation().hashCode();
		}
		if (getYear() != null) {
			_hashCode += getYear().hashCode();
		}
		if (getNumber() != null) {
			_hashCode += getNumber().hashCode();
		}
		if (getSerial_number() != null) {
			_hashCode += getSerial_number().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Nts_number_type.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "nts_number_type"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("organisation");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "organisation"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("year");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "year"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("number");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "number"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serial_number");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "serial_number"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
