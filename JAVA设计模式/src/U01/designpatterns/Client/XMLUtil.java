package U01.designpatterns.Client;

import org.w3c.dom.*;

import javax.xml.parsers.*;
import java.io.*;



public class XMLUtil {
    public static String getChartType(){

        try {
            DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc;
            doc= (Document) builder.parse(new File("src//U01.simplefactory//pom.xml"));

            //获取包含图表类型的文本结点
            NodeList nl= doc.getElementsByTagName("chartType");
            Node classNode=nl.item(0).getFirstChild();
            String chartType=classNode.getNodeValue().trim();
            return chartType;


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
