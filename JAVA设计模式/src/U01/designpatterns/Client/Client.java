package U01.designpatterns.Client;

import U01.designpatterns.Chart.Chart;
import U01.designpatterns.ChartFactory.ChartFactory;

public class Client {
    public static void main(String args[]){
        Chart chart;
        String type=XMLUtil.getChartType();
        chart= ChartFactory.getChart(type);
        chart.display();
    }
}
