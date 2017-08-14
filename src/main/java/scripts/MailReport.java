package scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Testcases;
import commonMethods.Utils;

public class MailReport extends Keywords {
	/*
	 * Name : Pavan
	 * Created Date: 27/July/2017 
	 * Modified Date:27/July/2017
	 * Description:
	 * 
	 */
	public static void mailReport()
	{       
        final String username = Utils.getDataFromTestConfig("Username");
		final String password = Utils.getDataFromTestConfig("Password");
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,new javax.mail.Authenticator() 
		{
		  protected PasswordAuthentication getPasswordAuthentication() 
		  {
			  return new PasswordAuthentication(username, password);
		  }
		   
		}); 
		
		try 
		{
			Message message = new MimeMessage(session);
		    message.setFrom(new InternetAddress( Utils.getDataFromTestConfig("Username")));
		    String s=Utils.getDataFromTestConfig("Email Recipients");
			String[] w=s.split(",");
		    message.setRecipients(Message.RecipientType.TO,
		    InternetAddress.parse(w[0]));
		    message.setSubject(Utils.getDataFromTestConfig("Email Subject"));
		    BodyPart part= new MimeBodyPart();
		    part.setText(Utils.getDataFromTestConfig("Email Body"));
		    MimeBodyPart messageBodyPart2 = new MimeBodyPart();  

		    String filename = "Tookitaki Reports.docx";
		    DataSource source = new FileDataSource(filename);  
		    messageBodyPart2.setDataHandler(new DataHandler(source));  
		    messageBodyPart2.setFileName(filename);  

		    Multipart multipart = new MimeMultipart();  
		    multipart.addBodyPart(messageBodyPart2);
		    multipart.addBodyPart(part);
		    message.setContent(multipart );  
		    Transport.send(message);
		    System.out.println("MailReport sent");
	
		 } 
		
		catch (MessagingException e) 
		{
		     throw new RuntimeException(e);
		}
        }
	}

