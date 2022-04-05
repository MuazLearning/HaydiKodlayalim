package com.haydikodlayalim.dpatterns.d2_factory;

class PdfExporter implements FileExporter{

    @Override
    public String export(String content) {
        return "PDF -> " + content;
    }

}
