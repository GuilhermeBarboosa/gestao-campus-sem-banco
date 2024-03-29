/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Gui
 */
public class Campus {

    private int id;
    private String nome;
    private String abreviacao;
    private double duracaoAula;
    private LocalDate dtCriacaoCamp;
    private String cidade;
    private String bairro;
    private String rua;
    private String cep;
    private LocalDate dtCriacao;
    private LocalDate dtModificacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public double getDuracaoAula() {
        return duracaoAula;
    }

    public void setDuracaoAula(double duracaoAula) {
        this.duracaoAula = duracaoAula;
    }

    public LocalDate getDtCriacaoCamp() {
        return dtCriacaoCamp;
    }

    public void setDtCriacaoCamp(LocalDate dtCriacaoCamp) {
        this.dtCriacaoCamp = dtCriacaoCamp;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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
        String aux = "";
        aux += "DADOS DA INSTITUIÇÃO \n\n";
        aux += "ID: " + this.id + "\n";
        aux += "NOME: " + this.nome + "\n";
        aux += "ABREVIAÇÃO: " + this.abreviacao + "\n";
        aux += "DURAÇÃO DE AULA: " + this.duracaoAula + "\n";
        aux += "CEP: " + this.cep + "\n";
        aux += "BAIRRO: " + this.bairro + "\n";
        aux += "RUA: " + this.rua + "\n";
        aux += "DATA DE CRIAÇÃO DO CAMPUS: " + this.dtCriacaoCamp + "\n";
        aux += "DATA DE CRIAÇÃO: " + this.dtCriacao + "\n";
        if (this.dtModificacao != null) {
            aux += "DATA DE MODIFICAÇÃO: " + this.dtModificacao;
        }
        return aux;
    }

}
