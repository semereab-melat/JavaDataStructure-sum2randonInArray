import java.util.Random; // Random number generator class

public class Main {

    public static void main(String[] args) {
    
      Random ran = new Random(0); // Random num generator obj - seed=0
      int [][]a = new int[20][8]; // 20 rows, 8 cols
    
      for(int r = 0; r < a.length; r++){
        for(int c = 0; c < a[0].length; c++){ 
          a[r][c] = ran.nextInt(1000) + 1; // generate random num
        }//end for c
      } //end for r
      
      System.out.println("The sum of random numbers of a given array\n" + sum2DArray(a));

    } //main
  
    public static int sum2DArray(int[][] a) {
        int total = 0;
        for(int r = 0; r < a.length; r++){
            for(int c = 0; c < a[0].length; c++){
                total += a[r][c];
    }//for
    }//for
        return total;
}//sum2DArray()
}//class
