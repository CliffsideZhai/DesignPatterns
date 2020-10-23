package com.cliffside.singleton;

/**
 * @author windo
 * 双重检查实现线程安全
 */
public class Mgr06 {
    private static Mgr06 INSTANCE;

    private Mgr06(){ }

    public static Mgr06 getInstance(){
        if (INSTANCE == null){
            synchronized (Mgr06.class){
                if (INSTANCE ==null){
                    try{
                        Thread.sleep(1);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

    public void test(){
        System.out.println("Mgr06");
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(Mgr06.getInstance());
            }).start();
        }
    }
}
