
public class StudentAvg {
   private String name;
    private int age;
    private double heightIncm;

    public StudentAvg(String name,int age,double height){
        this.name = name;
        this.age = age;
        this.heightIncm = height;
    }

    public void setName() {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return heightIncm;}

    public String toString()
    {
        return (name + "(" + age + ")" + heightIncm);


    }
}
