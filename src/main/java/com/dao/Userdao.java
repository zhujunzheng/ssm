package com.dao;

import com.entity.Page;
import com.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface Userdao {

   // @Select("select * from user where uid = #{uid}")
   // public  User selectuser(int uid);
   //@Select("select * from user")
    public List<User>  selectuserall();
   // @Select("insert into user(uname) VALUE (#{uname})")
    public  void adduser(User user);
   // @Select("update  user SET uname=#{uname} where uid=#{uid}")
    public  void updateuser(User user);
    //@Select("delete  FROM user where uid=#{uid}")
    public  void deleteuser(int uid);
    //@Select("select * from user limit #{ben},#{end} ")
    public List<User> selectfenyt(Page page);
}
