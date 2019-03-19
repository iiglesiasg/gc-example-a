package everis.conocimiento.controller;

import everis.conocimiento.model.SaludosTerricolas;
import everis.conocimiento.service.serviceImpl.ColorsImpl;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.reactivex.Single;

@Controller("/grupo-paas")
public class ColorsController {

    private final ColorsImpl service;

    public ColorsController(ColorsImpl service) {
        this.service = service;
    }

    @Get("/")
    @Produces(MediaType.APPLICATION_JSON_STREAM)
    public Single<SaludosTerricolas> getColors(){
        return service.getColors();
    }
}
