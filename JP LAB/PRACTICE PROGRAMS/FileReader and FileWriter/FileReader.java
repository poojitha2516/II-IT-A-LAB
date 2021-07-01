// Filereader 

import java.io.FileReader;

class Read {
	public static void main(String args[]) {
		char[] array = new char[100];
		try {
			FileReader input = new FileReader("input.txt");  // Creates a reader
			input.read(array);      // reads
			System.out.println("Here is the Data in the file : ");
			System.out.println(array);
			input.close();         // closes
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}



//input.txt
Hello !! I am the text inside the file .....
