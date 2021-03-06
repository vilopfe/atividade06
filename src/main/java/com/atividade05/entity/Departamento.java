package com.atividade05.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Builder
public class Departamento extends AbstractPersistable<Long> {

	public String nomeDepartamento;

}
