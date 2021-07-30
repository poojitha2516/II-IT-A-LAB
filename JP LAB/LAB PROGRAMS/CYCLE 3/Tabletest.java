/* Suppose that a table named Table.txt is stored in a text file. The first line in the file is the header, and the
remaining lines correspond to rows in the table. The elements are separated by commas. Write a java
program to display the table using Labels in Grid Layout.*/

import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Table1 extends Frame {
	public Table1() {
		setSize(400,400);
		GridLayout g = new GridLayout(0,4);
		setLayout(g);
		try {
			FileInputStream fin = new FileInputStream("/home/poojitha/Table.txt");
			Scanner sc = new Scanner(fin).useDelimiter(",");
			String[] arrayList;
			String a;
			while(sc.hasNextLine()) {
				a = sc.nextLine();
				arrayList = a.split(",");
				for(String i:arrayList) {
					add(new Label(i));
				}
			}
		}
		catch(Exception ex) { }
		pack();
		setVisible(true);
	}
}

public class Tabletest {
	public static void main(String args[]) {
		Table1 a = new Table1();
	}
}



/* Create File name as Table.txt
and enter the table details

HT_NO,STUDENT_NAME,PH_NO,DEPARTMENT
1230,Poojitha,123456,IT
1228,Aparna,2345,CSE
1242,Sriya,7642,ECE

*/ 
