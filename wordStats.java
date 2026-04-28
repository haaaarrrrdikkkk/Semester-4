import java.util.Scanner;
public class wordStats{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = in.nextLine();

        int upper = 0, lower = 0, digits = 0, spaces = 0;

        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)){
                upper++;

            }
            else if(Character.isLowerCase(ch)){
                lower++;

            }
            else if(Character.isDigit(ch)){
                digits++;

            }
            else if(Character.isSpaceChar(ch)){
                spaces++;

            }
        }
        System.out.println("Uppercase Characters: "+ upper);
        System.out.println("Lower Case Characters: "+ lower);
        System.out.println("Digits :"+ digits);
        System.out.println("Spaces: "+ spaces);

    }
}
