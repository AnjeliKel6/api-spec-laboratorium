package com.api_spec_labor.api_spec_labor.pengujian.controller;

import com.api_spec_labor.api_spec_labor.pengujian.model.IdentifikasiSampel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/identifikasi-sampel")
@CrossOrigin
public class IdentifikasiSampelController {

    private Map<Long, IdentifikasiSampel> dataSampel = new HashMap<>();
    private Long counter = 1L;

    @GetMapping("/")
    public ResponseEntity<List<IdentifikasiSampel>> getAllSampel() {
        return ResponseEntity.ok(new ArrayList<>(dataSampel.values()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<IdentifikasiSampel> getSampelById(@PathVariable Long id) {
        IdentifikasiSampel sampel = dataSampel.get(id);
        if (sampel != null) {
            return ResponseEntity.ok(sampel);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<IdentifikasiSampel> addSampel(@RequestBody IdentifikasiSampel sampel) {
        sampel.setId(counter++);
        dataSampel.put(sampel.getId(), sampel);
        return ResponseEntity.ok(sampel);
    }

}
