package com.cliffside.singleton;

/**
 * 和Mgr01差不多
 */
public class Mgr02 {

    //直接加载为静态类static
    private static final Mgr02 INSTANCE ;
    static {
        INSTANCE = new Mgr02();
    }
    /**
     * 把构造器设置成私有的
     */
    private Mgr02(){}

    public static Mgr02 getInstance(){
        return INSTANCE;
    }

    public void test(){
        System.out.println("这是我的方法");
    }

    public static void main(String[] args) {
        Mgr02 mgr02 = Mgr02.getInstance();
        Mgr02 mgr022 = Mgr02.getInstance();
        System.out.println(mgr02==mgr022);
        System.out.println(mgr02);
    }
}
