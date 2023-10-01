package ru.netology.rest_authoriz.repository;

import org.springframework.stereotype.Repository;
import ru.netology.rest_authoriz.modelenum.Authorities;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {

        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("admin") && password.equals("qwerty")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("kiosk") && password.equals("111")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("user") && password.equals("123qweasd")) {
            Collections.addAll(authorities, Authorities.READ);
        }
        return authorities;
    }
}
