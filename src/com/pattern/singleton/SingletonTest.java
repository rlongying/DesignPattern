package com.pattern.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonTest {

    public static void main(String[] args) {
//        testSingleInstance();
        int repetition = 1_000;
        for (int i = 0; i < repetition; i++) {
//            testThreadNotSafe();
            testThreadSafe();
        }
    }

    private static void testSingleInstance() {
        Instance instance1 = Instance.getInstance();
        System.out.println("instance1: " + instance1.getStatus());
        Instance instance2 = Instance.getInstance();
        System.out.println("instance2: " + instance2.getStatus());
    }

    private static int threads = 20;
    private static String expectedStatus = "status 0";

    private static void testThreadNotSafe() {
        class SingletonTestThread implements Runnable {
            private int num;

            public SingletonTestThread(int num) {
                this.num = num;
            }

            @Override
            public void run() {
                Instance instance = Instance.getInstance();
                if (!instance.getStatus().equals(expectedStatus)) {
                    System.out.println("instance" + num + ": " + instance.getStatus());
                }
            }
        }

        List<Thread> pool = new ArrayList<>(threads);
        for (int i = 0; i < threads; i++) {
            Thread t = new Thread(new SingletonTestThread(i));
            pool.add(t);
        }

        pool.forEach(Thread::start);
    }

    private static void testThreadSafe() {
        class SingletonTestThread implements Runnable {
            private int num;

            public SingletonTestThread(int num) {
                this.num = num;
            }

            @Override
            public void run() {
                InstanceThreadSafe instance = InstanceThreadSafe.getInstance();
                if (!instance.getStatus().equals(expectedStatus)) {
                    System.out.println("instance" + num + ": " + instance.getStatus());
                }
            }
        }

        List<Thread> pool = new ArrayList<>(threads);
        for (int i = 0; i < threads; i++) {
            Thread t = new Thread(new SingletonTestThread(i));
            pool.add(t);
        }

        pool.forEach(Thread::start);
    }

}
