package W02.S191220107.task3;

public class Matrix extends Line {

    private int row;
    private int col;

    public Matrix(int size, int row, int col) {
        super(size);
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        String matrixString = "";
        int count = 0;
        for (Position p : super.positions) {
            ++count;
            matrixString += p.linable.toString()+" ";
            if (count == col) {
                count = 0;
                matrixString += "\n\n";
            }
        }
        return matrixString;
    }
}
