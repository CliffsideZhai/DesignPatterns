package com.cliffside.singleton;

/**
 * @author windo
 * 妄图通过减小同步代码块来提高效率，但是不可行
 * 也是线程不安全的
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;

    private Mgr05(){ }

    public static Mgr05 getInstance(){
        if (INSTANCE == null){
            synchronized (Mgr05.class){
                try{
                    Thread.sleep(1);
                }catch (Exception e){
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }

    public void test(){
        System.out.println("Mgr05");
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(Mgr05.getInstance());
            }).start();
        }
    }
}
