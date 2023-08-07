package firstProgram;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
//import java.io.IOException;

public class TextReadWriteAndUpdate {
	public static void main(String[] args) throws Throwable {
		File f1 =new File("C:\\Users\\DANI\\eclipse-workspace\\SampleProject\\ReadWriteUpadte\\A\\Amazon.txt");
		
		//to create folder
		boolean m = f1.mkdirs();
		System.out.println(m);
		
		//to create a multiple folder
		boolean m1 = f1.mkdirs();
	    System.out.println(m1);
	    
	    //TO FIND WHEATHER ITS  DIRECTORY OR NOT
        boolean d = f1.isDirectory();
	    System.out.println(d);
	    
	    //TO DELETE THE RESPECTIVE FOLDER
	   boolean del = f1.delete();
	   System.out.println(del);
	   
	  boolean h = f1.isHidden();
	  System.out.println(h);
		
		boolean files = f1.isFile();
		 System.out.println(files);
		
		//TO PRINT THE PATH
		File[] lf = f1.listFiles();
		for(File file:lf) {
			System.out.println(file);
		}
	  
		//TO PRINT THE FOLDER  NAME
		String[] l = f1.list();
		for(String X:l) {
			System.out.println(X);
		}
		
		//TO CREATE NEW FILES
		boolean nf = f1.createNewFile();
		System.out.println(nf);
		
		//TO WRITE IN THE RESPECTIVE  FILES
		 FileWriter fw = new FileWriter(f1);
		 fw.write("BELIVE IN  JESUS");
		 fw.close();
		 
		//TO READ IN THE RESPECTIVE  FILES
		 FileReader fr = new FileReader(f1);
		 char c[] =  new char[20];
		 fr.read(c);
		 for(Character ch :c) {
			 System.out.print(ch);
		 }
		 
		 fr.close();
	}

}
