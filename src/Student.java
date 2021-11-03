public class Student {
    private int id;
    private String FIO,
    birth,
    addres,
    facultet;
   private int course;
   private String group;

    public Student(int id, String FIO, String birth, String addres, String facultet, int course, String group) {
        this.id = id;
        this.FIO = FIO;
        this.birth = birth;
        this.addres = addres;
        this.facultet = facultet;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", FIO='" + FIO + '\'' +
                ", birth='" + birth + '\'' +
                ", addres='" + addres + '\'' +
                ", facultet='" + facultet + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}
