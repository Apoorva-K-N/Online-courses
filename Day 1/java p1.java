import java.util.Scanner;
 public class Main
{
   public static void main(String args[])
   {
        int i;
        String str;
        int counter[] = new int[256];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        str=in.nextLine();
        for (i = 0; i < str.length(); i++) {
            counter[(int) str.charAt(i)]++;
        }
        // Print Frequency of characters
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                  System.out.println( (char) i  + ":" +counter[i]);
            }
        }
   }
}



Output:
Enter a String : amrutha
a: 2
h: 1
m: 1
r: 1
t: 1
u: 1