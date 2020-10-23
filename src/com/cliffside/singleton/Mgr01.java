package com.cliffside.singleton;

/**
 * 饿汉式（不由分说，直接先给我）
 * 类加载到内存后，就实例化一个单例（单个实例），JVM保证线程安全
 * 简单实用，推荐！
 * 缺点：不管用到与否，类装载时就完成实例化
 * （你不用的，装载它就浪费资源）
 */
public class Mgr01 {
    //直接加载为静态类static,final对应是必须初始化的
    private static final Mgr01 INSTANCE = new Mgr01();
    /**
     * 把构造器设置成私有的
     */
    private Mgr01(){}

    public static Mgr01 getInstance(){
        return INSTANCE;
    }

    public void test(){
        System.out.println("这是我的方法");
    }

    public static void main(String[] args) {
        Mgr01 mgr01 = Mgr01.getInstance();
        Mgr01 mgr011 = Mgr01.getInstance();
        System.out.println(mgr01==mgr011);
        System.out.println(mgr01);
    }
}
