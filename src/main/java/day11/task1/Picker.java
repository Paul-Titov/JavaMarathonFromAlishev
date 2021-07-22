package day11.task1;

public class Picker implements Worker {
    //    “Сборщик” (англ. Picker) с полями salary (заработная плата)
//    и isPayed (был выплачен бонус или нет),
//    get методами для обоих полей, методом toString() и конструктором.
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
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
        salary += 80;
        warehouse.setCountPickedOrders((warehouse.getCountPickedOrders()) + 1);
        if (warehouse.getCountPickedOrders() % 10000 == 0) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        if (!isPayed) {
            if (warehouse.getCountPickedOrders() >= 10000) {
                salary += 70000;
                isPayed = true;
            } else {
                System.out.println("Бонус пока не доступен");
            }

        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
