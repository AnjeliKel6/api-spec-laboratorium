package com.api_spec_labor.api_spec_labor.UjiProfisiensi.controller;

import com.api_spec_labor.api_spec_labor.UjiProfisiensi.model.ListUjiProfisiensi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/list-uji-profisiensi")
@CrossOrigin
public class ListUjiProfisiensiController {

    private Map<Long, ListUjiProfisiensi> listujiProfisiensiData = new HashMap<>();
    private Long counter = 1L;

    // GET all data
    @GetMapping("/")
    public ResponseEntity<List<ListUjiProfisiensi>> getAllListUjiProfisiensi() {
        return ResponseEntity.ok(new ArrayList<>(listujiProfisiensiData.values()));
    }

    // GET by ID
    @GetMapping("/{id}")
    public ResponseEntity<ListUjiProfisiensi> getListUjiProfisiensiById(@PathVariable Long id) {
        ListUjiProfisiensi item = listujiProfisiensiData.get(id);
        if (item != null) {
            return ResponseEntity.ok(item);
        }
        return ResponseEntity.notFound().build();
    }

    // POST (add new data)
    @PostMapping
    public ResponseEntity<ListUjiProfisiensi> addListUjiProfisiensi(@RequestBody ListUjiProfisiensi item) {
        item.setId(counter++);
        listujiProfisiensiData.put(item.getId(), item);
        return ResponseEntity.ok(item);
    }

    // PUT (update data)
    @PutMapping("/{id}")
    public ResponseEntity<ListUjiProfisiensi> updateListUjiProfisiensi(@PathVariable Long id, @RequestBody ListUjiProfisiensi updatedItem) {
        ListUjiProfisiensi existing = listujiProfisiensiData.get(id);
        if (existing != null) {
            updatedItem.setId(id);
            listujiProfisiensiData.put(id, updatedItem);
            return ResponseEntity.ok(updatedItem);
        }
        return ResponseEntity.notFound().build();
    }
}
