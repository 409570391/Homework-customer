package ConsumptionList;

import java.util.concurrent.Callable;

public class ConsumptionList {
    public static void main(String[] args) {

        Customer cus1 = new Customer(13, 490, 0);
        Customer cus2 = new Customer(52, 1000, 100);
        Customer cus3 = new Customer(81, 290, 0);
        Customer cus4 = new Customer(2212, 2000, 200);
        cus1.print();
        cus2.print();
        cus3.print();
        cus4.print();
    }
}
