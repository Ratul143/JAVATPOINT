package com.ThreadJava;

/* class MyTask{
    void executeTask(){
        for (int doc=1; doc<=10;doc++){
            System.out.println("@@ Printing Document #"+doc+" - Printer2");
        }
    }
} */

/* class MyTask extends Thread {
    @Override
    public void run() {
        for (int doc = 1; doc <= 10; doc++) {
            System.out.println("@@ Printing Document #" + doc + " - Printer2");
        }
    }
} */

class CA{

}

class MyTask extends CA implements Runnable {
    @Override
    public void run() {
        for (int doc = 1; doc <= 10; doc++) {
            System.out.println("@@ Printing Document #" + doc + " - Printer2");
        }
    }
}

class YourTask extends CA implements Runnable {
    @Override
    public void run() {
        for (int doc = 1; doc <= 10; doc++) {
            System.out.println("$$ Printing Document #" + doc + " - Printer3");
        }
    }
}

public class Threading {

    public static void main(String[] args) {
        System.out.println("==Application Started==");

        Runnable r = new MyTask();
        Thread task = new Thread(r);
        task.start();

        new Thread(new YourTask()).start();

        for (int doc=1; doc<=10; doc++){
            System.out.println("^^ Printing Document #"+doc+" - Printer1");
        }
        System.out.println("==Application Finished==");
    }

}
