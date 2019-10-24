package model;

import javax.persistence.*;

@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    public Blog() {
    }

    public Blog(String title, String content) {

        this.title = title;
        this.content = content;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Blog{"+ ", title:'" + title + '\'' +
                ", content:'" + content + '\'' +
                '}';
    }
}
