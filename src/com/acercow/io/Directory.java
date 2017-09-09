package com.acercow.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Directory {

    public static File[] local(File dir, String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }

    public static File[] local(String dir, String regex) {
       return local(new File(dir), regex);
    }



    public static void main(String[] args) {
        File file = new File(".");
        File thfile = new File("thinkjava.iml");
        String[] fileList = file.list();
        System.out.println(Arrays.toString(fileList));

//        System.out.println(Arrays.toString(local(".", "out")));


        try {
            System.out.println(thfile.getAbsoluteFile());
            System.out.println(thfile.getName());
            System.out.println(thfile.exists());
            System.out.println(thfile.lastModified());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
