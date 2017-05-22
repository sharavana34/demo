import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.SmsFactory;
import com.twilio.sdk.resource.instance.Account;

import java.util.HashMap;

public class HelloTwilio {
    public static void main(String[] args) throws TwilioRestException {
        TwilioRestClient client = new TwilioRestClient("ACf0d815a6d70f2504d0f760734fa45f79", "b331d5f6dd359c4df51ce665d3feecc6");

        Account account = client.getAccount();

        SmsFactory factory = account.getSmsFactory();

        HashMap<String, String> message = new HashMap<>();

        message.put("To", "7904441040");
        message.put("From", "+15034516550");
        message.put("Body", "Test Message With java!");

        factory.create(message);
    }
}