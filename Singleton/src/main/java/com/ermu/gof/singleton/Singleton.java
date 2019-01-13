package com.ermu.gof.singleton;

/**
 * @author：xusonglin
 * ===============================
 * Created with IDEA.
 * Date：2019/1/3
 * Time：21:19
 * 一般单例，类加载的时候就创建实例
 * 饿汉式
 * ================================
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){
        System.out.println("创建了实例");
    }

    /**
     *  如果类比较大，比较占内存，初始化的适合就实例了，占用了内存
     *  但是之后又不用，浪费内存。
     * @return
     */
    private static Singleton getInstance(){
        return instance;
    }
}
