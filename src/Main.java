import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu y = new menu();
        y.lijst();
        int num = scanner.nextInt();
        schema h = new schema();
        spiergroep k = new spiergroep();
        if (num==1){
            h.lijst();
        }
        else if (num==2){
            k.lijst();
        }
        else {
            System.out.println("type 1 of 2 probeer opnieuw.");
        }

    }
}
