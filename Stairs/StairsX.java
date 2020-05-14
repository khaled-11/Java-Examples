package Stairs;
  
  public class StairsX{
      public static void main(String[] args) {
        System.out.println(getStairs(3));
        //System.out.println(getStairs2(7));
      }
     
      
     // Loop Solution 
     static  public int getStairs(int n) {
        if ( n == 0 ){
          return 1;
        }
        else{    
        int[] num = new int[n+1];
        num[0] = 1;
        for (int i = 1 ; i <= n ; i++){
          int total = 0;
          for ( int j = 0 
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
          u = getStairs2(n-1) + getStairs(n-2);
        }
        return u;
        }
     
     
      

  }