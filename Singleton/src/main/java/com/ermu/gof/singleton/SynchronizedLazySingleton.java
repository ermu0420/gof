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

    /**
     * 如果实例不为空  方法锁住，多个线程调用方法 造成阻塞 影响性能
     * @return
     */
    private synchronized SynchronizedLazySingleton getInstance(){
        if (instance == null){
            instance = new SynchronizedLazySingleton();
        }
        return instance;
    }
}
