package com.cliffside.singleton;

/**
 * lazy loading
 * 懒汉式
 * 什么时候用到，再初始化它，但是会带来线程不安全的问题
 * @author windo
 */
public class Mgr03 {
//这里不可以加final，如果加了final就必须在类加载时，就进行初始化

    private static Mgr03 INSTANCE;

    private Mgr03(){ }

    public static Mgr03 getInstance(){
        if (INSTANCE == null){
            try{
                Thread.sleep(1);
            }catch (Exception e){
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public void test(){
        System.out.println("Mgr03");
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(Mgr03.getInstance());
            }).start();
        }
    }
}
