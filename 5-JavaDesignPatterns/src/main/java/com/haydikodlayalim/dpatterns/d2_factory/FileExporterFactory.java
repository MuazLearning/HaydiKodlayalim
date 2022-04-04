package com.haydikodlayalim.dpatterns.d2_factory;

public class FileExporterFactory {

    public static FileExporter getInstace(FileType fileType) {
        switch (fileType) {
            case Excel:
                return new ExcelExporter();
            case PDF:
                return new PdfExporter();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public enum FileType {
        Excel,
        PDF
    }
}
