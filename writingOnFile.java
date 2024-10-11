package workingWithFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class writingOnFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		createFile();
		getFileInfo();
		readFile();
		writeFile();
	}

	public static void createFile() {

		File file = new File("C:\\Users\\Gokhan\\Desktop\\eclipse\\files\\ student.txt");
		
		try {

		if (file.createNewFile()) {
			
			System.out.println("Dosya oluşturuldu.");
		} else {

			System.out.println("Dosya zaten var.");
		}
				
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void getFileInfo() {
		
		File file = new File("C:\\Users\\Gokhan\\Desktop\\eclipse\\files\\ student.txt");
		
		
	if (file.exists()) {
		
		System.out.println("Dosya adi:" + file.getName());
		System.out.println("Dosya yolu:" + file.getAbsolutePath());
		System.out.println("Dosya yazilabilir mi:" + file.canWrite());
		System.out.println("Dosya okunabilir mi:" + file.canRead());
		System.out.println("Dosyanin byte cinsinden boyutu:" + file.length());}
		
		
	} 
	
public static void readFile() {
		
		File file = new File("C:\\Users\\Gokhan\\Desktop\\eclipse\\files\\ student.txt");
		

		try {

			Scanner reader = new Scanner(file);
				while (reader.hasNextLine()) {
					String line =  reader.nextLine();
					System.out.println(line);
				}
			
				reader.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
public static void writeFile() {
	try {
		BufferedWriter BufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Gokhan\\Desktop\\eclipse\\files\\ student.txt"));
	
		BufferedWriter.write("Zeynep");
		System.out.println("Dosyaya yazildi.");
		
	BufferedWriter.close();
	} catch (IOException e) {
		// TODO: handle exception
	}
}
}