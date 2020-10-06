package services;

import api.model.TokenCreated;
import com.crowdar.api.rest.Response;
import com.crowdar.api.rest.MethodsService;

public class CreateTokenService extends MethodsService {

    public static Response post(String jsonName) {
        return post(jsonName, TokenCreated.class);
    }
}
