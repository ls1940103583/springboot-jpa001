package com.offcn.service;

import com.offcn.po.Person;

import java.util.List;

/**
 * ClassName:PersonService
 * PackageName:com.offcn.service
 *
 * @Date:2020/1/7 19:48
 * @Author:Mr.Li
 */
public interface PersonService {
    public void add(Person person);
    public void update(Person person);
    public void delete(Long id);

    public Person findOne(Long id);

    public List<Person> findAll();

    public Person findByNameEquals(String name);


    public List<Person> findByNameLike(String name);

    public Person login(String name,String password);

    public Person getpasswordlength();

}
