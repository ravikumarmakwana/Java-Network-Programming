import java.net.*;
import java.io.*;
public class Client1
{
	public static void main(String args[])
	throws Exception
	{
		InetAddress ip=InetAddress.getByName(args[0]);
		int port=Integer.parseInt(args[1]);
		DatagramSocket ds=new DatagramSocket();
		DatagramPacket dp=new DatagramPacket("Hello I am Client".getBytes(),"Hello I am Client".length(),ip,port);
		ds.send(dp);
		ds.close();
	}
}