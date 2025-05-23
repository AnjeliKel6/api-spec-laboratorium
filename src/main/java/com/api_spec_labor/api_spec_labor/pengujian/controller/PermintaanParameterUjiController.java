package com.api_spec_labor.api_spec_labor.pengujian.controller;

import com.api_spec_labor.api_spec_labor.pengujian.model.PermintaanParameterUji;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/parameter-uji")
@CrossOrigin

public class PermintaanParameterUjiController {
    private Map<Long, PermintaanParameterUji> dataParameterUji = new HashMap<>();
    private Long counter = 1L;

    @GetMapping("/")
    public ResponseEntity<List<PermintaanParameterUji>> getAllParameterUji() {
        return ResponseEntity.ok(new ArrayList<>(dataParameterUji.values()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PermintaanParameterUji> getParameterUjiById(@PathVariable Long id) {
        PermintaanParameterUji parameter = dataParameterUji.get(id);
        if (parameter != null) {
            return ResponseEntity.ok(parameter);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<PermintaanParameterUji> addParameterUji(@RequestBody PermintaanParameterUji parameter) {
        parameter.setId(counter++);
        dataParameterUji.put(parameter.getId(), parameter);
        return ResponseEntity.ok(parameter);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PermintaanParameterUji> updateParameterUji(@PathVariable Long id, @RequestBody PermintaanParameterUji parameter) {
        if (!dataParameterUji.containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        parameter.setId(id);
        dataParameterUji.put(id, parameter);
        return ResponseEntity.ok(parameter);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParameterUji(@PathVariable Long id) {
        if (!dataParameterUji.containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        dataParameterUji.remove(id);
        return ResponseEntity.noContent().build();
    }

}
