public class ServiceStation {
    public void check(Machine machine) {
        System.out.println("Обслуживаем " + machine.getModelName());
        for (int i = 0; i < machine.getWheelsCount(); i++) {
            machine.updateTyre();
        }
        machine.checkEngine();
        machine.checkTrailer();
    }
}
