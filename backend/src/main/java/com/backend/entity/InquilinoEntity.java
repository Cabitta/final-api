package com.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "inquilinos")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class InquilinoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String contacto;
    @Column(unique = true, nullable = false)
    private int departamento;

    @OneToMany(mappedBy = "inquilino", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReservaEntity> reservas;

    public Long getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public void setReservas(List<ReservaEntity> reservas) {
        this.reservas = reservas;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public int getDepartamento() {
        return departamento;
    }

    public List<ReservaEntity> getReservas() {
        return reservas;
    }
}
