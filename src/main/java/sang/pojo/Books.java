package sang.pojo;

public class Books {
    private int id;
    private String name;
    private String image;
    private int categoryId;
    private int readNumber;
    private int thisvipid;
    private String isyn;
    private String categoryname;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getThisvipid() {
        return thisvipid;
    }

    public void setThisvipid(int thisvipid) {
        this.thisvipid = thisvipid;
        if(this.thisvipid==0){
            this.isyn="免费读";
        }else{
            this.isyn="VIP年卡";
        }
    }

    public String getIsyn() {
        return isyn;
    }

    public void setIsyn(String isyn) {
        this.isyn = isyn;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public int getReadNumber() {
        return readNumber;
    }

    public void setReadNumber(int readNumber) {
        this.readNumber = readNumber;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", categoryId=" + categoryId +
                ", readNumber=" + readNumber +
                ", thisvipid=" + thisvipid +
                ", isyn='" + isyn + '\'' +
                ", categoryname='" + categoryname + '\'' +
                '}';
    }
}
