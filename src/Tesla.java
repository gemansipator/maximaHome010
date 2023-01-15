public class Tesla extends Car{
    @Override
    void madeASound() {
        System.out.println("Tesla бибикнула");
    }

    @Override
    public void start() {
        System.out.println("Тесла поехала");
    }

    @Override
    public void stop() {
        System.out.println("Тесла остановилась");
    }
}
