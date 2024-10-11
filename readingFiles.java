package workingWithFiles;

import java.io.File;
import java.io.IOException;

public class readingFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		createFile();
		getFileInfo();
		
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
		System.out.println("Dosyanin byte cinsinden boyutu:" + file.length());
		
		
	} 
	}
}

