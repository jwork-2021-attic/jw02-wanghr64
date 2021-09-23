package W02.S191220107.task3;

import java.util.Random;

public class Line {

    public Line(int length) {
        this.positions = new Position[length];
    }

    protected Position[] positions;

    public void put(Linable linable) {
        Random generator = new Random();
        int rand_pos = 0;
        while (this.positions[rand_pos] != null)
            rand_pos = generator.nextInt(256);
        this.positions[rand_pos] = new Position(null);
        this.positions[rand_pos].setLinable(linable);

        //System.out.println("put " + linable + " into pos of " + rand_pos);
    }

    public Linable get(int i) {
        if ((i < 0) || (i > positions.length)) {
            return null;
        } else {
            return positions[i].linable;
        }
    }

    class Position {

        protected Linable linable;

        Position(Linable linable) {
            this.linable = linable;
        }

        public void setLinable(Linable linable) {
            this.linable = linable;
            linable.setPosition(this);
        }

    }

    @Override
    public String toString() {
        String lineString = "\t";
        for (Position p : positions) {
            lineString += p.linable.toString();
        }
        return lineString;
    }

    public Linable[] toArray() {
        Linable[] linables = new Linable[this.positions.length];

        for (int i = 0; i < linables.length; i++) {
            linables[i] = positions[i].linable;
        }

        return linables;

    }

}
