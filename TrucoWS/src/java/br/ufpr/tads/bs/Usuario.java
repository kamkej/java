/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.tads.bs;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author julio
 */
@Entity
@Table(name = "Usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByTelefone", query = "SELECT u FROM Usuario u WHERE u.telefone = :telefone"),
    @NamedQuery(name = "Usuario.findByNome", query = "SELECT u FROM Usuario u WHERE u.nome = :nome"),
    @NamedQuery(name = "Usuario.findBySobrenome", query = "SELECT u FROM Usuario u WHERE u.sobrenome = :sobrenome"),
    @NamedQuery(name = "Usuario.findByVitorias", query = "SELECT u FROM Usuario u WHERE u.vitorias = :vitorias"),
    @NamedQuery(name = "Usuario.findByDerrotas", query = "SELECT u FROM Usuario u WHERE u.derrotas = :derrotas")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "Telefone")
    private String telefone;
    @Size(max = 20)
    @Column(name = "Nome")
    private String nome;
    @Size(max = 20)
    @Column(name = "Sobrenome")
    private String sobrenome;
    @Column(name = "Vitorias")
    private Integer vitorias;
    @Column(name = "Derrotas")
    private Integer derrotas;

    public Usuario() {
    }

    public Usuario(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (telefone != null ? telefone.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.telefone == null && other.telefone != null) || (this.telefone != null && !this.telefone.equals(other.telefone))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.ufpr.tads.bs.Usuario[ telefone=" + telefone + " ]";
    }
    
}
