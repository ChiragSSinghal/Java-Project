import java.io.*;

public class File_RW {
	
	public static void main(String[] args) throws IOException {
		String str = "File handling " + "Filewriter and Filereader", line = "NULL";
		int ch;
		FileWriter fw = new FileWriter("text.txt");
		
		for(int i = 0; i < str.length(); i++)
			fw.write(str.charAt(i));
		fw.close();
		
		FileReader file = new FileReader("text.txt"); 
		BufferedReader fr = new BufferedReader(file);
		
		while((line = fr.readLine()) != null) {
			System.out.println(line);
		}
		fr.close();
	}
}