public class Inherit_demo {
    public  String name = "sainath";
    public String course = "Computer Science";

    public void student(){
        System.out.println(course);
    }
}

class Details extends Inherit_demo {
    public String rank = "A";
    public static void main(String[] args){
        Details student = new Details();
        System.out.println(student.name + "-" + student.rank);
        student.student();
    }
}
