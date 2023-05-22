package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        int score = 93;
        System.out.println(score);
        System.out.println((float) score);

        float score_f = 93.3F;
        double score_d = 93.8;
        System.out.println((int) score_f);
        System.out.println((double) score_d);

        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);
    }
}
