import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x < 5){
            System.out.println(x * x -3* x + 4);
        }
        else{
            System.out.println(x + 7);
        }
    }
}