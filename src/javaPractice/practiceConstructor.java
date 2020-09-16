package javaPractice;

public class practiceConstructor {

        String name;
        int age;
        char gender;



        public practiceConstructor(String name, int age, char gender) {

            this.name=name;
            this.age=age;
            this.gender=gender;

            System.out.println("Our mentor is: " + name +" who is "+age+" years old and is a "+ gender);
        }

        public static void main(String[] args) {

            practiceConstructor obj = new practiceConstructor("Emelda",32,'M');


        }


    }

