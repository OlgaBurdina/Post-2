import java.awt.*;
import java.util.Date;

public class Post {
    private String id;
    private String id_group;
    private String name;
    private Date date;
    private String text;
    private Image image;

    public Post () {

    }

    public Post(String id, String id_group, String name, Date date, String text, Image image) {
        this.id = id;
        this.id_group = id_group;
        this.name = name;
        this.date = date;
        this.text = text;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public Image getImage() {
        return image;
    }

    public String getId_group() {
        return id_group;
    }

    public String getText() {
        return text;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId_group(String id_group) {
        this.id_group = id_group;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void AddComment () {
        System.out.println("Комментировать");
    }
    public void AddLike () {
        System.out.println("Поставьте лайк");
    }
    public void Repost () {
        System.out.println("Сделать репост");
    }
}
