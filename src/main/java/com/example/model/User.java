package com.example.model;

import com.avaje.ebean.Ebean;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by gyutr20 on 2015/07/08.
 */
@Data
@Entity
public class User {
    @Id
    Integer id;
    String name;
    String pass;

    public static void main(String args[]) {
        System.out.println("ユーザー作成");

        User user = new User();
        user.setName("test");
        user.setPass("とりあえず平文で");
        Ebean.save(user);

        //検索の方法
        Ebean.createQuery(User.class).where().eq("name","test").findUnique();

    }
}
