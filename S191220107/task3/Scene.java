package S191220107.task3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scene {

    public static void main(String[] args) throws IOException {

        Matrix matrix = new Matrix(256, 16, 16);

        // put Youkais into line
        for (Youkai yk : Youkai.values())
            matrix.put(yk);

        Geezer theGeezer = Geezer.getTheGeezer();

        //Sorter sorter = new HeapSorter();
        Sorter sorter = new QuickSorter();

        theGeezer.setSorter(sorter);

        String log = theGeezer.lineUp(matrix);

        // System.out.println("Geezer finished his task.");

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }

}
