package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        businessProcess(picker);
        businessProcess(courier);

        System.out.println(warehouse.getCountPickedOrders());
        System.out.println(warehouse.getCountDeliveredOrders());
        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse);
        Courier courier2 = new Courier(warehouse);

        picker2.doWork();
        courier2.doWork();

        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

}
