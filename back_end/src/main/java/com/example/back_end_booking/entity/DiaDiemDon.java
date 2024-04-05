package com.example.back_end_booking.entity;

import com.example.back_end_booking.constan.DefaultId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Time;

@Entity
@Table(name = "diadiemdon")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DiaDiemDon extends DefaultId<String> {

    private Time thoiGianXuatPhat;
    private String diemDiemDon;
    private Integer trangThai;
}
