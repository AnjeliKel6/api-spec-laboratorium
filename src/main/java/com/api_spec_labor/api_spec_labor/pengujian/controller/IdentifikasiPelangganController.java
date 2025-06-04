package com.api_spec_labor.api_spec_labor.pengujian.controller;

import com.api_spec_labor.api_spec_labor.pengujian.model.IdentifikasiPelanggan;
import com.api_spec_labor.api_spec_labor.pengujian.model.PermintaanPengujianReq;
import com.api_spec_labor.api_spec_labor.share.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/pelanggan")
@CrossOrigin
public class IdentifikasiPelangganController {

    private Map<Long, IdentifikasiPelanggan> dataPelanggan = new HashMap<>();
    private Long counter = 1L;

    @GetMapping("/")
    public ResponseEntity<List<IdentifikasiPelanggan>> getAllPelanggan() {
        return ResponseEntity.ok(new ArrayList<>(dataPelanggan.values()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<IdentifikasiPelanggan> getPelangganById(@PathVariable Long id) {
        IdentifikasiPelanggan identifikasiPelangganData = dataPelanggan.get(id);
        if (identifikasiPelangganData != null) {
            return ResponseEntity.ok(identifikasiPelangganData);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public BaseResponse addPelanggan(@RequestBody PermintaanPengujianReq permintaanPengujianReqData) {
        return new BaseResponse(1);
    }


}



