import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();
            System.out.printf("%d %d",2 * (n + m), n*m);
            System.out.printf("\n");
        }
    }
}