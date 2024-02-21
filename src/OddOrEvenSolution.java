
/*
Question: Tell if an int is an odd or even number
234 --> Even
233 --> Odd
Cover all test scenarios
 */

/*
    int num = 234;
    String numStr = (String)num;
    String[] numStrAr = numStr.split();
    if(numStrAr.lastNumber.equals(0 OR 2 OR 4 OR 6 OR 8){print "even";}
    else{print "odd";}

    Complexity of the solution --> O(n)


    int num = 15;
    int res = num%2;
    if(res == 0) print "even";
    else print "odd";

    o(1)

 */

public class OddOrEvenSolution {
    public static void main(String[] args) {
        int num = 0;
        int res = num % 2;
        if (res == 0)
            System.out.println(num + " is an even number!");
        else
            System.out.println(num + " is an odd number!");
    }
}

/*
  read about code complexity (Topic: Big O notation)
  modulus operator

  O(1)      --> Constant time complexity
  O(log n)  --> Logarithmic complexity
  O(n)      --> Linear complexity
  O(n^2)    --> Quadratic complexity
  O(n^x)    --> Exponential complexity
 */