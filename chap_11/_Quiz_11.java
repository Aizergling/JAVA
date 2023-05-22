package chap_11;

// 발생 가능 문제의 2가지 조건 : 상품 구매 가능 시간, 상품 매진
// 각 문제에 대한 사용자 저으이 예외 클래스 작성
// 에러 코드에 따른 의도적 예외 발생 및 예외 처리
// 모든 클래스는 하나의 파일에 정의

// 에러 코드
// 0 (에러 없음), 1 (판매 시간 아님), 2 (매진)

// 0 -> 상품 구매를 완료했습니다.
// 1 -> 상품 구매 가능 시간이 아닙니다. / 상품 구매는 20시 부터 가능합니다.
// 2 -> 해당 상품은 매진되었습니다. / 다음 기회에 이용해주세요.

public class _Quiz_11 {
    public static void main(String[] args) {
        int errorCode = 0;
        try {
            if (errorCode == 0) {
                System.out.println("상품 구매를 완료하였습니다.");
            } else if (errorCode == 1) {
                throw  new NotOnSaleException("상품 구매 가능 시간이 아닙니다.");
            } else if (errorCode == 2) {
                throw new SoldOutException("해당 상품은 매진되었습니다.");
            }
        } catch (NotOnSaleException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");
        }
    }
}

class NotOnSaleException extends Exception {
    public NotOnSaleException(String message) {
        super(message);
    }
}

class SoldOutException extends Exception {
    public SoldOutException(String message) {
        super(message);
    }
}