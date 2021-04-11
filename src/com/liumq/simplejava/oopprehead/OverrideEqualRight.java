package com.liumq.simplejava.oopprehead;

class NewPerson {
    private String name;
    private String idStr;

    public NewPerson(String name, String id) {
        this.name = name;
        this.idStr = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == NewPerson.class) {
            NewPerson obj1 = (NewPerson) obj;
            //被比较对象也是同类对象的话使用id类作为是否相等的尺度
            if (this.getIdStr().equals(obj1.getIdStr())) {
                return true;
            }
        }
        return false;
    }
}

public class OverrideEqualRight {
    public static void main(String[] args) {
        NewPerson p1 = new NewPerson("孙悟空", "2423424234234254567");
        NewPerson p2 = new NewPerson("孙行者", "2423424234234254567");
        NewPerson p3 = new NewPerson("孙悟饭", "3334544545454545665");
        System.out.println("p1和p2是否相等：" + (p1.equals(p2)));
        System.out.println("p1和p3是否相等：" + (p1.equals(p3)));
    }
}
