package com.ermu.gof.singleton;

/**
 * @author：xusonglin
 *  ===============================
 * Created with IDEA.
 * Date：2019/1/13
 * Time：21:27
 * 双重判断
 * ================================
 */
public class DoubleSynchronizedLazySingleton {
    /**
     * volatile 禁止指令重排序
     *  因为下面代码有重复地方
     */
    private static volatile DoubleSynchronizedLazySingleton singleton = null;

    public DoubleSynchronizedLazySingleton() {
    }

    private static DoubleSynchronizedLazySingleton getSingleton(){
        if(null == singleton){
            synchronized (DoubleSynchronizedLazySingleton.class){
                if (null == singleton){
                    return new DoubleSynchronizedLazySingleton();
                }
                return singleton;
            }
        }
        return singleton;
    }
}
