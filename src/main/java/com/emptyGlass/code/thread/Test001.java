package com.emptyGlass.code.thread;

/**
 * @author Administrator
 * @date 2019-12-11 19:48
 */
public class Test001 {
    /**
     *  1.什么是线程 线程是一条执行路径，每个线程都互不影响。
     * 2.什么是多线程，多线程在一个进程中，有多条不同的执行路径，并行执行。目的为了提高程序效率。
     * 3.在一个进程中，一定会主线程。
     * 4.如果连线程主线程都没有，怎么执行程序。
     * 线程几种分类 用户线程、守护线程
     * 主线程 子线程 GC线程
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("main....主线程开始");
        ThreadDemo01 threadDemo01 = new ThreadDemo01();
        threadDemo01.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main .. i:"+i);
        }
        System.out.println("main ....主线程结束.....");
    }
}

class ThreadDemo01 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子id："+this.getId());
            System.out.println(getName());
            System.out.println("..i:"+i);
            System.out.println();
        }
    }
}
