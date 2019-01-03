package com.ermu.gof.singleton;

/**
 * @author：xusonglin
 * ===============================
 * Created with IDEA.
 * Date：2019/1/3
 * Time：21:22
 * 懒式模式
 * 在需要的时候才进行创建
 * 有线程安全的问题
 * ================================
 */
public class LazySingleton {
    private static LazySingleton ourInstance = null;

    public static LazySingleton getInstance() {
        if(ourInstance == null){
            ourInstance = new LazySingleton();
        }
        return ourInstance;
    }

    private LazySingleton() {
    }
}
