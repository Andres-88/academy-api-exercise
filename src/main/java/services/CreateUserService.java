package services;

import api.model.UserCreated;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;


public class CreateUserService extends MethodsService {

    public static final ThreadLocal<String> TOKEN = new ThreadLocal<String>();

    public static Response get(String jsonName) {
        Map<String,String> parametros = new HashMap<String,String>();
        parametros.put("token", TOKEN.get());

        return get(jsonName, UserCreated.class, parametros);
    }
}
