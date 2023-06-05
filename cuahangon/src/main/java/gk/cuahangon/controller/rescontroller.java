package gk.cuahangon.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rescontroller {

    @PostMapping("add")
    public String add(@RequestBody Object o){
        return o.toString();
    }


}
