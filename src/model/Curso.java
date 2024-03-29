/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Curso {

    private int id;
    private Campus campus;
    private String nome;
    private String estado;
    private LocalDate anoInicio;
    private LocalDate anoTermino;
    private LocalDate dtCriacao;
    private LocalDate dtModificacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(LocalDate anoInicio) {
        this.anoInicio = anoInicio;
    }

    public LocalDate getAnoTermino() {
        return anoTermino;
    }

    public void setAnoTermino(LocalDate anoTermino) {
        this.anoTermino = anoTermino;
    }

    public LocalDate getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(LocalDate dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public LocalDate getDtModificacao() {
        return dtModificacao;
    }

    public void setDtModificacao(LocalDate dtModificacao) {
        this.dtModificacao = dtModificacao;
    }

    @Override
    public String toString() {
        String stringResponse = "";
        stringResponse += "ID: " + this.id + "\n";
        stringResponse += "Nome: " + this.nome + "\n";
        if (campus != null) {
          stringResponse += "Campus:" + campus.getNome()+ "\n";
        }
        stringResponse += "Estado: " + this.estado + "\n";
        stringResponse += "Ano de inicio: " + this.anoInicio + "\n";
        stringResponse += "Ano de termino: " + this.anoTermino + "\n";
        stringResponse += "Data de criação: " + this.dtCriacao + "\n";
        if (this.getDtModificacao() != null) {
            stringResponse += "Data de modificação: " + this.dtModificacao + "\n";
        }
        stringResponse += "\n\n";
        return stringResponse;
    }

}
