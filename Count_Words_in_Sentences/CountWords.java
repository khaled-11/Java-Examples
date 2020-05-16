package Count_Words_in_Sentences;
import java.util.*;
  
public class CountWords {
public static void main(String[] args) throws Exception{
  HashMap<String, Integer> map = new HashMap<>();
  String[] words = {"first" , "second" , "third" , "fourth"}; 
  String[] sentences = {"here is my first First sentense First to test." , "First here is the third to count" , "here First is nothing" , " consider edge case  with double space then select first.", "second was not included" , "  why don't wecount all words as  well"};
  String test = "THJhhjfHyyI";
  String lower1 = lower(test);
  System.out.println(lower1);
  for (int j = 0 ; j < words.length ; ++j)
  {
    int c = 0;
    for (int i = 0 ; i < sentences.length ; ++i) {
      String lower = lower(words[j]);
      if (sentences[i].contains(words[j]) || sentences[i].contains(lower)) {
        //System.out.println(words[j]  + "Found");
        ++c;
        map.put(words[j],c);
      } 
    }}
    for (int o = 0 ; o < words.length ; ++o){
         if (map.containsKey(words[o])) {
         System.out.println("The String " + words[o] + " was found " + map.get(words[o]) + " times");
         //System.out.println(map.get(words[o]));
         //System.out.println(map.get(words[o]));
       }
    }}

public static String lower(String str){
  char current;
  String lower ="";
  int tmp;
  boolean a;
  for ( int k = 0 ; k < str.length() ; ++k){
    current = str.charAt(k);
    if (current >= 'A' && current <= 'Z')  {
    tmp = (int) current;
    tmp += 32;
    current = (char) tmp;
    lower += current;
    }
    else{
      lower += current;
    }
  }
  return lower;
}



}