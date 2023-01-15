public class Main {
    public static void main(String[] args) {
        Tesla tesla = new Tesla("Синий","Тесла №1");
        Sedan sedan = new Sedan("белый", "Седан");
        Truck truck = new Truck("Черный", "Трак");
        tesla.start();
        tesla.stop();
        tesla.madeASound();
        System.out.println("Цвет Tesla "+ tesla.color);
        System.out.println("Модель "+ tesla.model);
        sedan.start();
        sedan.stop();
        sedan.madeASound();
        System.out.println("Цвет Седан "+ sedan.color);
        System.out.println("Модель "+ sedan.model);
        truck.start();
        truck.stop();
        truck.madeASound();
        System.out.println("Цвет Трак "+ truck.color);
        System.out.println("Модель "+ truck.model);

    }
}