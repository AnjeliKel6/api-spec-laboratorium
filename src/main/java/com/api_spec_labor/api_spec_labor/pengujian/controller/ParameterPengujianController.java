package com.api_spec_labor.api_spec_labor.pengujian.controller;

import com.api_spec_labor.api_spec_labor.pengujian.model.ParameterPengujian;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/parameter-uji")
@CrossOrigin

public class ParameterPengujianController {
    private Map<Long, ParameterPengujian> dataParameterUji = new HashMap<>();
    private Long counter = 1L;

    @GetMapping("/")
    public ResponseEntity<List<ParameterPengujian>> getAllParameterUji() {
        return ResponseEntity.ok(new ArrayList<>(dataParameterUji.values()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParameterPengujian> getParameterUjiById(@PathVariable Long id) {
        ParameterPengujian parameter = dataParameterUji.get(id);
        if (parameter != null) {
            return ResponseEntity.ok(parameter);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<ParameterPengujian> addParameterUji(@RequestBody ParameterPengujian parameter) {
        parameter.setId(counter++);
        dataParameterUji.put(parameter.getId(), parameter);
        return ResponseEntity.ok(parameter);
    }



}
