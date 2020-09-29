package com.Collections;

import java.util.*;
class Queue {
    public static void main(String args[]){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        // creating priority queue
        queue.add("Hamid");
        // adding elements
        queue.add("Hakeem");
        queue.add("Bashir");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
