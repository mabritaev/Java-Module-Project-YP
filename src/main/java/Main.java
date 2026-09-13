
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Car[] cars = new Car[3];

        for (int i = 0; i < cars.length; i++) {

            String carName;

            while (true) {
                System.out.print("Введите название машины: ");
                carName = scanner.nextLine();

                if (!carName.trim().isEmpty()) {
                    break;
                }

                System.out.println("Название не может быть пустым.");
            }

            int speed;

            while (true) {
                System.out.print("Введите скорость (1-250): ");
                String speedInput = scanner.nextLine();

                try {
                    speed = Integer.parseInt(speedInput);

                    if (speed > 0 && speed <= 250) {
                        break;
                    }

                    System.out.println("Скорость должна быть от 1 до 250.");
                } catch (NumberFormatException e) {
                    System.out.println("Введите целое число.");
                }
            }

            cars[i] = new Car(carName, speed);
        }

        Race race = new Race(cars);

        Car leader = race.findLeader();

        System.out.println("Победитель: " + leader.carName);

        scanner.close();
    }
}