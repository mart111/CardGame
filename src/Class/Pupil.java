package Class;

public class Pupil {

    private String nameP;
    private String surnameP;
    private String genderP;
    private int grade;

    public Pupil() {
    }

    public Pupil(String nameP, String surnameP, String genderP, int grade) {
        this.nameP = nameP;
        this.surnameP = surnameP;
        this.genderP = genderP;
        this.grade = grade;
    }

    public String getNameP() {
        return nameP;
    }

    public String getSurnameP() {
        return surnameP;
    }

    public String getGenderP() {
        return genderP;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String studyStatus() {
        if (grade < 10)
            return "Bad Class.Pupil";
        if (grade > 10 || grade < 20)
            return "Average Class.Pupil";
        return "Good Class.Pupil";
    }
}
