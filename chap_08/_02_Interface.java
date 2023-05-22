package chap_08;

import chap_08.Camera.FactoryCam;
import chap_08.Reporter.NormalReporter;
import chap_08.Reporter.VideoReporter;
import chap_08.detector.AdvencedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;

import java.awt.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스 (여러 상속 가능)
        // 단일상속 (extends)
        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("----------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvencedFireDetector();
        advancedFireDetector.detect();

        System.out.println("-------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
