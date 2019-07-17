package models;
import java.util.Properties;
import java.util.Scanner;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class SendEmail {

	String Username="conference.hub.5716";
	String Password="vaishalisinghal";
	String fromEmailAddress ="conference.hub.5716@gmail.com";
	String toEmailAddress="",subject="",textMessage="";
	
	public String getToEmailAddress() {
		return toEmailAddress;
	}

	public void setToEmailAddress(String toEmailAddress) {
		this.toEmailAddress = toEmailAddress;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTextMessage() {
		return textMessage;
	}

	public void setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}
		 String m;
		 public String start() {
		 
		  // For establishment of email client with 
		  // Google's gmail use below properties.
		  // For TLS Connection use below properties
		  // Create a Properties object 
		  Properties props = new Properties();
		 
		  // these properties are required
		  // providing smtp auth property to true
		  props.put("mail.smtp.auth", "true");
		  // providing tls enability
		  props.put("mail.smtp.starttls.enable", "true");
		  // providing the smtp host i.e gmail.com
		  props.put("mail.smtp.host", "smtp.gmail.com");
		  // providing smtp port as 587
		  props.put("mail.smtp.port", "587");
		 
		  // For SSL Connection use below properties
		 
		  /*props.put("mail.smtp.host", "smtp.gmail.com");
		  props.put("mail.smtp.socketFactory.port", "465");
		  props.put("mail.smtp.socketFactory.class",
		    "javax.net.ssl.SSLSocketFactory");
		  props.put("mail.smtp.auth", "true");
		  props.put("mail.smtp.port", "465");*/
		 
		  // Create a Session object based on the properties and 
		  // Authenticator object
		  Session session = Session.getDefaultInstance(props, 
		    new LoginAuthenticator(Username,Password));
		 
		  try {
		 
		   // Create a Message object using the session created above
		   Message message = new MimeMessage(session);
		 
		   // setting email address to Message from where message is being sent
		   message.setFrom(new InternetAddress(fromEmailAddress));
		 
		   // setting the email address to which user wants to send message 
		   message.setRecipients(Message.RecipientType.TO,
		     InternetAddress.parse(toEmailAddress));
		 
		   // setting the subject for the email 
		   message.setSubject(subject);
		 
		   // setting the text message which user wants to send to recipients
		   message.setText(textMessage);
		 
		   // Using the Transport class send() method to send message 
		   Transport.send(message);
		 
		   System.out.println("\nYour Message delivered successfully ....");
		 
		  } catch (MessagingException e) {
		 
		   throw new RuntimeException(e);
		 
		  }
		  return m="success";
		 }
		 
		 // Creating a class for Username and Password authentication
		 // provided by the user.
		 class LoginAuthenticator extends Authenticator {
		  PasswordAuthentication authentication = null;
		 
		  public LoginAuthenticator(String username, String password) {
		   authentication = new PasswordAuthentication(username,password);
		  }
		 
		  @Override
		  protected PasswordAuthentication getPasswordAuthentication() {
		   return authentication;
		  }
		 }
}
