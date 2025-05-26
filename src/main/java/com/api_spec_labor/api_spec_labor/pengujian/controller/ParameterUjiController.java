package com.api_spec_labor.api_spec_labor.pengujian.controller;

import com.api_spec_labor.api_spec_labor.pengujian.model.ParameterUji;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/parameter-uji")
@CrossOrigin

public class ParameterUjiController {
    private Map<Long, ParameterUji> dataParameterUji = new HashMap<>();
    private Long counter = 1L;

    @GetMapping("/")
    public ResponseEntity<List<ParameterUji>> getAllParameterUji() {
        return ResponseEntity.ok(new ArrayList<>(dataParameterUji.values()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParameterUji> getParameterUjiById(@PathVariable Long id) {
        ParameterUji parameter = dataParameterUji.get(id);
        if (parameter != null) {
            return ResponseEntity.ok(parameter);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<ParameterUji> addParameterUji(@RequestBody ParameterUji parameter) {
        parameter.setId(counter++);
        dataParameterUji.put(parameter.getId(), parameter);
        return ResponseEntity.ok(parameter);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ParameterUji> updateParameterUji(@PathVariable Long id, @RequestBody ParameterUji parameter) {
        if (!dataParameterUji.containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        parameter.setId(id);
        dataParameterUji.put(id, parameter);
        return ResponseEntity.ok(parameter);
    }


}
