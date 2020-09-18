package 作业;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo2 {
    private static String rootPath = "D:/demo/xx/in.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(rootPath);
        if (!file.exists()){
            file.createNewFile();
        }
        Writer writer = new FileWriter(file,true);/*将默认覆盖写入文件改为追加数据，构造函数加上追加标记*/
        String str = "我又又来啦";
        writer.write(str);
        System.out.println("文件写入成功！");
        writer.close();
    }
}
