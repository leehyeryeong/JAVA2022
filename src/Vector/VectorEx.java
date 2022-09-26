package Vector;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        //정수 값만 다루는 제네릭 벡터 생성
        Vector<Integer> v = new Vector<>();

        v.add(5);  //5 삽입 int 값임에도 자동 박싱 처리
        v.add(4);  //4 삽입
        v.add(-1); //-1 삽입
        //5 4 -1
        //4와 -1 사이에 삽입할 경우
        v.add(2, 100);

        System.out.println("벡터 내의 요소 객체수: "+v.size());
        System.out.println("벡터 내의 현재 용량: "+v.capacity());
        
        //모든 요소 출력
        for (int i = 0; i < v.size(); i++) {
            int n = v.get(i); //int에다가 Integer 값을 자동 언박싱 처리
            System.out.println(n);
        }

        //벡터 속의 모든 정수 거하기
        int sum = 0;
        for (int i = 0; i < v.size(); i++) {
            int n = v.elementAt(i); //get()과 차이가 없음
            sum += n;
        }
        System.out.println("벡터에 있는 정수 합: "+sum);
    }
}
