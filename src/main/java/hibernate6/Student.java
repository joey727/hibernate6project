package hibernate6;

public class Student {
    private String studentName ;
    private int studentNumber;
    private double marks;

    // getters and setters
    public void setstudentName (String studentName) {
        this.studentName = studentName;
    }
    public String getstudentName () {
        return studentName ;
    }
    public void setstudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    public int getstudentNumber() {
        return studentNumber;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    public double getMarks() {
        return marks;
    }
    
    @Override
    public String toString() {
        return studentNumber + " " + studentName + " " + marks;
    }
}
