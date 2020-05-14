package Stairs;
  
  public class Stairs{
      public static void main(String[] args) {
        System.out.println(getStairs(7));
        System.out.println(getStairs2(7));
      }
     
      
     // Loop Solution 
     static  public int getStairs(int n) {
        if ( n == 0 || n == 1){
          return 1;
        }
        else{    
        int[] num = new int[n+1];
        num[0] = 1;
        num[1] = 1;
        for (int i = 2 ; i <= n ; i++){
          num[i] = num[i-1] + num[i-2];
        }
       return num[n];
        }}
     
     // Recursive Solution.
      static  public int getStairs2(int n) {
        int u;
        if ( n == 0 || n == 1){
          return 1;
        }
        else{    
          u = getStairs2(n-1) + getStairs2(n-2);
        }
        return u;
        }
     
     
      

  }