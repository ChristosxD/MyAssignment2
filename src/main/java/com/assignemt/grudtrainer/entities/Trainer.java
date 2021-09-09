/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignemt.grudtrainer.entities;


import javax.validation.constraints.Size;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Chris
 */
@Entity
@Table(name = "trainers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trainer.findAll", query = "SELECT t FROM Trainer t"),
    @NamedQuery(name = "Trainer.findById", query = "SELECT t FROM Trainer t WHERE t.id = :id"),
    @NamedQuery(name = "Trainer.findByFirstname", query = "SELECT t FROM Trainer t WHERE t.firstname = :firstname"),
    @NamedQuery(name = "Trainer.findByLastname", query = "SELECT t FROM Trainer t WHERE t.lastname = :lastname"),
    @NamedQuery(name = "Trainer.findBySubject", query = "SELECT t FROM Trainer t WHERE t.subject = :subject")})
public class Trainer implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    

    @Column(name = "firstname")
    @Size(min=2,max=30,message = "Please Write Name")
    @Pattern(regexp="^([a-zA-Z]+\\s?)*$",message = "Only letters")
    private String firstname;
    
   
    @Size(min=2,max=30,message = "Please Write Name")
    @Pattern(regexp="^[A-Za-z]*$",message = "Only letters")
    @Column(name = "lastname")
    private String lastname;

    
    @Size(min=2,max=30,message ="Please give up to 2 Characters")
    @Column(name = "subject")
    private String subject;

    
    public Trainer() {
    }

    public Trainer(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainer)) {
            return false;
        }
        Trainer other = (Trainer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trainer{id=").append(id);
        sb.append(", firstname=").append(firstname);
        sb.append(", lastname=").append(lastname);
        sb.append(", subject=").append(subject);
        sb.append('}');
        return sb.toString();
    }


    
}
