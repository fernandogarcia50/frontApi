/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicas.Entity;

import java.io.Serializable;

/**
 *
 * @author fer_g
 */
public class Consultorio implements Serializable {

    private int id;

    private Integer idDoctor;

    private Integer idPaciente;

    private Integer idConsultorio;

    private String fechaConsulta;

    private Integer hora;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Integer idDoctor) {
        this.idDoctor = idDoctor;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(Integer idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

}
