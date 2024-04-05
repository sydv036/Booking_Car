package com.example.back_end_booking.entity;

import com.example.back_end_booking.constan.DefaultId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "giave")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GiaVe extends DefaultId<String>{
        private String idDiaDiemDon;
        private String idDiaDiemDen;
        private Integer soKmDiChuyen;
}
