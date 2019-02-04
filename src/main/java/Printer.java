public class Printer {

    private int sheetsOfPaperLeft;
    private int tonerVolume;

//    CONSTRUCTOR

    public Printer(int sheetsOfPaperLeft){
        this.sheetsOfPaperLeft = sheetsOfPaperLeft;
        this.tonerVolume = 800;
    }

    public int getNumberOfSheetsOfPaper(){
        return this.sheetsOfPaperLeft;
    }

    public int print(int pages, int copies){
        if ((this.sheetsOfPaperLeft >= pages * copies) && (this.sheetsOfPaperLeft <= this.tonerVolume) ) {
            this.sheetsOfPaperLeft -= pages * copies;
            this.tonerVolume -= pages * copies;
        }
        return this.sheetsOfPaperLeft;
    }



    public int refill(){
        if (this.sheetsOfPaperLeft < 500){
        this.sheetsOfPaperLeft = 500;
        }
        return this.sheetsOfPaperLeft;
    }
}

