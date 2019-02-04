public class Printer {

    private int sheetsOfPaperLeft;

//    CONSTRUCTOR

    public Printer(int sheetsOfPaperLeft){
        this.sheetsOfPaperLeft = sheetsOfPaperLeft;
    }

    public int getNumberOfSheetsOfPaper(){
        return this.sheetsOfPaperLeft;
    }

    public int print(int pages, int copies){
        if (this.sheetsOfPaperLeft >= pages * copies) {
            this.sheetsOfPaperLeft -= pages * copies;
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

//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.