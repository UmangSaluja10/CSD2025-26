package Questions;

import java.util.HashMap;
import java.util.Scanner;

// Write a java program to find frequency of string character using HashMap
public class question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        str1 = str1.toLowerCase();
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
        for(Character i : map.keySet()) {
            System.out.println(i+" "+map.get(i));
        }
    }
}
