package com.loeaf.template.model;

import com.loeaf.common.domain.Domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity(name = "template")
public class Template extends Domain {
}
