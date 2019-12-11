(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["login_main_welcome"],{"046f":function(e,t,s){e.exports=s.p+"img/logoMain.c2013ca4.png"},"06c6":function(e,t,s){},2773:function(e,t,s){},"6e78":function(e,t,s){"use strict";var r=s("ff23"),o=s.n(r);o.a},9868:function(e,t,s){"use strict";var r=s("2773"),o=s.n(r);o.a},a55b:function(e,t,s){"use strict";s.r(t);var r=function(){var e=this,t=e.$createElement,s=e._self._c||t;return s("div",{staticClass:"login_container"},[s("div",{staticClass:"login_box"},[e._m(0),s("el-form",{ref:"loginFormRef",staticClass:"login_form",attrs:{model:e.loginForm,rules:e.loginFormRules,"label-width":"0px"}},[s("el-form-item",{attrs:{prop:"username"}},[s("el-input",{attrs:{"prefix-icon":"iconfont icon-user",placeholder:"用户名"},model:{value:e.loginForm.username,callback:function(t){e.$set(e.loginForm,"username",t)},expression:"loginForm.username"}})],1),s("el-form-item",{attrs:{prop:"password"}},[s("el-input",{attrs:{"prefix-icon":"iconfont icon-3702mima",type:"password",placeholder:"密码"},on:{change:e.pwdChangeHandle},model:{value:e.loginForm.password,callback:function(t){e.$set(e.loginForm,"password",t)},expression:"loginForm.password"}})],1),s("el-form-item",{staticClass:"btns"},[s("el-button",{attrs:{type:"primary"},nativeOn:{click:function(t){return t.preventDefault(),e.login(t)},keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.loginEnter("loginData")}}},[e._v("登录")]),s("el-button",{attrs:{type:"info"},on:{click:e.resetLoginForm}},[e._v("重置")])],1)],1)],1)])},o=[function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",{staticClass:"avatar_box"},[r("img",{staticStyle:{width:"100%"},attrs:{src:s("cf05"),alt:""}})])}],i=(s("d3b7"),s("96cf"),s("4328")),n=s.n(i),a={data:function(){return{loginForm:{username:"",password:""},loginFormRules:{username:[{required:!0,message:"请输入登录名称",trigger:"blur"},{min:2,max:4,message:"长度在 3 到 10 个字符",trigger:"blur"}],password:[{required:!0,message:"请输入登录密码",trigger:"blur"},{min:3,max:16,message:"长度在 6 到 15 个字符",trigger:"blur"}]}}},mounted:function(){},created:function(){var e=this;document.onkeydown=function(t){if(void 0===window.event)var s=t.keyCode;else s=window.event.keyCode;13===s&&e.loginEnter("loginData")}},methods:{loginEnter:function(){this.login()},pwdChangeHandle:function(e){},resetLoginForm:function(){this.$refs.loginFormRef.resetFields()},login:function(){var e=this;this.$refs.loginFormRef.validate((function(t){var s,r;return regeneratorRuntime.async((function(o){while(1)switch(o.prev=o.next){case 0:if(t){o.next=2;break}return o.abrupt("return");case 2:return o.next=4,regeneratorRuntime.awrap(e.$http.post("/user/findUserLogin",n.a.stringify(e.loginForm)));case 4:if(s=o.sent,r=s.data,200===r.status){o.next=8;break}return o.abrupt("return",e.$message.error(r.msg));case 8:document.onkeydown=void 0,e.$message.success("登录成功"),window.sessionStorage.setItem("userId",r.data.userId),window.sessionStorage.setItem("userName",r.data.userName),window.sessionStorage.setItem("userType",r.data.userType),e.$router.push("/main");case 14:case"end":return o.stop()}}))}))}}},l=a,c=(s("6e78"),s("2877")),u=Object(c["a"])(l,r,o,!1,null,"759a08d2",null);t["default"]=u.exports},b70f:function(e,t,s){"use strict";var r=s("06c6"),o=s.n(r);o.a},cd56:function(e,t,s){"use strict";s.r(t);var r=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("el-container",{staticClass:"home-container"},[r("el-header",[r("div",[r("img",{staticStyle:{height:"60px","margin-left":"30px"},attrs:{src:s("046f"),alt:""}})]),r("el-dropdown",{attrs:{trigger:"click"},on:{command:e.handleCommand}},[r("span",{staticClass:"el-dropdown-link"},[e._v(" "+e._s(e.userName)),r("i",{staticClass:"el-icon-arrow-down el-icon--right"})]),r("el-dropdown-menu",{attrs:{slot:"dropdown"},slot:"dropdown"},[r("el-dropdown-item",{attrs:{icon:"el-icon-edit",command:"/editpass/editpassword"}},[e._v("修改密码")]),r("el-dropdown-item",{attrs:{icon:"el-icon-switch-button",command:"/"}},[e._v("退出")])],1)],1)],1),r("el-container",[r("el-aside",{attrs:{width:e.isCollapse?"64px":"200px"}},[r("div",{staticClass:"toggle-button",on:{click:e.toggleCollapse}},[e._v(" ||| ")]),r("el-menu",{attrs:{"background-color":"#eee","text-color":"#666","active-text-color":"#889EFF","unique-opened":"",collapse:e.isCollapse,"collapse-transition":!1,router:"","default-active":e.activePath}},[r("el-submenu",[r("template",{slot:"title"},[r("i",{staticClass:"el-icon-s-data"}),r("span",[e._v("我的客户")])]),r("el-menu-item",{attrs:{index:"/my/myclient"},on:{click:function(t){return e.saveNavState("/my/myclient")}}},[r("template",{slot:"title"},[r("i",{staticClass:"el-icon-user"}),r("span",[e._v("我的客户")])])],2),r("el-menu-item",{attrs:{index:"/my/CustomerPublicArea"},on:{click:function(t){return e.saveNavState("/my/CustomerPublicArea")}}},[r("template",{slot:"title"},[r("i",{staticClass:"el-icon-user"}),r("span",[e._v("客户公海")])])],2)],2),r("el-submenu",[r("template",{slot:"title"},[r("i",{staticClass:"el-icon-notebook-1"}),r("span",[e._v("工作日报")])]),r("el-menu-item",{attrs:{index:"/work/daily"},on:{click:function(t){return e.saveNavState("/work/daily")}}},[r("template",{slot:"title"},[r("i",{staticClass:"el-icon-document"}),r("span",[e._v("我的日报")])])],2)],2),2!==e.userType?r("div",[r("el-submenu",[r("template",{slot:"title"},[r("i",{staticClass:"el-icon-setting"}),r("span",[e._v("用户管理")])]),r("el-menu-item",{attrs:{index:"/user/userControl"},on:{click:function(t){return e.saveNavState("/user/userControl")}}},[r("template",{slot:"title"},[r("i",{staticClass:"el-icon-s-tools"}),r("span",[e._v("用户管理")])])],2)],2)],1):e._e()],1)],1),r("el-main",[r("router-view")],1)],1),r("el-dialog",{attrs:{title:"修改密码",visible:e.editPasswordDialogVisible,width:"50%","before-close":e.handleClose},on:{"update:visible":function(t){e.editPasswordDialogVisible=t}}},[r("el-form",{ref:"ruleForm",staticClass:"demo-ruleForm",attrs:{model:e.editPasswordRuleForm,rules:e.rules,"label-width":"100px"}},[r("el-form-item",{attrs:{label:"新密码",prop:"userPassword"}},[r("el-input",{staticClass:"el-input-width",attrs:{autocomplete:"off",type:"password"},model:{value:e.editPasswordRuleForm.userPassword,callback:function(t){e.$set(e.editPasswordRuleForm,"userPassword",t)},expression:"editPasswordRuleForm.userPassword"}})],1),r("el-form-item",{attrs:{label:"确认新密码",prop:"checkPassword"}},[r("el-input",{staticClass:"el-input-width",attrs:{autocomplete:"off",type:"password"},model:{value:e.editPasswordRuleForm.checkPassword,callback:function(t){e.$set(e.editPasswordRuleForm,"checkPassword",t)},expression:"editPasswordRuleForm.checkPassword"}})],1),r("el-alert",{staticStyle:{"margin-bottom":"10px","margin-top":"-10px",width:"490px","margin-left":"106px","text-align":"center"},attrs:{title:"即将修改密码 注意文档保存",type:"error"}}),r("el-form-item",[r("el-button",{attrs:{type:"primary",plain:""},on:{click:function(t){return e.editPasswordSubmitForm("ruleForm")}}},[e._v("立即修改")]),r("el-button",{attrs:{plain:"",type:"danger"},on:{click:function(t){return e.editPasswordResetForm("ruleForm")}}},[e._v("重置")])],1)],1)],1)],1)},o=[],i=(s("d3b7"),s("96cf"),s("4328")),n=s.n(i),a={data:function(){var e=this,t=function(t,s,r){""===s?r(new Error("请输入密码")):(""!==e.editPasswordRuleForm.checkPassword&&e.$refs.ruleForm.validateField("checkPassword"),r())},s=function(t,s,r){""===s?r(new Error("请再次输入密码")):s!==e.editPasswordRuleForm.userPassword?r(new Error("两次输入密码不一致!")):r()};return{isCollapse:!1,activePath:"",userName:"",userType:null,editPasswordDialogVisible:!1,editPasswordRuleForm:{userPassword:"",checkPassword:""},rules:{userPassword:[{validator:t,trigger:"blur"},{min:3,max:16,message:"长度在 6 到 15 个字符",trigger:"blur"}],checkPassword:[{validator:s,trigger:"blur"}]}}},created:function(){this.userName=window.sessionStorage.getItem("userName"),this.userType=window.sessionStorage.getItem("userType")-0,this.activePath=window.sessionStorage.getItem("activePath")},methods:{handleClose:function(){this.editPasswordResetForm("ruleForm"),this.editPasswordDialogVisible=!1},editPasswordSubmitForm:function(e){var t=this;this.$refs[e].validate((function(e){var s,r,o,i;return regeneratorRuntime.async((function(a){while(1)switch(a.prev=a.next){case 0:if(!e){a.next=15;break}return s={userId:window.sessionStorage.getItem("userId"),userPassword:t.editPasswordRuleForm.checkPassword},r=n.a.stringify(s),a.next=5,regeneratorRuntime.awrap(t.$http.post("/user/updateUser",r));case 5:if(o=a.sent,i=o.data,t.clearCookie(),window.sessionStorage.clear(),200===i.status){a.next=11;break}return a.abrupt("return",t.$message.error("用户信息更新失败！"));case 11:return t.$router.push("/"),a.abrupt("return",t.$message.success("请重新登录！"));case 15:return a.abrupt("return",!1);case 16:case"end":return a.stop()}}))}))},editPasswordResetForm:function(e){this.$refs[e].resetFields()},handleCommand:function(e){"/editpass/editpassword"===e?this.editPasswordDialogVisible=!0:(window.sessionStorage.clear(),this.clearCookie(),this.$router.push("/"))},logout:function(){window.sessionStorage.clear()},getMenuList:function(){return regeneratorRuntime.async((function(e){while(1)switch(e.prev=e.next){case 0:case"end":return e.stop()}}))},toggleCollapse:function(){this.isCollapse=!this.isCollapse},saveNavState:function(e){window.sessionStorage.setItem("activePath",e),this.activePath=e},clearCookie:function(){this.setCookie("","")},setCookie:function(e,t){window.document.cookie="username="+e+";",window.document.cookie="password="+t+";"}}},l=a,c=(s("b70f"),s("2877")),u=Object(c["a"])(l,r,o,!1,null,"2f18cac4",null);t["default"]=u.exports},cf05:function(e,t,s){e.exports=s.p+"img/logo.335af26b.png"},eec5:function(e,t,s){"use strict";s.r(t);var r=function(){var e=this,t=e.$createElement,s=e._self._c||t;return s("div",{staticClass:"home"},[s("div",{staticClass:"bgc"},[s("el-card",{staticClass:"box-card upRecordByRemind"},[e.isUpRecordByRemind?s("div",[s("div",{staticClass:"title"},[e._v("跟进提醒")]),e._l(e.upRecordByRemind,(function(t,r){return s("el-collapse",{key:r,model:{value:e.activeNames,callback:function(t){e.activeNames=t},expression:"activeNames"}},[s("el-collapse-item",{attrs:{title:t.customerName,name:r}},[s("div",{staticStyle:{"margin-bottom":"15px"}},[s("p",{staticClass:"upRecordByRemindTitle"},[e._v("跟进主题： ")]),s("div",{staticStyle:{"margin-left":"80px","margin-top":"-20px"},domProps:{innerHTML:e._s(t.nextFollowUpTheme)}})]),s("div",[s("p",{staticClass:"upRecordByRemindTitle"},[e._v("跟进内容: "),s("el-button",{staticStyle:{float:"right"},attrs:{type:"text"},on:{click:function(s){return e.targetHandle(t.followUpRecordId)}}},[e._v(" 详情 ")])],1),s("div",{staticStyle:{"margin-left":"80px","margin-top":"-20px"},domProps:{innerHTML:e._s(t.nextFollowUpContent)}})])])],1)}))],2):s("div",{staticClass:"noRemind",staticStyle:{"font-size":"14px",color:"#78b9ee"}},[e._v("暂无更新提醒~")])])],1)])},o=[],i=(s("d3b7"),s("96cf"),s("4328")),n=s.n(i),a={data:function(){return{drawer:!1,activeNames:["1"],upRecordByRemind:[],isUpRecordByRemind:!1}},created:function(){this.getUpRecordByRemind(),0!==this.upRecordByRemind.length&&(this.drawer=!0)},methods:{targetHandle:function(e){this.$router.push({path:"/update/updateDetail",query:{id:e}})},getUpRecordByRemind:function(){var e,t,s;return regeneratorRuntime.async((function(r){while(1)switch(r.prev=r.next){case 0:return e=n.a.stringify({userId:window.sessionStorage.getItem("userId")}),r.next=3,regeneratorRuntime.awrap(this.$http.post("/followUpRecord/findFollowUpRecordByRemind",e));case 3:if(t=r.sent,s=t.data,200===s.status){r.next=7;break}return r.abrupt("return",this.$message.error("获取更新提醒失败！"));case 7:this.upRecordByRemind=s.data,s.data.length>=1&&(this.isUpRecordByRemind=!0);case 9:case"end":return r.stop()}}),null,this)},handleChange:function(e){}}},l=a,c=(s("9868"),s("2877")),u=Object(c["a"])(l,r,o,!1,null,"b87e78d2",null);t["default"]=u.exports},ff23:function(e,t,s){}}]);
//# sourceMappingURL=login_main_welcome.d3bbb233.js.map