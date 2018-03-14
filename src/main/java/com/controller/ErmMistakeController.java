package com.controller;

import com.dao.ErmMistakeDao;
import com.entity.ErmMistake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class ErmMistakeController {

    @Autowired
    private ErmMistakeDao ermMistakeDao ;


    @ResponseBody
    @RequestMapping(value = "getAll")
    public List<ErmMistake> getAll(HttpServletRequest request, @RequestParam(required = false)String waybill_no,@RequestParam(required = false) String beginTime,@RequestParam(required = false)String endTime,@RequestParam(required = false)String code,@RequestParam(required = false)Integer type){

        List<ErmMistake> ermMistakes;//当页面传过来的参数不为空时，执行带参查询
//        if (beginTime !=null && endTime !=null || code !=null || type!=null){
//            ermMistakes = ermMistakeDao.selsctErmMistake(null , null , null , null , null);
//        }else {
//            ermMistakes = ermMistakeDao.selsctErmMistake(null , null , null , null , null);
//        }
        ermMistakes = ermMistakeDao.selsctErmMistake(waybill_no , code , type , beginTime , endTime);


        return ermMistakes ;
    }


}
