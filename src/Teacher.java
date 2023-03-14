// createed by team in Bangalore
public class Teacher {
    // data
    String name;
    String ic;
    String address;
    int numyearexp;
    String qualification;

    //setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumyearexp() {
        return numyearexp;
    }

    public void setNumyearexp(int numyearexp) {
        this.numyearexp = numyearexp;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


    //method
    public float calcPay(){

        return 0;
    }

    public abstract float calcPay(){

    }
    public static void main(String args[]){
        //why the above is not good
        Teacher t = new Teacher();
        System.out.println(t.calcPay());
    }
}
