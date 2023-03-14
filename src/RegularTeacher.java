public class RegularTeacher extends Teacher{ //extends - inheritance: dont have to repeat the code.
    // has been declared in superclass
    // but can be override [banyak sangat/bertindih]
    int hours;

    //setter and getter
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }


    public float calcPay(){

        return 0;
    }
    public static void main(String args[]){
        RegularTeacher rt = new RegularTeacher();//parameter
        float pay = rt.calcPay();
    }

}
