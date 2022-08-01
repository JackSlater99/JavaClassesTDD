public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper() {
        return paper;
    }

    public int getToner() {
        return toner;
    }

    public void print(int pages, int copies) {
        int totalPaperToPrint = pages * copies;
        if (totalPaperToPrint < this.paper && totalPaperToPrint < this.toner) {
            this.paper -= totalPaperToPrint;
            this.toner -= totalPaperToPrint;
        }
    }
}
