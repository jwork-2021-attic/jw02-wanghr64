package W02.S191220107.task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scene {

    public static void main(String[] args) throws IOException {

        Line line = new Line(256);

        // put Youkais into line
        for (Youkai yk : Youkai.values())
            line.put(yk);

        Geezer theGeezer = Geezer.getTheGeezer();

        //Sorter sorter = new HeapSorter();
        Sorter sorter = new QuickSorter();

        theGeezer.setSorter(sorter);

        String log = theGeezer.lineUp(line);

        // System.out.println("Geezer finished his task.");

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }

}
