package com.service;

import com.dao.DataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author User: LiZhiYong
 * Date: 2019/8/3
 * Time: 9:57
 * Description: No Description
 */
@Service
public class DataService {
    @Autowired
    private DataDao dataDao;

    public String data(){
        return dataDao.select();
    }
}
