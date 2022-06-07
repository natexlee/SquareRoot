import java.util.Scanner;


class Solution {
    public static int mySqrt(int x) {
        
        int sqrt = x / 2;
        int number = 0;
        
        while (sqrt != number){
            
            number = sqrt;
            
            sqrt = (x/number + number) / 2;
        }
        
        return sqrt;
    }



public static void main(String[] args) {

    System.out.println("Enter a number to square root: ");
    int originalNumber = new java.util.Scanner(System.in).nextInt();

    System.out.println("The square root of " + originalNumber + " is " + mySqrt(originalNumber));

}

}