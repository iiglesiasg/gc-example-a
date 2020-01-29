package inditex.poc;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Introspected
public class Color {
    String color;
    String description;
}