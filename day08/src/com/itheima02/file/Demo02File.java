package com.itheima02.file;

import java.io.File;
import java.io.IOException;

/*
    java中
    File类中 创建 与删除功能

    public boolean createNewFile() 创建一个新的对象
        注意: 如果该路径不存在 则可以创建成功 (可以访问的情况下)
        如果 该文件已经有了呢? 创建失败

    public boolean mkdir() 创建一个新的文件夹 单级的
    public boolean mkdirs() 创建多级文件夹

    public boolean delete() 删除文件或者文件夹
        删除的时候 不会走 回收站 慎用
 */
public class Demo02File {

    public static void main(String[] args) throws IOException {
        //封装一个 路径 称为 file对象
        File file = new File("day08\\a.txt");

        System.out.println("file对象 是否是真实的路径呢?" + file.exists());

        //创建新的文件
        boolean flag = file.createNewFile();
        System.out.println("文件是否创建成功:" + flag);

        //封装了一个路径 File对象
        File dir = new File("day08\\aaa");
        System.out.println("创建一个新的文件夹是否成功:" + dir.mkdir());

        System.out.println("创建多级的文件夹 怎么做 ");
        File dirs = new File("day08\\bb\\cc\\dd");
        System.out.println("创建多级文件夹:" + dirs.mkdirs());

        //删除操作
        System.out.println("删除 day08\\a.txt" + file.delete());
        System.out.println("删除 day08\\aaa" + dir.delete());

        File dirs2 = new File("day08\\bb");
        System.out.println("删除 day08\\bb:"+dirs2.delete());
    }
}
