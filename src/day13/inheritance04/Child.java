package day13.inheritance04;

import day10.aaa.package1.A;

import java.util.ArrayList;
import java.util.List;

public class Child extends Pareant{
//      super.name;
//      super.age;
      int number;


    public static void main(String[] args) {
        Pareant p = new Pareant();
        Child child = new Child();
        System.out.println(p.name + p.age);
        System.out.println(child.number + child.age + child.name);



        //업캐스팅 --> 자식에서 부모로
         Pareant p1 = (Pareant) child;
        System.out.println(p1.name + p1.age);
        //다운캐스팅 --> 부모에서 자식으로
        Child c2 =(Child) p1;
        System.out.println(c2.number + c2.age + c2.name);

        ArrayList arrayList = new ArrayList();
        List<Integer> list = new ArrayList<Integer>();

    }
}
