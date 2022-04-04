package com.example.appclickup.entity;

import com.example.appclickup.template.AbsLongEntity;
import com.example.appclickup.template.AbsUUIDEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Workspace extends AbsLongEntity{


}
