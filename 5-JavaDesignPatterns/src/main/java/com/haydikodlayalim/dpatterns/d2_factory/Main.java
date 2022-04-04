package com.haydikodlayalim.dpatterns.d2_factory;

public class Main {

    public static void main(String[] args) {

        String file1 = FileExporterFactory.getInstace(FileExporterFactory.FileType.PDF).export("Test");
        String file2 = FileExporterFactory.getInstace(FileExporterFactory.FileType.Excel).export("Test");
        System.out.println(file1);
        System.out.println(file2);

    }

}
