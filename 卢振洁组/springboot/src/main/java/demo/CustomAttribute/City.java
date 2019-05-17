package demo.CustomAttribute;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "city")
public class City {
    private String name;
    private String id;

    public String getLatitude() {
        return id;
    }
    public Object getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }
    public void setId(String id){this.id=id;}
}
