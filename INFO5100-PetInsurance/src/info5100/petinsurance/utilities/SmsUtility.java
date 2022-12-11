/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.utilities;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
/**
 *
 * @author rakshaisrani
 */
public class SmsUtility {
    public static final String ACCOUNT_SID = "AC5aba9b7469751ee118bd03806c0d7988";
    public static final String AUTH_TOKEN = "377b39f5c9eb8ceac02f3fd6dbfdf5ba";

    public static void sendSMS(String to, String smsMessage) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(to),
                new com.twilio.type.PhoneNumber("+17432007211"),
                smsMessage)
            .create();

        System.out.println(message.getSid());
    }
    
    public static void main(String[] args) {
        SmsUtility.sendSMS("+18575441709", "Hello From Twilio");
    }
}
