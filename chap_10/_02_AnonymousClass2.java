package chap_10;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("---------------------");

        HomeMadBurger broMadeBurger = getBroBadeBurger();
        broMadeBurger.cook();
        System.out.println("---------------------");
    }

    private static HomeMadBurger getBroBadeBurger() {
        return new HomeMadBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료 : 빵, 치킨패티, 양배추, 샐러드, 딸기잼, 치즈, 삶은 계란");
            }
        };
    }

    public static HomeMadBurger getMomMadeBurger() {
        return new HomeMadBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제 버거");
                System.out.println("재료 : 빵, 소고기패티, 해시브라운, 양상추, 마요네즈, 피클");
            }
        };
    }
}

abstract class HomeMadBurger {
    public abstract void cook();
}