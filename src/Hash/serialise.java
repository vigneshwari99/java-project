package Hash;

import java.io.*;
import java.util.Date;
class Serialise
{
	Date d;
	transient Date d1;
	public Serialise()
	{
		d = new Date();	
		d1 = new Date();
	}
	public void performSr()
	{
		try
		{
		FileOutputStream fs = new FileOutputStream("data.ser");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(d);
		os.flush();
		os.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
