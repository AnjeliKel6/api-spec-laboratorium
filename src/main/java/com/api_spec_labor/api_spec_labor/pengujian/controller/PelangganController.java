package com.api_spec_labor.api_spec_labor.pengujian.controller;

import com.api_spec_labor.api_spec_labor.pengujian.model.pelanggan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/pelanggan")
@CrossOrigin
public class PelangganController {

    private Map<Long, pelanggan> dataPelanggan = new HashMap<>();
    private Long counter = 1L;

    @GetMapping("/")
    public ResponseEntity<List<pelanggan>> getAllPelanggan() {
        return ResponseEntity.ok(new ArrayList<>(dataPelanggan.values()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<pelanggan> getPelangganById(@PathVariable Long id) {
        pelanggan pelangganData = dataPelanggan.get(id);
        if (pelangganData != null) {
            return ResponseEntity.ok(pelangganData);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<pelanggan> addPelanggan(@RequestBody pelanggan pelangganData) {
        pelangganData.setId(counter++);
        dataPelanggan.put(pelangganData.getId(), pelangganData);
        return ResponseEntity.ok(pelangganData);
    }

    @PutMapping("/{id}")
    public ResponseEntity<pelanggan> updatePelanggan(@PathVariable Long id, @RequestBody pelanggan pelangganData) {
        if (!dataPelanggan.containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        pelangganData.setId(id);
        dataPelanggan.put(id, pelangganData);
        return ResponseEntity.ok(pelangganData);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePelanggan(@PathVariable Long id) {
        if (!dataPelanggan.containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        dataPelanggan.remove(id);
        return ResponseEntity.noContent().build();
    }
}



