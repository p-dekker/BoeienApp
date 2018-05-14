package nl.pdekker.nts_ms_1_0_3_0;

public class NtS_message_serviceProxy implements nl.pdekker.nts_ms_1_0_3_0.NtS_message_service {
  private String _endpoint = null;
  private nl.pdekker.nts_ms_1_0_3_0.NtS_message_service ntS_message_service = null;
  
  public NtS_message_serviceProxy() {
    _initNtS_message_serviceProxy();
  }
  
  public NtS_message_serviceProxy(String endpoint) {
    _endpoint = endpoint;
    _initNtS_message_serviceProxy();
  }
  
  private void _initNtS_message_serviceProxy() {
    try {
      ntS_message_service = (new nl.pdekker.nts_ms_1_0_3_0.NtS_message_service_serviceLocator()).getNtS_message_service();
      if (ntS_message_service != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ntS_message_service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ntS_message_service)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ntS_message_service != null)
      ((javax.xml.rpc.Stub)ntS_message_service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public nl.pdekker.nts_ms_1_0_3_0.NtS_message_service getNtS_message_service() {
    if (ntS_message_service == null)
      _initNtS_message_serviceProxy();
    return ntS_message_service;
  }
  
  public nl.pdekker.nts_ms_1_0_3_0.Get_messages_result get_messages(nl.pdekker.nts_ms_1_0_3_0.Get_messages_query parameters) throws java.rmi.RemoteException{
    if (ntS_message_service == null)
      _initNtS_message_serviceProxy();
    return ntS_message_service.get_messages(parameters);
  }
  
  
}