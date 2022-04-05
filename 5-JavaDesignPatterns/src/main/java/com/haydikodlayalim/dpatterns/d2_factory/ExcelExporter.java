package com.haydikodlayalim.dpatterns.d2_factory;

class ExcelExporter implements FileExporter {

    @Override
    public String export(String content) {
        return "Excel -> " + content;
    }

}