package U01.designpatterns.ChartFactory;

import U01.designpatterns.Chart.Chart;
import U01.designpatterns.HistogramChart.HistogramChart;
import U01.designpatterns.LineChart.LineChart;
import U01.designpatterns.PieChart.PieChart;

public class ChartFactory {
    public static Chart getChart(String type){
        Chart chart=null;
        if(type.equalsIgnoreCase("histogram")){
            chart=new HistogramChart();
            System.out.println("初始化设置柱状图");
        }
        else if(type.equalsIgnoreCase("pie")){
            chart=new PieChart();
            System.out.println("初始化设置饼状图");
        }
        else if(type.equalsIgnoreCase("line")){
            chart=new LineChart();
            System.out.println("初始化设置折线图");
        }

        return chart;
    }
}
