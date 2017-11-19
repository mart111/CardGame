package Class;

public class HeadTeacher {

    private String nameHT;
    private String surnameHT;
    private String genderHT;

    public HeadTeacher() {
    }

    public HeadTeacher(String nameHT, String surnameHT, String genderHT) {
        this.nameHT = nameHT;
        this.surnameHT = surnameHT;
        this.genderHT = genderHT;
    }

    public String getNameHT() {
        return nameHT;
    }

    public String getSurnameHT() {
        return surnameHT;
    }

    public String getGenderHT() {
        return genderHT;
    }

    public void addNewPupil(Pupil pupil) {
        new Classroom().getPupils().add(pupil);
    }


    public void chnageStudyStatus() {
        new Pupil().setGrade(new Pupil().getGrade() + 10);
    }
}
