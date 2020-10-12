package colors.service;

import colors.model.Color;
import io.reactivex.Flowable;
import lombok.extern.slf4j.Slf4j;


import javax.inject.Singleton;

@Slf4j
@Singleton
public class ColorsImpl {

    public Flowable<Color> getColors() {
        log.info("Saludos Terricolas");
        return Flowable.just(new Color("Green", "Grass is green"),
                new Color("Blue", "Blue is the ocean"));
    }
}

