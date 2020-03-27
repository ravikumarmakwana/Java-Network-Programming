import java.io.*;
import java.net.*;
public class Server1
{
	public static void main(String args[])
	throws Exception
	{
		DatagramSocket ds=new DatagramSocket(Integer.parseInt(args[0]));
		byte []data=new byte[1024];
		DatagramPacket dp=new DatagramPacket(data,1024);
		ds.receive(dp);
		String msg=new String(dp.getData(),0,dp.getLength());
		System.out.println(msg);
		ds.close();
	}
}