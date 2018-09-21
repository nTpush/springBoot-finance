package com.imooc.entity.enums;

import com.imooc.entity.Product;

public enum OrderType {
    APPLY("申购"),
    REDEEM("赎回");

    private String desc;

    OrderType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }



}
