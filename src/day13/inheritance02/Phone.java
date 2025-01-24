package day13.inheritance02;

public class Phone extends Object{


    //멤버 변수
    private String bander;
    private String model;
    private String color;

    public String getModel() {
        return model;
    }

    public String getBander() {
        return bander;
    }

    public String getColor() {
        return color;
    }

    public Phone(){
        super();
    }
    public Phone(String bander , String model, String color){
        this.bander = bander;
        this.model = model;
        this.color = color;
    }



    //멤버 메소드

    //벨이 울린다.
      public void bell(){
          System.out.println("벨이 울린다.");
      }

    //음성을 전송한다.
      public String sendVoice(String message){
          System.out.println("보내는사람" + message);
          return message;
      }

    //전송된 음성을 상대방이 들을 수 있다.
      public void receiveVoice(String message){
          System.out.println("받는사람" + message);
      }


    //벨이 울리면 전화를 받는다.
       public void hangOn(){
           System.out.println("전화를 받다");
       }


    //전화를 끊는다.
      public void hangUp(){
          System.out.println("전화를 끊는다.");
      }


}
