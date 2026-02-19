import java.util.Scanner;
class NoCheck{
    int num;

    NoCheck(int n){
        num = n;

    }
    void check(){
        if(num > 0)
        System.out.println("Positive Number");
        else if(num <0)
        System.out.println("Negative Number");
        else 
        System.out.println("Zero");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        int n = sc.nextInt();

        NoCheck obj = new NoCheck(n);
        obj.check();
        
    }
}