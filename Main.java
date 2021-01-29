import java.util.Scanner;

class Main {
  public static void main(String[] args)
  {
   Scanner scan= new Scanner(System.in);
   System.out.println("What should be your A value?");
   int aValue = scan.nextInt();
   System.out.println("What Should be your B value");
   int bValue = scan.nextInt();


   System.out.println("Here's your math!");

   int sum = addition  (aValue, bValue);
   System.out.println("If you add, " + aValue + " and " + bValue + " and " + " you get " + sum);

   int diff = subtraction(aValue, bValue);
   System.out.println("If you subtract, " + aValue + " and " + bValue + " and you get " + diff);

   int product = multiplication (aValue, bValue);
   System.out.println("If you multiply, " + aValue + " and " + bValue + " and you get " + product);

   int quotient = division (aValue,bValue);
   System.out.println("If you divide, " + aValue + " by " + bValue + " you get " + quotient);
 
   
  }
    
    
    // addition method for math
  static int addition(int aValue, int bValue)
  {
    int sum = aValue + bValue;
    return sum;
  }

  // subtraction method for math
  static int subtraction(int aValue, int bValue)
  {
    int diff = aValue - bValue;
    return diff;
  }
 
   // multiplication method for math
   static int multiplication(int aValue, int bValue)
   {
    int product = aValue * bValue;
    return product;
   }

    // division method for math
   static int division(int aValue, int bValue)
   {
    int quotient = aValue / bValue;
    return quotient;
   }
  
}