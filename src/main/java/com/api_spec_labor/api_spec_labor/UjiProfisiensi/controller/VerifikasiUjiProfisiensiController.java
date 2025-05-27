package com.api_spec_labor.api_spec_labor.UjiProfisiensi.controller;

import com.api_spec_labor.api_spec_labor.UjiProfisiensi.model.VerifikasiUjiProfisiensi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/verifikasi-uji")
@CrossOrigin
public class VerifikasiUjiProfisiensiController {
    private Map<Long, VerifikasiUjiProfisiensi> verifikasiUjiProfisiensiData = new HashMap<>();
    private Long counter = 1L;

    // GET all parameter uji
    @GetMapping("/")
    public ResponseEntity<List<VerifikasiUjiProfisiensi>> getAllverifikasiUjiProfisiensi() {
        return ResponseEntity.ok(new ArrayList<>(verifikasiUjiProfisiensiData.values()));
    }

    // GET by ID
    @GetMapping("/{id}")
    public ResponseEntity<VerifikasiUjiProfisiensi> getverifikasiUjiProfisiensiById(@PathVariable Long id) {
        VerifikasiUjiProfisiensi item = verifikasiUjiProfisiensiData.get(id);
        if (item != null) {
            return ResponseEntity.ok(item);
        }
        return ResponseEntity.notFound().build();
    }

    // POST (add new parameter)
    @PostMapping
    public ResponseEntity<VerifikasiUjiProfisiensi> addverifikasiUjiProfisiensi(@RequestBody VerifikasiUjiProfisiensi item) {
        item.setId(counter++);
        verifikasiUjiProfisiensiData.put(item.getId(), item);
        return ResponseEntity.ok(item);
    }

    // PUT (update parameter)
    @PutMapping("/{id}")
    public ResponseEntity<VerifikasiUjiProfisiensi> updateverifikasiUjiProfisiensi(@PathVariable Long id, @RequestBody VerifikasiUjiProfisiensi updatedItem) {
            VerifikasiUjiProfisiensi existing = verifikasiUjiProfisiensiData.get(id);
        if (existing != null) {
            updatedItem.setId(id);
            verifikasiUjiProfisiensiData.put(id, updatedItem);
            return ResponseEntity.ok(updatedItem);
        }
        return ResponseEntity.notFound().build();
    }

}
