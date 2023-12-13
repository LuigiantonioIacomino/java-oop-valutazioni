package org.lessons.java.valutazioni;

import java.util.ArrayList;

public class Corso {
    ArrayList<Studente> listStudent;

    public Corso(ArrayList<Studente> listStudent) {
        this.listStudent = listStudent;
    }

    public void printStudent(ArrayList<Studente> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).toString();

        }
    }

}
