package com.structural.bridge.movie;

import java.util.List;

public class PrintFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(header).append('\n');

        for(Detail detail: details){
            stringBuilder.append(detail.getLabel()).append(":").append(detail.getValue()).append("\n");
        }

        return stringBuilder.toString();
    }
}
