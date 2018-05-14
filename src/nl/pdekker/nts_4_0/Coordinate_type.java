/**
 * Coordinate_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts_4_0;

public class Coordinate_type implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 480121012002052789L;

	private String latitude;
	private String longitude;

	
	@Override
	public String toString() {
		return "Coordinate_type [latitude=" + latitude + ", longitude=" + longitude + "]";
	}

	public Coordinate_type() {
	}

	public Coordinate_type(java.lang.String lat, java.lang.String _long) {
		this.latitude = lat;
		this.longitude = _long;
	}

	/**
	 * Gets the lat value for this Coordinate_type.
	 * 
	 * @return lat
	 */
	public java.lang.String getLat() {
		return latitude;
	}

	/**
	 * Sets the lat value for this Coordinate_type.
	 * 
	 * @param lat
	 */
	public void setLat(java.lang.String lat) {
		this.latitude = lat;
	}

	/**
	 * Gets the _long value for this Coordinate_type.
	 * 
	 * @return _long
	 */
	public java.lang.String get_long() {
		return longitude;
	}

	/**
	 * Sets the _long value for this Coordinate_type.
	 * 
	 * @param _long
	 */
	public void set_long(java.lang.String _long) {
		this.longitude = _long;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Coordinate_type)) {
			return false;
		}
		Coordinate_type other = (Coordinate_type) obj;
		if (this == obj) {
			return true;
		}
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.latitude == null && other.getLat() == null)
						|| (this.latitude != null && this.latitude.equals(other.getLat())))
				&& ((this.longitude == null && other.get_long() == null)
						|| (this.longitude != null && this.longitude.equals(other.get_long())));
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
		if (getLat() != null) {
			_hashCode += getLat().hashCode();
		}
		if (get_long() != null) {
			_hashCode += get_long().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Coordinate_type.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "coordinate_type"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lat");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "lat"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_long");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/4.0.4.0", "long"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
			java.lang.Class<?>_javaType, javax.xml.namespace.QName _xmlType) {
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
