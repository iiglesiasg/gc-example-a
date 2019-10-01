package example.micronaut.controller;

import example.micronaut.model.Color;
import example.micronaut.service.ColorsImpl;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.reactivex.Flowable;

@Controller("/colors")
public class ColorsController {

    private final ColorsImpl servicio;

    public ColorsController(ColorsImpl servicio) {
        this.servicio = servicio;
    }

    @Get("/")
    @Produces(MediaType.APPLICATION_JSON_STREAM)
    public Flowable<Color> getColors(){
        return servicio.getColors();
    }
}
