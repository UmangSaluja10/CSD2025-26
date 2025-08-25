
//1.     WAP to insert 3 numbers from the keyboard and find a greater number among 3 numbers.
/*
package Package1;
import java.util.*;
public class greaterNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number1: ");
        int a = in.nextInt();
        System.out.println("Enter a number2: ");
        int b = in.nextInt();
        System.out.println("Enter a number3: ");
        int c = in.nextInt();
        if(a>b && a>c){
            System.out.println("number1: "+a+" is largest");
        }
        else{
            if(b>c){
                System.out.println("number2: "+b+" is largest");
            }
            else{
                System.out.println("number3: "+c+" is largest");
            }
        }
    }
}

*/
//2.     WAP to count the total number of odd numbers between 1-100, and display the sum of them.
/*
package Package1;
public class countAndSumOdd {
    public static void main(String[] args) {
        int sum=0, c=0;
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                sum+=i;
                c++;
            }
        }
        System.out.println("The count of odd numbers between 1-100 is: "+c);
        System.out.println("The sum of odd numbers between 1-100 is: "+sum);
    }
}

*/

//3.     WAP to Find largest and smallest numbers in an array.
/*
package Package1;
import java.util.*;
public class largestAndSmallestInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int max = arr[0], min = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];
        }
        System.out.println("Maximum number in Array: "+max);
        System.out.println("Minimum number in Array: "+min);
    }
}
*/

//4.     WAP to count the number of charcters in a given string, to reverse the string and check whether it is palindrome or not?
/*
package Package1;
import java.util.*;
public class countCharacterAndCheckPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = in.nextLine();
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                continue;
            }
            c++;
        }
        String wrd = "";
        for(int i=0;i<str.length();i++){
            wrd=str.charAt(i)+wrd;
        }
        System.out.println("Number of characters in the given String are: "+c);
        System.out.println("The reverse of the given String is: "+wrd);
        if(wrd.equals(str)){
            System.out.println("The given String is palindrome");
        }
        else{
            System.out.println("The given String is not palindrome");
        }
    }
}
*/

//5.     WAP to find out the sum of command line arguments.

package Package1;
public class sumOfCommandLineArguments {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum of command line arguments: " + sum);
    }
}
