package Class;

import java.util.List;

public class Classroom {

    private int classRoomNumber;
    private List<Pupil> pupils;
    private HeadTeacher headTeacher;

    public Classroom() {
    }

    public Classroom(int classRoomNumber, List<Pupil> pupils, HeadTeacher headTeacher) {
        this.classRoomNumber = classRoomNumber;
        this.pupils = pupils;
        this.headTeacher = headTeacher;
    }

    public int getClassRoomNumber() {
        return classRoomNumber;
    }

    public List<Pupil> getPupils() {
        return pupils;
    }

    public HeadTeacher getHeadTeacher() {
        return headTeacher;
    }

    public void setHeadTeacher(HeadTeacher headTeacher) {
        this.headTeacher = headTeacher;
    }
}
