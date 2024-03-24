package practice_list;

import java.util.ArrayList;

public class useArrayList {
    public static void main(String[] args) {
        //객체 배열
//        Book[] books = new Book[5];
//        int count = 0;

        //ArrayList를 이용한 방법
        ArrayList<Book> books = new ArrayList<Book>();

        //객체생성
//        books[count++] = new Book("나루토", 4500);
          books.add(new Book("나루토", 4500));
//        books[count++] = new Book("원피스", 4500);
          books.add(new Book("원피스", 4500));
//        books[count++] = new Book("블리치", 4500);
          books.add(new Book("블리치", 4500));

        //객체 출력
//        for (int i = 0; i < count; i++) {
//            System.out.println(books[i].toString());
        for (Book b : books) {
            System.out.println(b.toString());
        }
//        }
    }
}
class Book {
    //필드
    private String title;
    private int price;

    //생성자
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String toString() {
        return String.format("%s(%d원)", this.title, this.price);
    }
}
