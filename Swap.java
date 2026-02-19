import java.util.Scanner;
class Swap{
    int num;
    Swap(int n){
        num = n;

    }
    void Swap(Swap other){
        int temp = num;
        num = other.num;
        other.num = temp;

    }
    void display(){
        System.out.println(num);

    }
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);

        System.out.println("Enetr 1st number");
        int a= in.nextInt();
        System.out.println("Enter 2nd number");
        int b = in.nextInt();

        Swap obj1= new Swap(a);
        Swap obj2= new Swap(b);
        obj1.Swap(obj2);

        System.out.println("After Swapping:");
        obj1.display();
        obj2.display();

    }
}