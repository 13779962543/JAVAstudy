public class SchoolPreson {
     public String name;
     public String xb;
     public String id;
     public SchoolPreson(String name,String xb,String id){
         this.name=name;
         this.xb=xb;
         this.id=id;
     }
     public String getName(){
         return name;
     }
     public void setName(){
         this.name=name;
     }
     public String getXb(){
         return xb;
     }
     public void setXb(){
         this.xb=xb;
     }
     public String getId(){
         return id;
     }
     public void setId(){
         this.id=id;
     }
    void printInfo(){
        System.out.println("姓名："+name+"性别"+xb+"身份证"+id);
    }
}
class Teacher extends SchoolPreson{
    private int number;
    public Teacher(String name,String xb,String id,int number){
        super(name,xb,id);
        this.number=number;
        }
        public int getNumber(){
        return number;
        }
        public void setNumber(int number){
        this.number=number;
        }
    }
class Student extends SchoolPreson{
    public String studentID;
    public String nj;
    public String banj;
    public Student(String name,String xb,String id,String studentID,String nj,String banj){
        super(name,xb,id);
        this.studentID=studentID;
        this.nj=nj;
        this.banj=banj;
    }
    public String getStudentID(){
        return studentID;
    }
    public void setStudentID(){
        this.studentID=studentID;
    }
    public String getNj(){
        return nj;
    }
    public void setNj(){
        this.nj=nj;
    }
    public String getBanj(){
        return banj;
    }
    public void setBanj(){
        this.banj=banj;
    }

}
