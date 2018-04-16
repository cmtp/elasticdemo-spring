package com.example.elasticdemo.bootstrap;

import com.example.elasticdemo.models.Student;
import com.example.elasticdemo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private StudentRepository studentRepository;

    @Autowired
    public DevBootstrap(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Student student1 = new Student(1, "elli rantala", 11);
        Student student2 = new Student(2, "aquino viana", 22);
        Student student3 = new Student(3, "ayse velioglu", 33);
        Student student4 = new Student(4, "brooklyn taylor", 44);
        Student student5 = new Student(5, "kuzey ozbey", 55);
        Student student6 = new Student(6, "eloise denis", 66);
        Student student7 = new Student(7, "ronja tanner", 45);
        Student student8 = new Student(8, "livia dufour", 70);
        Student student9 = new Student(9, "james singh", 35);
        Student student10 = new Student(10, "quinten van der flier", 25);
        Student student11 = new Student(11, "bruce grant", 23);
        Student student12 = new Student(12, "tina unger", 24);
        Student student13 = new Student(13, "clara muller", 18);
        Student student14 = new Student(14, "benjamin robert", 36);
        Student student15 = new Student(15, "ryan neal", 38);
        Student student16 = new Student(16, "nivalda viana", 25);
        Student student17 = new Student(17, "terra burton", 24);
        Student student18 = new Student(18, "jeanne caron", 52);
        Student student19 = new Student(19, "theodore walker", 66);
        Student student20 = new Student(20, "thais rey", 40);
        Student student21 = new Student(21, "kayla jones", 46);
        Student student22 = new Student(22, "carissa van houte", 45);
        Student student23 = new Student(23, "mies de deugd", 48);
        Student student24 = new Student(24, "chad romero", 20);
        Student student25 = new Student(25, "anton christiansen", 27);
        Student student26 = new Student(26, "airton goncalves", 29);
        Student student27 = new Student(27, "gul gonultaş", 28);
        Student student28 = new Student(28, "beverley peters", 30);
        Student student29 = new Student(29, "leo ebert", 35);
        Student student30 = new Student(30, "isaac burns", 40);
        Student student31 = new Student(31, "dwight arnold", 65);
        Student student32 = new Student(32, "timothy evans", 15);
        Student student33 = new Student(33, "judith harvey", 18);
        Student student34 = new Student(34, "fanny pierre", 19);
        Student student35 = new Student(35, "janique klinge", 17);
        Student student36 = new Student(36, "silas thomsen", 21);
        Student student37 = new Student(37, "davut smith", 23);
        Student student38 = new Student(38, "lawrence lynch", 22);
        Student student39 = new Student(39, "dylan belanger", 24);
        Student student40 = new Student(40, "tommy hudson", 25);
        Student student41 = new Student(41, "daniel bouchard", 45);
        Student student42 = new Student(42, "amandine philippe", 29);
        Student student43 = new Student(43, "valdemar sorensen", 35);
        Student student44 = new Student(44, "maddison daniels", 38);
        Student student45 = new Student(45, "iliass de koster", 29);
        Student student46 = new Student(46, "charlotte jean-baptiste", 27);
        Student student47 = new Student(47, "xavier lam", 34);
        Student student48 = new Student(48, "sophia robert", 50);
        Student student49 = new Student(49, "valentin keil", 51);
        Student student50 = new Student(50, "jeffery jackson", 53);

        // Saving Student to StudentRepository
        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);
        studentRepository.save(student4);
        studentRepository.save(student5);
        studentRepository.save(student6);
        studentRepository.save(student7);
        studentRepository.save(student8);
        studentRepository.save(student9);
        studentRepository.save(student10);
        studentRepository.save(student11);
        studentRepository.save(student12);
        studentRepository.save(student13);
        studentRepository.save(student14);
        studentRepository.save(student15);
        studentRepository.save(student16);
        studentRepository.save(student17);
        studentRepository.save(student18);
        studentRepository.save(student19);
        studentRepository.save(student20);
        studentRepository.save(student21);
        studentRepository.save(student22);
        studentRepository.save(student23);
        studentRepository.save(student24);
        studentRepository.save(student25);
        studentRepository.save(student26);
        studentRepository.save(student27);
        studentRepository.save(student28);
        studentRepository.save(student29);
        studentRepository.save(student30);
        studentRepository.save(student31);
        studentRepository.save(student32);
        studentRepository.save(student33);
        studentRepository.save(student34);
        studentRepository.save(student35);
        studentRepository.save(student36);
        studentRepository.save(student37);
        studentRepository.save(student38);
        studentRepository.save(student39);
        studentRepository.save(student40);
        studentRepository.save(student41);
        studentRepository.save(student42);
        studentRepository.save(student43);
        studentRepository.save(student44);
        studentRepository.save(student45);
        studentRepository.save(student46);
        studentRepository.save(student47);
        studentRepository.save(student48);
        studentRepository.save(student49);
        studentRepository.save(student50);

//        // Getting all Students
//        System.out.println("***** Getting All Students *******");
//        for (Student student : studentRepository.findAll())
//        {
//            System.out.println(student);
//        }
//
//        // Getting the student with Id 4
//        System.out.println("***** Student with Id 4 *******");
//        System.out.println(studentRepository.findOne((long) 4));
//
//
//        // Getting the student with Name JIP3
//        System.out.println("***** Student with Name JIP3 *******");
//        System.out.println(studentRepository.findByName("JIP3"));
//
//        // Getting the student with Age 22
//        System.out.println("***** Student with ID 2 *******");
//        System.out.println(studentRepository.findByAge(22));
//
//        //Delete the Student with Id 5
//        studentRepository.delete((long) 5);
//        //Check whether the student is deleted or not
//        System.out.println("***** Student with id 5 : "+(studentRepository.findOne((long) 5)));
    }

    private void convertStringToJson() {

    }
}
