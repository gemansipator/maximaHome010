public class Tesla extends Car{
    public Tesla(String color, String model) {
        super(color, model);
    }

    @Override
    public void madeASound() {
        System.out.println(model + " бибикнула");
    }

    @Override
    public void start() {
        System.out.println(model + " поехала");
    }

    @Override
    public void stop() {
        System.out.println(model +" остановилась");
    }
}
