package com.structural.bridge.movie;

import java.util.List;

public class HtmlFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("<table>").append("<th>Classification</th>").append("<th>").append(header).append("</th>");

        for(Detail detail: details){
            stringBuilder.append("<tr><td>").append(detail.getLabel()).append("</td>").append("<td>").append(detail.getValue()).append("</td></tr>");
        }
        stringBuilder.append("</table>");

        return stringBuilder.toString();
    }
}
