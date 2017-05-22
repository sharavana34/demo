package NET.webserviceX.www;

public class SendSMSSoapProxy implements NET.webserviceX.www.SendSMSSoap {
  private String _endpoint = null;
  private NET.webserviceX.www.SendSMSSoap sendSMSSoap = null;
  
  public SendSMSSoapProxy() {
    _initSendSMSSoapProxy();
  }
  
  public SendSMSSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initSendSMSSoapProxy();
  }
  
  private void _initSendSMSSoapProxy() {
    try {
      sendSMSSoap = (new NET.webserviceX.www.SendSMSLocator()).getSendSMSSoap();
      if (sendSMSSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sendSMSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sendSMSSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sendSMSSoap != null)
      ((javax.xml.rpc.Stub)sendSMSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public NET.webserviceX.www.SendSMSSoap getSendSMSSoap() {
    if (sendSMSSoap == null)
      _initSendSMSSoapProxy();
    return sendSMSSoap;
  }
  
  public NET.webserviceX.www.SMSResult sendSMSToIndia(java.lang.String mobileNumber, java.lang.String fromEmailAddress, java.lang.String message) throws java.rmi.RemoteException{
    if (sendSMSSoap == null)
      _initSendSMSSoapProxy();
    return sendSMSSoap.sendSMSToIndia(mobileNumber, fromEmailAddress, message);
  }
  
  
}