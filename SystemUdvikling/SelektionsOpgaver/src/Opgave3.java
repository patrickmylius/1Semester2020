public class Opgave3 {
  //TEST CASE Lav et program der:
    //Erklærer to variable first og second.
    //Sætter first og second til værdier du selv vælger
    //Undersøger hvilken af de to variable der har den største værdi og udskriver denne
    //Test dit program med forskellige værdier for first og second.
  public static void main(String[] args) {

    int first = 25;
    int second = 27;
    //forventet output = "second variable is higher than the first variable"

    if (first > second)
      System.out.println(first + " first variable is higher than the second variable");
    if (first < second)
      System.out.println(second + " second variable is higher than the first variable");
    if (first == second)
      System.out.println(first + " and " + second + " first and second variable are equal");
    //faktisk output "second variable is higher than the first variable"


    first = 2354234;
    second = 2325342;
    //forventet output = "first variable is higher than the second variable"

    if (first > second)
      System.out.println(first + " first variable is higher than the second variable");
    if(first < second)
      System.out.println(first + " first varaible is higher than the second variable");
    if (first == second)
    System.out.println(first + " and " + second + " first and second variable are equal");
    //faktisk output "first variable is higher than the second variable"


    first = 500;
    second = 500;
    //forventet output = "first and second varaible are equal"

    if (first > second)
      System.out.println(first + " first variable is higher than the second variable");
    if(first < second)
      System.out.println(first + " first varaible is higher than the second varaible");
    if (first == second)
      System.out.println(first + " and " + second + " first and second variable are equal");
    //faktisk output "first and second variable are equal"
  }
}
