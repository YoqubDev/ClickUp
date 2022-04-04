package com.example.appclickup.entity;

import com.example.appclickup.template.AbsUUIDEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Attachment extends AbsUUIDEntity {

    private String name;

    private String orginalName;

    private Long size;

    private String contentType;


}
