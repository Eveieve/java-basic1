package day11.vo;

import java.util.Scanner;

public class BestMovieModeling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("입력할 영화의 총개수를 입력하세요!");
        int movieTotal = input.nextInt();
        System.out.println("각 영화당  상세정보의 개수를 입력하세요");
        int movieInfo = input.nextInt();

        // 레벨업: 5개의 영화를 배열로 관리하고 싶다.   movieArray 를 만들어 5개의 영화정보를 입력 한 후 해당 전체 영화리스트를 출력
        MovieVO[][] movieArray;
        movieArray = new MovieVO[movieTotal][movieInfo];

        //3개의 영화의 상세정보목록의 개수는 3개(title, actor, grade)

        //정보를 입력받고 해당 영화정보의 내용이 자동으로 movieArray에 할당되도록 만들어주세요
        //영화 정보 입력 for문을 작성하고 슬랙으로 제출하세요
        for (int movie = 0; movie < 4; movie++) {
            for (int movieinfo = 0; movieinfo < 4; movieinfo++) {

                // movieArray 첫번째 영화로 movieVO를 할당한 후 
                //아래에 movieVO 첫번째 영화의 타이틀, 배우, 등급의 값을 입력한다. 
                
                System.out.println("영화타이틀을 입력하세요");


            }
        }


        MovieVO avata = new MovieVO("아바타", "12세", "액션");
        System.out.println(avata.toString());
        avata.setOpenDay("2022.12.14");
        avata.setActor("제이크 설리");
        avata.setRunningTime("192");

        System.out.println("++++++++++" + avata.getTitle() + " 영화정보 +++++++++++++++++++");
        System.out.printf("제목  : %s %n", avata.getTitle());
        System.out.printf("배우  : %s %n", avata.getActor());
        System.out.printf("런닝타임  : %s %n", avata.getRunningTime());
        System.out.printf("등급  : %s %n", avata.getGrade());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


    }
}
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class BestVOModeling {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("입력할 영화의 총 개수를 입력하세요.");
//        int movieTotal = sc.nextInt();
//        sc.nextLine();
//
//        ArrayList<MovieVO> movieVOArrayList = new ArrayList<>();
//
//        for (int i = 0; i < movieTotal; i++) {
//            System.out.println(i + "번째 제목, 배우, 등급을 입력하세요.");
//            MovieVO movieVO = new MovieVO();
//            System.out.print("제목: ");
//            movieVO.setTitle(sc.nextLine());
//            System.out.print("배우: ");
//            movieVO.setActor(sc.nextLine());
//            System.out.print("등급: ");
//            movieVO.setGrade(sc.nextInt());
//            sc.nextLine();
//            movieVOArrayList.add(movieVO);
//        }
//        //정보 출력
//        movieVOArrayList.stream().forEach(x -> {
//            System.out.printf("제목 : %s, 배우 : %s, 등급 : %d\n",
//                    x.getTitle(), x.getActor(), x.getGrade());
//        });
//    }
//}