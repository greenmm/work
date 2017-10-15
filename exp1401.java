package ll;
class Student{//����ѧ����
    private String name;
    private int age;
    private String degree;
    public Student(String name, int age, String degree) {//ѧ������
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
        System.out.println("������" + this.getName() + ". ���䣺" + this.getAge() + ". ѧλ��" + this.getDegree() );
    }
}
 
class Undergraduate extends Student{//�о�����
    private String specialty;
 
    public String getSpecialty() {
        return specialty;
    }
 
    public void setSpecialty(String specialty) {//����רҵ
        this.specialty = specialty;
    }
 
    public Undergraduate(String name, int age, String degree, String specialty) {//�о�������
        super(name, age, degree);
        this.specialty = specialty;
    }
 
    public Undergraduate(String name, int age, String degree) {
        super(name, age, degree);
    }
     
    public void show(){//�������
        System.out.println("������" + this.getName() + ". ���䣺" + this.getAge() + ". ѧλ��" + this.getDegree() + ". רҵ��" + this.getSpecialty());
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
        System.out.println("������" + this.getName() + ". ���䣺" + this.getAge() + ". ѧλ��" + this.getDegree() + ". �о�����" + this.getDirection());
    }
}
public class exp1401 {
	public static void main(String[] args) {//������
        Undergraduate stu1=new Undergraduate("������",21,"����","�������");
        Graduate stu2=new Graduate("����",27,"˶ʿ","��ȫ����");
        stu1.show();
        stu2.show();
}
}