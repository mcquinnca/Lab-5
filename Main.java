import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Student student1 = new Student();
    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

    Student student2 = new Student();
    student2.name = "Colin McQuinn";
    student2.gpa = 4.3;
    student2.major = "Information Systems";

    // or can do this with the dot operator
    // student1.name = "Arnold Spielberg";
    // student1.gpa = 4.0;
    // student1.major = "Electrical Engineering";
    System.out.println("student1's name is " + student1.getName() + " and their GPA is " + student1.getGPA()
        + " and their major is " + student1.getMajor());

    System.out.println("student2's name is " + student2.getName() + " and their GPA is " + student2.getGPA()
        + " and their major is " + student2.getMajor());

    ArrayList<Double> gpas = new ArrayList<Double>();

    gpas.add(student1.gpa);
    gpas.add(student2.gpa);

    double totalGpa = 0;
    double avgGpa;

    for(int i=0; i<=gpas.size()-1; i++){
     totalGpa = totalGpa + gpas.get(i);
    }
    avgGpa = totalGpa / gpas.size();
    System.out.println(avgGpa);


  }


}
// or can do this with the dot operator
// System.out.println("student1's name is " + student1.name + " and their GPA
// is" + student1.gpa + " and their major is " + student1.major); }}