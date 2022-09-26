package Vector;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {
    public static void main(String[] args) {
        //영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성
        HashMap<String, String> dic = new HashMap<String, String>();

        //3개의 (key, value) 쌍을 dic에 저장
        dic.put("baby", "애기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");
        
        //영어 단어를 입력 받고 한글 단어를 검색. "exit"를 입력 받으면 종료
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("찾고 싶은 단어는? ");
            String eng = scan.next();
            if(eng.equals("exit")) {
                System.out.println("종료합니다...");
                break;
            }
            //해시맵에서 '키' eng의 값 kor 검색
            String kor = dic.get(eng);
            if(kor == null) {
                System.out.println(eng+"는 없는 단어입니다.");
            } else {
                System.out.println(kor);
            }
            scan.close();
        }
    }
}