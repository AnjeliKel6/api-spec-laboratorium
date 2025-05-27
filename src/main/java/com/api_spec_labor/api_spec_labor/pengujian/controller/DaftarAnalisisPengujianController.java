package com.api_spec_labor.api_spec_labor.pengujian.controller;

import com.api_spec_labor.api_spec_labor.pengujian.model.DaftarAnalisisPegujian;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/daftar-analisis-pengujian")
@CrossOrigin

public class DaftarAnalisisPengujianController {
    private final Map<Long, DaftarAnalisisPegujian> dataAnalisis = new HashMap<>();
    private Long counter = 1L;

    // GET semua data
    @GetMapping("/")
    public ResponseEntity<List<DaftarAnalisisPegujian>> getAllAnalisis() {
        return ResponseEntity.ok(new ArrayList<>(dataAnalisis.values()));
    }

    // GET by ID
    @GetMapping("/{id}")
    public ResponseEntity<DaftarAnalisisPegujian> getAnalisisById(@PathVariable Long id) {
        DaftarAnalisisPegujian analisis = dataAnalisis.get(id);
        if (analisis != null) {
            return ResponseEntity.ok(analisis);
        }
        return ResponseEntity.notFound().build();
    }

}
