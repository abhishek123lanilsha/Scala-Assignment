object bookCost extends App{
    def booksFullAmount(bCount:Integer):Double=bCount*24.95;
    def discount(price:Double):Double=price*0.4;
    def shipping(bCount:Integer):Double={
        var shipping:Double=0;
        if(bCount>50)
        {
            shipping=3*50+(bCount-50)*0.75;
        }
        else
        {
            shipping=3*bCount;
        }
        shipping;
    }

    printf("%.2f",booksFullAmount(60)-discount(booksFullAmount(60))+shipping(60));
}