import java.net.*;
import java.io.*;

class Net{
	public static void main(String args[]){
		try{
			URL u=new URL("http://ramubhusal.com.np");
			InetAddress ip[]=InetAddress.getAllByName("www.google.com");
			System.out.println(ip[1]);
			//URLConnection uc=u.openConnection();
			//uc.connect();
			//String x=u.openStream();
			//DataInputStream dis=new DataInputStream(u.openStream());
			//FileOutputStream dos=new FileOutputStream("new.html");
			//int i;
			//while((i=dis.read())!=-1){
				//System.out.print((char)i);
			//	dos.write(i);
				
			//}
			//dos.close();
			
		}catch(Exception e){
			System.out.println("Error"+e);
		}
	}
}