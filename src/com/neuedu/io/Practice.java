package com.neuedu.io;

import java.io.*;

/**
 * Created by 86183 on 2020/2/12.
 */
public class Practice {
    public static void main(String[] args) {
        File file = new File("d:/Text.java");
        File file2 = new File("d:/a");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File to = new File("d:/a" + file.getName());
        InputStream inputStream = null;
        OutputStream outputStream = null;
        byte[] b = new byte[1024];
        try {
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(to);
            int len = inputStream.read(b);
            while (len != -1) {
                outputStream.write(b, 0, len);
                outputStream.flush();
                len = inputStream.read(b);
            }
            System.out.println("复制完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null)
                    outputStream.close();
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
