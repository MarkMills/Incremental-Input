import java.util.*;
//import all
class Main {
  //create class
   public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    //create scanner for input

    System.out.println("Integer?");
    //print integer?

    int num = input.nextInt();
    //collect input

    System.out.println("The integer you entered is "+num+".");
    //print original input

    System.out.println("The next integer is "+(++num)+".");
    //print updated input with incremental operator
  }

}
