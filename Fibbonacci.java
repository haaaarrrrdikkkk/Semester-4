import java.util.Scanner;
class Fibonacci{
    int terms;
    Fibonacci(int t){
        terms = t;

    }
    void printSeries(){
        int a = 0, b = 1;

        for(int i = 0; i<= terms; i++){
            System.out.println(a+" ");
            int next = a+b;
            a= b;
            b= next;

        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        Fibonacci f= new Fibonacci(t);
        f.printSeries();

    }
}