package colors.service;

import colors.model.Color;
import io.reactivex.Flowable;

import javax.inject.Singleton;

@Singleton
public class ColorsImpl {

    public Flowable<Color> getColors() {
        return Flowable.just(new Color("Green", "Grass is green"),
                new Color("Blue", "Blue is the ocean"));
    }
}

