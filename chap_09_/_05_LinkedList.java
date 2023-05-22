package chap_09_;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("------------------");

        // 추가
        list.addFirst("서장훈"); // 리스트에 제일 앞으로
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------");

        list.addLast("김희철"); // 리스트 제일 끝으로
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------");

        list.add(1, "김영철"); // 인덱스 값에 추가
        for (String s : list) {
            System.out.println(s);
        }

        // 삭제
        System.out.println("남은 하생 수 :" + list.size());
        list.remove("김영철");
        System.out.println("남은 하생 수(수정 후) :" + list.size());

        System.out.println("--------------------");

        //처음 학생과 마지막 학생이 전학
        System.out.println("남은 하생 수 :" + list.size());
        list.removeFirst(); // 처음 데이터
        list.removeLast(); // 마지막 데이터
        System.out.println("남은 하생 수(수정 후) :" + list.size());

        // 변경
        list.set(0, "이수근");
        System.out.println(list.get(0));

        //확인
        System.out.println(list.indexOf("김종국"));
        if (list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("-------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("---------------");

        // 새로운 학기
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        Collections.sort(list);
        for (String s : list)
            System.out.println(s);
    }
}
