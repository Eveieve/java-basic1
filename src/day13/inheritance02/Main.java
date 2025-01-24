package day13.inheritance02;

public class Main {

    public static void main(String[] args) {
        //Phone 타입 유선전화를 생성하여
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("LG","PLK1023", "회색");
        //1. 전화를 건다.
        phone2.bell();
        //2. 전화를 받는다.
        phone2.hangOn();
        //3. 메세지를 전송한다.
        phone2.sendVoice("안녕하세요 .....");
        //4. 메세지를 수신한다.
        //phone2.receiveVoice();
        //5. 전화를 끊는다.


        //SmartPhone 을 생성하여
        SmartPhone smartPhone1 = new SmartPhone();
        SmartPhone smartPhone2 = new SmartPhone("사과","사과15Pro","흰색");

        //0. wifi를 연결하고 인터넷을 켠다.
        //1. 전화를 건다.
        //2. 전화를 받는다.
        //3. 메세지를 전송한다.
        //4. 메세지를 수신한다.
        //5. 전화를 끊는다.

        //bander : 사과  model : 사과15 Pro  color : 화이트 SmartPhone 을 생성하여
        //0. wifi를 연결하고 인터넷을 켠다.
        //1. 전화를 건다.
        //2. 전화를 받는다.
        //3. 메세지를 전송한다.
        //4. 메세지를 수신한다.
        //5. 전화를 끊는다.

        //작성이 되면 슬랙 DM 전송해 주세요
        SmartPhone2 phone3 = new SmartPhone2();






    }
}
