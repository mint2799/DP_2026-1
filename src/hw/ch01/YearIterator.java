package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class YearIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public YearIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = bookShelf.getLength() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Book next(){
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        return bookShelf.getBookAt(index--);
    }
}
