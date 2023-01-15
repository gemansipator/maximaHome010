public class Truck extends Car{


    public Truck(String color, String model) {
        super(color, model);
    }

    @Override
    public void madeASound() {
        System.out.println(model + " бибикнул");
    }

    @Override
    public void start() {
        System.out.println(model + " поехал");
    }

    @Override
    public void stop() {
        System.out.println(model +" остановился");
    }
}
