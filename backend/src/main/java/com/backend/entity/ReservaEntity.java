package com.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reservas")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String motivo;

    @ManyToOne
    @JoinColumn(name = "horario_id", referencedColumnName = "id", nullable = false)
    private HorarioEntity horario;
    @ManyToOne
    @JoinColumn(name = "servicio_id", referencedColumnName = "id", nullable = false)
    private ServicioEntity servicio;
    @ManyToOne
    @JoinColumn(name = "inquilino_id", referencedColumnName = "id", nullable = false)
    private InquilinoEntity inquilino;
}
