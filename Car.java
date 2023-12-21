class Car extends AbstractCar {
    private boolean engineStarted;

    public Car(String model, int horsepower, double weight, int maxSpeed, String country) {
        super(model, horsepower, weight, maxSpeed, country);
        this.engineStarted = false;
    }

    // Реалізація абстрактного методу
    public void specialFeature() {
        System.out.println();
    }

    // Перевизначений метод
    public void startEngine() {
        this.engineStarted = true;
        System.out.println("Двигун автомобіля запущено.");
    }

    // Перевантажений метод
    public void startEngine(String ignitionType) {
        this.engineStarted = true;
        System.out.println("Двигун автомобіля запущено за допомогою " + ignitionType);
    }

    // Додатковий метод
    public void drive() {
        if (engineStarted) {
            System.out.println("Автомобіль рухається з середньою швидкістю 140 км/год по трасі Київ-Чоп.");
        } else {
            System.out.println("Спочатку потрібно запустити двигун.");
        }
    }
}