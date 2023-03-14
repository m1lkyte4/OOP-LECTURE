public class FreelanceTeacher extends Teacher{ //extends-inheritance: don't have to repeat code.
    private int hours;

    //setter and getter
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }


    public float calcPay(){ // method header

        return 0;
    }

    public static void main(String args[]){
        FreelanceTeacher ft = new FreelanceTeacher();
        ft.setHours(10);
        float pay = ft.calcPay;
    }


}
