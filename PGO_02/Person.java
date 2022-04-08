package PGO_02;

// import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

public class Person {
  private String name;
  private String surname;
  private LocalDate dateOfBirth;
  private Adress adress;
  // private int age;
  // ---------------------------------------------
  public LocalDate current_date = LocalDate.now();
  public int currentYear = current_date.getYear();

  // constuctor
  public Person(String name, String surname, LocalDate dateOfBirth, Adress adress) {
    setName(name);
    setSurname(surname);
    setDateOfBirth(dateOfBirth);
    setAdres(adress);
  }

  // setters and getters
  public String getName() {
    return name;
  }

  public void setName(String n) {
    if (n == null || n.isEmpty()) {
      throw new ValidationException("Name musn't be empty");
    }
    this.name = n;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String sur) {
    if (sur == null || sur.isEmpty()) {
      throw new ValidationException("Surname musn't be empty");
    }
    this.surname = sur;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    if (dateOfBirth.equals(null)) {
      throw new ValidationException("Date of birth musn't be empty");
    } else {
      this.dateOfBirth = dateOfBirth;
    }
  }

  public int getPersonAge() {
    return Period.between(dateOfBirth, LocalDate.now()).getYears();
  }

  public String getAdress() {
    return adress.getCountry() + " " + adress.getCity() + " " + adress.getStreet() + " " + adress.getHouse() + " "
        + adress.getFlat();
  }

  public void setAdres(Adress adres) {
    if (adres == null) {
      throw new ValidationException("adress musn't be empty");
    }
    this.adress = adres;
  }

  // methods
  public Book PublishBook(String name, Genre genre, Lang lang, LocalDate pubDate) {
    // ArrayList<Person> authors = new ArrayList<Person>();
    // authors.add(this);
    Book b = new Book(name, genre, lang, authors);
    b.setPublishDate(pubDate);
    return b;
  }

}
