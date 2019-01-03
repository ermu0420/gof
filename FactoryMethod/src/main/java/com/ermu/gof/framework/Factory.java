package com.ermu.gof.framework;

/**
 * @author：xusonglin
 * ===============================
 * Created with IDEA.
 * Date：2019/1/3
 * Time：20:51
 * role：创建者 (Creator)
 * action：决定实例的创建方式
 * ================================
 */
public abstract class Factory {
    public final Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
