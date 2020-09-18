package 作业;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo1 {
    private static String rootPath = "D:/demo/xx/in.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(rootPath);
        if (!file.exists()){
            file.createNewFile();
        }
        Writer writer = new FileWriter(file);
        String str = "我来啦";
        writer.write(str);
        System.out.println("文件写入成功！");
        writer.close();
    }
}
