public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;
    int year = 2021;

    Employee(String name, int salary, int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        System.out.println("Çalışan bilgileri işlendi...");
    }
    public double tax(){
        if (this.salary < 1000){
            return 0;
        }
        else {
            return this.salary*0.03;
        }
    }

    public double bonus(){
        if (this.workHours > 40){
            return (this.workHours - 40)*30;
        }
        else{
            return 0;
        }
    }

    public double raiseSalary(){
        if (this.year - this.hireYear < 10){
            return this.salary * 0.05;
        }
        else if (this.year - this.hireYear > 9 && this.year - this.hireYear < 20){
            return this.salary * 0.1;
        }
        else {
            return this.salary * 0.15;
        }
    }

    public void bilgileriGoster(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma saati: "+this.workHours);
        System.out.println("Başlangıç Yılı: "+this.hireYear);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş Artışı: "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: "+(this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş: "+(this.salary + raiseSalary()));
    }

}
