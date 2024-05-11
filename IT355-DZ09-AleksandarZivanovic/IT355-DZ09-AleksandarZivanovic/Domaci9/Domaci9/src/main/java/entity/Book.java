package entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
public class Book {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "book_id")
    private int bookId;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "isbn13")
    private String isbn13;
    @Basic
    @Column(name = "language_id")
    private Integer languageId;
    @Basic
    @Column(name = "num_pages")
    private Integer numPages;
    @Basic
    @Column(name = "publication_date")
    private Date publicationDate;
    @Basic
    @Column(name = "publisher_id")
    private Integer publisherId;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId && Objects.equals(title, book.title) && Objects.equals(isbn13, book.isbn13) && Objects.equals(languageId, book.languageId) && Objects.equals(numPages, book.numPages) && Objects.equals(publicationDate, book.publicationDate) && Objects.equals(publisherId, book.publisherId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, isbn13, languageId, numPages, publicationDate, publisherId);
    }
}
