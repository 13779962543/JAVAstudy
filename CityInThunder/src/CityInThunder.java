import java.applet.Applet;

import java.awt.Color;

import java.awt.Graphics;

import java.awt.Image;

//在applet中支持线程，需要实现Runnable接口

public class CityInThunder extends Applet implements Runnable

{

    private Thread thread = null; //applet支持的线程

    private boolean no_thunder = true; //没有闪电的标志变量

    private boolean thunder = true; //有闪电的标志变量

    private int[] light;

    private int[] b1;

    private int[] b2;

    private Color whiteSky = new Color(0, 0, 65), yellowSky = new Color(144,

            40, 40);//白色闪电、黄色闪电

    private Image buffer, image;

    private String delay = "3";

    public void init() {

//初始化applet

        String imageName = getParameter("Image1");

        image = getImage(getCodeBase(), imageName);

        light = new int[getSize().height];

        b1 = new int[getSize().height];

        b2 = new int[getSize().height];

        buffer = this.createImage(getSize().width, getSize().height);

    }

    public void paint(Graphics g) {

        int i, thr;

        if (no_thunder) //没有闪电

        {

            g.setColor(Color.black); //设背景色为黑色

            g.fillRect(0, 0, getSize().width, getSize().height); //填充背景色

            g.drawImage(image, 0, 0, this); //输出City.gif

        } else //有闪电

        {

            if (thunder) //白色闪电

                g.setColor(whiteSky); //设背景色为白色

            else

//黄色闪电

                g.setColor(yellowSky); //设背景色为黄色

            g.fillRect(0, 0, getSize().width, getSize().height); //填充背景色

//输出闪电图像

            thr = (int) (0.8F * getSize().height);

            for (i = 1; i < getSize().height; i++) {

                if (i < thr) { //输出闪电周围的灰色矩形

                    g.setColor(Color.darkGray);

                    g.drawRect(light[i] - 4, i, 3, 1);

                    g.drawRect(light[i] + 2, i, 3, 1);

                    g.setColor(Color.gray);

                    g.drawRect(light[i] - 1, i, 1, 1);

                    g.drawRect(light[i] + 1, i, 1, 1);

                }

                if (thunder) { //白色闪电

                    g.setColor(Color.white);

                } else

//黄色闪电

                    g.setColor(Color.yellow);

                g.drawLine(light[i], i, light[i - 1], i - 1);

                if (b1[i] >= 0) { //输出闪电折线

                    g.drawLine(b1[i], i, b1[i - 1], i - 1);

                }

                if (b2[i] >= 0) { //输出闪电折线

                    g.drawLine(b2[i], i, b2[i - 1], i - 1);

                }

            }

//输出城市图像city.gif

            g.drawImage(image, 0, 0, this);

            thunder = !thunder;

        }

    }

    void drawBuffer() {

//调用paint()方法

        Graphics g;

        g = buffer.getGraphics();

        paint(g);

    }

    public void start() {

//启动applet，创建并启动线程

        if (thread == null) {

            thread = new Thread(this);

            thread.start();

        }

    }

    public void stop() {

        if (thread != null) {

            thread.stop();

            thread = null;

        }

    }

    void createThunder() {

//生成闪电的坐标数组数据

        int i;

        int bs1, bs2; //开始位置的坐标

        int be1, be2; //结束位置的坐标

        light[0] = (int) (Math.random() * getSize().width); //随机产生闪



        b1[0] = light[0];

        b2[0] = light[0];

        bs1 = (int) (Math.random() * getSize().height) + 1;

        bs2 = (int) (Math.random() * getSize().height) + 1;

        be1 = bs1 + (int) (0.5 * Math.random() * getSize().height) + 1;

        be2 = bs2 + (int) (0.5 * Math.random() * getSize().height) + 1;

        for (i = 1; i < getSize().height; i++) {

            light[i] = light[i - 1] + ((Math.random() > 0.5) ? 1 : -1);

            b1[i] = light[i];

            b2[i] = light[i];

        }

        for (i = bs1; i < getSize().height; i++) {

            b1[i] = b1[i - 1] + ((Math.random() > 0.5) ? 2 : -2);

        }

        for (i = bs2; i < getSize().height; i++) {

            b2[i] = b2[i - 1] + ((Math.random() > 0.5) ? 2 : -2);

        }

        for (i = be1; i < getSize().height; i++) {

            b1[i] = -1;

        }

        for (i = be2; i < getSize().height; i++) {

            b2[i] = -1;

        }

    }

    public void run() {

//启动进程

        Graphics g;

        while (true) {

            try {

//输出图像

                drawBuffer();

                g = this.getGraphics();

                g.drawImage(buffer, 0, 0, this);

//线程休眠，时间随机产生

                Thread.sleep((int) (Integer.parseInt(delay) * 1000 * Math

                        .random()));

//无闪电标记变量置位

                no_thunder = false;

//创建闪电

                createThunder();

//输出图像

                drawBuffer();

                g = this.getGraphics();

                g.drawImage(buffer, 0, 0, this);

//线程休眠1秒

                Thread.sleep(1000);

//无闪电标记变量置位

                no_thunder = true;

            } catch (InterruptedException e) {

                stop();//发生异常，停止线程

            }

        }

    }

}


