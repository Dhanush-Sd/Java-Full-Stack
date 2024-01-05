package Oops;
class Company{
    private String empname;
    public void setEmpname(String empname){
        this.empname = empname;
    }
    public String getEmpname(){
        return empname;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Company c = new Company();
        c.setEmpname("Hello");
        String y = c.getEmpname();
        System.out.println(y);
    }
}
