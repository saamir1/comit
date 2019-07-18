public class SurveyParticipant {
    private int photoId;
    private String gender; // 1-male, 2-female
    private int job; // 1-employed, 2-unemployed
    private int salary;

    public SurveyParticipant(int photoId, String gender, int job, int salary) {
        this.photoId = photoId;
        this.gender = gender;
        this.job = job;
        this.salary = salary;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        String strJob;

        if (this.job == 1) {
            strJob = "Employed";
        } else {
            strJob = "Unemployed";
        }

        return "SurveyParticipant{" +
                "photoId=" + photoId +
                ", gender='" + gender + '\'' +
                ", job=" + strJob +
                ", salary=" + salary +
                '}';
    }
}
