/**
 * NtS_message_service_serviceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.pdekker.nts.ms_2_0_4_0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.xml.namespace.QName;

public class NtS_message_service_serviceLocator extends org.apache.axis.client.Service
		implements nl.pdekker.nts.ms_2_0_4_0.NtS_message_service_service {

	/**
	 * 
	 */
	private static final long serialVersionUID = 304535069586050225L;

	public NtS_message_service_serviceLocator() {
	}

	public NtS_message_service_serviceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public NtS_message_service_serviceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for NtS_message_service
	private java.lang.String NtS_message_service_address = "http://nts-ms.example.org/NtS_message_service";

	@Override
	public java.lang.String getNtS_message_serviceAddress() {
		return NtS_message_service_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String NtS_message_serviceWSDDServiceName = "NtS_message_service";

	public java.lang.String getNtS_message_serviceWSDDServiceName() {
		return NtS_message_serviceWSDDServiceName;
	}

	public void setNtS_message_serviceWSDDServiceName(java.lang.String name) {
		NtS_message_serviceWSDDServiceName = name;
	}

	@Override
	public nl.pdekker.nts.ms_2_0_4_0.NtS_message_service getNtS_message_service()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(NtS_message_service_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getNtS_message_service(endpoint);
	}

	@Override
	public nl.pdekker.nts.ms_2_0_4_0.NtS_message_service getNtS_message_service(java.net.URL portAddress)
			throws javax.xml.rpc.ServiceException {
		try {
			nl.pdekker.nts.ms_2_0_4_0.NtS_message_service_soap_bindingStub _stub = new nl.pdekker.nts.ms_2_0_4_0.NtS_message_service_soap_bindingStub(
					portAddress, this);
			_stub.setPortName(getNtS_message_serviceWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setNtS_message_serviceEndpointAddress(java.lang.String address) {
		NtS_message_service_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has no
	 * port for the given interface, then ServiceException is thrown.
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		try {
			if (nl.pdekker.nts.ms_2_0_4_0.NtS_message_service.class.isAssignableFrom(serviceEndpointInterface)) {
				nl.pdekker.nts.ms_2_0_4_0.NtS_message_service_soap_bindingStub _stub = new nl.pdekker.nts.ms_2_0_4_0.NtS_message_service_soap_bindingStub(
						new java.net.URL(NtS_message_service_address), this);
				_stub.setPortName(getNtS_message_serviceWSDDServiceName());
				return _stub;
			}
		} catch (java.lang.Throwable t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  "
				+ (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has no
	 * port for the given interface, then ServiceException is thrown.
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("NtS_message_service".equals(inputPortName)) {
			return getNtS_message_service();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	@Override
	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "NtS_message_service_service");
	}

	private Set<QName> ports = null;

	@Override
	public Iterator<QName> getPorts() {
		if (ports == null) {
			ports = new HashSet<>();
			ports.add(new javax.xml.namespace.QName("http://www.ris.eu/nts.ms/2.0.4.0", "NtS_message_service"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName, java.lang.String address)
			throws javax.xml.rpc.ServiceException {

		if ("NtS_message_service".equals(portName)) {
			setNtS_message_serviceEndpointAddress(address);
		} else { // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address)
			throws javax.xml.rpc.ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
