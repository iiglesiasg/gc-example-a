package colors.model;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Color {
    String color;
    String description;

    public Color(String color, String description) {
        this.color = color;
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
