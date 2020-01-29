package inditex.poc;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.reactivex.Flowable;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Controller("/colors")
@Slf4j
public class ColorsController {
    ColorsService service;

    @Get("/")
    @Produces(MediaType.APPLICATION_JSON_STREAM)
    public Flowable<Color> getColors(){
        log.info("Paso por aca");
        return service.getColors();
    }
}
