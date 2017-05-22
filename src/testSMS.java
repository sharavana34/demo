import com.way2sms.SMS;
class TestSMS {

public static void main(String[] args) {

	String Username="9952910455";
	String Password="suganya";
	String Number="7904441040";
	String Message="test message";
	String Proxy="";
	
SMS smsClient=new SMS();
smsClient.send( Username, Password, Number, Message,Proxy);
}
}