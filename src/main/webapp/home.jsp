<%--
  Created by IntelliJ IDEA.
  User: zjz
  Date: 2018/1/15
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>bootstrap</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    <!-- 引入bootstrap-table样式 -->
    <link href="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.css" rel="stylesheet">

    <!-- jquery -->
    <script src="https://cdn.bootcss.com/jquery/2.2.3/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

    <!-- bootstrap-table.min.js -->
    <script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.js"></script>
    <!-- 引入中文语言包 -->
    <script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/locale/bootstrap-table-zh-CN.min.js"></script>




</head>
<body>

<div style="width: 100%;height:100px;background:url(image/bg_header.jpg) bottom repeat-x;box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444;">

    <div class="col-xs-6 col-sm-6" >
        <h2 style="color: white;">Bootstrap Web Admin</h2>
    </div>
    <div class="col-xs-6 col-sm-6" >
        <h3 style="text-align: right;color: white;">admin,欢迎您!</h3>
        <div  style="text-align: right;color: white;">
            <a>网站首页</a>|<a>支持论坛</a>|<a>帮助中心</a>|<a>安全退出</a>
        </div>
    </div>

</div>

<div style="width: 100%;height:560px;box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444;">
    <div class="panel-group col-xs-6" id="accordion"  style="height: 100%;width: 20%;box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444;">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h4 class="panel-title">
                    <a data-toggle="collapse" data-parent="#accordion"
                       href="#collapseOne">
                        快捷管理
                    </a>
                </h4>
            </div>
            <div id="collapseOne" class="panel-collapse collapse in">
                <div class="tree well" >
                    <ul>
                        <li onclick="add('菜单导航','home')">
                            <span><i></i> 菜单导航</span>
                        </li>
                        <li onclick="add('用户管理','ios')">
                            <span><i ></i> 用户管理</span> <a href=""></a>

                        </li >
                        <li onclick="add('角色管理','jmeter')">
                            <span><i ></i> 角色管理</span> <a href=""></a>

                        </li >
                        <li onclick="add('数据字典','ejb')">
                            <span><i ></i> 数据字典</span> <a href=""></a>

                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading">
                <h4 class="panel-title">
                    <a data-toggle="collapse" data-parent="#accordion"
                       href="#collapseTwo">
                        数据管理
                    </a>
                </h4>
            </div>
            <div id="collapseTwo" class="panel-collapse collapse">
                <div class="panel-body">
                    Nihil anim keffiyeh helvetica, craft beer labore wes anderson
                    cred nesciunt sapiente ea proident. Ad vegan excepteur butcher
                    vice lomo.
                </div>
            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading" >
                <h4 class="panel-title">
                    <a data-toggle="collapse" data-parent="#accordion"
                       href="#collapseThree">
                        财务管理
                    </a>
                </h4>
            </div>
            <div id="collapseThree" class="panel-collapse collapse">
                <div class="panel-body">
                    Nihil anim keffiyeh helvetica, craft beer labore wes anderson
                    cred nesciunt sapiente ea proident. Ad vegan excepteur butcher
                    vice lomo.
                </div>
            </div>
        </div>
    </div>
    <div class="col-xs-6" style="width: 80%;">
        <ul id="myTab" class="nav nav-tabs">
            <li class="active">
                <a href="#home" data-toggle="tab">
                    首页
                </a>

            </li>

        </ul>
        <div id="myTabContent" class="tab-content">
            <div class="table-responsive">
                <div class="tab-pane fade in active  " id="home">
                    <div class="panel-body" style="padding-bottom:0px;">
                        <div class="panel panel-default">
                            <div class="panel-heading">查询条件</div>
                            <div class="panel-body">
                                <form id="formSearch" class="form-horizontal">
                                    <div class="form-group" style="margin-top:15px">
                                        <label class="control-label col-sm-1" for="txt_search_departmentname">部门名称</label>
                                        <div class="col-sm-3">
                                            <input type="text" class="form-control" id="txt_search_departmentname">
                                        </div>
                                        <label class="control-label col-sm-1" for="txt_search_statu">状态</label>
                                        <div class="col-sm-3">
                                            <input type="text" class="form-control" id="txt_search_statu">
                                        </div>
                                        <div class="col-sm-4" style="text-align:left;">
                                            <button type="button" style="margin-left:50px" id="btn_query" class="btn btn-primary">查询</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>

                        <div id="toolbar" class="btn-group">
                            <button id="btn_add" type="button" class="btn btn-default">
                                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
                            </button>
                            <button id="btn_edit" type="button" class="btn btn-default">
                                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
                            </button>
                            <button id="btn_delete" type="button" class="btn btn-default">
                                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
                            </button>
                        </div>
                        <table id="tb_departments"></table>
                    </div>
                </div>
                <div class="tab-pane fade" id="ios">
                    <p>iOS is a mobile operating system developed and distributed by Apple
                        Inc. Originally released in 2007 for the iPhone, iPod Touch, and
                        Apple TV. iOS is derived from OS X, with which it shares the
                        Darwin foundation. iOS is Apple's mobile version of the
                        OS X operating system used on Apple computers.</p>
                </div>
                <div class="tab-pane fade" id="jmeter">
                    <p>jMeter is an Open Source testing software. It is 100% pure
                        Java application for load and performance testing.</p>
                </div>
                <div class="tab-pane fade" id="ejb">
                    <p>Enterprise Java Beans (EJB) is a development architecture
                        for building highly scalable and robust enterprise level
                        applications to be deployed on J2EE compliant
                        Application Server such as JBOSS, Web Logic etc.
                    </p>
                </div>
            </div>
        </div>

    </div>
    <div data-options="region:'south',split:true" style="height:20px;text-align: center;box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444;float: left;width: 100%;">
        &copy; 2013 Wu All Rights Reserved

    </div>


</div>

<script type="javascript" >

    $(function(){

        $(".form_datetime").datetimepicker({
            format: "yyyy-mm-dd",
            autoclose: true,
            todayBtn: true,
            todayHighlight: true,
            showMeridian: true,
            pickerPosition: "bottom-left",
            language: 'zh-CN',//中文，需要引用zh-CN.js包
            startView: 2,//月视图
            minView: 2//日期时间选择器所能够提供的最精确的时间选择视图
        });


        var oTable = new TableInit();
        oTable.Init();





    });

    var TableInit = function () {
        var oTableInit = new Object();
        //初始化Table
        oTableInit.Init = function () {
            $('#tb_departments').bootstrapTable({
                url: '/user/getallJSON.action',         //请求后台的URL（*）
                method: 'post',                      //请求方式（*）
                toolbar: '#toolbar',                //工具按钮用哪个容器
                striped: true,                      //是否显示行间隔色
                cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
                pagination: true,                   //是否显示分页（*）
                sortable: false,                     //是否启用排序
                sortOrder: "asc",                   //排序方式
                queryParams: oTableInit.queryParams,//传递参数（*）
                sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
                pageNumber: 1,                       //初始化加载第一页，默认第一页
                pageSize: 10,                       //每页的记录行数（*）
                pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
                search: true,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
                strictSearch: true,
                showColumns: true,                  //是否显示所有的列
                showRefresh: true,                  //是否显示刷新按钮
                minimumCountColumns: 2,             //最少允许的列数
                clickToSelect: true,                //是否启用点击选中行
                height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
                uniqueId: "uid",                     //每一行的唯一标识，一般为主键列
                showToggle: true,                    //是否显示详细视图和列表视图的切换按钮
                cardView: false,                    //是否显示详细视图
                detailView: false,                   //是否显示父子表
                columns: [{
                    checkbox: true
                }, {
                    field: 'uid',
                    title: '编号'
                }, {
                    field: 'uname',
                    title: '用户名'
                }]
            });
        };


        //得到查询的参数
        oTableInit.queryParams = function (params) {
            var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
                limit: params.limit,   //页面大小
                offset: params.offset,  //页码
                departmentname: $("#txt_search_departmentname").val(),
                statu: $("#txt_search_statu").val()
            };
            return temp;
        };
        return oTableInit;
    }



    //添加选项卡
    function add(text,href){

        //拿到选项卡下所有节点
        var children= $('#myTab').children();


        var flag = true ;
        for(var j = 0 ; j < children.length;j++){
            if(children[j].innerHTML.indexOf(text)>=0){
                flag =  false ;
                break ;
            }
        }
        //如果存在打开，不存在添加
        if(flag){
            $("#myTab").html($("#myTab").html()+"<li ><a href='#"+href+"' data-toggle='tab'>"+text+" <span onclick='deleteLi(this)'>x</span></a></li>")
        }else{
            for(var j = 0 ; j < children.length;j++){
                children[j].className = '' ;
                if(children[j].innerHTML.indexOf(text)>=0){
                    children[j].className = 'active';
                }
            }
        }

    }




</script>

</body>
</html>
