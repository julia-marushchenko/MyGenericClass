/**
 *  Java program to create own class with generic type.
 */

package com.mygenerics;

import java.util.LinkedList;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Calling method classDemo().
        classDemo();

    }

    // Method to add items to MyQueue and print them.
    static void classDemo() {

        // Creating instance of MyQueue<String>.
        MyQueue<String> stringQueue = new MyQueue<>();

        // Adding elements to stringQueue.
        stringQueue.enqueue("alpha");
        stringQueue.enqueue("beta");
        stringQueue.enqueue("gamma");

        // Printing values of stringQueue.
        System.out.println("stringQueue is: " + stringQueue.list); // Output: stringQueue is: [alpha, beta, gamma]

        // Removing last element.
        stringQueue.dequeue();

        // Printing values of stringQueue.
        System.out.println("After dequeued stringQueue is: " + stringQueue.list); // Output: After dequeued stringQueue
                                                                                  // is: [beta, gamma]

        // Creating instance of MyQueue<String>.
        MyQueue<Integer> intQueue = new MyQueue<>();

        // Adding elements to MyQueue.
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);

        // Printing values of intQueue.
        System.out.println("intQueue is: " + intQueue.list); // Output: intQueue is: [1, 2, 3]

        // Removing last element.
        intQueue.dequeue();

        // Printing values of intQueue.
        System.out.println("After dequeued intQueue is: " + intQueue.list); // Output: After dequeued
                                                                            // intQueue is: [2, 3]

    }
}

/**
 *  MyQueue<T>  class.
 */
class MyQueue<T> {

    // LinkedList to store objects.
    LinkedList<T> list = new LinkedList<>();

    // Method to add element.
    public void enqueue(T obj) {
        list.addLast(obj);
    }

    // Method to remove element.
    public  T dequeue() {
        return list.removeFirst();
    }
}