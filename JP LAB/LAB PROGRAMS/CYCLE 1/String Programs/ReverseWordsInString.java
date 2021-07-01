// Java Program to reverse words in a String

import java.util.Scanner;
import java.util.regex.Pattern;
public class Reversewordsinastring {
  
    // Method to reverse words of a String
    static String reversewords(String str)
    {
        Pattern p = Pattern.compile("\\s");
        String[] temp = p.split(str);
        String rev = "";
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                rev = temp[i] + rev;
            else
                rev = " " + temp[i] + rev;
        }
        return rev;
    }

    public static void main(String[] args)
    {
        String s1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        s1 = sc.nextLine();
        System.out.println("The Reversed String is: "+reversewords(s1));
    }
}
