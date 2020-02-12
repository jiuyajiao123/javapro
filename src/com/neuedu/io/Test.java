package com.neuedu.io;


import java.io.*;

/**
 * Created by Neuedu on 2020/2/12.
 */
public class Test {
    public static void main(String[] args) {
       /* int a = 10;
        Student student = new Student();
        student.setId(10);
        student.setName("张三");
        student.setAge(18);
        student.setGrade("卓越1班");*/

        File file = new File("d:/Test.java");
       /* System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.getPath());
        System.out.println(file.isDirectory());*/
       /* try {
            OutputStream outputStream = new FileOutputStream(file,true);
            String a = "\n11111111111";
            outputStream.write(a.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*InputStream inputStream = null;
        try {
             inputStream = new FileInputStream(file);
            byte[] a = new byte[10];
            int b = inputStream.read(a);
            while(b!= -1){
                System.out.println("读取字节数:"+b);
                System.out.println(new String(a,0,b));
                b = inputStream.read(a);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

       /* Reader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            String str = br.readLine();
            while(str!=null){
                System.out.println(str);
                str = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(br!=null){
                    br.close();
                }
                if(reader!=null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        Writer writer = null;
        try {
            writer = new FileWriter(file, true);
            writer.write("11111111");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
