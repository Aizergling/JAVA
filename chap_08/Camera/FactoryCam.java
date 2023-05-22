package chap_08.Camera;

import chap_08.Reporter.Reportable;
import chap_08.detector.Detectable;

public class FactoryCam extends Camera implements Detectable, Reportable {
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
        System.out.println("화재 감지");
    }

    @Override
    public void report() {
        this.reporter.report();
    }

    @Override
    public void detect() {
        this.detector.detect();
    }
}
