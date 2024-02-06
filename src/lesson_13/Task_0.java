package lesson_13;

public class Task_0 {
    // Class "Student"
    public class Student {
        String name;
        int age;
        String specialization;

        public Student(String name, int age, String specialization) {
            this.name = name;
            this.age = age;
            this.specialization = specialization;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSpecialization() {
            return specialization;
        }

        public void study() {
            System.out.println(name + " : обучается " + specialization);
        }
    }

    // Class "Teacher"
    public class Teacher {
        String name;
        int age;
        String subject;

        public Teacher(String name, int age, String subject) {
            this.name = name;
            this.age = age;
            this.subject = subject;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSubject() {
            return subject;
        }

        public void teach() {
            System.out.println(name + " : учитель " + subject);
        }
    }

    // Class "Doctor"
    public class Doctor {
        String name;
        int age;
        String specialization;

        public Doctor(String name, int age, String specialization) {
            this.name = name;
            this.age = age;
            this.specialization = specialization;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSpecialization() {
            return specialization;
        }

        public void treat() {
            System.out.println(name + " : врач " + specialization);
        }
    }

}
