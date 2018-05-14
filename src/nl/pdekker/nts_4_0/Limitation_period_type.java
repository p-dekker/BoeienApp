/**
 * Limitation_period_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Limitation_period_type implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6781544681080081970L;

	/* Start date of limitation period including time zone */
	private java.util.Date date_start;

	/* End date of limitation period including time zone */
	private java.util.Date date_end;

	/* Start time of limitation period without time zone */
	private org.apache.axis.types.Time time_start;

	/* End time of limitation period without time zone */
	private org.apache.axis.types.Time time_end;

	/* Interval for limitation if applicable */
	private nl.pdekker.nts_4_0.Interval_code_enum interval_code;

	public Limitation_period_type() {
	}

	@Override
	public String toString() {
		return "Limitation_period_type [date_start=" + date_start + ", date_end=" + date_end + ", time_start="
				+ time_start + ", time_end=" + time_end + ", interval_code=" + interval_code + "]";
	}

	public Limitation_period_type(java.util.Date date_start, java.util.Date date_end,
			org.apache.axis.types.Time time_start, org.apache.axis.types.Time time_end,
			nl.pdekker.nts_4_0.Interval_code_enum interval_code) {
		this.date_start = date_start;
		this.date_end = date_end;
		this.time_start = time_start;
		this.time_end = time_end;
		this.interval_code = interval_code;
	}

	/**
	 * Gets the date_start value for this Limitation_period_type.
	 * 
	 * @return date_start * Start date of limitation period including time zone
	 */
	public java.util.Date getDate_start() {
		return date_start;
	}

	/**
	 * Sets the date_start value for this Limitation_period_type.
	 * 
	 * @param date_start
	 *            * Start date of limitation period including time zone
	 */
	public void setDate_start(java.util.Date date_start) {
		this.date_start = date_start;
	}

	/**
	 * Gets the date_end value for this Limitation_period_type.
	 * 
	 * @return date_end * End date of limitation period including time zone
	 */
	public java.util.Date getDate_end() {
		return date_end;
	}

	/**
	 * Sets the date_end value for this Limitation_period_type.
	 * 
	 * @param date_end
	 *            * End date of limitation period including time zone
	 */
	public void setDate_end(java.util.Date date_end) {
		this.date_end = date_end;
	}

	/**
	 * Gets the time_start value for this Limitation_period_type.
	 * 
	 * @return time_start * Start time of limitation period without time zone
	 */
	public org.apache.axis.types.Time getTime_start() {
		return time_start;
	}

	/**
	 * Sets the time_start value for this Limitation_period_type.
	 * 
	 * @param time_start
	 *            * Start time of limitation period without time zone
	 */
	public void setTime_start(org.apache.axis.types.Time time_start) {
		this.time_start = time_start;
	}

	/**
	 * Gets the time_end value for this Limitation_period_type.
	 * 
	 * @return time_end * End time of limitation period without time zone
	 */
	public org.apache.axis.types.Time getTime_end() {
		return time_end;
	}

	/**
	 * Sets the time_end value for this Limitation_period_type.
	 * 
	 * @param time_end
	 *            * End time of limitation period without time zone
	 */
	public void setTime_end(org.apache.axis.types.Time time_end) {
		this.time_end = time_end;
	}

	/**
	 * Gets the interval_code value for this Limitation_period_type.
	 * 
	 * @return interval_code * Interval for limitation if applicable
	 */
	public nl.pdekker.nts_4_0.Interval_code_enum getInterval_code() {
		return interval_code;
	}

	/**
	 * Sets the interval_code value for this Limitation_period_type.
	 * 
	 * @param interval_code
	 *            * Interval for limitation if applicable
	 */
	public void setInterval_code(nl.pdekker.nts_4_0.Interval_code_enum interval_code) {
		this.interval_code = interval_code;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Limitation_period_type)) {
			return false;
		}
		Limitation_period_type other = (Limitation_period_type) obj;
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
				&& ((this.date_start == null && other.getDate_start() == null)
						|| (this.date_start != null && this.date_start.equals(other.getDate_start())))
				&& ((this.date_end == null && other.getDate_end() == null)
						|| (this.date_end != null && this.date_end.equals(other.getDate_end())))
				&& ((this.time_start == null && other.getTime_start() == null)
						|| (this.time_start != null && this.time_start.equals(other.getTime_start())))
				&& ((this.time_end == null && other.getTime_end() == null)
						|| (this.time_end != null && this.time_end.equals(other.getTime_end())))
				&& ((this.interval_code == null && other.getInterval_code() == null)
						|| (this.interval_code != null && this.interval_code.equals(other.getInterval_code())));
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
		if (getDate_start() != null) {
			_hashCode += getDate_start().hashCode();
		}
		if (getDate_end() != null) {
			_hashCode += getDate_end().hashCode();
		}
		if (getTime_start() != null) {
			_hashCode += getTime_start().hashCode();
		}
		if (getTime_end() != null) {
			_hashCode += getTime_end().hashCode();
		}
		if (getInterval_code() != null) {
			_hashCode += getInterval_code().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Limitation_period_type.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "limitation_period_type"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("date_start");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "date_start"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("date_end");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "date_end"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("time_start");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "time_start"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("time_end");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "time_end"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("interval_code");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "interval_code"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "interval_code_enum"));
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
