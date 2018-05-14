/**
 * Target_group_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Target_group_type implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5942265763939263700L;

	/* Target group (vessel type) */
	private nl.pdekker.nts_4_0.Target_group_code_enum target_group_code;

	/* Upstream or downstream traffic, or both */
	private nl.pdekker.nts_4_0.Direction_code_enum direction_code;

	public Target_group_type() {
	}

	public Target_group_type(nl.pdekker.nts_4_0.Target_group_code_enum target_group_code,
			nl.pdekker.nts_4_0.Direction_code_enum direction_code) {
		this.target_group_code = target_group_code;
		this.direction_code = direction_code;
	}

	/**
	 * Gets the target_group_code value for this Target_group_type.
	 * 
	 * @return target_group_code * Target group (vessel type)
	 */
	public nl.pdekker.nts_4_0.Target_group_code_enum getTarget_group_code() {
		return target_group_code;
	}

	@Override
	public String toString() {
		return "Target_group_type [target_group_code=" + target_group_code + ", direction_code=" + direction_code + "]";
	}

	/**
	 * Sets the target_group_code value for this Target_group_type.
	 * 
	 * @param target_group_code
	 *            * Target group (vessel type)
	 */
	public void setTarget_group_code(nl.pdekker.nts_4_0.Target_group_code_enum target_group_code) {
		this.target_group_code = target_group_code;
	}

	/**
	 * Gets the direction_code value for this Target_group_type.
	 * 
	 * @return direction_code * Upstream or downstream traffic, or both
	 */
	public nl.pdekker.nts_4_0.Direction_code_enum getDirection_code() {
		return direction_code;
	}

	/**
	 * Sets the direction_code value for this Target_group_type.
	 * 
	 * @param direction_code
	 *            * Upstream or downstream traffic, or both
	 */
	public void setDirection_code(nl.pdekker.nts_4_0.Direction_code_enum direction_code) {
		this.direction_code = direction_code;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Target_group_type)) {
			return false;
		}
		Target_group_type other = (Target_group_type) obj;
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
		_equals = true && ((this.target_group_code == null && other.getTarget_group_code() == null)
				|| (this.target_group_code != null && this.target_group_code.equals(other.getTarget_group_code())))
				&& ((this.direction_code == null && other.getDirection_code() == null)
						|| (this.direction_code != null && this.direction_code.equals(other.getDirection_code())));
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
		if (getTarget_group_code() != null) {
			_hashCode += getTarget_group_code().hashCode();
		}
		if (getDirection_code() != null) {
			_hashCode += getDirection_code().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Target_group_type.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "target_group_type"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("target_group_code");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "target_group_code"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "target_group_code_enum"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("direction_code");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "direction_code"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "direction_code_enum"));
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
