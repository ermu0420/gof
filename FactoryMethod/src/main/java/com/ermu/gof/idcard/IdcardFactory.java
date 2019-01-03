package com.ermu.gof.idcard;

import com.ermu.gof.framework.Factory;
import com.ermu.gof.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：xusonglin
 * ===============================
 * Created with IDEA.
 * Date：2019/1/3
 * Time：20:53
 * role: 具体的创建者(ConcreteCreator)
 * action: 具体加工的一方，负责生产具体的产品
 * ================================
 */
public class IdcardFactory extends Factory {
   private List<String> owners = new ArrayList();

    protected Product createProduct(String owner) {
        return new Idcard(owner);
    }

    protected void registerProduct(Product product) {
        owners.add(((Idcard)product).getOwner());

    }

    public List<String> getOwners() {
        return owners;
    }
}
