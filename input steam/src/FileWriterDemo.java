import java.io.*;
public class FileWriterDemo {

	public static void main(String[] args)throws IOException
	{
		FileReader fr=null;
		FileWriter fw=null;
		try
		{
			fr=new FileReader("C://Users//swath//Desktop//New folder//text//hello.txt");
		    fw=new FileWriter("C://Users//swath//Desktop//New folder//text//hello1.txt");
		    int ch;
			while ((ch=fr.read())!=-1);
          fw.write((char)ch);
		}
		catch(FileNotFoundException fne)
		{
			System.out.println(fne.getMessage());
		}
		finally
		{
			if(fr!=null)
			
				fr.close();
			
			if(fw!=null)
			
				fw.close();
		}
		}
		

	}


