package chap_09_;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");

        System.out.println("총 구매 상품 : " + set.size());

        // 순회
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("--------------");

        // 확인
        if (set.contains("삼겹살")) {
            System.out.println("삽겹살 사러 출발");
        }
        
        System.out.println("------------------------");
        
        // 삭제
        System.out.println("총 구매 상품 수(삽겹살 구매 전) : " + set.size());
        set.remove("삽겹살");
        System.out.println("총 구매 상품 수(삽겹살 구매 후) : " + set.size());
        System.out.println("----------------");

        // 전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("남은 구매 상품 수 : " + set.size());
            System.out.println("집으로 출발");
        }
        System.out.println("-------------------------");

        // 세트 : 중복 허용 X, 순서 보장 X
        // Linked를 붙이면 순서도 지켜짐
        HashSet<Integer> intSet = new LinkedHashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);

        for (int i : intSet) {
            System.out.println(i);
        }
    }
}
