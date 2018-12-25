package com.itheima04.search;

import java.io.File;
import java.io.FileFilter;

/*
  使用文件过滤器方式完成

 */
public class Demo02FileFilter {
    public static void main(String[] args) {
        // 源目录 day08\\aaa    获取下面的  (包括子目录 )  所有文件及文件夹
        // .java结尾的文件

        // 封装源目录
        File dir = new File("day08\\aaa");


        searchJavaFile(dir);
    }

    private static void searchJavaFile(File dir) {
        // 返回的 File数组中 包含 文件及文件夹
        //使用文件过滤器方式 完成
        // 数组中需要的是什么 就怎么写过滤规则
        // 返回的数组 1 需要 当前目录下的.java结尾文件 2 需要当前目录下的 所有子目录
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
//                if(file.isFile()) {
//                    if (file.getName().endsWith(".java")) {
//                        return true;
//                    }
//                }
//
//                if(file.isDirectory()){
//                    return true;
//                }
//                return false;
                return file.isDirectory() || file.getName().endsWith(".java");
            }
        });
       // 遍历
        for (File file : files) {
            if(file.isFile()){
                //
                System.out.println("以.java结尾的文件是："+file.getAbsolutePath());
            }
            if(file.isDirectory()){
                //继续查找
                searchJavaFile(file);
            }

        }

        }
    }
