package day12.inheritance;

import day10.aaa.package2.C;

class Parent extends  Object{
    int field1 = 10;

    Parent(){
        super();
    }
    void method1() {
        System.out.println("나는 부모클래스의 method1이야");
    }
}

class Child extends Parent{      //Child클래스는 Parent 클래스에게 상속을 요청
    int field2 = 20;
    Child(){
        super();
    }

    void method2() {
        System.out.println("나는 자식클래스의 method2이야");
    }

    public class InherMain {
        public static void main(String[] args) {

            //Parent parent = new Parent();
            Child child = new Child();
            //System.out.println( parent.field1);
            //parent.method1();

            System.out.println(child.field1  + " " + child.field2);
            child.method1();
            child.method2();

        }


    }
}

