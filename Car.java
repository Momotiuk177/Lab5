class Car extends AbstractCar {
    private boolean engineStarted;

    public Car(String model, int horsepower, double weight, int maxSpeed, String country) {
        super(model, horsepower, weight, maxSpeed, country);
        this.engineStarted = false;
    }

    public void specialFeature() {
        System.out.println();
    }

    public void startEngine() {
        this.engineStarted = true;
        System.out.println("Двигун автомобіля запущено.");
    }

    public void startEngine(String ignitionType) {
        this.engineStarted = true;
        System.out.println("Двигун автомобіля запущено за допомогою " + ignitionType);
    }

    public void drive() {
        if (engineStarted) {
            System.out.println("Автомобіль рухається з середньою швидкістю 140 км/год по трасі Київ-Чоп.");
        } else {
            System.out.println("Спочатку потрібно запустити двигун.");
        }
    }
}
