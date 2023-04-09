class Library{
    private int code;
    private String title;
    private double price;
    Library(int code, String title, double price){
        this.code = code;
        this.title = title;
        this.price = price;
    }
    void Display(){
        System.out.print("Code: " + code + "\tTitle: " + title + "\t\tPrice: " + price);
    }
}

class Book extends Library{
    int semester;
    String technology;
    Book(int code, String title, double price, int semester, String technology){
        super(code, title, price);
        this.semester = semester;
        this.technology = technology;
    }
    void Display(){
        super.Display();
    System.out.print("\tSemester: " + semester + "\tTechnology: " + technology);
    }
}

class Journal extends Library{
    int publishingDate;
    Journal(int code, String title, double price, int publishingDate){
        super(code,title,price);
        this.publishingDate = publishingDate;
    }
    void Display(){
        super.Display();
        System.out.print("\tPublishingDate: " + publishingDate);
    }
}

class SoftCopy extends Book{
    String webaddress;
    SoftCopy(int code, String title, double price, int semester, String technology, String webaddress){
        super(code,title,price,semester,technology);
        this.webaddress = webaddress;
    }	
    void Display(){
        super.Display();
        System.out.print("\tWeb Address: " + webaddress);
    }
}

class Demo{
    public static void main(String args[]){
        Library l = new Library(42, "Magic Factory", 300);
        Book b = new Book(45, "D. Charlie", 400, 3, "Computer Engineering");
        Journal j = new Journal(46, "Peter Pan's Story", 1000, 2019);
        SoftCopy s = new SoftCopy(50, "OOP", 1400, 3, "Computer Science", "https://www.oopfornew.com");
        l.Display();
        System.out.println();
        b.Display();
        System.out.println();
        j.Display();
        System.out.println();
        s.Display();
    }
}
