import java.io.*;
public class BytesteamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fie=null;
		
		try
		{
			FileInputStream fis=new FileInputStream("C://Users//swath//Pictures//IMG_20220622_161508.jpg");
			int ch;
			while((ch= fis.read())!=-1);
				System.out.println((char)ch);
		}
		catch(FileNotFoundException fne)
		{
			System.out.println(fne.getMessage());
		}
		finally
		{
			if(fie!=null)
			{
				fie.close();
			}
	
		}
		

	}

}
