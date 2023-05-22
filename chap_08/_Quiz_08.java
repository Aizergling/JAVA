package chap_08;

import chap_08.Camera.SpeedCam;
import chap_08.Reporter.VideoReporter;
import chap_08.detector.AccidentDetector;

public class _Quiz_08 {
    public static void main(String[] args) {
        // 과속단속 카메라인 SpeedCam 클래스의 detect(), report() 개선
        // 교통 사고를 감지하는 AccidentDetector 클래스 신규 생성
        // 신고 기능은 기존에 작성된 VideoReporter 클래스 활용
        // 모든 클래스는 적절한 위치에 정의
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(new AccidentDetector());
        speedCam.setReporter(new VideoReporter());
        speedCam.detect();
        speedCam.report();
    }
}
