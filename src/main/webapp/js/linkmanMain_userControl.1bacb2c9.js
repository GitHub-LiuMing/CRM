(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["linkmanMain_userControl"],{"01d6":function(e,t,r){"use strict";var a=r("2b93"),s=r.n(a);s.a},"2b93":function(e,t,r){},"2ed3":function(e,t,r){"use strict";var a=r("4697"),s=r.n(a);s.a},4697:function(e,t,r){},"498a":function(e,t,r){"use strict";var a=r("23e7"),s=r("58a8").trim,n=r("e070");a({target:"String",proto:!0,forced:n("trim")},{trim:function(){return s(this)}})},5899:function(e,t){e.exports="\t\n\v\f\r                　\u2028\u2029\ufeff"},"58a8":function(e,t,r){var a=r("1d80"),s=r("5899"),n="["+s+"]",o=RegExp("^"+n+n+"*"),i=RegExp(n+n+"*$"),l=function(e){return function(t){var r=String(a(t));return 1&e&&(r=r.replace(o,"")),2&e&&(r=r.replace(i,"")),r}};e.exports={start:l(1),end:l(2),trim:l(3)}},e070:function(e,t,r){var a=r("d039"),s=r("5899"),n="​᠎";e.exports=function(e){return a((function(){return!!s[e]()||n[e]()!=n||s[e].name!==e}))}},f984:function(e,t,r){"use strict";r.r(t);var a=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",[r("el-breadcrumb",{attrs:{separator:"/"}},[r("el-breadcrumb-item",{attrs:{to:{path:"/welcome"}}},[e._v("首页")]),r("el-breadcrumb-item",[e._v("用户管理")])],1),r("el-card",{staticClass:"box-card"},[r("div",{staticClass:"clearfix",attrs:{slot:"header"},slot:"header"},[r("span",[e._v("用户管理")])]),r("el-row",[r("el-col",{attrs:{span:3}},[r("el-button",{attrs:{type:"primary",icon:"el-icon-circle-plus-outline",size:"middle",plain:""},on:{click:e.addUserHandle}},[e._v("新增用户")])],1)],1),r("el-table",{staticStyle:{width:"100%"},attrs:{data:e.userTableData,border:"",stripe:""}},[r("el-table-column",{attrs:{prop:"userType",label:"用户类型",width:"180"},scopedSlots:e._u([{key:"default",fn:function(t){return[0===t.row.userType?r("el-tag",[e._v("超级管理员")]):1===t.row.userType?r("el-tag",{attrs:{type:"success"}},[e._v("管理员")]):r("el-tag",{attrs:{type:"warning"}},[e._v("普通用户")])]}}])}),r("el-table-column",{attrs:{prop:"userName",label:"用户名",width:"180"}}),r("el-table-column",{attrs:{prop:"userUpdateDate",label:"修改时间"}}),r("el-table-column",{attrs:{label:"操作"},scopedSlots:e._u([{key:"default",fn:function(t){return[0===e.userType?r("el-button",{attrs:{type:"text",size:"mini"},on:{click:function(r){return e.editUserInfo(t.row.userId,t.row.userName,t.row.userType)}}},[e._v("修改")]):1===e.userType?r("el-button",{attrs:{type:"text",size:"mini"},on:{click:function(r){return e.editUserInfo(t.row.userId,t.row.userName,t.row.userType)}}},[e._v("修改")]):r("el-button",{attrs:{type:"text",size:"mini"}},[e._v("查看")])]}}])})],1),r("el-pagination",{attrs:{"current-page":e.currentPage,"page-sizes":[10,20,30,40],"page-size":e.pageSize,layout:"total, sizes, prev, pager, next, jumper",total:e.totalNum},on:{"size-change":e.handleSizeChange,"current-change":e.handleCurrentChange}})],1),r("el-dialog",{attrs:{title:"新增用户",visible:e.addUserDialogVisible,width:"50%","before-close":e.handleClose},on:{"update:visible":function(t){e.addUserDialogVisible=t}}},[r("el-form",{ref:"ruleForm",staticClass:"demo-ruleForm",attrs:{model:e.addUserRuleForm,rules:e.rules,"label-width":"100px"}},[r("el-form-item",{attrs:{label:"用户类型",prop:"userType"}},[r("el-select",{attrs:{placeholder:"请选择用户类型"},model:{value:e.addUserRuleForm.userType,callback:function(t){e.$set(e.addUserRuleForm,"userType",t)},expression:"addUserRuleForm.userType"}},[r("el-option",{attrs:{label:"管理员",value:"1"}}),r("el-option",{attrs:{label:"普通用户",value:"2"}}),r("el-option",{attrs:{label:"超级管理员",value:"0"}})],1)],1),r("el-form-item",{attrs:{label:"用户名称",prop:"userName"}},[r("el-input",{staticClass:"el-input-width",model:{value:e.addUserRuleForm.userName,callback:function(t){e.$set(e.addUserRuleForm,"userName",t)},expression:"addUserRuleForm.userName"}})],1),r("el-form-item",{attrs:{label:"用户密码",prop:"userPassword"}},[r("el-input",{staticClass:"el-input-width",attrs:{autocomplete:"off",type:"password"},model:{value:e.addUserRuleForm.userPassword,callback:function(t){e.$set(e.addUserRuleForm,"userPassword",t)},expression:"addUserRuleForm.userPassword"}})],1),r("el-form-item",{attrs:{label:"确认密码",prop:"checkPassword"}},[r("el-input",{staticClass:"el-input-width",attrs:{autocomplete:"off",type:"password"},model:{value:e.addUserRuleForm.checkPassword,callback:function(t){e.$set(e.addUserRuleForm,"checkPassword",t)},expression:"addUserRuleForm.checkPassword"}})],1),r("el-form-item",[r("el-button",{attrs:{type:"primary",plain:""},on:{click:function(t){return e.addUserSubmitForm("ruleForm")}}},[e._v("立即新增")]),r("el-button",{attrs:{plain:"",type:"danger"},on:{click:function(t){return e.addUserResetForm("ruleForm")}}},[e._v("重置")])],1)],1)],1),r("el-dialog",{attrs:{title:"修改用户",visible:e.editUserDialogVisible,width:"50%","before-close":e.editHandleClose},on:{"update:visible":function(t){e.editUserDialogVisible=t}}},[r("el-form",{ref:"ruleForm",staticClass:"demo-ruleForm",attrs:{model:e.editUserRuleForm,rules:e.editRules,"label-width":"100px"}},[r("el-form-item",{attrs:{label:"用户类型",prop:"userType"}},[r("el-select",{attrs:{disabled:"",placeholder:"请选择用户类型"},model:{value:e.editUserRuleForm.userType,callback:function(t){e.$set(e.editUserRuleForm,"userType",t)},expression:"editUserRuleForm.userType"}},[r("el-option",{attrs:{label:"管理员",value:"1"}}),r("el-option",{attrs:{label:"普通用户",value:"2"}}),r("el-option",{attrs:{label:"超级管理员",value:"0"}})],1)],1),r("el-form-item",{attrs:{label:"用户名称",prop:"userName"}},[r("el-input",{staticClass:"el-input-width",attrs:{disabled:""},model:{value:e.editUserRuleForm.userName,callback:function(t){e.$set(e.editUserRuleForm,"userName",t)},expression:"editUserRuleForm.userName"}})],1),r("el-form-item",{attrs:{label:"用户密码",prop:"userPassword"}},[r("el-input",{staticClass:"el-input-width",attrs:{autocomplete:"off",type:"password"},model:{value:e.editUserRuleForm.userPassword,callback:function(t){e.$set(e.editUserRuleForm,"userPassword",t)},expression:"editUserRuleForm.userPassword"}})],1),r("el-form-item",{attrs:{label:"确认密码",prop:"checkPassword"}},[r("el-input",{staticClass:"el-input-width",attrs:{autocomplete:"off",type:"password"},model:{value:e.editUserRuleForm.checkPassword,callback:function(t){e.$set(e.editUserRuleForm,"checkPassword",t)},expression:"editUserRuleForm.checkPassword"}})],1),r("el-form-item",[r("el-button",{attrs:{type:"primary",plain:""},on:{click:function(t){return e.editUserSubmitForm("ruleForm")}}},[e._v("立即修改")]),r("el-button",{attrs:{plain:"",type:"danger"},on:{click:function(t){return e.editUserResetForm("ruleForm")}}},[e._v("重置")])],1)],1)],1)],1)},s=[],n=(r("d3b7"),r("96cf"),r("4328")),o=r.n(n),i={data:function(){var e=this,t=function(t,r,a){""===r?a(new Error("请输入密码")):(""!==e.addUserRuleForm.checkPassword&&e.$refs.ruleForm.validateField("checkPassword"),a())},r=function(t,r,a){""===r?a(new Error("请再次输入密码")):r!==e.addUserRuleForm.userPassword?a(new Error("两次输入密码不一致!")):a()},a=function(t,r,a){""===r?a(new Error("请输入密码")):(""!==e.editUserRuleForm.checkPassword&&e.$refs.ruleForm.validateField("checkPassword"),a())},s=function(t,r,a){""===r?a(new Error("请再次输入密码")):r!==e.editUserRuleForm.userPassword?a(new Error("两次输入密码不一致!")):a()};return{userTableData:[],userType:null,addUserDialogVisible:!1,addUserRuleForm:{userType:"",userName:"",userPassword:"",checkPassword:""},rules:{userType:[{required:!0,message:"请选择用户类型",trigger:"change"}],userName:[{required:!0,message:"请填写用户名称",trigger:"blur"}],userPassword:[{validator:t,trigger:"blur"}],checkPassword:[{validator:r,trigger:"blur"}]},totalNum:null,pageSize:null,currentPage:1,editUserDialogVisible:!1,editUserRuleForm:{userType:"",userName:"",userPassword:"",checkPassword:""},editRules:{userType:[{required:!0,message:"请选择用户类型",trigger:"change"}],userName:[{required:!0,message:"请填写用户名称",trigger:"blur"}],userPassword:[{validator:a,trigger:"blur"}],checkPassword:[{validator:s,trigger:"blur"}]},editUserId:null,editUserName:"",editUserType:null}},created:function(){this.userType=window.sessionStorage.getItem("userType")-0,this.getUserList()},methods:{editUserInfo:function(e,t,r){this.editUserId=e,this.editUserName=t,this.editUserRuleForm.userName=t,this.editUserRuleForm.userType=r+"",this.editUserDialogVisible=!0},handleCurrentChange:function(e){this.currentPage=e,this.getUserList()},handleSizeChange:function(e){this.pageSize=e,this.getUserList()},handleClose:function(){this.addUserResetForm("ruleForm"),this.addUserDialogVisible=!1},addUserSubmitForm:function(e){var t=this;this.$refs[e].validate((function(e){var r,a,s,n;return regeneratorRuntime.async((function(i){while(1)switch(i.prev=i.next){case 0:if(!e){i.next=16;break}return r={userName:t.addUserRuleForm.userName,userPassword:t.addUserRuleForm.userPassword,userType:t.addUserRuleForm.userType,userId:window.sessionStorage.getItem("userId")},a=o.a.stringify(r),i.next=5,regeneratorRuntime.awrap(t.$http.post("/user/addUser",a));case 5:if(s=i.sent,n=s.data,200!==n.status){i.next=12;break}return t.addUserDialogVisible=!1,t.addUserResetForm("ruleForm"),t.getUserList(),i.abrupt("return",t.$message.success("新增用户成功！"));case 12:if(500!==n.status){i.next=14;break}return i.abrupt("return",t.$message.error("当前用户已存在！"));case 14:i.next=17;break;case 16:return i.abrupt("return",!1);case 17:case"end":return i.stop()}}))}))},addUserResetForm:function(e){this.$refs[e].resetFields()},addUserHandle:function(){this.addUserDialogVisible=!0},editUserSubmitForm:function(e){var t=this;this.$refs[e].validate((function(e){var r,a,s,n;return regeneratorRuntime.async((function(i){while(1)switch(i.prev=i.next){case 0:if(!e){i.next=14;break}return r={userId:t.editUserId,userPassword:t.editUserRuleForm.checkPassword},a=o.a.stringify(r),i.next=5,regeneratorRuntime.awrap(t.$http.post("/user/updateUser",a));case 5:if(s=i.sent,n=s.data,200===n.status){i.next=9;break}return i.abrupt("return",t.$message.error(n.msg));case 9:t.editUserResetForm("ruleForm"),t.editUserDialogVisible=!1,t.$message.success(n.msg),i.next=15;break;case 14:return i.abrupt("return",!1);case 15:case"end":return i.stop()}}))}))},editUserResetForm:function(e){this.$refs[e].resetFields()},editUserHandle:function(){this.editUserDialogVisible=!0},editHandleClose:function(){this.editUserDialogVisible=!1,this.editUserResetForm("ruleForm")},getUserList:function(){var e,t,r;return regeneratorRuntime.async((function(a){while(1)switch(a.prev=a.next){case 0:return e=o.a.stringify({pageSize:this.pageSize,pageNum:this.currentPage}),a.next=3,regeneratorRuntime.awrap(this.$http.post("/user/findUser",e));case 3:if(t=a.sent,r=t.data,this.totalNum=r.data.totalNum-0,this.pageSize=r.data.pageSize-0,this.currentPage=r.data.currentPage,this.userTableData=r.data.items,200===r.status){a.next=11;break}return a.abrupt("return",this.$message.error("获取用户列表失败！"));case 11:case"end":return a.stop()}}),null,this)}}},l=i,u=(r("2ed3"),r("2877")),d=Object(u["a"])(l,a,s,!1,null,"5b30f916",null);t["default"]=d.exports},fb1d:function(e,t,r){"use strict";r.r(t);var a=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",[r("el-breadcrumb",{attrs:{separator:"/"}},[r("el-breadcrumb-item",{attrs:{to:{path:"/welcome"}}},[e._v("首页")]),r("el-breadcrumb-item",{attrs:{to:{path:"/my/myclient"}}},[e._v("我的客户")]),r("el-breadcrumb-item",[e._v("联系人")])],1),r("el-card",{staticClass:"box-card"},[r("div",{staticClass:"clearfix",attrs:{slot:"header"},slot:"header"},[r("span",[e._v("联系人")]),r("el-button",{staticStyle:{float:"right",padding:"3px 0"},attrs:{type:"text",icon:"el-icon-d-arrow-left"},on:{click:e.returnHandle}},[e._v("返回")])],1),r("div",[r("el-row",[r("el-col",{attrs:{span:3}},[r("el-button",{attrs:{type:"primary",icon:"el-icon-circle-plus-outline",size:"middle",plain:""},on:{click:e.addLinkmanHandle}},[e._v("新增")])],1),r("el-col",{attrs:{span:6}})],1),r("el-row",[r("el-table",{staticStyle:{width:"100%"},attrs:{data:e.customerTableData,stripe:"",border:""}},[r("el-table-column",{attrs:{type:"index",width:"50"}}),r("el-table-column",{attrs:{prop:"contactPersonName",label:"联系人",width:"130"}}),r("el-table-column",{attrs:{prop:"contactPersonPhone",label:"电话",width:"180"},scopedSlots:e._u([{key:"default",fn:function(t){return[e._v(" "+e._s(t.row.contactPersonPhone?t.row.contactPersonPhone:"---")+" ")]}}])}),r("el-table-column",{attrs:{prop:"contactPersonWechat",label:"微信",width:"180"},scopedSlots:e._u([{key:"default",fn:function(t){return[e._v(" "+e._s(t.row.contactPersonWechat?t.row.contactPersonWechat:"---")+" ")]}}])}),r("el-table-column",{attrs:{prop:"contactPersonWangwang",label:"阿里旺旺",width:"180"},scopedSlots:e._u([{key:"default",fn:function(t){return[e._v(" "+e._s(t.row.contactPersonWangwang?t.row.contactPersonWangwang:"---")+" ")]}}])}),r("el-table-column",{attrs:{prop:"contactPersonUpdatedDate",label:"更新时间"}})],1)],1)],1)]),r("el-dialog",{attrs:{title:"新增联系人",visible:e.addLinkmanDialogVisible,width:"50%","before-close":e.handleClose},on:{"update:visible":function(t){e.addLinkmanDialogVisible=t}}},[r("el-form",{ref:"ruleForm",staticClass:"demo-ruleForm",attrs:{model:e.addLinkmanRuleForm,rules:e.rules,"label-width":"100px"}},[r("el-form-item",{attrs:{label:"联系人",prop:"contactPersonName"}},[r("el-input",{staticClass:"el-input-width",model:{value:e.addLinkmanRuleForm.contactPersonName,callback:function(t){e.$set(e.addLinkmanRuleForm,"contactPersonName",t)},expression:"addLinkmanRuleForm.contactPersonName"}})],1),r("el-form-item",{attrs:{label:"电话",prop:"contactPersonPhone"}},[r("el-input",{staticClass:"el-input-width",model:{value:e.addLinkmanRuleForm.contactPersonPhone,callback:function(t){e.$set(e.addLinkmanRuleForm,"contactPersonPhone",t)},expression:"addLinkmanRuleForm.contactPersonPhone"}})],1),r("el-form-item",{attrs:{label:"微信",prop:"contactPersonWechat"}},[r("el-input",{staticClass:"el-input-width",model:{value:e.addLinkmanRuleForm.contactPersonWechat,callback:function(t){e.$set(e.addLinkmanRuleForm,"contactPersonWechat",t)},expression:"addLinkmanRuleForm.contactPersonWechat"}})],1),r("el-form-item",{attrs:{label:"阿里旺旺号",prop:"contactPersonWangwang"}},[r("el-input",{staticClass:"el-input-width",model:{value:e.addLinkmanRuleForm.contactPersonWangwang,callback:function(t){e.$set(e.addLinkmanRuleForm,"contactPersonWangwang",t)},expression:"addLinkmanRuleForm.contactPersonWangwang"}})],1),r("el-form-item",[r("el-button",{attrs:{type:"primary",plain:""},on:{click:function(t){return e.addLinkmanSubmitForm("ruleForm")}}},[e._v("立即新增")]),r("el-button",{attrs:{plain:"",type:"danger"},on:{click:function(t){return e.addLinkmanResetForm("ruleForm")}}},[e._v("重置")])],1)],1)],1)],1)},s=[],n=(r("d3b7"),r("498a"),r("96cf"),r("4328")),o=r.n(n),i={data:function(){return{customerTableData:[],addLinkmanDialogVisible:!1,addLinkmanRuleForm:{contactPersonPhone:"",contactPersonWechat:"",contactPersonWangwang:"",contactPersonName:"",customerId:""},rules:{contactPersonName:[{required:!0,message:"请填写客户名称",trigger:"blur"}]}}},created:function(){this.customeId=this.$route.params.id,this.getLinkman()},methods:{getLinkman:function(){var e,t,r;return regeneratorRuntime.async((function(a){while(1)switch(a.prev=a.next){case 0:return e=o.a.stringify({customerId:this.$route.params.id}),a.next=3,regeneratorRuntime.awrap(this.$http.post("/contactPerson/findContactPerson",e));case 3:if(t=a.sent,r=t.data,200===r.status){a.next=7;break}return a.abrupt("return",this.$message.error("获取联系人失败！"));case 7:this.customerTableData=r.data;case 8:case"end":return a.stop()}}),null,this)},addLinkmanHandle:function(){this.addLinkmanDialogVisible=!0},addLinkeman:function(){var e,t,r;return regeneratorRuntime.async((function(a){while(1)switch(a.prev=a.next){case 0:return this.addLinkmanRuleForm.customerId=this.$route.params.id,e=o.a.stringify(this.addLinkmanRuleForm),a.next=4,regeneratorRuntime.awrap(this.$http.post("/contactPerson/addContactPerson",e));case 4:if(t=a.sent,r=t.data,200!==r.status){a.next=11;break}return this.addLinkmanDialogVisible=!1,this.addLinkmanResetForm("ruleForm"),this.getLinkman(),a.abrupt("return",this.$message.success("新增联系人成功！"));case 11:case"end":return a.stop()}}),null,this)},addLinkmanSubmitForm:function(e){var t=this;this.$refs[e].validate((function(e){var r,a;return regeneratorRuntime.async((function(s){while(1)switch(s.prev=s.next){case 0:if(!e){s.next=16;break}if(r=t.addLinkmanRuleForm.contactPersonPhone.trim()||t.addLinkmanRuleForm.contactPersonWechat.trim()||t.addLinkmanRuleForm.contactPersonWangwang.trim(),r){s.next=4;break}return s.abrupt("return",t.$message.error("至少输入一种联系方式！"));case 4:if(a=/^[1](([3][0-9])|([4][5-9])|([5][0-3,5-9])|([6][5,6])|([7][0-8])|([8][0-9])|([9][1,8,9]))[0-9]{8}$/,!t.addLinkmanRuleForm.contactPersonPhone.trim()){s.next=13;break}if(!a.test(t.addLinkmanRuleForm.contactPersonPhone.trim())){s.next=10;break}t.addLinkeman(),s.next=11;break;case 10:return s.abrupt("return",t.$message.error("请输入合法得手机号！"));case 11:s.next=14;break;case 13:t.addLinkeman();case 14:s.next=17;break;case 16:return s.abrupt("return",t.$message.error("提交失败！"));case 17:case"end":return s.stop()}}))}))},addLinkmanResetForm:function(e){this.$refs[e].resetFields()},returnHandle:function(){this.$router.push("/my/myclient")},handleClose:function(){this.addLinkmanResetForm("ruleForm"),this.addLinkmanDialogVisible=!1}}},l=i,u=(r("01d6"),r("2877")),d=Object(u["a"])(l,a,s,!1,null,"e64eedc8",null);t["default"]=d.exports}}]);
//# sourceMappingURL=linkmanMain_userControl.1bacb2c9.js.map