public class Student {
    private String name;
    private int group;
    public Student(String name){
        this.name = name;
    }
    public Student(String name, int group){
      this(name);
      this.group = group;
    }
    public Student(Student student){
       this.name = student.name;
       this.group = student.group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}

