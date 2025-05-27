package com.api_spec_labor.api_spec_labor.UjiProfisiensi.controller;

import com.api_spec_labor.api_spec_labor.UjiProfisiensi.model.ParameterUjiProfisiensi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/parameter-uji-profisiensi")
@CrossOrigin
public class ParameterUjiProfisiensiController {

    private Map<Long, ParameterUjiProfisiensi> parameterUjiData = new HashMap<>();
    private Long counter = 1L;

    // GET all parameter uji
    @GetMapping("/")
    public ResponseEntity<List<ParameterUjiProfisiensi>> getAllParameterUji() {
        return ResponseEntity.ok(new ArrayList<>(parameterUjiData.values()));
    }

    // GET by ID
    @GetMapping("/{id}")
    public ResponseEntity<ParameterUjiProfisiensi> getParameterUjiById(@PathVariable Long id) {
        ParameterUjiProfisiensi item = parameterUjiData.get(id);
        if (item != null) {
            return ResponseEntity.ok(item);
        }
        return ResponseEntity.notFound().build();
    }

    // POST (add new parameter)
    @PostMapping
    public ResponseEntity<ParameterUjiProfisiensi> addParameterUji(@RequestBody ParameterUjiProfisiensi item) {
        item.setId(counter++);
        parameterUjiData.put(item.getId(), item);
        return ResponseEntity.ok(item);
    }

    // PUT (update parameter)
    @PutMapping("/{id}")
    public ResponseEntity<ParameterUjiProfisiensi> updateParameterUji(@PathVariable Long id, @RequestBody ParameterUjiProfisiensi updatedItem) {
        ParameterUjiProfisiensi existing = parameterUjiData.get(id);
        if (existing != null) {
            updatedItem.setId(id);
            parameterUjiData.put(id, updatedItem);
            return ResponseEntity.ok(updatedItem);
        }
        return ResponseEntity.notFound().build();
    }

    // DELETE (optional)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParameterUji(@PathVariable Long id) {
        if (parameterUjiData.containsKey(id)) {
            parameterUjiData.remove(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}


