import java.io.Serializable;

public class Cat implements Serializable {
    private Long id;
    private String eyes;
    private String mustache;
    private String colour;
    private int age;

    public Cat() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getMustache() {
        return mustache;
    }

    public void setMustache(String mustache) {
        this.mustache = mustache;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
