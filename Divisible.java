import java.util.Scanner;
class Divisible{
    int num;

Divisible(int n){
    num = n;

}

void check(){
    if(num % 5 == 0)
    System.out.println("Number is divisible by 5");
    else
    System.out.println("Number is not divisible by 5");
}
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a number");
    int n= in.nextInt();

    Divisible d= new Divisible(n);
    d.check();
    
}
}