package entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "book_language", schema = "gravity_books", catalog = "")
public class BookLanguage {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "language_id")
    private int languageId;
    @Basic
    @Column(name = "language_code")
    private String languageCode;
    @Basic
    @Column(name = "language_name")
    private String languageName;

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookLanguage that = (BookLanguage) o;
        return languageId == that.languageId && Objects.equals(languageCode, that.languageCode) && Objects.equals(languageName, that.languageName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(languageId, languageCode, languageName);
    }
}
