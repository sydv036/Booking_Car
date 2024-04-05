package com.example.back_end_booking.entity;

import com.example.back_end_booking.constan.DefaultId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tuyentrinhdichuyen")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TuyenTinhDiChuyen extends DefaultId<String> {

    private Double tienXe;
    @Column(columnDefinition = "longtext")
    private String ghiChu;
    private String idGiaVe;
    private Integer trangThai;
}
