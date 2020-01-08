package com.offcn.controller;

import com.offcn.po.Person;
import com.offcn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName:PersonController
 * PackageName:com.offcn.controller
 *
 * @Date:2020/1/7 19:53
 * @Author:Mr.Li
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/")//@RequestBody：通过json对象传输
    public String add(@RequestBody Person person){
        personService.add(person);
        return "add-success";
    }

    @PutMapping("/{id}")    //传参                    json
    public String update(@PathVariable("id") Long id,@RequestBody Person person){
        person.setId(id);
        personService.update(person);
        return "update-success";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id){
        personService.delete(id);
        return "delete-success";
    }

    @GetMapping("/{id}")
    public Person findOne(@PathVariable("id") Long id){

        return personService.findOne(id);

    }

    @GetMapping("/")
    public List<Person> findAll(){
        return personService.findAll();
    }

    /*
    自定义的方法，根据名找人
     */
    @GetMapping("/name/{name}")
    public Person findByNameEquals(@PathVariable("name") String name){

        return personService.findByNameEquals(name);
    }

    /*
    查询名字像
     */
    @GetMapping("/namelike/{name}")
    public List<Person> findByNameLike(@PathVariable("name") String name){
        return personService.findByNameLike(name);
    }

    /*
    login操作
     */
    @GetMapping("/login/{name}/{password}")
    public Person login(@PathVariable("name") String name,@PathVariable("password") String password){

        return personService.login(name,password);
    }

    @GetMapping("/password/")
    public Person password(){

        return personService.getpasswordlength();
    }

    public String test1(){
        System.out.println("老鸟增加test1");
        return "test1";
    }

    public String test2(){
        System.out.println("老鸟增加test2");
        return "test2";
    }

    public String test3(){
        System.out.println("老鸟增加test3");
        return "test3";
    }
}
