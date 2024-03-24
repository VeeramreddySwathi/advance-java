import java.io.*;
public class BufferedReadDemo {

	public static void main(String[] args)throws IOException {
		FileReader fr=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
			fr=new FileReader("C:/Users/swath/Desktop/New folder/text/happy.txt");
			fw=new FileWriter("C:/Users/swath/Desktop/New folder/text/happy1.txt");
			bw=new BufferedWriter(fw);
			int ch;
			while((ch=fr.read())!=-1)
			bw.write((char)ch);
		}
		catch(FileNotFoundException fne)
		{
			System.out.println(fne.getMessage());			
		}
		finally
		{
			if(bw!=null)
				bw.close();
			if(fr!=null)
				fr.close();
			if(fw!=null)
				fw.close();
		}

	}

}
