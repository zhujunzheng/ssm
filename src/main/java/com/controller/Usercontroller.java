package com.controller;

import com.dao.Userdao;
import com.entity.Page;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("user")
@Controller
public class Usercontroller {


    @Autowired
    private Userdao userdao;


    @RequestMapping("getall")
    public String getall(){
        List<User> list=userdao.selectuserall();
        System.out.println(list.size());
        return "list";
    }

    @ResponseBody
    @RequestMapping("getallJSON")
    public Map<String,Object> getallJSON(HttpServletRequest request){
        //分页
        String rows=  request.getParameter("rows");
        String page=  request.getParameter("page");
        //排序
        String sidx=  request.getParameter("sidx");
        String sord=  request.getParameter("sord");
        //搜索
        String filters=  request.getParameter("filters");
        System.out.println(filters);
        List<User> list=userdao.selectuserall();
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("page",page);
        int  total=list.size()%Integer.parseInt(rows)==0?list.size()/Integer.parseInt(rows):list.size()/Integer.parseInt(rows)+1;
        map.put("total",total);
        map.put("records",list.size());
        int ben=(Integer.parseInt(page)-1)*Integer.parseInt(rows);
        int end=Integer.parseInt(page)*Integer.parseInt(rows);
        List<User> list1=userdao.selectfenyt(new Page(end,ben,sidx,sord) );
        map.put("rows",list1);
        return map;
    }

    @ResponseBody
    @RequestMapping("dummy")
    public int dummy(HttpServletRequest request){
        String oper=  request.getParameter("oper");
        String uname=  request.getParameter("uname");
        String id=  request.getParameter("id");
        if("add".equals(oper)){
            userdao.adduser(new User(uname));
        }else if("del".equals(oper)){
            String [] idall= id.split(",");
            for (String s : idall) {
                userdao.deleteuser(Integer.parseInt(s));
            }
        }else if("edit".equals(oper)){
            userdao.updateuser(new User(Integer.parseInt(id),uname));
        }
        return 1;
    }

}
