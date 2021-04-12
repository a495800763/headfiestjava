package com.liumq.simplejava.oopprehead;

/**
 * 不可变类测试
 */
public class Address {
    private final String detail;
    private final String postCode;

    //在构造器中初始化这两个final实例变量
    public Address(String detail, String postCode) {
        this.detail = detail;
        this.postCode = postCode;
    }

    //仅为这两个变量提供get方法
    public String getDetail() {
        return detail;
    }

    public String getPostCode() {
        return postCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj != null && obj.getClass() == Address.class) {
            Address ad = (Address) obj;
            if (this.getDetail().equals(ad.getDetail()) && this.getPostCode().equals(ad.getPostCode())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return detail.hashCode() + postCode.hashCode() * 31;
    }
}
