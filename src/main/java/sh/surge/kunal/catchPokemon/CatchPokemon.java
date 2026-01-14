package sh.surge.kunal.catchPokemon;

import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/goPokeball")
public class CatchPokemon {
    Faker faker = new Faker();

    @GetMapping
    public Map<String, String> captured() {
        Map<String, String> response = new HashMap<>();
        response.put("pokemon", faker.pokemon().name());
        response.put("location", faker.pokemon().location());
        response.put("status", "Captured!");

        return response;
    }
}
