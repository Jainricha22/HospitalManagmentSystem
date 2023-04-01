/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author richajain
 */
public class EmailUtility {
    public static void sendEmail(String subject,final String from, final String password, String message, String[] to)
    {
        String host = "smtp.gmail.com";
        Properties pros = System.getProperties();
        pros.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        pros.put("mail.smtp.auth", "true");
        pros.put("mail.smtp.port", "465");
        pros.put("mail.smtp.starttls.enable","true");
        pros.put("mail.smtp.host", host);
        pros.put("mail.smtp.socketFactory.port", "465");

        Session session = Session.getInstance(pros, new javax.mail.Authenticator()
        {
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(from, password);
            }
        });

        MimeMessage mimeMessage = new MimeMessage(session);

        try
        {
            mimeMessage.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            for(int i=0; i<to.length; i++)
            {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for(int i =0; i<toAddress.length; i++)
            {
                mimeMessage.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            mimeMessage.setSubject(subject);
            mimeMessage.setText(message);

            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, password);
            transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
            transport.close();
        }
        catch(MessagingException me)
        {
            me.printStackTrace();
        }
    }
}
