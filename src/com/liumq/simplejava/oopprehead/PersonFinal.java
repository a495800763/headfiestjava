package com.liumq.simplejava.oopprehead;

class Name {
    private String firstName;
    private String lastName;

    public Name() {
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

public class PersonFinal {
    //引用对象是final，但是name对象里面的值还是可以改变
    private final Name name;

    public PersonFinal(Name name) {
        //初始化是时this的成员变量 与参数name不是同一个
        this.name = new Name(name.getFirstName(), name.getLastName());
    }

    public Name getName() {
        //get时也不要返回对象中name真实的指针
        return new Name(name.getFirstName(), name.getLastName());
    }

    public static void main(String[] args) {
        Name name = new Name("悟空", "孙");
        PersonFinal p = new PersonFinal(name);
        System.out.println(p.getName().getFirstName());

        name.setFirstName("八戒");
        System.out.println(p.getName().getFirstName());

    }
}
