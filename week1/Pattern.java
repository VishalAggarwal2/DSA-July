package week1;

import java.util.Scanner;

public class Pattern {
    static   void pattern1(int n){
        // Example 1:
        // Input: N = 3
        // Output: 
        // * * *
        // * * *
        // * * *       

    for(int i=0;i<n;i++){
  for(int j=0;j<n;j++){
   System.out.print("*"); 
  }
  System.out.println();
   }

       }



       static   void pattern2(int n){
        // Input Format: N = 3
        // Result: 
        // * 
        // * * 
        // * * *
        
        // Input Format: N = 6
        // Result:
        // * 
        // * * 
        // * * *
        // * * * *
        // * * * * *
        // * * * * * *
    for(int i=0;i<n;i++){
  for(int j=0;j<=i;j++){
   System.out.print("*"); 
  }
  System.out.println();
   }

       }




      static   void pattern3(int n){
        // Input Format: N = 3
        // Result: 
        // 1
        // 1 2 
        // 1 2 3
        
        // Input Format: N = 6
        // Result:
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        // 1 2 3 4 5 6
    for(int i=1;i<=n;i++){
  for(int j=1;j<=i;j++){
   System.out.print(j); 
  }
  System.out.println();
   }

       }


       static void pattern4(int n){
        // Input Format: N = 3
        // Result: 
        // * * *
        // * * 
        // *
        
        // Input Format: N = 6
        // Result:
        // * * * * * *
        // * * * * * 
        // * * * * 
        // * * * 
        // * * 
        // * 


        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
             System.out.print("*"); 
            }
            System.out.println();
             }
       }


       static void pattern5(int n){
        // Input Format: N = 3
        // Result: 
        //   *  
        //  *** 
        // *****   
        // Input Format: N = 6
        // Result:
        //      *     
        //     ***    
        //    *****   
        //   *******  
        //  ********* 
        // ***********


        for(int i=0;i<n;i++){
       
for(int j=0;j<n-i-1;j++){
    System.out.print(" ");

}
for(int j=0;j<2*i+1;j++){
    System.out.print("*");

}
for(int j=0;j<n-i-1;j++){
    System.out.print(" ");

}
System.out.println();

             }
       }



       static void pattern7(int n){
        // Input Format: N = 3
        // Result: 
        //   *  
        //   **
        //   ***  
        //   **
        //   *   
        // Input Format: N = 6
        // Result:   
        //      *
        //      **
        //      *** 
        //      ****
        //      *****
        //      ******  
        //      *****
        //      ****
        //      ***    
        //      **
        //      *

pattern2(n);
pattern4(n);
       }

       static void pattern8(int n){
//         Input Format: N = 3
// Result: 
// 1
// 01
// 101

// Input Format: N = 6
// Result:   
// 1
// 01
// 101
// 0101
// 10101
// 010101
int start =1;
for(int i=0;i<n;i++){
    
          // if the row index is even then 1 is printed first
          // in that row.
          if(i%2 ==0) start = 1;
          
          // if odd, then the first 0 will be printed in that row.
          else start = 0;
          
          // We alternatively print 1's and 0's in each row by using
          // the inner for loop.
          for(int j=0;j<=i;j++){
              System.out.print(start);
              start = 1-start;
          }
          System.out.println();
}


       }
// upper butterfly
       static void pattern9(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<(2*n-2*(i+1));j++){
                System.out.print(" ");
            }
            for(int j=i+1;j>0;j--){
                System.out.print("*");
            }

            System.out.println();
        }
       }
// Lower butterfly
       static void pattern10(int n){
        for(int i=n-1;i>0;i--){
          for(int j=0;j<i;j++){
            System.out.print("*");
          }
          for(int j =0;j<2*(n-i);j++){
            System.out.print(" ");
          }
          for(int j=0;j<i;j++){
            System.out.print("*");
          }
          System.out.println();
        }
       }
// Complete butterfly
static void pattern11(int n){
pattern9(n);
pattern10(n);
   }


// upper symmetric void pattern
static void pattern12(int n){
    for(int i=n;i>0;i--){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        
        for(int j =0;j<2*(n-i);j++){
            System.out.print(" ");
        }

        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}


// lowere symmetric void pattern
 static void pattern13(int n){
    for(int i=1;i<n;i++){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        
        for(int j=0;j<2*(n-i);j++){
            System.out.print(" ");
        }

        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

 }

 static void pattern14(int n){
    pattern12(n);
    pattern13(n);
 }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Value Of N");
    int n = sc.nextInt();
    pattern14(n);

     }
}
