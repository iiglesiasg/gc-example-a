package everis.conocimiento.service.serviceImpl;

import everis.conocimiento.model.Color;
import io.reactivex.Flowable;

import javax.inject.Singleton;


@Singleton
public class ColorsImpl {

    public Flowable<Color> getColors() {
        return Flowable.just(new Color("Orange","Orange is the new black"),
                             new Color("Purple","Purple rain, purple rain"));
    }
}
