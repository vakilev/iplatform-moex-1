package space.eliseev.iplatformmoex.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import space.eliseev.iplatformmoex.model.entity.Engine;
import space.eliseev.iplatformmoex.model.entity.Engine;
import space.eliseev.iplatformmoex.util.EngineClient;

import java.util.List;

@RestController
public class EngineController {

    private final EngineClient engineClient:

    public EngineController(EngineClient engineClient) {
        this.engineClient = engineClient;
    }

    @GetMapping("/engines")
    public ResponseEntity<List<Engine>> getEngines(@RequestParam(defaultValue = "en") String lang) {
        return ResponseEntity.ok().body(engineClient.getEngines(lang));
    }
}
