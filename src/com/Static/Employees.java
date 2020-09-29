package com.Static;

public class Employees {
    int id;
    int Compensation;
    static String company = "DOER Services Ltd";

    static void check(){
        company = "Celloscope";
    }

    Employees(int i, int c) {
        id = i;
        Compensation = c;
    }

    void display() {
        System.out.println("Employee ID: " + id + ", " +"Compensation: "+ Compensation + ", " +"Company Name: "+ company);
    }
}

     class StaticKey {
        public static void main(String[] args) {
            Employees.check();
            Employees e1 = new Employees(21, 8000);
            Employees e2 = new Employees(51, 10000);
            e1.display();
            e2.display();
        }
}
