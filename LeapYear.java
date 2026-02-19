import java.util.Scanner;
class LeapYear{
    int year;
    LeapYear(int y){
        year = y;

    }
    void checkLeap(){
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0))
        System.out.println(year+ "is a Leap Year");
        else
        System.out.println(year+ "is not a Leap Year");

    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Year:");
        int y= in.nextInt();

        LeapYear obj = new LeapYear(y);
        obj.checkLeap();

    }
}