public class Race {

    Car[] cars;

    Race(Car[] cars) {
        this.cars = cars;
    }

    Car findLeader() {

        Car leader = cars[0];

        for (int i = 1; i < 3; i++) {
            Car current = cars[i];

            if (current.speed > leader.speed) {
                leader = current;
            }
        }

        return leader;
    }
}
