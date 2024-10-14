public class Course {
    String unitCode;
    String unitTitle;
    public Course(String unitCode, String unitTitle){
        //this.unitCode = unitCode;
        //this.unitTitle = unitTitle;
        //Generally encourage code below for to replace above 
        setUnitcode(unitCode);//returns this.unitCode
        setUnitTitle(unitTitle);//returns this.unitTitle
    }
    public void setUnitcode(String newUnitCode){
        this.unitCode = newUnitCode;
    }
    public void setUnitTitle(String newUnitTitle){
        this.unitTitle = newUnitTitle;
    }
    public String getUnitcode(){
        return this.unitCode;
    }
    public String getUnitTitle(){
        return this.unitTitle;
    }
    public String toString(){
        return "UNIT CODE: " +unitCode+"\n UNIT TITLE: "+unitTitle;
    }
}
