import java.io.*;
public class charatcter {

	public static void main(String args[]) throws IOException
	{
		FileReader fr=null;
		BufferedReader br=null;
		try
		{
			fr=new FileReader("C:/Users/swath/Desktop/New folder/text//sample.txt");
					br=new BufferedReader(fr);
			String str;
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
		}
		catch(FileNotFoundException fne)
		{
			System.out.println(fne.getMessage());
			
		}
		finally
		{
			if(fr!=null)
			{
			fr.close();
			
			
			}
				
			
		}

	}

}
