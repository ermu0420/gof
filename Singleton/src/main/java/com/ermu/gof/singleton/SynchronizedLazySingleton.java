package com.ermu.gof.singleton;

/**
 * @author：xusonglin
 * ===============================
 * Created with IDEA.
 * Date：2019/1/3
 * Time：21:25
 * 在懒式上加锁进行线程安全
 * ================================
 */
public class SynchronizedLazySingleton {
    private static SynchronizedLazySingleton instance = null;

    private SynchronizedLazySingleton() {
    }

    private synchronized SynchronizedLazySingleton getInstance(){
        if (instance == null){
            instance = new SynchronizedLazySingleton();
        }
        return instance;
    }
}
