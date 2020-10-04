package com.ThreadJava;

class Printer{

    // synchronized void printDocuments(int numOfCopies, String docName){
    void printDocuments(int numOfCopies, String docName){
        for (int i=1; i<=numOfCopies; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(">> Printing "+docName+" "+i);
        }
    }
}

class MyThread extends Thread{

    Printer pRef;

    MyThread(Printer p){
        pRef =p;
    }

    @Override
    public void run(){
        synchronized (pRef){
            pRef.printDocuments(10,"Mehrab'sCV.pdf");
        }
    }
}

class YourThread extends Thread{

    Printer pRef;

    YourThread(Printer p){
        pRef =p;
    }

    @Override
    public void run(){
        synchronized (pRef) {
            pRef.printDocuments(10, "Nishi'sCV.pdf");
        }
    }
}

public class MultiThreading {

    public static void main(String[] args) {
        System.out.println("==Application Started==");

        Printer printer = new Printer();
        // printer.printDocuments(10, "Mehrab'sCV.pdf");
        MyThread mRef = new MyThread(printer);
        YourThread yRef = new YourThread(printer);

        mRef.start();
        /*try {
            mRef.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }*/

        yRef.start();

        System.out.println("==Application Finished==");
    }

}
