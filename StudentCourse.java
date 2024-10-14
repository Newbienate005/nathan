public class StudentCourse {
    String regNo;
    String fullNames;
    Course course;// object of type Course(Aggregation)
    public StudentCourse(String regNo, String fullNames, Course course){
        this.regNo = regNo;
        this.fullNames = fullNames;
        this.course = course;
    }
    //Setters and Getters
    public void setRegNo(String newReg){
        this.regNo = newReg;
    }
    public String getRegNo(){
        return this.regNo;
    }
    public void setName(String newName){
        this.fullNames =newName;
    }
    public String getName(){
        return this.fullNames;
    }
    public void setCourse(Course obj){
        this.course = obj;
    }
    public Course getCourse(){//method return object of type Course
        return this.course;
    }
    public String printD(){
        return "Full Name:"+ fullNames +"\n" +getCourse().toString;
    }
}
