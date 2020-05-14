  package run_length;
  import java.util.*;
  
  public class runLength {
     public static void main(String[] args) throws Exception {
       
       String a = "aaafaafssabcdbbbda";
       System.out.println("The original String is:");
       System.out.println(a);
       char[] input = a.toCharArray();
       int d = 0;
       char t = input[0];
       a = "";
       // First Approach. Adding Value to String.
       for (char c : input) {
         if (c == t){
           d++;
         } else {
         a += d;
         a += t;
         d = 1;
         t = c;
         }}
       a += d;
       a += t;
       // Printing generated String.
       System.out.println("The Generated String from the First Approach:");
       System.out.println(a);
       
       // Second Approach
       int counter = 1;
       System.out.println("The Generated Value from the Second Approach:");
       for(int i = 1 ; i < input.length ; ++i) {
         if (input[i-1] == input[i]) {
         counter ++;
         }
         if (input[i-1] != input[i] || i == input.length -1) {
           // Printing the generated value.
           System.out.print(counter);
           System.out.print(input[i-1]);
           counter = 1;
         }}
       System.out.println();
       
       // Decoding //
       // Adding the string to the Char Array.
       input = a.toCharArray();
       // New String for the decoded value.
       String n = "";
       //System.out.println(a);
       int z = Integer.parseInt(a.valueOf(a.charAt(0)));
       for (int w = 0 ; w < z ; ++w) {
         n += a.valueOf(a.charAt(1));
       }
       for (int p = 2 ; p < a.length() - 1 ; p += 2) {
         int b = Integer.parseInt(a.valueOf(a.charAt(p)));
         for (int v = 0 ; v < b ; ++v) {
         n += a.valueOf(a.charAt(p+1));
         }}
       // Printing the Decoded String..
       System.out.println("The Decoded string is:");
       System.out.println(n);  
     }
  }
     