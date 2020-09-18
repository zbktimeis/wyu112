package 作业;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownloadPicFromWeb {
	//test
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://pic1.win4000.com/pic/1/5c/b19b23087f.jpg");
        String downUrl = "D:/demo/xx/beauty.jpg";
        OutputStream fos = null;
        try {
            URLConnection connection = url.openConnection();/*和当前地址获取连接*/
            InputStream is = connection.getInputStream();
            File file = new File(downUrl);
            if (!file.exists()){
                file.createNewFile();
            }
            fos = new FileOutputStream(file);
            byte[] bytes = new byte[1024];
            int len=0;
            int byteAsc;
            int byteRead = 0;
            while ((byteAsc=is.read(bytes))!=-1){
                byteRead += byteAsc;
                fos.write(bytes,0,byteAsc);
            }
            fos.write(bytes,0,len);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fos.close();
        }
    }
}
