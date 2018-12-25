package com.itheima04.search;

import java.io.File;
import java.io.FileFilter;

/*

java.io.FileFilter 是一个接口 是File的过滤器
该接口对象 可以传递给File类的listFiles(FileFilter) 作为参数

  boolean accept(File pathname) 测试pathname是否应该包含在当前的File目录中 符合就返回true

  文件过滤器
    File[] listFiles()
      将 该目录下 所有的文件及文件夹 返回 存储到File数组中

    File[] listFiles(FileFilter filter)
      将 该目录下 所有的文件及文件夹 尽心过滤之后  返回 过滤之后的 存储到File数组中

      按照某种规则 进行文件的筛选  将符合要求的 返回到数组中

      那么过滤的规则 写那呢
        boolean accept(File pathname)
          这个规则 就是 来过滤file对象 是否 会进入到返回数组的
            是不是符合这个规则  true 符合 就添加
            false 不符合 就不要
 */
public class Demo01FileFilter {

    public static void main(String[] args) {
        //想要 day08\\aaa下面的所有 .java文件(单级目录 不包含子目录)
        // 源目录 day08\\aaa    获取下面的所有文件及文件夹

        // 封装源目录
        File dir = new File("day08\\aaa");

//        // 返回的 File数组中 包含 文件及文件夹
//        File[] files = dir.listFiles();
//
//        for (File file : files) {
//            // file 是文件 还是文件夹呢？ 再判断
//            if(file.isFile()){
//                if(file.getName().endsWith(".java")){
//
//                System.out.println(file.getAbsolutePath());
//                }
//            }
//        }

        // 使用带有过滤规则的方法 listFiles(FileFilter filter)
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                if(file.isFile()) {
                    if (file.getName().endsWith(".java")) {
                       return true;
                    }
                }
                return false;
            }
        });

        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
