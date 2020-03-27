import java.io.*;
import java.net.*;
public class Url 
{
	public static void main(String args[])
	throws Exception
	{
		URL url=new URL(args[0]);
		URLConnection con=url.openConnection();
		InputStream is=con.getInputStream();
		int i;
		while((i=is.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}