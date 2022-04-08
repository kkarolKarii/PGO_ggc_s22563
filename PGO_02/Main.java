package PGO_02;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Book book1 = new Book(1L, "Pan tadeusz", Genre.Adventure, Lang.English, LocalDate.of(1990, 10, 1), 1);
    Book book2 = new Book(2L, "Pan tadeusz", Genre.Adventure, Lang.English, LocalDate.of(1890, 11, 10), 1);
    Person person1 = new Person("Tom", "Smith", LocalDate.of(2000, 8, 6),
        new Adress("Poland", "warsaw", "Marszalkowska", 11, 20));
    Person person2 = new Person("Jan", "Smith", LocalDate.of(2000, 8, 6),
        new Adress("Poland", "warsaw", "Marszalkowska", 11, 20));

    System.out.println(person1.getPersonAge());
    System.out.println(book1.getBookAge());
    System.out.println(person1.getAdress());
    book1.BorrowBook(person1);
    book1.BorrowBook(person2);
    // System.out.println(book1.getwhoBorrowed()); TO DO
  }
}

// to do walidacja daty i ID