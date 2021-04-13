package com.liumq.simplejava.oopprehead;

/**
 * 缓存实例的不可变类
 */
class CacheImmutale {
    private static int MAX_SIZE = 10;
    //使用数组来缓存已有的实例
    private static CacheImmutale[] cache = new CacheImmutale[MAX_SIZE];
    //记录缓存实例在数组中的位置， cache[pos-1]是最新的缓存实例
    private static int pos = 0;
    private final String name;

    private CacheImmutale(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static CacheImmutale valueOf(String name) {
        //遍历已缓存的对象
        for (int i = 0; i < MAX_SIZE; i++) {
            //如果已有相同实例，则直接返回当前存在的实例
            if (cache[i] != null && cache[i].getName().equals(name)) {
                return cache[i];
            }
        }
        //遍历当前缓存对象不存在，则需要缓存进去
        //当前缓存池已满
        if (pos == MAX_SIZE) {
            //把缓存池的第一个对象覆盖，将需要缓存的新元素放在缓存池的最开始位置，pos也更新
            cache[0] = new CacheImmutale(name);
            pos = 1;
        } else {
            cache[pos++] = new CacheImmutale(name);
        }
        return cache[pos - 1];
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == CacheImmutale.class) {
            CacheImmutale ci = (CacheImmutale) obj;
            return name.equals(ci.getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

public class CacheImmutaleTest {
    public static void main(String[] args) {
        CacheImmutale c1 = CacheImmutale.valueOf("hello");
        CacheImmutale c2 = CacheImmutale.valueOf("hello");

        System.out.println("第二个对象是第一个对象的缓存吗：" + (c2 == c1));
    }

}
