package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){

        //Given
        Library library = new Library("Library 1");

        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks()
                        .add(new Book("Title" + n,"Author" + n,
                                LocalDate.of(2000 + n, 01, 15))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().clear();

        //Then
        System.out.println(library.getName());
        System.out.println(library.getBooks());

        System.out.println(clonedLibrary.getName());
        System.out.println(clonedLibrary.getBooks());

        System.out.println(deepClonedLibrary.getName());
        System.out.println(deepClonedLibrary.getBooks());

        assertEquals(0, library.getBooks().size());
        assertEquals(0, clonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}
