package Stairs;
  
  public class StairsX{
      public static void main(String[] args) {
       // System.out.println(getStairs(2));
        int [] u = {1,3,5};
        System.out.println(getStairs(u,4));
        
        
      }
       static public boolean check(int[] arr, int toCheckValue) 
    { 
        boolean test = false; 
        for (int element : arr) { 
            if (element == toCheckValue) { 
                test = true; 
                break; 
            } 
        }
        return test;
    }   
      
     // Loop Solution 
     static  public int getStairs(int[] u, int n) {
        if ( n == 0 ){
          return 1;
        }
        int []num = new int[n+1];
        num[0] = 1;
        for(int i = 1 ; i <= n ; ++i){
          int total = 0;
          for ( int j=0;j<=n; j++){
          if ( i-j >= 0 && (check(u,j))){
          //System.out.println("Found");
          total += num[i-j];
          num[i]=total;
        }

          }  

        }
        return num[n];
        }

  }