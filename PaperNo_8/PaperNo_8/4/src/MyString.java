
import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MTLS
 */
public class MyString implements IString{

    @Override
    public int f1(String str) {
        String[] words = str.split("\\s+");
        int count = 0;
        for(String word : words){
            if(isPalindrome(word) && countDigits(word) >= 3){
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        Set<Character> seenOddNumbers = new HashSet<>();
        StringBuilder result = new StringBuilder();
        boolean firstEvenNumberSeen = false;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                if (digit % 2 == 0) { // even number
                    if (!firstEvenNumberSeen) {
                        result.append(c);
                        firstEvenNumberSeen = true;
                    }
                } else { // odd number
                    if (!seenOddNumbers.contains(c)) {
                        result.append(c);
                        seenOddNumbers.add(c);
                    }
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
  private boolean isPalindrome(String word){
      int len = word.length();
      for(int i = 0; i < len/2; i++){
          if(word.charAt(i)!= word.charAt(len - i - 1)){
              return false;
          }
      }
      return true;
 }
  private int countDigits(String word){
      int count = 0;
      for(char c : word.toCharArray()){
          if(Character.isDigit(c)){
              count++;
          }
      }
      return count;
  }
}