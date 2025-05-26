package com.api_spec_labor.api_spec_labor.UjiProfisiensi.controller;

import com.api_spec_labor.api_spec_labor.UjiProfisiensi.model.UjiProfisiensi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/uji-profisiensi")
@CrossOrigin
public class ujiprofisiensiController {

    private Map<Long, UjiProfisiensi> ujiProfisiensiData = new HashMap<>();
    private Long counter = 1L;

    // GET all data
    @GetMapping("/")
    public ResponseEntity<List<UjiProfisiensi>> getAllUjiProfisiensi() {
        return ResponseEntity.ok(new ArrayList<>(ujiProfisiensiData.values()));
    }

    // GET by ID
    @GetMapping("/{id}")
    public ResponseEntity<UjiProfisiensi> getUjiProfisiensiById(@PathVariable Long id) {
        UjiProfisiensi uji = ujiProfisiensiData.get(id);
        if (uji != null) {
            return ResponseEntity.ok(uji);
        }
        return ResponseEntity.notFound().build();
    }

    // POST (add new data)
    @PostMapping
    public ResponseEntity<UjiProfisiensi> addUjiProfisiensi(@RequestBody UjiProfisiensi uji) {
        uji.setId(counter++);
        ujiProfisiensiData.put(uji.getId(), uji);
        return ResponseEntity.ok(uji);
    }

    // DELETE by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUjiProfisiensi(@PathVariable Long id) {
        if (!ujiProfisiensiData.containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        ujiProfisiensiData.remove(id);
        return ResponseEntity.noContent().build();
    }
}


