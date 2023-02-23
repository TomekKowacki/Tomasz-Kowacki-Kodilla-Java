package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Henryk Sienkiewicz", "Potop", 2008, "1");
        Book book2 = new Book("Henryk Sienkiewicz", "Ogniem i mieczem", 2003, "2");
        Book book3 = new Book("Henryk Sienkiewicz", "Pan Wołodyjowski", 2000, "3");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationYearMedia = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2003, publicationYearMedia, 0);
    }
}
