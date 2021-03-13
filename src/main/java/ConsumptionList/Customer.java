package ConsumptionList;

import javax.swing.*;
import java.text.DecimalFormat;

public class Customer {
    int id;
    int money;
    int discount;

    public Customer(int id, int money, int discount) {
        this.id = id;
        this.money = money;
        this.discount = discount;
    }

    public int spend() {
        return money-discount;
    }

    public void print() {
        if (id <= 99) {
            System.out.println("id 00" +id + "\t" +"money "+ money + "\t" +"discount "+ discount + "\t" +"Cost"+ spend());
        } else if (id <= 999) {
            System.out.println("id 0" +id + "\t" +"money "+ money + "\t" +"discount "+ discount + "\t" +"Cost"+ spend());        } else {
            System.out.println("id " +id + "\t" +"money "+ money + "\t" +"discount "+ discount + "\t" +"Cost"+ spend());        }
    }
}
