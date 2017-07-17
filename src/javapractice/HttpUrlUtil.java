package javapractice;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrlUtil {
	public static void connect(){
	HttpURLConnection connection;
	try {
		URL url = new URL("http://localhost:8080/360BUY/login.jsp");  
		connection = (HttpURLConnection) url.openConnection();  
		connection.setDoOutput(true);//允许连接提交信息  
		connection.setRequestMethod("POST");//网页提交方式“GET”、“POST”  
		connection.setRequestProperty("User-Agent", "Mozilla/4.7 [en] (Win98; I)");   
		StringBuffer sb = new StringBuffer();  
		sb.append("username=admin");  
		sb.append("&password=admin");   
		OutputStream os = connection.getOutputStream();  
		os.write(sb.toString().getBytes());  
		os.close();
	
		BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));  
		  
		  
		  
		  
		String responseCookie = connection.getHeaderField("Set-Cookie");//取到所用的Cookie  
		           System.out.println("cookie:" + responseCookie);  
		String line = br.readLine();  
		  
		  
		while (line != null) {  
		  
		  
		System.out.println(new String(line.getBytes()));  
		  
		  
		line = br.readLine();//打出登录的网页   
		  
		  
		}  
		//acces  
		URL url1 = new URL("http://localhost:8080/360BUY/login.jsp");  
		HttpURLConnection connection1 = (HttpURLConnection) url1.openConnection();  
		connection1.setRequestProperty("Cookie", responseCookie);//给服务器送登录后的cookie  
		BufferedReader br1 = new BufferedReader(new InputStreamReader(connection1.getInputStream()));  
		  
		  
		String line1= br1.readLine();  
		  
  
		while (line1 != null) {  
		  
		  
		System.out.println(new String(line1.getBytes()));  
		  
		  
		line1 = br1.readLine();  
		 
			}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	}
	public static void main(String args[]){
		connect();
	}
}
  

