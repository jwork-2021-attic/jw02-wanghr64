package S191220107.task2;

public class Geezer {

    private static Geezer theGeezer;

    public static Geezer getTheGeezer() {
        if (theGeezer == null) {
            theGeezer = new Geezer();
        }
        return theGeezer;
    }

    private Geezer() {

    }

    private Sorter sorter;

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public String lineUp(Line line) {

        String log = new String();

        if (sorter == null) {
            return null;
        }

        Linable[] linables = line.toArray();
        int[] ranks = new int[linables.length];

        for (int i = 0; i < linables.length; i++) {
            ranks[i] = linables[i].getValue();
        }

        // for debug
        //System.out.println("Ready to sort.");

        sorter.load(ranks);
        sorter.sort();

        // for debug
        //System.out.println("finished sorting.");

        String[] sortSteps = this.parsePlan(sorter.getPlan());

        //System.out.println("finished parsing plan.");

        /*
         * for (String step : sortSteps) { System.out.println(step); }
         */
        int count = 0;
        for (String step : sortSteps) {
            this.execute(step);
            // System.out.println("execute seems to be fine.");
            log += line.toString();
            // System.out.println("toString() of line seems to be fine.");
            log += "\n[frame]\n";
            //System.out.println("handling line " + count);
            count++;
        }

        return log;

    }

    private String[] parsePlan(String plan) {
        return plan.split("\n");
    }

    private void execute(String step) {
        String[] couple = step.split("<->");
        Youkai.getYoukaiByRank(Integer.parseInt(couple[0]))
                .swapPosition(Youkai.getYoukaiByRank(Integer.parseInt(couple[1])));
    }

}
