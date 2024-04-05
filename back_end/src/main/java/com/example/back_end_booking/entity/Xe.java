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
@Table(name = "xe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Xe extends DefaultId<String> {
    private String idTuyenTrinhDiChuyen;
    private String idLoaiXe;
    @Column(columnDefinition = "varchar(255)")
    private String bienSo;
    private String mauXe;
    @Column(columnDefinition = "longtext")
    private String hinhAnhXe;
    private Integer trangThai;
}
