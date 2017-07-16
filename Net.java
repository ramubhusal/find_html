import java.net.*;
import java.io.*;

class Net{
	public static void main(String args[]){
		try{
			URL u=new URL("http://www.google.com.np"); //change website name here
			InetAddress ip=InetAddress.getByName("www.google.com"); //change website name here
			System.out.println(ip);
			URLConnection uc=u.openConnection();
			uc.connect();
			DataInputStream dis=new DataInputStream(u.openStream());
			FileOutputStream dos=new FileOutputStream("new.html"); 
			int i;
			while((i=dis.read())!=-1){
				System.out.print((char)i);
				dos.write(i);
				
			}
			dos.close();
			
		}catch(Exception e){
			System.out.println("Error"+e);
		}
	}
}
