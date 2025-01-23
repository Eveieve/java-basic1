package day12;

public class ArrayCopyByForEx {

    public static void main(String[] args) {
        // 길이가 3인 배열 생성 후 초기화 : oldIntArray
        int[] oldIntArray = {1, 2, 3};


        // 길이가 5인 배열 생성 후 길이가 3인 배열의 항목들을 옮겨야 한다.
        int[] newIntArray = new int[5];
        int[] newIntArray2 = new int[5];

        newIntArray[0] = oldIntArray[0];
        newIntArray[1] = oldIntArray[1];
        newIntArray[2] = oldIntArray[2];

        // 1. for 문을 배열의 복사
        for (int index = 0; index < oldIntArray.length; index++) {
            newIntArray[index] = oldIntArray[index];
        }

        // 2. 자바 API  System클래스에서 제공하는 arraycopy() 를 이용한 방법
        System.arraycopy(oldIntArray,0,newIntArray2,0,oldIntArray.length);

        // 길이가 5인 배열에 옮긴 항목들이 잘 옮겨 졌는지 항목을 확인 (출력)
        for (int index = 0; index < newIntArray.length; index++) {
            System.out.print(newIntArray[index] + "  ");
        }
        System.out.println();
        for(int number:newIntArray2){
            System.out.print(number + "  ");
        }
        // code summary : 배열의 복사 프로그램으로 기본적인 for문을 이용하여 항목을 하나씩 읽고 배열에 저장하는 코드



    }
}
