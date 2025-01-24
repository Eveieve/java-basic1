package day13.inheritance05;

public class CircleCal1 extends CircleCal{

//    public double areaCircle(double radius) {
//        System.out.println("나는 CircleCal1의 areaCircle 메소드야");
//        super.areaCircle(20);
//        return Math.PI * radius * radius;
//    }

  // 컴파일 단계에서 정확히 부모의 메소드를 오버라이딩이 되었는지 체크하고 문제가 있으면 컴파일 에러를 출련한다.
    @Override      // @ (at) 어노테이션 마크: 개발자의 실수를 줄여주기 위해 정확히 오버라이딩이 되었는지 체크
    public double areaCircle(double radius) {
         double result = super.areaCircle(radius);
        System.out.println("부모 버전 계산 : " + result);   // 자식메소드와 부모메소드의 공동 작업처리 기법
        // 부모 메소드를 재사용함으로써 자식 메소드의 중복 작업을 최소화 할 수 있다.
        return Math.PI * radius * radius;
    }
// 오버라이딩(메소드의 재정의)은 부모 메소드는 숨겨지고, 자식 메소드만 사용되기 때문에 부모메소드의 일부만
// 변경되더라도 중복된 내용을 자식 메소드도 가질 수 있다. 간혹, 부모 메소드도 호출해서 써야할 때가 있다.
// super 키워드를 사용. super (부모클래스의 객체값을 저장한 특수 키워드)
// this 키워드  현재 자신의 객체주소값을 저장한 특수 키워드

    public static void main(String[] args) {
        CircleCal c1 = new CircleCal();
        double result = c1.areaCircle(10);
        System.out.printf("원의 면적: %.1f", result);

        System.out.println("=====================");
        System.out.println();
        CircleCal1 c2 = new CircleCal1();
        result = c2.areaCircle(20);
        System.out.printf("원의 면적: %.1f", result);

        System.out.println("=====================");
        System.out.println();
        CircleCal c3 = new CircleCal1();
        result = c3.areaCircle(30);

        System.out.printf("원의 면적: %.1f", result);

    }
}
