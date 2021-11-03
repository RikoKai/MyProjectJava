public class Main {

    public static void main(String[] args) {

        Student student[]=new Student[3];
       student[0]=new Student(1,"Muh A","2002","Ast","FIT",2,"Sib-21");
        student[1]=new Student(2,"Muh NUr","2001","Alt","FEN",1,"Sib-21");
        student[2]=new Student(2,"Muh Aslan","2003","Atyrau","FIT",3,"IS31");

        for (int i = 0; i <student.length ; i++) {
            System.out.println(student[i].toString());
        }

    }
}
