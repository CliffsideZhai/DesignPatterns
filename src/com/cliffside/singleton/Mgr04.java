package com.cliffside.singleton;


/**
 * @author windo
 * 线程安全的懒汉式，但是会导致效率降低
 * 这里给Mgr04.class加锁
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04(){ }

    public static synchronized Mgr04 getInstance(){
        if (INSTANCE == null){
            try{
                Thread.sleep(1);
            }catch (Exception e){
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public void test(){
        System.out.println("Mgr04");
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(Mgr04.getInstance());
            }).start();
        }
    }
}
