import java.util.Scanner;

public class Dodatnie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie liczby od użytkownika
        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int number = scanner.nextInt();

        // Sprawdzenie, czy liczba jest dodatnia
        if (number <= 0) {
            System.out.println("Podana liczba nie jest dodatnia. Uruchom program ponownie i podaj poprawną wartość.");
        } else {
            System.out.println("Liczby nieparzyste nie większe od " + number + ":");

            // Wypisanie liczb nieparzystych
            for (int i = 1; i <= number; i += 2) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}