package com.controller;

import com.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author User: LiZhiYong
 * Date: 2019/8/3
 * Time: 9:13
 * Description: No Description
 */
@RestController
public class DataController {

    @Autowired
    private DataService dataService;


    @RequestMapping("hello")
    public void HelloData() {
        System.out.println(dataService.data());
    }
}
