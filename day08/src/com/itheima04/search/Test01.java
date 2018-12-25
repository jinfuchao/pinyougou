package com.itheima04.search;
/*
    搜索 day08\\aaa 目录中
        所有以.java结尾的文件
        (包含子目录中文件)
 */

import java.io.File;

public class Test01 {

    public static void main(String[] args) {
        //封装源目录
        File srcdir = new File("day08\\aaa");

        searchJavaFile(srcdir);
    }

    /*
        搜索 该目录下 所有的 .java结尾 文件(包含子文件夹)
            分析
                1.获取当前目录下 所有的 文件 和 文件夹
                2.判断
                    如果是文件
                        如果是.java结尾 输出打印 绝对路径
                    如果是目录
                        继续往下寻找

     */
    private static void searchJavaFile(File srcdir) {
        // 获取当前目录下 所有的 文件和文件夹
        File[] files = srcdir.listFiles();

        //遍历
        for (File file : files) {
            if(file.isFile()){//是文件
                //是不是以.java结尾
                /*
                    调用字符串.endsWith(参数字符串)://调用的字符串是否是以传入的字符串结尾
                    startsWith();是否以某个字符串开头
                 */
                if(file.getName().endsWith(".java")){
                    System.out.println("该java文件是:" + file.getAbsolutePath());

                }
            }

            if(file.isDirectory()){//是文件夹 目录
                //继续 搜索 于是就再调用该方法 递归
                searchJavaFile(file);
            }
        }
    }
}
