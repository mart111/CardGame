package Class;

import java.util.Iterator;
import java.util.List;

public class Director<T extends Classroom> {

    private List<T> tList;

    public Director(List<T> tList) {
        this.tList = tList;
    }

    public void show() {
        List<Pupil> pupil;
        Iterator<T> it = tList.iterator();
        for (T e : tList
                ) {
            System.out.print("Classroom- " + e.getClassRoomNumber() + " " + "HeadTeacher- " + e.getHeadTeacher().getSurnameHT() + " " + " |" + " ");
            while (it.hasNext()) {
                pupil = it.next().getPupils();
                for (Pupil x : pupil
                        ) {
                    System.out.print(x.getNameP() + " " + x.getSurnameP() + " " + x.getGenderP() + " " + x.getGrade() + " ");
                }
                break;
            }
            System.out.println();
        }

    }

    public void removeGraduated() {
        Iterator<T> it = tList.iterator();
        while (it.hasNext()) {
            if (it.next().getClassRoomNumber() == 12) {
                it.remove();
            }
        }
    }

    public void removeBadStudents() {
        List<Pupil> pupils;
        Iterator<T> it = tList.iterator();
        Iterator<Pupil> it1;
        while (it.hasNext()) {
            pupils = it.next().getPupils();
            it1 = pupils.iterator();
            while (it1.hasNext()) {
                if (it1.next().studyStatus() == "Bad Class.Pupil")
                    it1.remove();
            }
        }
    }

    public void changeHeadTeacher(HeadTeacher headTeacher, int k) {
        Iterator<T> it = tList.iterator();
        int p = 0;
        while (it.hasNext()) {
            if (p == k) {
                it.next().setHeadTeacher(headTeacher);
                break;
            } else {
                it.next();
                p++;
            }
        }
    }

    public void addNewClassroom(int classN, List<Pupil> list, HeadTeacher headTeacher) {
        tList.add((T) new Classroom(classN, list, headTeacher));
    }

    /* Class.Director MAIN function/*
      String[] names = {"Martin", "Arman", "Petros"};
        String[] surnames = {"Knyazyan", "Grigoryan", "Kirakosyan"};
        String[] genders = {"Male", "Male", "Male"};
        int[] grades = {30, 30, 9};
        List<Classroom> classrooms = new ArrayList<>();
        Director<Classroom> director = new Director(classrooms);
        List<Pupil> pupils = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            pupils.add(new Pupil(names[i], surnames[i], genders[i], grades[i]));
        }


        classrooms.add(new Classroom(11, pupils, new HeadTeacher("Nona", "Maxaqyan", "Female")));
        classrooms.add(new Classroom(10, pupils, new HeadTeacher("Hranush", "Grigoryan", "Female")));
        classrooms.add(new Classroom(12, pupils, new HeadTeacher("Qristine", "Epremyan", "Female")));
//        director.removeBadStudents();
//        director.removeGraduated();
//        director.changeHeadTeacher(new HeadTeacher("Yervand", "Aleqsanyan", "Male"), 1);
//              director.addNewClassroom(12, pupils, new HeadTeacher("Gayane", "Khachatryan", "Female"));
        director.show();
     */

}