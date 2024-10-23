package co.edu.uco.ubico.infrastructure.message;
import co.edu.uco.ubico.crosscutting.message.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisMessageProvider implements MessageProvider {

    private final StringRedisTemplate redisTemplate;

    @Autowired
    public RedisMessageProvider(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public String getMessage(String key) {
        try {
            String message = redisTemplate.opsForValue().get(key);
            if (message == null) {
                return "El mensaje con la clave \"" + key + "\" no fue encontrado.";
            }
            return message;
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al obtener el mensaje desde Redis: " + e.getMessage();
        }
    }
}
