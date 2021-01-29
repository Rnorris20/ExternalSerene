import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  {
    //created scanners and the original print statements
    Scanner scan = new Scanner(System.in);
    System.out.println("What should be your A value");
    int aValue = scan.nextint();
    System.out.println("What should be your B value");
    int bValue = scan.nextint();

    System.out.println("This is your result for your work");

    //math part of the code
    int sum = addition(aValue, bValue);
    System.out.println("If you add," + aValue + "and" + bValue + "you would get" + sum);

    int diff = subtraction (aValue, bValue);
    System.out.println("If you subtract the values," + aValue + "and" + bValue + "you would get" + diff);

    int product = multiplication (aValue, bValue);
    System.out.println("If you multiply the values," + aValue + "and" + bValue + "you would get" + product);

    int quotient = division (aValue, bValue);
    System.out.println("If you divide the values," + aValue + "and" + bValue + "you would get" + quotient);


  }
    
    //addition method 
    static int addition(int aValue, int bValue)
    {
      int sum = aValue + bValue;
      return sum;
    }

    //subtraction method
    static int subtraction(int aValue, int bValue)
    {
      int diff = aValue - bValue;
      return diff;
    }

    //multiplication method
    static int multiplication(int aValue, int bValue)
    {
      int product = aValue * bValue;
      return product;
    }

    //division method
    static int division(int aValue, int bValue)
    {
      int quotient = aValue / bValue;
      return quotient;
     }
    
  
}