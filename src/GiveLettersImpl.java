package src;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GiveLettersImpl {
    public static void gimmeTheLetters(String s) {

        String alpabhet = "abcdefghijklmnopqrstuvwxyz";
        String alphabhetCheck;
        int firstLetterIndex = 0;
        int lastLetterIndex = 0;

        Character firstLetter = Character.valueOf(s.charAt(0));
        Character lastLetter = Character.valueOf(s.charAt(s.length() - 1));

        if (Character.isUpperCase(firstLetter)){
           alphabhetCheck = alpabhet.toUpperCase();
        } else {
           alphabhetCheck =  alpabhet.toLowerCase();
        }

        for (int i = 0; i < alphabhetCheck.length(); i++) {
            if (alphabhetCheck.charAt(i) == firstLetter){
                firstLetterIndex = i;
            }
            if (alphabhetCheck.charAt(i) == lastLetter){
                lastLetterIndex = i;
            }
         }
        String[] alphabhetResult = new String[lastLetterIndex + 1];
        for (int x = firstLetterIndex; x < alphabhetResult.length; x++) {

            alphabhetResult[x] = String.valueOf(alphabhetCheck.charAt(x));
            alphabhetResult[lastLetterIndex] = String.valueOf(alphabhetCheck.charAt(lastLetterIndex));
        }

        List<String> list = new ArrayList<String>();

        for(String ss : alphabhetResult) {
            if(ss != null ) {
                list.add(ss);
            }
        }

        String alpabhetResultString = list.stream().map(Object::toString)
                .collect(Collectors.joining(""));

        System.out.println(alpabhetResultString);

    }
}


// Faster Version:
//        StringBuilder sb = new StringBuilder();
//        for (char c = s.charAt(0); c<=s.charAt(2); c++)
//            sb.append(c);
//        System.out.println(sb.toString());
//        return sb.toString();
//    }
//}


//"a-z" ➞ "abcdefghijklmnopqrstuvwxyz"
//"h-o" ➞ "hijklmno"
//"Q-Z" ➞ "QRSTUVWXYZ"
//"J-J" ➞ "J"