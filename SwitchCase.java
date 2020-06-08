import java.util.Scanner;
public class SwitchCase{
  public static void main(String[] args){
    int select;
    System.out.println("Your fav color is: 1.Black\t2.Blue\t3.Pink\t");//1
    Scanner sc = new Scanner(System.in);
    select = sc.nextInt();
    switch(select){
      case 1: System.out.println("Your fav color is Black");
             break;
      case 2: System.out.println("Your fav color is Blue");
             break;
      case 3: System.out.println("Your fav color is Pink");
             break;
      default: System.out.println("Invalid Choice");
        //Your fav color is Black
    }
  }
}
