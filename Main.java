import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer value");
    int original = sc.nextInt();

//------------------------------------------------------
   
    // 1. What will you use to make one int variable the same as another int variable? Create an int variable called copy and make it equal to the int variable original.
int copy = original; 


    System.out.println(original + " equals " + copy);

//------------------------------------------------------


  int low = 100;
  int high = 100;

  // 2. Now using the == operator to create an if statement to check if the following two ints are equal. In the if statement print out "They are equal".
	if (low == high  ) {		
			System.out.println("They are equal");
		}

		else {
			System.out.println("Not Equal");
		}
			



//------------------------------------------------------

    String string1 = "Hello World";

    String string2 = new String("Hello World");

// 3. Create statement that compares the two strings using the == operator.

		  System.out.println(string1 == string2); //false


// 4. Now try using the string method .equals() for the same task as above.

  
		  System.out.println(string1.equals(string2)); 
    
  }
}