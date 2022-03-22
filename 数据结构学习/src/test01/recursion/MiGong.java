package test01.recursion;

public class MiGong {
    public static void main(String[] args) {
        //先创建一个二维数组，模拟迷宫
        //地图
        int[][] map = new int[8][7];
        //使用1表示墙
        //上下全部置为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //左右全部置为1
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        //设置挡板，1表示
        map[3][1] = 1;
        map[3][2] = 1;
        map[1][2] = 1;
        map[2][2] = 1;

        //输出地图
        System.out.println("地图的情况");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        //使用递归回溯给小球找路
        setWay(map,1,1);
        setWay2(map, 1, 1);

        //输出新地图，小球走过，并标识过的递归
        System.out.println("小球走过，并标识过的，地图的情况");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean setWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            //通路已经找到ok
            return true;
        } else {
            if (map[i][j] == 0) {
                //如果当前这个点还没走过,
                //按照策略 下->右->上->左
                map[i][j] = 2;
                if (setWay(map, i + 1, j)) {
                    return true;
                } else if (setWay(map, i, j + 1)) {
                    return true;
                } else if (setWay(map, i - 1, j)) {
                    return true;
                } else if (setWay(map, i, j - 1)) {
                    return true;
                } else {
                    //说明该点是走不通的，死路
                    map[i][j] = 3;
                    return false;
                }
            } else {
                //如果map[i][j]!=0,可能是1,2,3
                return false;
            }
        }
    }

    //修改找路策略，改成 上-?右->下->左
    public static boolean setWay2(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            //通路已经找到ok
            return true;
        } else {
            if (map[i][j] == 0) {
                //如果当前这个点还没走过,
                //按照策略 下->右->上->左
                map[i][j] = 2;
                if (setWay(map, i - 1, j)) {
                    return true;
                } else if (setWay(map, i, j + 1)) {
                    return true;
                } else if (setWay(map, i + 1, j)) {
                    return true;
                } else if (setWay(map, i, j - 1)) {
                    return true;
                } else {
                    //说明该点是走不通的，死路
                    map[i][j] = 3;
                    return false;
                }
            } else {
                //如果map[i][j]!=0,可能是1,2,3
                return false;
            }
        }
    }

}