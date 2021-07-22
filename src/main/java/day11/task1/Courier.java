package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    @Override
    public String toString() {
        return salary + " " + isPayed;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders((warehouse.getCountDeliveredOrders()) + 1);
        if (warehouse.getCountDeliveredOrders() == 10000) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        if (!isPayed) {
            if (warehouse.getCountDeliveredOrders() >= 10000) {
                salary += 50000;
                isPayed = true;
            } else {
                System.out.println("Бонус пока не доступен");
            }

        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
