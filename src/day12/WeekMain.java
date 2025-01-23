package day12;

import java.util.Calendar;

public class WeekMain {
    public static void main(String[] args) {
        Week today = null;

        //자바 Calendar 클래스  : 컴퓨터에서 제공하는 날짜, 요일, 시간을 얻어올때 사용한다.
        Calendar now = Calendar.getInstance(); //Calendar 객체 얻기
        int year = now.get(Calendar.YEAR);  //연
        int month = now.get(Calendar.MONTH) + 1;                                  //월
        //일
        int day = now.get(Calendar.DAY_OF_MONTH);
        //요일
        int week = now.get(Calendar.DAY_OF_WEEK);  //시스템으로 부터  일요일(1)~ 토요일(7)까지의 숫자를 얻어온다.
        //시간
        int hour = now.get(Calendar.HOUR);
        //분
        int minute = now.get(Calendar.MINUTE);
        //초
        int second = now.get(Calendar.SECOND);

        //요일은 1~7 사이의 숫자입니다. 코드 가독성을 위해 열거 상수로 변환해서 Week변수에 대입해서 오늘이 무슨요일인지 알고싶다.
        System.out.println(today);
        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }
        
        if(today == Week.THURSDAY){
            System.out.println(today);
            System.out.println("조별 스터디가 있는 날");
        }else{
            System.out.println("매일 매일 자바 혼공");
        }
    }
}
