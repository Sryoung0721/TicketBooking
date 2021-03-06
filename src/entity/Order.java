package entity;

public class Order {
    private int id;
    private String username;
    private String num;
    private String createTime;

    public Order(String username, String num, String createTime) {
        this.username = username;
        this.num = num;
        this.createTime = createTime;
    }

    public Order(int id,String username, String num, String createTime) {
        this.id=id;
        this.username = username;
        this.num = num;
        this.createTime = createTime;
    }
    public Order(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    public int getId() { return id; }

    public void setId(int id) { this.id = id; }
}
