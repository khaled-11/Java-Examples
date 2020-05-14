  package Cells;
  import java.util.*;
  
  public class cellsList {
  public static void main(String[] args) throws Exception{
    int [] arr = {1 , 0 , 0 , 1 , 1 , 0 , 1};
    int days = 1; 
    for (int i = 0 ; i <= days ; ++i) {
      ArrayList<Integer> a = new ArrayList<Integer>();
      for (int j = 0 ; j <= arr.length ; j++) {
        if (j == 0 || j == arr.length) {
          if (j == 0 && arr[1] == 0) {
          a.add(0);
          } else if (j == 0 && arr[1] == 1) {
            a.add(1);
          }
          if (j == arr.length && arr[arr.length - 2] == 0) {
            a.add(0);

          } else if (j == arr.length && arr[arr.length - 1] == 1) {
            a.add(1);
          }
        }
        if (j != 0 && j < arr.length - 1) {
          if (arr[j-1] == arr[j+1]) {
          a.add(0);
          } else {
            a.add(1);
          }}
      }
      System.out.println(a); 
      Iterator<Integer> it = a.iterator(); 
      for (int k = 0 ; k < arr.length ; ++k) {
        if (it.hasNext()) { 
            arr[k] = it.next();
        } 
      }
      for (int o = 0 ; o < arr.length ; ++o) {
        System.out.println(arr[o]);
      }}
      System.out.println();
    }}