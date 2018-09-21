package com.imooc.entity.enums;

/*
 * 从上述代码可知，在enum类中确实可以像定义常规类一样声明变量或者成员方法。但是我们必须注意到，如果打算在enum类中定义方法，务必在声明完枚举实例后使用分号分开，倘若在枚举实例前定义任何方法，编译器都将会报错，无法编译通过，同时即使自定义了构造函数且enum的定义结束，我们也永远无法手动调用构造函数创建枚举实例，毕竟这事只能由编译器执行。
 */
public enum OrderStatus {
    INIT("初始化"),
    PROCESS("处理中"),
    SUCCESS("成功"),
    FAIL("失败"); // 记住要用分号结束

    private String desc;  // 中文描述

    /**
     * 私有构造,防止被外部调用
     * @param desc
     */
    OrderStatus(String desc) {
        this.desc = desc;
    }
    /**
     * 定义方法,返回描述,跟常规类的定义没区别
     * @return
     */
    public String getDesc() {
        return desc;
    }

    public static void main(String[] args) {
        // 列出所有枚举类的实例
        for (OrderStatus day:OrderStatus.values()) {
            System.out.println("name:"+day.name()+
                    ",desc:"+day.getDesc());
        }
    }
}


