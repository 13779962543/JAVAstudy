package U01.designpatterns.HistogramChart;

import U01.designpatterns.Chart.Chart;

public class HistogramChart implements Chart {
    public HistogramChart(){
        System.out.println("创建柱状图");
    }
    public void display(){
        System.out.println("显示柱状图");
    }
}
