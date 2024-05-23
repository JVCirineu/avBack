package com.example.des.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "turma")
public class Turma {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
	
    private String nome;
    
    private String descricao;

}