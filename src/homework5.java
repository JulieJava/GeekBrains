public class homework5 {

    public static void main(String[] args) {
        Employee firstEmployee = new Employee("IvanovIvan", "engineer", "ivanov@mail.ru", "89998888888", 30000, 30);
        Employee secondEmployee = new Employee("PetrovPetr", "technician", "petrov@mail.ru", "89997777777", 35000, 35);
        Employee thirdEmployee = new Employee("FedorovFedor", "accountant", "fedorov@mail.ru", "89996666666", 40000, 40);
        Employee forthEmployee = new Employee("AlekseevAleksey", "manager", "alekseev@mail.ru", "89994444444", 45000, 45);
        Employee fifthEmployee = new Employee("AndreevAndrey", "director", "andreev@mail.ru", "89995555555", 50000, 50);

        firstEmployee.print();
        secondEmployee.print();
        thirdEmployee.print();
        forthEmployee.print();
        fifthEmployee.print();

        System.out.println();

        Employee[] emplArray = new Employee[5];
        emplArray[0] = firstEmployee;
        emplArray[1] = secondEmployee;
        emplArray[2] = thirdEmployee;
        emplArray[3] = forthEmployee;
        emplArray[4] = fifthEmployee;


        for (Employee empl : emplArray) {
            if (empl.getAge() > 40) empl.print();
        }

    }

}
