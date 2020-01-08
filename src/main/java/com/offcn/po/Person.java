package com.offcn.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * ClassName:Person
 * PackageName:com.offcn.po
 *
 * @Date:2020/1/7 19:32
 * @Author:Mr.Li
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity     //Java官方对jpa的规范：生明该类符合jpa规范
@Table(name = "tb_person")      //@Table(name = "tb_person")    自定义表名
public class Person {
    @Id     //主键
    @GeneratedValue     //自增
    private Long id;
    @Column(name = "name",nullable = false,length = 100)    //设置字段名，是否为空，长度
    private String name;
    @Column(nullable = false,length = 20)
    private String password;
    @Column(length = 4,nullable = false)
    private Integer age;
}
