package Minitest.Bai2.model;

public class ClassRoom {
    private int id ;
    private static int INDEX = 1;
    private String name ;

    public ClassRoom() {
    }

    public ClassRoom(String name) {
        this.id = INDEX++;
        this.name = name;
    }


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

    @Override
    public String toString() {
        return id + name;
    }
}
