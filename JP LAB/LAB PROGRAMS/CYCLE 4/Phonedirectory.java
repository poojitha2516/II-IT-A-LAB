/* Write a java program that loads names and phone numbers from a text file where the data is organized as
one line per record and each field in a record are separated by a tab (\t).it takes a name or phone number as
input and prints the corresponding other value from the hash table(hint: use hash tables) */

import java.util.*;
import java.io.*;
public class Phonedirectory {
	public static void main(String args[]) {
		try {
			FileInputStream fs= new FileInputStream("/home/poojitha/Phonenum.txt");
			Scanner sc = new Scanner(fs).useDelimiter("\\s+");
			Hashtable<String,String> ht = new Hashtable<String,String>();
			String[] arrayList;
			String a;
			System.out.println("Welcome");
			System.out.println(" ");
			System.out.println("Phone Numbers are : ");
			while(sc.hasNext()) {
				a = sc.nextLine();
				arrayList = a.split("\\s+");
				ht.put(arrayList[0],arrayList[1]);
				System.out.println(arrayList[0]+" : "+arrayList[1]);
			}
			System.out.println(" ");
			System.out.println("MENU");
			System.out.println("1.Search by Name");
			System.out.println("2.Search by Phone Number");
			System.out.println("3.Exit");
			
			String op = "";
			String name,phno;
			Scanner s = new Scanner(System.in);
			while(op != "3") {
			    System.out.println(" ");
				System.out.print("Enter your choice : ");
				op = s.next();
				switch(op) {
					case "1":
						System.out.print("Enter Name : ");
						name = s.next();
						if(ht.containsKey(name)) {
							System.out.println("Phone Number : "+ht.get(name));
						}
						else {
							System.out.println("Not Found !!");
						}
						break;
						
					case "2":
						System.out.print("Enter Phone Number : ");
						phno = s.next();
						if(ht.containsValue(phno)) {
							for(Map.Entry e:ht.entrySet()) {
								if(phno.equals(e.getValue())) {
									System.out.println("Name : "+e.getKey());
								}
							}
						}
						else {
							System.out.println("Not Found !!");
						}
						break;
						
					case "3":
						op = "3";
						break;
						
					default:
						System.out.println("Invalid Choice !!");
						break;
				}
			} 
			
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}


/* 
Create a file named Phonenum.txt
Poojitha  9134284311
Aparna  8214009463
Sriya   6304999122
*/

