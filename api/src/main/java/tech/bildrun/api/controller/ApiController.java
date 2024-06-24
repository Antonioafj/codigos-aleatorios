package tech.bildrun.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/tesks")
public class ApiController {

    private List<String> tesks = new ArrayList<>();

    private ObjectMapper objectMapper;

    public ApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GetMapping
    public ResponseEntity<String> listTesks() throws JsonProcessingException {
        return ResponseEntity.ok(objectMapper.writeValueAsString(tesks));
    }

    @PostMapping
    public ResponseEntity<Void> creatTask(@RequestBody String tesk){
        tesks.add(tesk);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> clearTesks(){
        tesks = new ArrayList<>();
        return ResponseEntity.ok().build();
    }
}
