public abstract class Car {
    String color;
    String model;

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    protected void start(){
        System.out.println("Некая машина поехала");
    };
    protected void stop(){
        System.out.println("Некая машина остановилась");
    };
    protected abstract void madeASound();  //издать звук
}
