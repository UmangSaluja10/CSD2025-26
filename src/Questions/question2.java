package Questions;

import java.util.HashMap;
import java.util.Scanner;

// Write a java program if two strings are anagram or not using HashMap
public class question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<str1.length();i++)
        {
            if(map.containsKey(str1.charAt(i))) {
                map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
            }
            else {
                map.put(str1.charAt(i), 1);
            }
        }
        for(int i=0;i<str2.length();i++){
            if(map.containsKey(str2.charAt(i))) {
                map.put(str2.charAt(i), map.getOrDefault(str2.charAt(i), 0) - 1);
            }
            else {
                System.out.println("False");
                System.exit(0);
            }
        }
        for(Integer i:map.values()){
            if(i!=0){
                System.out.println("False");
                System.exit(0);
            }
        }
        System.out.println("True");
    }
}
