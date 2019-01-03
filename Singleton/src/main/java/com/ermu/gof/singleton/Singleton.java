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
    private static Singleton getInstance(){
        return instance;
    }
}
