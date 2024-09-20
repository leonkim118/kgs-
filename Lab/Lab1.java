import java.util.Scanner;
public class Lab {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("type the number");
        int n = input.nextInt();
        while (n<=100){
            System.out.println(n);
            n+=10;
        }
    }
}
