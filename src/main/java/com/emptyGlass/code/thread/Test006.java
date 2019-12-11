package com.emptyGlass.code.thread;

/**
 * @author Administrator
 * @date 2019-12-11 22:58
 */
public class Test006 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程，i:" + i);
                }
            }
        });
        t1.start();
        // 当前线程释放资格权，等t1执行完毕之后，才会继续进行执行。
        //如果加join则t1线程执行完之后主线程才会执行。
        t1.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程，i:"+i);
        }
    }
}
