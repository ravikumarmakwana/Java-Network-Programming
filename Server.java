import java.io.*;
import java.net.*;
public class Server
{
	public static void main(String []args)
	throws Exception
	{
		int port=Integer.parseInt(args[0]);
		ServerSocket ss=new ServerSocket(port);
		Socket s=ss.accept();
		InputStream is=s.getInputStream();
		DataInputStream in=new DataInputStream(is);
		System.out.println(in.readUTF());
		OutputStream os=s.getOutputStream();
		DataOutputStream out=new DataOutputStream(os);
		out.writeUTF("Thanking For Connection ! ! !");
		ss.close();
	}
}