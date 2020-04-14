package sang.pojo;

public class Category {
    private int id;
    private String name;
    private int thisvipId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThisvipId() {
        return thisvipId;
    }

    public void setThisvipId(int thisvipId) {
        this.thisvipId = thisvipId;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", thisvipId=" + thisvipId +
                '}';
    }
}
