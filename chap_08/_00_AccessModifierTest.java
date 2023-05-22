package chap_08;

import chap_07.BlackBox;
import chap_07.BlackBoxRefurbish;

// import chap_07.* -> 7패키지의 모든 클래스를 사용함.

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public
        // b1.resolutin = "FHD"; // default
        // b1.price = 200000; // private
        // b1.color = "블랙"; // protected
    }
}
