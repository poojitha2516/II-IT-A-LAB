// FileWriter

import java.io.FileWriter;

class Write {
	public static void main(String args[]) {
		String data = "Hello !! This is the data in the output file...";
        try{
			FileWriter output = new FileWriter("output.txt");
			output.write(data);
			System.out.println("Data is written to the file");
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}


//output.txt
Hello !! This is the data in the output file...
