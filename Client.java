import java.net.*;
import java.io.*;
public class Client
{
	public static void main(String []args)
	throws Exception
	{
		String host=args[0];
		int port=Integer.parseInt(args[1]);
		Socket client = new Socket(host,port);
		OutputStream os=client.getOutputStream();
		DataOutputStream out=new DataOutputStream(os);
		out.writeUTF("Hi Server, I am Client");
		InputStream is=client.getInputStream();
		DataInputStream in=new DataInputStream(is);
		System.out.println(in.readUTF());
		os.close();
	}
}