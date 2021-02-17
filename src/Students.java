public class Students {

    private String name;
    private String department;
    private String faculty;
    private String course;
    private int level;
    private String matriculation_number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getMatriculation_number() {
        return matriculation_number;
    }

    public void setMatriculation_number(String matriculation_number) {
        this.matriculation_number = matriculation_number;
    }

    public static void main(String[] args) {
        Students studentObject = new Students();
        studentObject.setName("Nathan");
        studentObject.setMatriculation_number("FPB/99/36145");
        System.out.println("Student name: "+studentObject.getName());
        System.out.println("Student matric no:" +studentObject.getMatriculation_number());
    }
}
