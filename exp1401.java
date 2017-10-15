package ll;
class Student{//建立学生类
    private String name;
    private int age;
    private String degree;
    public Student(String name, int age, String degree) {//学生属性
        super();
        this.name = name;
        this.age = age;
        this.degree = degree;
    }
    public Student() {
        super();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }
    public void show(){
        System.out.println("姓名：" + this.getName() + ". 年龄：" + this.getAge() + ". 学位：" + this.getDegree() );
    }
}
 
class Undergraduate extends Student{//研究生类
    private String specialty;
 
    public String getSpecialty() {
        return specialty;
    }
 
    public void setSpecialty(String specialty) {//设置专业
        this.specialty = specialty;
    }
 
    public Undergraduate(String name, int age, String degree, String specialty) {//研究生属性
        super(name, age, degree);
        this.specialty = specialty;
    }
 
    public Undergraduate(String name, int age, String degree) {
        super(name, age, degree);
    }
     
    public void show(){//输出函数
        System.out.println("姓名：" + this.getName() + ". 年龄：" + this.getAge() + ". 学位：" + this.getDegree() + ". 专业：" + this.getSpecialty());
    }
}
 
class Graduate extends Student{
    private String direction;
 
    public String getDirection() {
        return direction;
    }
 
    public void setDirection(String direction) {
        this.direction = direction;
    }
 
    public Graduate(String name, int age, String degree, String direction) {
        super(name, age, degree);
        this.direction = direction;
    }
 
    public Graduate(String name, int age, String degree) {
        super(name, age, degree);
    }
    public void show(){
        System.out.println("姓名：" + this.getName() + ". 年龄：" + this.getAge() + ". 学位：" + this.getDegree() + ". 研究方向：" + this.getDirection());
    }
}
public class exp1401 {
	public static void main(String[] args) {//主函数
        Undergraduate stu1=new Undergraduate("王蕴臻",21,"本科","软件工程");
        Graduate stu2=new Graduate("李四",27,"硕士","安全工程");
        stu1.show();
        stu2.show();
}
}