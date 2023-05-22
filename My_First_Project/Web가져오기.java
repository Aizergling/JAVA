package My_First_Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Web가져오기 {
    public static void main(String[] args) {
        String url = "https://www.naver.com";  // 가져올 웹 사이트 URL

        try {
            // URL 객체 생성
            URL websiteURL = new URL(url);

            // HttpURLConnection 객체 생성 및 설정
            HttpURLConnection connection = (HttpURLConnection) websiteURL.openConnection();
            connection.setRequestMethod("GET");

            // 응답 코드 확인
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // 응답 데이터 읽기
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder content = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    content.append(line);
                }
                reader.close();

                // 응답 데이터 출력
                System.out.println(content.toString());
            } else {
                System.out.println("HTTP 요청 실패: " + responseCode);
            }

            // 연결 종료
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
