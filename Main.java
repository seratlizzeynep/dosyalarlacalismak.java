package workingWithFiles;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

}
