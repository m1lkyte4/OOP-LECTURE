import java.util.*;

public class Center {
    //Center has list(s) of teachers, and student batches
    //there should be method for add and info display

    private ArrayList<Teacher> rts = new ArrayList<Teacher>();
    private ArrayList<StudentBatch> sbs = new ArrayList<StudentBatch>();

    public void addFTeacher(FreelanceTeacher ft){


    }

    public void addTeacher(Teacher teacher){

    }

    public void addStudentBatch(StudentBatch sb) {

    }

    //display the name
    public void displayTeachers(){
        for(int i=0; i<teachers.size(), i++) {
            Teacher teacher = teachers.get(i);
            System.out.println();
        }
    }

    public float calcTotalPay(){
        float sum = 0;
        for(int i=0; i<teachers.size(); i++){
            Teacher teacher = teachers.get(i);
            System.out.println();

            if (teacher instanceof RegularTeacher){
                RegularTeacher rt = (RegularTeacher) teacher; //casting - change type
                sum += rt.calcPay();
            }
            else if (teacher instanceof FreelanceTeacher){
                FreelanceTeacher rt = (FreelanceTeacher) teacher; //casting - change type
                sum += rt.calcPay();
            }
            return sum;
    }


    public static void main(String args[]){
        Center ipohcenter = new Center(); // create a new center

        RegularTeacher rteacher = new RegularTeacher();
        FreelanceTeacher fteacher = new FreelanceTeacher();

        ipohcenter.addRTeacher(rteacher);

        // polymorphism - can make the code cleaner & shorter
        ipohcenter.addTeacher(rteacher);
        ipohcenter.addTeacher(fteacher);
        ipohcenter.displayTeachers();

        float totalPay = ipohcenter.calcTotalPay();

    }
}
