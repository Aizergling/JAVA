package chap_08.Camera;

import chap_08.Reporter.Reportable;
import chap_08.Reporter.VideoReporter;
import chap_08.detector.Detectable;

public class SpeedCam extends Camera{
    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void detect() {
        this.detector.detect();
    }

    public void report() {
        this.reporter.report();
    }

    public void setReporter(VideoReporter videoReporter) {
    }
}
