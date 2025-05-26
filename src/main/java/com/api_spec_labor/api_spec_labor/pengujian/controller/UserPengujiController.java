package com.api_spec_labor.api_spec_labor.pengujian.controller;

import com.api_spec_labor.api_spec_labor.pengujian.model.UserPenguji;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/user-penguji")
@CrossOrigin
public class UserPengujiController {

    private Map<Long, UserPenguji> dataPenguji = new HashMap<>();
    private Long counter = 1L;

    @GetMapping("/")
    public ResponseEntity<List<UserPenguji>> getAllPenguji() {
        return ResponseEntity.ok(new ArrayList<>(dataPenguji.values()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserPenguji> getPengujiById(@PathVariable Long id) {
        UserPenguji penguji = dataPenguji.get(id);
        if (penguji != null) {
            return ResponseEntity.ok(penguji);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<UserPenguji> addPenguji(@RequestBody UserPenguji penguji) {
        penguji.setId(counter++);
        dataPenguji.put(penguji.getId(), penguji);
        return ResponseEntity.ok(penguji);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserPenguji> updatePenguji(@PathVariable Long id, @RequestBody UserPenguji penguji) {
        if (!dataPenguji.containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        penguji.setId(id);
        dataPenguji.put(id, penguji);
        return ResponseEntity.ok(penguji);
    }

}
