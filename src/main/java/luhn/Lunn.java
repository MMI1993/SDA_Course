package main.java.luhn;
/*
Given a number determine whether or not it is valid per the Luhn formula.
The Luhn algorithm is a simple checksum formula used to validate a variety of identification numbers, such as credit card numbers and
Canadian Social Insurance Numbers.
The task is to check if a given string is valid.
Validating a Number
Strings of length 1 or less are not valid. Spaces are allowed in the input, but they should be stripped before checking.
All other non-digit characters are disallowed.
Example 1: valid credit card number
4539 1488 0343 6467
The first step of the Luhn algorithm is to double every second digit, starting from the right. We will be doubling
4_3_ 1_8_ 0_4_ 6_6_
If doubling the number results in a number greater than 9 then subtract 9 from the product. The results of our doubling:
8569 2478 0383 3437
Then sum all of the digits:
8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80
If the sum is evenly divisible by 10, then the number is valid. This number is valid!
Example 2: invalid credit card number
8273 1232 7352 0569
Double the second digits, starting from the right
7253 2262 5312 0539
Sum the digits
7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57
57 is not evenly divisible by 10, so this number is not valid.
 */
public class Lunn {
    private String nr;
    public Lunn(String nr) {
        this.nr = nr;
        int l = nr.length();
        int x = 0;
        int i = 0;
        nr = nr.replace(" ", "");
        if (nr.matches("^[\\d ]*$")) {
            System.out.println("Cod valid");
        } else {
            System.out.println("Cod invalid");
        }
    }
    public boolean extract() {
        nr = nr.replace(" ", "");
        int sum = 0;
        int x = 0;
        for (int i = nr.length()-1 ; i >= 0; i --) {
            x = Character.getNumericValue(nr.charAt(i));
            if(i%2==0){
                if (x * 2 > 9) {
                    x = x * 2 - 9;
                    sum = sum + x;
                } else {
                    sum = sum + x * 2;
                }
            }else{
                sum = sum + x;
            }
        }
        if (sum % 10 == 0) {
            return true;
        } else
            return false;
    }
    public static void main(String[] args) {
        Lunn k = new Lunn("4539 1488 0343 6467");
        System.out.println(k.extract());
    }
}

/*raspuns 2
/>>>>>>>>>
verifica daca suma este divizibila cu
10>>>>>>>>>>>>>>>>
  public static boolean validateCard(String cardNumber) {
      boolean regex = cardNumber.matches("^[\\d ]*$");
      if (cardNumber.length() <= 1 || cardNumber.length() != 16 || !regex) {
          return false;
      } else {
          int sum = checkLohnAlgo(cardNumber);
          return (sum % 10 == 0);
      }
  }
  //>>>>>>>>> verifica Lohn Algoritm>>>>>>>>>>>>>>>>
  public static int checkLohnAlgo(String nrCard) {
      char[] cardArray;
      int sum = 0;
      int conditie;
      nrCard = nrCard.replace(" ", "");
      cardArray = nrCard.toCharArray();
      for (int i = 0; i < cardArray.length; i++) {
          int cifra = Character.getNumericValue(cardArray[i]);
          if (i % 2 == 0) {
              conditie = cifra * 2;
              if (conditie > 9) {
                  conditie = conditie - 9;
              }
              sum = sum + conditie;
          } else {
              sum = sum + cifra;
          }
      }
      return sum;
  }
  public static void main(String[] args) {
      Card c = new Card();
      System.out.println(c.validateCard("8273 1232 7352 0569"));
      System.out.println(c.validateCard("4539 1488 0343 6467"));
      System.out.println(c.validateCard("4539 1488 034A 6467"));
  }
}
 */