package everis.conocimiento.service.serviceImpl;

import everis.conocimiento.model.SaludosTerricolas;
import io.reactivex.Single;

import javax.inject.Singleton;


@Singleton
public class ColorsImpl {

    public Single<SaludosTerricolas> getColors() {
        return Single.just(new SaludosTerricolas("Mensaje recibido desde un Android"));
    }
}
