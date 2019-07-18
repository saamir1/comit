package Work;

public class Participant {
    private int photoID;
    private char sex;
    private boolean job;
    private int salary;

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean isHasJob() {
        return job;
    }

    public void setJob(boolean job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Participant(int photoID, char sex, boolean job, int salary) {
        this.photoID = photoID;
        this.sex = sex;
        this.job = job;
        this.salary = salary;
    }
}
