
import org.apache.axis.AxisFault;

import NET.webserviceX.www.*;
public class sendSMS {

public static void main(String[] args) {

	String Username="9952910455";
	String Password="suganya";
	String Number="7904441040";
	String Message="test message";
	String Proxy="null";
	
//SMS smsClient=new SMS();
//smsClient.send( Username, Password, Number, Message,Proxy);
	
	try {
		//SendSMSSoapStub sendsmsstub=new SendSMSSoapStub();
		SendSMSSoapProxy sendsmsproxy=new SendSMSSoapProxy();
		//System.out.println("sendsmsstub-->"+sendsmsstub.sendSMSToIndia("9952910455", "sharavana34@gmail.com", "test Sms"));
		System.out.println("sendsmsproxy-->"+sendsmsproxy.sendSMSToIndia("9952910455", "sharavana34@gmail.com", "test Sms"));

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}