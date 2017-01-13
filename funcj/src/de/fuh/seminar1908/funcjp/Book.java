package de.fuh.seminar1908.funcjp;

import java.time.Year;
import java.util.List;

public class Book {
    private final String title;
    private final List<String> authors;

    private final Year year;
    private final int pages;

    public Book(String title, List<String> authors, Year year, int pages) {
        this.title = title;
        this.authors = authors;
        this.year = year;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((authors == null) ? 0 : authors.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((year == null) ? 0 : year.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (authors == null) {
            if (other.authors != null)
                return false;
        } else if (!authors.equals(other.authors))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (year == null) {
            if (other.year != null)
                return false;
        } else if (!year.equals(other.year))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", authors=" + authors + ", pages=" + pages
                + ", year=" + year + "]";
    }

    public Year getYear() {
        return year;
    }
}
