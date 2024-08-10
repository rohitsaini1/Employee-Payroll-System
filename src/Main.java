public class Main {
    public static void main(String[] args) {

        PayrollSystem pay = new PayrollSystem();
        FullTimeEmployee Emp1 = new FullTimeEmployee("Rohit",1,7000.0);
        PartTimeEmployee Emp2 = new PartTimeEmployee("Akhilesh",2,40,50.0);

        pay.addEmployee(Emp1);
        pay.addEmployee(Emp2);
        System.out.println("Employee Details : ");
        pay.displayEmployees();
        System.out.println("Remove Employee :");
        pay.removeEmployee(2);
        System.out.println("Remaning Employee");
        pay.displayEmployees();
    }
}