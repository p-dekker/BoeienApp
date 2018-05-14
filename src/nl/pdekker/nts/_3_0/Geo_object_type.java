/**
 * Geo_object_type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts._3_0;

public class Geo_object_type  implements java.io.Serializable {
    /* Unique identification of the geo object, country specific */
    private java.lang.String[] id;

    /* Name of the geo object (local) */
    private java.lang.String name;

    /* Type code of the geo object */
    private nl.pdekker.nts._3_0.Type_code_enum type_code;

    /* Fairway begin and end coordinates */
    private nl.pdekker.nts._3_0.Coordinate_type[] coordinate;

    public Geo_object_type() {
    }

    public Geo_object_type(
           java.lang.String[] id,
           java.lang.String name,
           nl.pdekker.nts._3_0.Type_code_enum type_code,
           nl.pdekker.nts._3_0.Coordinate_type[] coordinate) {
           this.id = id;
           this.name = name;
           this.type_code = type_code;
           this.coordinate = coordinate;
    }


    /**
     * Gets the id value for this Geo_object_type.
     * 
     * @return id   * Unique identification of the geo object, country specific
     */
    public java.lang.String[] getId() {
        return id;
    }


    /**
     * Sets the id value for this Geo_object_type.
     * 
     * @param id   * Unique identification of the geo object, country specific
     */
    public void setId(java.lang.String[] id) {
        this.id = id;
    }

    public java.lang.String getId(int i) {
        return this.id[i];
    }

    public void setId(int i, java.lang.String _value) {
        this.id[i] = _value;
    }


    /**
     * Gets the name value for this Geo_object_type.
     * 
     * @return name   * Name of the geo object (local)
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Geo_object_type.
     * 
     * @param name   * Name of the geo object (local)
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type_code value for this Geo_object_type.
     * 
     * @return type_code   * Type code of the geo object
     */
    public nl.pdekker.nts._3_0.Type_code_enum getType_code() {
        return type_code;
    }


    /**
     * Sets the type_code value for this Geo_object_type.
     * 
     * @param type_code   * Type code of the geo object
     */
    public void setType_code(nl.pdekker.nts._3_0.Type_code_enum type_code) {
        this.type_code = type_code;
    }


    /**
     * Gets the coordinate value for this Geo_object_type.
     * 
     * @return coordinate   * Fairway begin and end coordinates
     */
    public nl.pdekker.nts._3_0.Coordinate_type[] getCoordinate() {
        return coordinate;
    }


    /**
     * Sets the coordinate value for this Geo_object_type.
     * 
     * @param coordinate   * Fairway begin and end coordinates
     */
    public void setCoordinate(nl.pdekker.nts._3_0.Coordinate_type[] coordinate) {
        this.coordinate = coordinate;
    }

    public nl.pdekker.nts._3_0.Coordinate_type getCoordinate(int i) {
        return this.coordinate[i];
    }

    public void setCoordinate(int i, nl.pdekker.nts._3_0.Coordinate_type _value) {
        this.coordinate[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Geo_object_type)) return false;
        Geo_object_type other = (Geo_object_type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              java.util.Arrays.equals(this.id, other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.type_code==null && other.getType_code()==null) || 
             (this.type_code!=null &&
              this.type_code.equals(other.getType_code()))) &&
            ((this.coordinate==null && other.getCoordinate()==null) || 
             (this.coordinate!=null &&
              java.util.Arrays.equals(this.coordinate, other.getCoordinate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType_code() != null) {
            _hashCode += getType_code().hashCode();
        }
        if (getCoordinate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCoordinate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCoordinate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Geo_object_type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "geo_object_type"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", ">geo_object_type>id"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "type_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "type_code_enum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordinate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "coordinate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ris.eu/nts/3.0", "coordinate_type"));
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
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
