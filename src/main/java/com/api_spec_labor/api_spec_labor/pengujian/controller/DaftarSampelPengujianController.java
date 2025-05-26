package com.api_spec_labor.api_spec_labor.pengujian.controller;

import com.api_spec_labor.api_spec_labor.pengujian.model.DaftarSampelPengujian;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/daftarsampelpengujian")
@CrossOrigin
public class DaftarSampelPengujianController {
    private final Map<Long, DaftarSampelPengujian> dataSampel = new HashMap<>();
    private Long counter = 1L;

    // GET semua data
    @GetMapping("/")
    public ResponseEntity<List<DaftarSampelPengujian>> getAllSampel() {
        return ResponseEntity.ok(new ArrayList<>(dataSampel.values()));
    }

    // GET by ID
    @GetMapping("/{id}")
    public ResponseEntity<DaftarSampelPengujian> getSampelById(@PathVariable Long id) {
        DaftarSampelPengujian sampel = dataSampel.get(id);
        if (sampel != null) {
            return ResponseEntity.ok(sampel);
        }
        return ResponseEntity.notFound().build();
    }

    // POST (Tambah data baru)
    @PostMapping
    public ResponseEntity<DaftarSampelPengujian> addSampel(@RequestBody DaftarSampelPengujian sampel) {
        sampel.setId(counter++);
        dataSampel.put(sampel.getId(), sampel);
        return ResponseEntity.ok(sampel);
    }

    // PUT (Update data)
    @PutMapping("/{id}")
    public ResponseEntity<DaftarSampelPengujian> updateSampel(@PathVariable Long id, @RequestBody DaftarSampelPengujian updated) {
        if (!dataSampel.containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        updated.setId(id);
        dataSampel.put(id, updated);
        return ResponseEntity.ok(updated);
    }

}
