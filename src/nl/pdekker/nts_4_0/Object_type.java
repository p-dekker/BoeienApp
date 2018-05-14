/**
 * Object_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

import java.util.Arrays;

public class Object_type implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5342584226859385220L;

	/* Geo Information of object */
	private nl.pdekker.nts_4_0.Geo_object_type geo_object;

	/* Object limitation section */
	private nl.pdekker.nts_4_0.Limitation_type[] limitation;

	public Object_type() {
	}

	public Object_type(nl.pdekker.nts_4_0.Geo_object_type geo_object,
			nl.pdekker.nts_4_0.Limitation_type[] limitation) {
		this.geo_object = geo_object;
		this.limitation = limitation;
	}

	@Override
	public String toString() {
		return "Object_type [geo_object=" + geo_object + ", limitation=" + Arrays.toString(limitation) + "]";
	}

	/**
	 * Gets the geo_object value for this Object_type.
	 * 
	 * @return geo_object * Geo Information of object
	 */
	public nl.pdekker.nts_4_0.Geo_object_type getGeo_object() {
		return geo_object;
	}

	/**
	 * Sets the geo_object value for this Object_type.
	 * 
	 * @param geo_object
	 *            * Geo Information of object
	 */
	public void setGeo_object(nl.pdekker.nts_4_0.Geo_object_type geo_object) {
		this.geo_object = geo_object;
	}

	/**
	 * Gets the limitation value for this Object_type.
	 * 
	 * @return limitation * Object limitation section
	 */
	public nl.pdekker.nts_4_0.Limitation_type[] getLimitation() {
		return limitation;
	}

	/**
	 * Sets the limitation value for this Object_type.
	 * 
	 * @param limitation
	 *            * Object limitation section
	 */
	public void setLimitation(nl.pdekker.nts_4_0.Limitation_type[] limitation) {
		this.limitation = limitation;
	}

	public nl.pdekker.nts_4_0.Limitation_type getLimitation(int i) {
		return this.limitation[i];
	}

	public void setLimitation(int i, nl.pdekker.nts_4_0.Limitation_type _value) {
		this.limitation[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Object_type)) {
			return false;
		}
		Object_type other = (Object_type) obj;
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
				&& ((this.geo_object == null && other.getGeo_object() == null)
						|| (this.geo_object != null && this.geo_object.equals(other.getGeo_object())))
				&& ((this.limitation == null && other.getLimitation() == null) || (this.limitation != null
						&& java.util.Arrays.equals(this.limitation, other.getLimitation())));
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
		if (getGeo_object() != null) {
			_hashCode += getGeo_object().hashCode();
		}
		if (getLimitation() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getLimitation()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getLimitation(), i);
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
			Object_type.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "object_type"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("geo_object");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "geo_object"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "geo_object_type"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("limitation");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "limitation"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "limitation_type"));
		elemField.setMinOccurs(0);
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
