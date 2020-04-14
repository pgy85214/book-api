package sang.pojo;

public class Thisvip {
    private int id;
    private String whether;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWhether() {
        return whether;
    }

    public void setWhether(String whether) {
        this.whether = whether;
    }

    @Override
    public String toString() {
        return "Thisvip{" +
                "id=" + id +
                ", whether='" + whether + '\'' +
                '}';
    }
}
