import java.text.DecimalFormat;

    public class SurveyPartMain {
        public static void main(String[] args) {
            SurveyParticipant p0 = new SurveyParticipant(1111, "Male", 1, 10000);
            SurveyParticipant p1 = new SurveyParticipant(2222, "Female", 1, 20000);
            SurveyParticipant p2 = new SurveyParticipant(3333, "Male", 2, 0);
            SurveyParticipant p3 = new SurveyParticipant(4444, "Female", 1, 40000);
            SurveyParticipant p4 = new SurveyParticipant(5555, "Male", 1, 30000);
            SurveyParticipant p5 = new SurveyParticipant(6666, "Male", 1, 30000);

            int numParticipants = 6;
            SurveyParticipant[] pArray = new SurveyParticipant[numParticipants];
            pArray[0] = p0;
            pArray[1] = p1;
            pArray[2] = p2;
            pArray[3] = p3;
            pArray[4] = p4;
            pArray[5] = p5;

            // Percentage of male, female in the university
            int numMale = 0;
            int numFemale = 0;
            int numEmployedMale = 0;
            int numEmployedFemale = 0;
            double maleSalary = 0;
            double femaleSalary = 0;

            for (int i = 0; i < pArray.length; i++) {
                SurveyParticipant p = pArray[i];
                if (p.getGender().equals("Male")) {
                    numMale ++;

                    if (p.getJob() == 1) {
                        numEmployedMale ++;
                        maleSalary += p.getSalary();
                    }

                } else if (p.getGender().equals("Female")) {
                    numFemale++;

                    if (p.getJob() == 1) {
                        numEmployedFemale ++;
                        femaleSalary += p.getSalary();
                    }
                }
            }

            double percentMale = (double)numMale / numParticipants * 100;
            double percentFemale = (double)numFemale / numParticipants * 100;
            double avgMaleSalary = maleSalary / numEmployedMale;
            double avgFemaleSalary = femaleSalary / numEmployedFemale;

            DecimalFormat df = new DecimalFormat("###.00");

            System.out.println("Percent of male: " + df.format(percentMale) + "%");
            System.out.println("Percent of female: " + df.format(percentFemale) + "%");
            System.out.println("Average male salary: " + df.format(avgMaleSalary));
            System.out.println("Average female salary: " + df.format(avgFemaleSalary));
        }
    }
