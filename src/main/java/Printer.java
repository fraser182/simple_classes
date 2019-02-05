public class Printer {

    private int initialNumberOfSheets;
    private int sheetsOfPaperLeft;
    private int tonerVolume;

//    CONSTRUCTOR

    public Printer(int sheetsOfPaperLeft, int tonerVolume){
        this.sheetsOfPaperLeft = sheetsOfPaperLeft;
        this.initialNumberOfSheets = sheetsOfPaperLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getNumberOfSheetsOfPaper(){
        return this.sheetsOfPaperLeft;
    }

    public void print(int pages, int copies){
        if (canPrint(pages, copies)){ // if the result of canPrint is true, do the following (!canPrint means if false
            this.sheetsOfPaperLeft -= pages * copies;
            this.tonerVolume -= pages * copies;
        }
    }

    public boolean canPrint(int pages, int copies){
        int totalSheets = pages * copies;
        if (this.sheetsOfPaperLeft >= totalSheets && this.tonerVolume >= totalSheets){
            return true;
        }
        return false;
    }

    public void refill() {
    this.sheetsOfPaperLeft = initialNumberOfSheets;

    }


//    public void getToner() {
//    this.tonerVolume =
//    }
}
