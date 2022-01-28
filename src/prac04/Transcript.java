package prac04;
public class Transcript {
    int[][] data = {{1,90},{2,87},{3,99},{4,77},{5,98},{6,79}};

    public static void main(String[] args) {
        Transcript test = new Transcript();
        System.out.println("排序前：");
        test.display();
        test.sort();
        System.out.println("\n排序后：");
        test.display();


    }
    public void sort(){
        for(int i=0; i<this.data.length; i++) {
            for(int j=0; j<this.data.length-i-1; j++) {
                if(this.data[j][1]<this.data[j+1][1]) {
                    int[] item = this.data[j];
                    this.data[j] = this.data[j+1];
                    this.data[j+1] = item;
                }
            }
        }
    }

    public void display() {
        for(int i=0; i<this.data.length; i++) {
            System.out.printf("第%d名  学号：%d  成绩：%d\n", i+1, this.data[i][0], this.data[i][1]);
        }
    }
}
