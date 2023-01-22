package com.alamin.file_name_change;

import java.io.File;

public class Root {
    private static String dirName = "E:\\DataSet\\folk cutted\\DataSet\\folk";
    File folder = new File("E:/DataSet/folk cutted/folk cutted/");
    File[] listOfFiles = folder.listFiles();
    public void convert(){
        int c = 0;
        for (int i=0; i<listOfFiles.length;i++) {
            if (listOfFiles[i].isFile()) {
                int j = listOfFiles[i].getName().lastIndexOf('.');
//                String name = listOfFiles[i].getName().substring(0,j);
                String name = "folk-00-"+c;
                File file = new File(dirName, name + ".wav");
                listOfFiles[i].renameTo(file);
                c++;
            }
        }
        System.out.println("===>"+c);
    }
    public static void main(String[] args) {
        new Root().convert();
    }
}
