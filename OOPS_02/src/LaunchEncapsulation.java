class Book{
   private int pageNum;
   private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    void display(){
        System.out.println("Page number is  : " + pageNum);
    }
}


public class LaunchEncapsulation {
    public static void main(String[] args) {

        Book book = new Book();
        book.setPageNum(65);
        book.display();

    }
}
