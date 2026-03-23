package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20230776 이름: 김성희");
        System.out.println();

        BookShelf bookShelf = new BookShelf(10);

        bookShelf.appendBook(new Book("클린코드", "기술", 2008, 30000));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000));
        bookShelf.appendBook(new Book("사피엔스", "역사", 2011, 18000));
        bookShelf.appendBook(new Book("이펙티브 자바", "기술", 2018, 36000));
        bookShelf.appendBook(new Book("객체지향의 사실과 오해", "기술", 2015, 20000));
        bookShelf.appendBook(new Book("레미제라블", "소설", 1862, 12000));
        bookShelf.appendBook(new Book("총균쇠", "역사", 1997, 22000));
        bookShelf.appendBook(new Book("리팩터링", "기술", 2018, 34000));
        bookShelf.appendBook(new Book("로마인 이야기", "역사", 1992, 25000));
        bookShelf.appendBook(new Book("어린왕자", "소설", 1943, 9000));

        // 명시적으로 Iterator를 사용하는 방법 
        Iterator<Book> it1 = bookShelf.iteratorByGenre("소설");
        System.out.println("=== 장르 필터: 소설 ===");
        while (it1.hasNext()) {
            Book book = it1.next();
        
            System.out.printf("%-20s %-4s %-6d %.0f원%n",
                    book.getName(), 
                    book.getGenre(), 
                    book.getYear(), 
                    book.getPrice());
        }
        System.out.println();

        Iterator<Book> it2 = bookShelf.iteratorByYear("소설");
        System.out.println("=== 출판연도 역순 전체 목록 ===");
        while (it2.hasNext()) {
            Book book = it2.next();

            System.out.printf("%-20s %-4s %-6d %.0f원%n",
                    book.getName(), 
                    book.getGenre(), 
                    book.getYear(), 
                    book.getPrice());
        }
    }
}
