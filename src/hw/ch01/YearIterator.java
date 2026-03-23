package hw.ch01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class YearIterator implements Iterator<Book> {
    private Book[] sortedBooks;
    private int index;
    private String genre;

    public YearIterator(BookShelf bookShelf, String genre){
        this.genre = genre;
        int length = bookShelf.getLength();
        
        long count = 0;
        for (int i = 0; i < length; i++){
            if (genre == null || genre.equals(bookShelf.getBookAt(i).getGenre()))
                count++;
        }

        sortedBooks = new Book[(int) count];
        int j = 0;
        for (int i = 0; i < length; i++){
            Book b = bookShelf.getBookAt(i);
            if (genre == null || genre.equals(b.getGenre())){
                sortedBooks[j++] = b;
            }
        }

        Arrays.sort(sortedBooks, (a, b) -> b.getYear() - a.getYear());
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < sortedBooks.length;
    }

    @Override
    public Book next(){
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        return sortedBooks[index++];
    }
}