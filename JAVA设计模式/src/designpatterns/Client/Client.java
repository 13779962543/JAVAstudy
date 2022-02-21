package designpatterns.Client;

import designpatterns.Chart.Chart;
import designpatterns.ChartFactory.ChartFactory;

public class Client {
    public static void main(String args[]){
        Chart chart;
        String type=XMLUtil.getChartType();
        chart= ChartFactory.getChart(type);
        chart.display();
    }
}
