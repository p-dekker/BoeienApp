/**
 * Get_messages_query.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts.ms_2_0_4_0;

import java.lang.reflect.Array;

public class Get_messages_query implements java.io.Serializable {
	private static final long serialVersionUID = -3811023779953206539L;

	private nl.pdekker.nts.ms_2_0_4_0.Message_type_type message_type;

	private java.lang.String[][] ids;

	private nl.pdekker.nts_4_0.Validity_period_type validity_period;

	private nl.pdekker.nts.ms_2_0_4_0.Date_pair[] dates_issue;

	private nl.pdekker.nts.ms_2_0_4_0.Paging_request_type paging_request;

	public Get_messages_query() {
	}

	public Get_messages_query(nl.pdekker.nts.ms_2_0_4_0.Message_type_type message_type, java.lang.String[][] ids,
			nl.pdekker.nts_4_0.Validity_period_type validity_period,
			nl.pdekker.nts.ms_2_0_4_0.Date_pair[] dates_issue,
			nl.pdekker.nts.ms_2_0_4_0.Paging_request_type paging_request) {
		this.message_type = message_type;
		this.ids = ids;
		this.validity_period = validity_period;
		this.dates_issue = dates_issue;
		this.paging_request = paging_request;
	}

	/**
	 * Gets the message_type value for this Get_messages_query.
	 * 
	 * @return message_type
	 */
	public nl.pdekker.nts.ms_2_0_4_0.Message_type_type getMessage_type() {
		return message_type;
	}

	/**
	 * Sets the message_type value for this Get_messages_query.
	 * 
	 * @param message_type
	 */
	public void setMessage_type(nl.pdekker.nts.ms_2_0_4_0.Message_type_type message_type) {
		this.message_type = message_type;
	}

	/**
	 * Gets the ids value for this Get_messages_query.
	 * 
	 * @return ids
	 */
	public java.lang.String[][] getIds() {
		return ids;
	}

	/**
	 * Sets the ids value for this Get_messages_query.
	 * 
	 * @param ids
	 */
	public void setIds(java.lang.String[][] ids) {
		this.ids = ids;
	}

	public java.lang.String[] getIds(int i) {
		return this.ids[i];
	}

	public void setIds(int i, java.lang.String[] _value) {
		this.ids[i] = _value;
	}

	/**
	 * Gets the validity_period value for this Get_messages_query.
	 * 
	 * @return validity_period
	 */
	public nl.pdekker.nts_4_0.Validity_period_type getValidity_period() {
		return validity_period;
	}

	/**
	 * Sets the validity_period value for this Get_messages_query.
	 * 
	 * @param validity_period
	 */
	public void setValidity_period(nl.pdekker.nts_4_0.Validity_period_type validity_period) {
		this.validity_period = validity_period;
	}

	/**
	 * Gets the dates_issue value for this Get_messages_query.
	 * 
	 * @return dates_issue
	 */
	public nl.pdekker.nts.ms_2_0_4_0.Date_pair[] getDates_issue() {
		return dates_issue;
	}

	/**
	 * Sets the dates_issue value for this Get_messages_query.
	 * 
	 * @param dates_issue
	 */
	public void setDates_issue(nl.pdekker.nts.ms_2_0_4_0.Date_pair[] dates_issue) {
		this.dates_issue = dates_issue;
	}

	public nl.pdekker.nts.ms_2_0_4_0.Date_pair getDates_issue(int i) {
		return this.dates_issue[i];
	}

	public void setDates_issue(int i, nl.pdekker.nts.ms_2_0_4_0.Date_pair _value) {
		this.dates_issue[i] = _value;
	}

	/**
	 * Gets the paging_request value for this Get_messages_query.
	 * 
	 * @return paging_request
	 */
	public nl.pdekker.nts.ms_2_0_4_0.Paging_request_type getPaging_request() {
		return paging_request;
	}

	/**
	 * Sets the paging_request value for this Get_messages_query.
	 * 
	 * @param paging_request
	 */
	public void setPaging_request(nl.pdekker.nts.ms_2_0_4_0.Paging_request_type paging_request) {
		this.paging_request = paging_request;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Get_messages_query)) {
			return false;
		}
		Get_messages_query other = (Get_messages_query) obj;
		if (this == obj) {
			return true;
		}
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.message_type == null && other.getMessage_type() == null)
						|| (this.message_type != null && this.message_type.equals(other.getMessage_type())))
				&& ((this.ids == null && other.getIds() == null)
						|| (this.ids != null && java.util.Arrays.equals(this.ids, other.getIds())))
				&& ((this.validity_period == null && other.getValidity_period() == null)
						|| (this.validity_period != null && this.validity_period.equals(other.getValidity_period())))
				&& ((this.dates_issue == null && other.getDates_issue() == null) || (this.dates_issue != null
						&& java.util.Arrays.equals(this.dates_issue, other.getDates_issue())))
				&& ((this.paging_request == null && other.getPaging_request() == null)
						|| (this.paging_request != null && this.paging_request.equals(other.getPaging_request())));
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
		if (getMessage_type() != null) {
			_hashCode += getMessage_type().hashCode();
		}
		if (getIds() != null) {
			for (int i = 0; i < Array.getLength(getIds()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getIds(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getValidity_period() != null) {
			_hashCode += getValidity_period().hashCode();
		}
		if (getDates_issue() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getDates_issue()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getDates_issue(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getPaging_request() != null) {
			_hashCode += getPaging_request().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Get_messages_query.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", ">get_messages_query"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("message_type");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "message_type"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "message_type_type"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ids");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "ids"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "id_pair"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("validity_period");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "validity_period"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "validity_period_type"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dates_issue");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "dates_issue"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "date_pair"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("paging_request");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "paging_request"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "paging_request_type"));
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
