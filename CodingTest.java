import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.averagingDouble;

class Employee{
    private int id;
    private String name;
    private Double salary;
    private String department;
    private String gender;

    public Employee(int id, String name, Double salary, String department, String gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}


public class CodingTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Narsing", 100000.0, "IT", "Male");
        Employee e2 = new Employee(2, "Priya", 500000.0, "HR", "Female");
        Employee e3 = new Employee(3, "Dinesh", 70000.0, "IT", "Male");
        Employee e4 = new Employee(4, "Manish", 80000.0, "Sales", "Male");
        Employee e5 = new Employee(5, "Avinash", 40000.0, "IT", "Male");
        Employee e6 = new Employee(6, "Saurabh", 150000.0, "HR", "Male");
        Employee e7 = new Employee(7, "Gayatri", 600000.0, "Sales", "Female");
        Employee e8 = new Employee(8, "Bharat", 900000.0, "IT", "Male");
        Employee e9 = new Employee(9, "Ganesh", 800000.0, "Marketing", "Male");
        Employee e10 = new Employee(10, "Godavari", 9000000.0, "IT", "Female");
        Employee e11 = new Employee(11, "Ramesh", 550000.0, "Finance", "Male");
        Employee e12 = new Employee(12, "Sita", 450000.0, "Finance", "Female");
        Employee e13 = new Employee(13, "Anjali", 120000.0, "Marketing", "Female");
        Employee e14 = new Employee(14, "Rahul", 95000.0, "Sales", "Male");
        Employee e15 = new Employee(15, "Komal", 850000.0, "HR", "Female");
        Employee e16 = new Employee(16, "Vikram", 250000.0, "IT", "Male");
        Employee e17 = new Employee(17, "Deepa", 700000.0, "Marketing", "Female");
        Employee e18 = new Employee(18, "Arjun", 1200000.0, "IT", "Male");
        Employee e19 = new Employee(19, "Kiran", 380000.0, "Finance", "Male");
        Employee e20 = new Employee(20, "Meena", 950000.0, "Sales", "Female");

        List<Employee> li1 = List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20);

      //  List<Employee> li=new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10));


       //grouping by gender
        Map<String,List<Employee>> m=li1.stream().collect(Collectors.groupingBy(Employee::getGender));
        System.out.println(m);

        //averaging salary by department--------------------------------------------
        Map<String,Double>li2 = li1.stream().collect(Collectors.groupingBy(Employee::getDepartment, averagingDouble(Employee::getSalary)));
        li2.forEach((dept,sal)-> System.out.println(dept+":"+sal));

        //average salary by depart per gender--------------------------------------------
        Map<String,Map<String,Double>>li3 = li1.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.groupingBy(Employee::getGender,
                                averagingDouble(Employee::getSalary) ) ));

        li3.forEach((dept1,genSalary)-> {
            System.out.println("----------------------------------");
            System.out.println("deptname wise:" + dept1);
            System.out.print("Gender wise salary:");
            genSalary.forEach((gen1,sal1)-> System.out.println(gen1+":"+sal1));

        });

        //lowest salary in each department based on the gender-------------------------------------------
       Map<String,Map<String,Optional<Employee>>>map = li1.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.groupingBy(Employee::getGender, Collectors.minBy(Comparator.comparing(Employee::getSalary)))));
       map.forEach((dept2,genSal2)->{
           System.out.println("----------------------------------------");
           System.out.println("Dept:"+dept2);
           genSal2.forEach((gen2,minsal)->{
               if(minsal.isPresent()) {
                   System.out.println("gender by " + gen2 + ":" + "salary " + minsal.get().getSalary());
               }else{
                   System.out.println(" "+gen2+": No employees");
               }
           });
       });
    }
}

/*
output:
------------------------------------
{
Female=[Employee{id=2, name='Priya', salary=500000.0, department='HR', gender='Female'}, 
Employee{id=7, name='Gayatri', salary=600000.0, department='Sales', gender='Female'}, 
Employee{id=10, name='Godavari', salary=9000000.0, department='IT', gender='Female'}, 
Employee{id=12, name='Sita', salary=450000.0, department='Finance', gender='Female'}, 
Employee{id=13, name='Anjali', salary=120000.0, department='Marketing', gender='Female'}, 
Employee{id=15, name='Komal', salary=850000.0, department='HR', gender='Female'}, 
Employee{id=17, name='Deepa', salary=700000.0, department='Marketing', gender='Female'}, 
Employee{id=20, name='Meena', salary=950000.0, department='Sales', gender='Female'}], 

Male=[Employee{id=1, name='Narsing', salary=100000.0, department='IT', gender='Male'}, 
Employee{id=3, name='Dinesh', salary=70000.0, department='IT', gender='Male'}, 
Employee{id=4, name='Manish', salary=80000.0, department='Sales', gender='Male'}, 
Employee{id=5, name='Avinash', salary=40000.0, department='IT', gender='Male'}, 
Employee{id=6, name='Saurabh', salary=150000.0, department='HR', gender='Male'}, 
Employee{id=8, name='Bharat', salary=900000.0, department='IT', gender='Male'}, 
Employee{id=9, name='Ganesh', salary=800000.0, department='Marketing', gender='Male'}, 
Employee{id=11, name='Ramesh', salary=550000.0, department='Finance', gender='Male'}, 
Employee{id=14, name='Rahul', salary=95000.0, department='Sales', gender='Male'}, 
Employee{id=16, name='Vikram', salary=250000.0, department='IT', gender='Male'}, 
Employee{id=18, name='Arjun', salary=1200000.0, department='IT', gender='Male'}, 
Employee{id=19, name='Kiran', salary=380000.0, department='Finance', gender='Male'}]
}

Sales:431250.0
Finance:460000.0
HR:500000.0
IT:1651428.5714285714
Marketing:540000.0
----------------------------------
deptname wise:Sales
Gender wise salary:Female:775000.0
Male:87500.0
----------------------------------
deptname wise:Finance
Gender wise salary:Female:450000.0
Male:465000.0
----------------------------------
deptname wise:HR
Gender wise salary:Male:150000.0
Female:675000.0
----------------------------------
deptname wise:IT
Gender wise salary:Female:9000000.0
Male:426666.6666666667
----------------------------------
deptname wise:Marketing
Gender wise salary:Female:410000.0
Male:800000.0
----------------------------------------
Dept:Sales
gender by Female:salary 600000.0
gender by Male:salary 80000.0
----------------------------------------
Dept:Finance
gender by Female:salary 450000.0
gender by Male:salary 380000.0
----------------------------------------
Dept:HR
gender by Male:salary 150000.0
gender by Female:salary 500000.0
----------------------------------------
Dept:IT
gender by Female:salary 9000000.0
gender by Male:salary 40000.0
----------------------------------------
Dept:Marketing
gender by Female:salary 120000.0
gender by Male:salary 800000.0
 
 */
