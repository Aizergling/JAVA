package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // 주민등록번호는 13자리의 숫자로 구성
        // 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별정보
        // 입력 데이터는 - 를 포함한 14자리의 문자열 형태

        String x ="901231-1234567";
        String y ="030708-4567890";

        System.out.println(x.substring(0 , x.indexOf("-")+2));
    }
}
