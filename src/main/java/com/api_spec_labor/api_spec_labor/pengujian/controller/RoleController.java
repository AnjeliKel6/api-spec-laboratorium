package com.api_spec_labor.api_spec_labor.pengujian.controller;

import com.api_spec_labor.api_spec_labor.pengujian.model.Role;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/roles")
@CrossOrigin
public class RoleController {

    private Map<Long, Role> dataRole = new HashMap<>();
    private Long counter = 1L;

    // Get all roles
    @GetMapping("/")
    public ResponseEntity<List<Role>> getAllRoles() {
        return ResponseEntity.ok(new ArrayList<>(dataRole.values()));
    }

    // Get role by ID
    @GetMapping("/{id}")
    public ResponseEntity<Role> getRoleById(@PathVariable Long id) {
        Role role = dataRole.get(id);
        if (role != null) {
            return ResponseEntity.ok(role);
        }
        return ResponseEntity.notFound().build();
    }

    // Create new role
    @PostMapping
    public ResponseEntity<Role> addRole(@RequestBody Role role) {
        role.setId(counter++);
        dataRole.put(role.getId(), role);
        return ResponseEntity.ok(role);
    }

    // Update role
    @PutMapping("/{id}")
    public ResponseEntity<Role> updateRole(@PathVariable Long id, @RequestBody Role updatedRole) {
        if (!dataRole.containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        updatedRole.setId(id);
        dataRole.put(id, updatedRole);
        return ResponseEntity.ok(updatedRole);
    }

}
