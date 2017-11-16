package com.acercow.async;

public class JoinTest implements Runnable{

    public static int a = 0;

    public void run() {
        for (int k = 0; k < 5; k++) {
            a = a + 1;
        }
    }

    public static void main(String[] args) throws Exception {
        Runnable r = new JoinTest();
        Thread t = new Thread(r);
        t.start();
        //t.join(); //加入join()
            /*
             注意循环体内一定要有实际执行语句，否则编译器或JVM可能优化掉你的这段代码，视这段代
             码为无效。
            */
        Thread.sleep(2000);
        System.out.println(a);

    }
}  