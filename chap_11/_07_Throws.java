package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        try {
            writeFile();
        } catch (IOException e) {
            System.out.println("메인 메소드에서 해결되었습니다.");
        }
    }

    public static void writeFile() throws IOException {
//        try {
//            FileWriter writer = new FileWriter("test.txt");
//            throw new IOException("파일쓰기에 실패했습니다.");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFile 메소드 내에서 해결되었습니다.");
//        }

        FileWriter writer = new FileWriter("test.txt");
        throw new IOException("파일쓰기에 실패했습니다.");
    }
}

