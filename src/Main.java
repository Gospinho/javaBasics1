import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imie?");
        String name = scanner.nextLine();
        System.out.println("Cześć, " + name);
        System.out.println("Jak masz na nazwisko?");
        String lastName = scanner.nextLine();
        System.out.println("Ile masz lat?");
        int age = scanner.nextInt();

        if (age == 18){
            System.out.println("Właśnie stałeś się pełnoletni!");
        } else if (age > 18){
            System.out.println("Wal do monopola!");
        } else {
            System.out.println("Szukaj jakiegoś kierownika co Ci kupi");
        }



    }
}
