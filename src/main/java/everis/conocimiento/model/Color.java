package everis.conocimiento.model;
import com.fasterxml.jackson.databind.JsonSerializable;
import io.micronaut.core.serialize.ObjectSerializer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

public class Color {
    String color;
    String description;

    public Color(String color, String description) {
        this.color = color;
        this.description = description;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }
}
