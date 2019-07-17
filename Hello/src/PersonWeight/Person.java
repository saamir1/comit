package PersonWeight;

public class Person {
        public static final char MALE = 'M';
        public static final char FEMALE = 'F';
        public static final int lENGTH_OF_ID= 8;
        public static final int IDEAL_WEIGHT = 0;
        public static final int UNDER_WEIGHT = -1;
        public static final int OVER_WEIGHT = 1;
        public static final int LEGAL_AGE = 18;


        private String name;
        private int age, id;
        private char gender;
        private int weight;
        private float height;

        public Person() {
            this.id = generateId();
            this.name = "";
            this.age = 0;
            this.gender = MALE;
            this.weight = 0;
            this.height = 0;
        }

        public Person(String name, int age, char gender) throws Exception {
            this.id = generateId();
            this.name = name;
            this.age = age;
            if(checkGender(gender)) this.gender = gender;
            else throw new Exception("Invalid Gender");
        }

        public Person(String name, int age, char gender, int weight, float height) throws Exception {
            this.id = generateId();
            this.name = name;
            this.age = age;
            if(checkGender(gender)) this.gender = gender;
            else throw new Exception("Invalid Gender");
            this.weight = weight;
            this.height = height;
        }

        private int generateId(){
            return (int)(lENGTH_OF_ID*Math.random());
        }

        public int calculate(){
            int idealWeight = (int)(weight/ Math.pow(height,2));

            System.out.println( idealWeight);

            if(weight > idealWeight)return OVER_WEIGHT;
            else if(weight < idealWeight) return UNDER_WEIGHT;
            else return IDEAL_WEIGHT;
        }

        public boolean isOver(){
            return (age >= LEGAL_AGE);
        }

        private boolean checkGender(char gen){
            return(gen==MALE || gen==FEMALE);
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setHeight(float height) {
            this.height = height;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public char getGender() {
            return gender;
        }

        public int getWeight() {
            return weight;
        }

        public float getHeight() {
            return height;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", id=" + id +
                    ", gender=" + gender +
                    ", weight=" + weight +
                    ", height=" + height +
                    '}';
        }
    }

