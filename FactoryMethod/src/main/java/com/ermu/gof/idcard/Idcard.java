package com.ermu.gof.idcard;

import com.ermu.gof.framework.Product;

/**
 * @author：xusonglin
 * ===============================
 * Created with IDEA.
 * Date：2019/1/3
 * Time：20:53
 * 具体产品
 * ================================
 */
public class Idcard extends Product {
    private String owner;

    public Idcard(String owner) {
        System.out.println("制作 " +owner +" 的Id卡。");
        this.owner = owner;
    }

    public void use() {
        System.out.println("使用 " +owner +" 的Id卡。");
    }

    public String getOwner() {
        return owner;
    }
}
