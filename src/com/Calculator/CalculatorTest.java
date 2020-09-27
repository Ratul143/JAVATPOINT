package com.Calculator;

public class CalculatorTest {

    public Integer add (Integer arg1, Integer arg2) {
        arg1=1000;
        Integer result = arg1+arg2;
        return  result;
    }

    public Integer add (Integer arg1, Integer arg2, Integer arg3) {
        Integer result = arg1+arg2+arg3;
        return result;
    }

    public static void main(String[] args) {
        CalculatorTest calc = new CalculatorTest();
        int arg1 = 56;
        int arg2 = 36;
        int arg3 = 76;
        System.out.println("Printing arg1 before passing it by value "+arg1);
        Integer result = calc.add(arg1,arg2);
        System.out.println("Printing arg1 after passing it by value to add method  "+arg1);
        System.out.println(" Result of addition is " +result);

        Integer resultFromNewMethod = calc.add(arg1,arg2,arg3);
        System.out.println("Result from new Add method "+resultFromNewMethod);
    }
}
