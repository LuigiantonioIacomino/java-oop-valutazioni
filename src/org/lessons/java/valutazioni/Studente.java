package org.lessons.java.valutazioni;

public class Studente {
    private int id;
    private int percentAbsence;
    private double averageVote;

    public Studente(int id, int percentAbsence, double averageVote) {
        this.id = id;
        this.percentAbsence = percentAbsence;
        this.averageVote = averageVote;
    }

    public String promotedOrFailed() {
        if (percentAbsence > 50) {
            return "failed";
        }

        if (percentAbsence > 25 && percentAbsence < 50) {
            if (averageVote < 2) {
                return "failed";
            } else if (averageVote > 2) {
                return "promoted";
            }
        }
        if(percentAbsence<25) {
            if(averageVote<2) {
                return "failed";
            }
            else if(averageVote>=2) {
                return "promoted";
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "id=" + id +
                ", percentAbsence=" + percentAbsence +
                ", averageVote=" + averageVote +
                '}';
    }
}

