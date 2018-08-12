package mvc.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

    @Id
    private int id;

    private int weight;

    private String name;

    @Column(length = 1000)
    private String description;

    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = trimHexValues(description);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    
    private String trimHexValues(String hexedString) {
        StringBuilder trimmedString = new StringBuilder();
        for(int i = 0; i < hexedString.length(); i++) {
            if(hexedString.charAt(i) == '^') {
                i += 6;
            }
            else if(hexedString.charAt(i) == '_')
                continue;
            else
                trimmedString.append(hexedString.charAt(i));
        }
        return trimmedString.toString();
    }
}
