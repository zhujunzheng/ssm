<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/27 0027
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>abnabnormal差错申诉</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <style>
        .tableContent tbody tr label{
            margin-left:30px;
            margin-top: 20px;
        }

    </style>

    <link href="bootstrap/assets/css/bootstrap.min.css" rel="stylesheet">
    <!-- 引入bootstrap-table样式 -->
    <link href="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.css" rel="stylesheet">
    <!-- 引入模态框样式-->
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="bootstrap/js/jquery-3.1.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>

    <!-- jquery -->
    <script src="bootstrap/assets/js/jquery.min.js"></script>

    <%--
        <!-- bootstrap-table.min.js -->
        <script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.js"></script>
        <!-- 引入中文语言包 -->
        <script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/locale/bootstrap-table-zh-CN.min.js"></script>
    --%>

    <%----------------------------------------------------------------------------%>

    <link rel="stylesheet" href="bootstrap/css/bootstrap-datetimepicker.css"/>

    <!--jqGrid 皮肤 -->
    <link rel="stylesheet" href="bootstrap/assets/css/ui.jqgrid.css"/>
    <%--<!-- ace styles 含jqGrid部分样式 -->
    <link rel="stylesheet" href="bootstrap/assets/css/ace.min.css"/>
    <script src="bootstrap/assets/js/ace.min.js"></script>--%>

    <!-- jqGrid scripts -->
    <script src="bootstrap/assets/js/jqGrid/jquery.jqGrid.min.js"></script>
    <!-- jqGrid 本地化脚本 相关文件可从jqGrid官网下载 -->
    <script src="bootstrap/assets/js/jqGrid/i18n/grid.locale-en.js"></script>

    <script src="bootstrap/assets/js/bootstrap.min.js"></script>
    <%--<!-- basic styles -->--%>
    <%--<link href="bootstrap/assets/css/bootstrap.min.css" rel="stylesheet" />--%>
    <%--<link rel="stylesheet" href="bootstrap/assets/css/font-awesome.min.css" />--%>

    <script src="bootstrap/js/bootstrap-datetimepicker.min.js" type="text/javascript"></script>

    <!-- basic styles -->

    <link href="bootstrap/assets/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="bootstrap/assets/css/font-awesome.min.css" />

    <!--[if IE 7]>
    <link rel="stylesheet" href="bootstrap/assets/css/font-awesome-ie7.min.css" />
    <![endif]-->

    <!-- page specific plugin styles -->

    <link rel="stylesheet" href="bootstrap/assets/css/jquery-ui-1.10.3.full.min.css" />
    <link rel="stylesheet" href="bootstrap/assets/css/datepicker.css" />
    <link rel="stylesheet" href="bootstrap/assets/css/ui.jqgrid.css" />

    <!-- fonts -->

    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />

    <!-- ace styles -->

    <link rel="stylesheet" href="bootstrap/assets/css/ace.min.css" />
    <link rel="stylesheet" href="bootstrap/assets/css/ace-rtl.min.css" />
    <link rel="stylesheet" href="bootstrap/assets/css/ace-skins.min.css" />

    <!--[if lte IE 8]>
    <link rel="stylesheet" href="bootstrap/assets/css/ace-ie.min.css" />
    <![endif]-->

    <!-- inline styles related to this page -->

    <!-- ace settings handler -->

    <script src="bootstrap/assets/js/ace-extra.min.js"></script>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

    <!--[if lt IE 9]>
    <script src="bootstrap/assets/js/html5shiv.js"></script>
    <script src="bootstrap/assets/js/respond.min.js"></script>
    <![endif]-->

    <script type="text/javascript" src="bootstrap/js/vue.min.js"></script>

</head>


<script type="text/javascript">

    $(function () {


        var vue = new Vue({
            el:"#xiangxi",
            data:{
                ermMistake:"",
                id:""
            },
            methods:{
                getErmMistakeById:function () {
                    var _this = this ;
                    $.ajax({
                        url:"/getErmMistakeById.action",
                        data:{id:_this.id},
                        dataType:"JSON",
                        success:function (result) {
                            _this.ermMistake =result;
                        }
                    });
                }
            },
            created:function () {
                if (this.id != "") {
                    this.getErmMistakeById() ;
                }else{

                }
            }


        });


        $("#jettison").jqGrid({
            url: '/getAll.action',
            datatype: "json",
            height: 400,
            jsonReader: {
                repeatitems: false,
                id: "code"
            },
            colNames:['差错编号','运单号', '处理状态', '处理人','差错类型','上报部门','上报时间','处理完成时间','审核时间','申诉时间'],
            colModel:[
                {name:'code',index:'code', width:60, sorttype:"int", editable: false},
                {name:'waybill_no',index:'waybillNo', width:150,editable: true},
                {name:'dispose_status',index:'disposeStatus', width:70, editable: true},
                {name:'creater',index:'creater', width:70, editable: true},
                {name:'type',index:'type', width:70, editable: true},
                {name:'report_department',index:'reportDepartment', width:70, editable: true},
                {name:'report_time',index:'reportTime', width:70, editable: true},
                {name:'dispose_time',index:'disposeTime', width:70, editable: true},
                {name:'handle_time',index:'handleTime', width:70, editable: true},
                {name:'appeal_time',index:'appealTime', width:70, editable: true}
            ],
            viewrecords: true,
            // rowNum:10,
            // rowList:[10,20,30],
            pager: "#jqGridPager",
            // altRows:true,
            multiselect: true,
            multiboxonly: true,
            loadComplete: function () {
                var table = this;
                setTimeout(function () {
                    updatePagerIcons(table);
                }, 0);
            },
            // caption: "| 查询结果",
            autowidth: true,
            onSelectRow:function (rowId ,status) {
                if (status) {
                    vue.id = rowId ;
                    vue.getErmMistakeById();
                }
            },

        });



    });


    function updatePagerIcons(table) {
        var replacement =
            {
                'ui-icon-seek-first' : 'icon-double-angle-left bigger-140',
                'ui-icon-seek-prev' : 'icon-angle-left bigger-140',
                'ui-icon-seek-next' : 'icon-angle-right bigger-140',
                'ui-icon-seek-end' : 'icon-double-angle-right bigger-140'
            };
        $('.ui-pg-table:not(.navtable) > tbody > tr > .ui-pg-button > .ui-icon').each(function(){
            var icon = $(this);
            var $class = $.trim(icon.attr('class').replace('ui-icon', ''));

            if($class in replacement) icon.attr('class', 'ui-icon '+replacement[$class]);
        })
    }


</script>

<body>

<div class="panel-body" style="padding-bottom:0px; margin: 5px;">
    <button class="btn btn-success" style="margin: 8px" data-toggle="modal" data-target="#myModal">申诉</button>
    <button class="btn btn-success" style="margin: 8px" onclick="update()">转仲裁</button>
    <button class="btn btn-success" style="margin: 8px" onclick="update()">转理赔</button>



    <ul id="myTab" class="nav nav-tabs">
        <li class="active"><a href="#shuju" data-toggle="tab">
            数据列表</a>
        </li>
        <li><a href="#xiangxi" data-toggle="tab">详细信息</a></li>
    </ul>

    <div class="tab-content">
        <div class="tab-pane fade in active" id="shuju">
            <div class="panel panel-default">
                <div class="panel-heading">| 查询条件</div>
                <div class="panel-body">
                    <form id="formSearch" class="form-horizontal">
                        <div class="form-group" style="margin-top:15px">

                            <div class="row" class="col-xs-12 col-sm-4">
                                <label style="margin-left:30px">
                                    <input type="checkbox" name="checkbox"/>按单号查询
                                    <input type="text" id="txt_search_departmentname" name="waybill_no"></label>
                                <button type="reset">清空</button>
                                <button type="button" style="margin-left:70px;margin-right: 20px" id="btn_query"
                                        class="btn btn-primary">查询
                                </button>
                            </div>

                            <div class="row" class="col-xs-12 col-sm-4" style="margin-top:15px">
                                <div>
                                    <label style="margin-left:30px">上报日期
                                        <input class="demo-input" id="beginTime" name="beginTime" type="text"
                                               placeholder="请选择日期"/>
                                        <label>至</label>
                                        <input class="demo-input" id="endTime" name="endTime" type="text"
                                               placeholder="请选择日期"/>
                                    </label>
                                </div>

                                <label style="margin-left:30px">差错单号
                                    <input type="text" name="code">
                                </label>

                                <label style="margin-left:30px">差错类型
                                    <select style="width: 170px" name="type">
                                        <option value="0">请选择</option>
                                        <option value="1">运单录入不规范</option>
                                        <option value="2">签收录入不规范</option>
                                        <option value="3">问题件上报录入不规范</option>
                                    </select>
                                </label>
                            </div>

                        </div>
                    </form>
                </div>
            </div>

            <div class="panel panel-default">
                <div class="panel-heading">| 查询结果</div>
                <br/>
                <div style="margin-left:10px">
                    <table id="jettison"></table>
                </div>
            </div>
        </div>
        <div class="tab-pane fade" id="xiangxi">
            <div class="panel panel-default">
                <div class="panel-heading">| 详细信息</div>
                <div class="panel-body">


                    <table class="tableContent">
                        <tr style="padding-top: 10px;">
                            <td>
                                <label>差错单号
                                    <input type="text" name="code" v-bind:value="ermMistake.code" readonly/>
                                </label>
                            </td>
                            <td>
                                <label>受理时间
                                    <input type="text" name="code" v-bind:value="ermMistake.accept_time" readonly/>
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>上报部门编码
                                    <input type="text" name="code" v-bind:value="ermMistake.report_department_code"readonly/>
                                </label>
                            </td>
                            <td>
                                <label style="margin-left:30px">上报部门
                                    <input type="text" name="code" v-bind:value="ermMistake.report_department" readonly/>
                                </label>
                            </td>
                        </tr>
                        <tr>
                        <td>
                            <label style="margin-left:30px">上报企业编码
                                <input type="text" name="code" v-bind:value="ermMistake.report_company_code" readonly/>
                            </label>
                        </td>
                        <td>
                            <label style="margin-left:30px">上报企业
                                <input type="text" name="code" v-bind:value="ermMistake.report_company" readonly/>
                            </label>
                        </td>
                    </tr>
                        <tr>
                        <td>
                            <label style="margin-left:30px">上报省区编码
                                <input type="text" name="code" v-bind:value="ermMistake.report_province_code" readonly/>
                            </label>
                        </td>
                        <td>
                            <label style="margin-left:30px">上报省区
                                <input type="text" name="code" v-bind:value="ermMistake.report_province" readonly/>
                            </label>
                        </td>
                    </tr>
                        <tr>
                        <td>
                            <label style="margin-left:30px">上报时间
                                <input type="text" name="code" v-bind:value="ermMistake.report_time" readonly/>
                            </label>
                        </td>
                        <td>
                            <label style="margin-left:30px">上报内容
                                <input type="text" name="code" v-bind:value="ermMistake.report_content" readonly/>
                            </label>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label style="margin-left:30px">处理状态
                                <input type="text" name="code" v-bind:value="ermMistake.dispose_status" readonly/>
                            </label>
                        </td>
                        <td>
                            <label style="margin-left:30px">异常件数
                                <input type="text" name="code" v-bind:value="ermMistake.question_quantity" readonly/>
                            </label>
                        </td>
                    </tr>
                        <tr>
                        <td>
                            <label style="margin-left:30px">托寄物
                                <input type="text" name="code" v-bind:value="ermMistake.goods_name" readonly/>
                            </label>
                        </td>
                        <td>
                            <label style="margin-left:30px">重量
                                <input type="text" name="code" v-bind:value="ermMistake.weight" readonly/>
                            </label>
                        </td>
                    </tr>
                        <tr>
                        <td>
                            <label style="margin-left:30px">包装方式
                                <input type="text" name="code" v-bind:value="ermMistake.package_type" readonly/>
                            </label>
                        </td>
                        <td>
                            <label style="margin-left:30px">服务方式
                                <input type="text" name="code" v-bind:value="ermMistake.package_type" readonly/>
                            </label>
                        </td>
                    </tr>
                        <tr>
                        <td>
                            <label style="margin-left:30px">签收状态
                                <input type="text" name="code" v-bind:value="ermMistake.sign_type" readonly/>
                            </label>
                        </td>
                        <td>
                            <label style="margin-left:30px">运单号
                                <input type="text" name="code" v-bind:value="ermMistake.waybill_no" readonly/>
                            </label>
                        </td>
                    </tr>
                        <tr>
                        <td>
                            <label style="margin-left:30px">问题件编码
                                <input type="text" name="code" v-bind:value="ermMistake.abnormal_code" readonly/>
                            </label>
                        </td>
                        <td>
                            <label style="margin-left:30px">差错类型
                                <input type="text" name="code" v-bind:value="ermMistake.type" readonly/>
                            </label>
                        </td>
                    </tr>
                        <tr>
                            <td>
                                <label style="margin-left:30px">差错编号
                                    <input type="text" name="code" v-bind:value="ermMistake.abnormal_code" readonly/>
                                </label>
                            </td>
                            <td>
                                <label style="margin-left:30px">组织类型
                                    <input type="text" name="code" v-bind:value="ermMistake.org_type" readonly/>
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label style="margin-left:30px">公司code
                                    <input type="text" name="code" v-bind:value="ermMistake.comp_code" readonly/>
                                </label>
                            </td>
                            <td>
                                <label style="margin-left:30px">创建人
                                    <input type="text" name="code" v-bind:value="ermMistake.creater" readonly/>
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label style="margin-left:30px">创建时间
                                    <input type="text" name="code" v-bind:value="ermMistake.create_time" readonly/>
                                </label>
                            </td>
                            <td>
                                <label style="margin-left:30px">修改人
                                    <input type="text" name="code" v-bind:value="ermMistake.modifier" readonly/>
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label style="margin-left:30px">修改时间
                                    <input type="text" name="code" v-bind:value="ermMistake.modifier_time" readonly/>
                                </label>
                            </td>


                    </table>

                </div>
                </div>
            </div>

        </div>

        <script type="text/javascript">

            $(function () {



                $("#btn_query").click(function () {
                    var form = $("#formSearch").serialize();
                    console.info(form);
                    $("#jettison").jqGrid("setGridParam", {
                        url: '/getAll.action',
                        dataType: "json",
                        postData: form,
                        page: 1
                    }).trigger("reloadGrid");

                });


                //获取当前时间
                var toDay = new Date();

                $('#beginTime').datetimepicker({
                    format: 'yyyy-mm-dd',//格式化时间
                    minView: 2,  //最精确时间
                    autoclose: true,
                    todayBtn: true,
                    language: 'zh-CN',
                    endDate: toDay  //这个时间后面的都不能进行选择
                }).on("change", function () {
                    //获取当前选择的时间
                    var date = new Date($('#beginTime').val());
                    //设置结束时间的可选起始时间为起始时间以及之后
                    $('#endTime').datetimepicker("setStartDate", date);
                });


                $('#endTime').datetimepicker({
                    format: 'yyyy-mm-dd',//格式化时间
                    minView: 2,  //最精确时间
                    autoclose: true,  //选择后自动关闭
                    todayBtn: true,   //显示today按钮
                    language: 'zh-CN',
                    startDate: toDay,
                    endDate: toDay
                }).on("change", function () {
                    //设置起始时间的最大可选时间为结束时间
                    $('#beginTime').datetimepicker("setEndDate", $('#endTime').val());
                });




            });

        </script>


    </div>
</div>
</body>


</html>
