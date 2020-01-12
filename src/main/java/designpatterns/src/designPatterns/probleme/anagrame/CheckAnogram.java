package main.java.designpatterns.src.designPatterns.probleme.anagrame;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.spi.CalendarNameProvider;

public class CheckAnogram {
   /* public static void main(String[] args) {
        System.out.println(isAnagram("ana", "naa"));
        System.out.println(isAnagram("anaf", "naa"));
        System.out.println(isAnagram("Ana", "nAa"));
    }
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        else {
            char[] strArr1 = str1.toCharArray();
            char[] strArr2 = str2.toCharArray();
            Arrays.sort(strArr1);
            Arrays.sort(strArr2);
            for (int i = 0; i < str1.length(); i++) {
                if (strArr1[i] != strArr2[i])
                    return false;
            }
        }
        return true;
    }
}
*/

/*  varianta 2*/
public static boolean isAnagram(String str1, String str2) {
    if (str1.length() != str2.length())
        return false;
    Map<Character, Integer> str1Freq = new HashMap<>();
    Map<Character, Integer> str2Freq = new HashMap<>();
    for (int i = 0; i < str1.length(); i++) {
        putCharIntoMap(str1.charAt(i), str1Freq);
        putCharIntoMap(str2.charAt(i), str2Freq);
    }
    for (Map.Entry<Character, Integer> entry : str1Freq.entrySet()) {
        if (entry.getValue() != str2Freq.get(entry.getKey())) {
            return false;
        }
    }
    return true;
}
    public static void putCharIntoMap(char c,
                                      Map<Character, Integer> mapToSearchIn) {
        if (mapToSearchIn.get(c) != null) {
            int val = mapToSearchIn.get(c);
            mapToSearchIn.put(c, ++val);
        } else {
            mapToSearchIn.put(c, 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("ana", "naa"));
    }
}
/* ex 3
 public static String isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return "Nu sunt anagrame";
        } else {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.substring(0, 1).equals(str2.substring(j, j + 1))) {
                        str1 = str1.replaceFirst(str1.substring(0, 1), "");
                        str2 = str2.replaceFirst(str2.substring(j, j + 1), "");
                    }
                }
            }
            if (str1.length() == 0 && str2.length() == 0) {
                return "Sunt anagrame";
            }
        }
        return "Nu sunt anagrame";
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("armata", "tamara"));
        System.out.println(isAnagram("ana", "aan"));
        System.out.println(isAnagram("craciun", "ciurxnc"));
    }
}

 */