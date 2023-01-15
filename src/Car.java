public abstract class Car {
    String color;
    int type;

    public void start(){
        System.out.println("Некая машина поехала");
    };
    public void stop(){
        System.out.println("Некая машина остановилась");
    };
    abstract void madeASound();  //издать звук
}
