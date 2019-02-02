package everis.conocimiento.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
public class Color{
    private String color;
    private String description;

    public Color(String color, String description) {
        this.color = color;
        this.description = description;
    }
}
