package com.offcn.dao;

import com.offcn.po.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * ClassName:PersonDao
 * PackageName:com.offcn.dao
 *
 * @Date:2020/1/7 19:44
 * @Author:Mr.Li
*/                                    //封装的是哪个实体类，实体类的主键是什么属性
public interface PersonDao extends JpaRepository<Person,Long> {
    //根据接口中定义的名字，自动推导出，用户要进行的操作
    public Person findByNameEquals(String name);

    public List<Person> findByNameLike(String name);


    //不是根据推导，会报错。需要自己写sql语句。格式如下        jpql语法
    @Query("select p from Person p where p.name=:name and p.password=:password")
    public Person login(@Param("name") String name,@Param("password") String password);
                                                            //nativeQuery：是否原生sql语句
    @Query(value = "select * from tb_person where length(password)=6",nativeQuery = true)
    public Person getpasswordlength();
}
