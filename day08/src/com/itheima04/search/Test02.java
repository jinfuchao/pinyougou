package com.itheima04.search;

import java.io.File;

public class Test02 {
    /*
        遍历打印day08\\aaa文件夹下所有的文件

        \转义: 在java程序中使用路径要使用\\.

        对null进行判断. 当我们获取File对象数组的时候,对这个对象数组进行一个非null的判断.
     */
    public static void main(String[] args) {
//        System.out.println("a\ta");// \t代码一个tab键
//        System.out.println("b\r\nb");

        File file = new File("day08\\aaa");
        //获取所有的子文件,子目录
        printDir(file);
    }

    public static void printDir(File file){
        File[] files = file.listFiles();
        if(files == null){
            return;
        }

        for (File file1 : files) {
            if(file1.isFile()){
                System.out.println(file1);
            } else {
                printDir(file1);
            }
        }
    }

}
