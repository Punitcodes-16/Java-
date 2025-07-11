
public class CompileTimePolymorphism{

    
static class Student {
   String name;
   int age;
  
   public void displayInfo(String name) {
       System.out.println(name);
   }


   public void displayInfo(int age) {
       System.out.println(age);
   }


   public void displayInfo(String name, int age) {
       System.out.println(name);
       System.out.println(age);
   }
}
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.displayInfo("Punit");
        s1.displayInfo(19);
        s1.displayInfo("Punit" , 19);
    }
}

