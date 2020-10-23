package com.cliffside.singleton;
/**
 * @author windo
 * 枚举单例
 * effective java的作者推荐
 * 不仅可以解决线程同步，
 * 还可以防止反序列化，因为它没有构造器，就算拿到它的class文件，也没有办法构造它的对象
 */

public enum Mgr08 {
    INSTANCE;
    public void test(){

    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }
}
