(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["customerUpdate_createUpdate_updateDetail"],{"06cf":function(e,t,r){var a=r("83ab"),n=r("d1e7"),o=r("5c6c"),l=r("fc6a"),s=r("c04e"),c=r("5135"),i=r("0cfb"),u=Object.getOwnPropertyDescriptor;t.f=a?u:function(e,t){if(e=l(e),t=s(t,!0),i)try{return u(e,t)}catch(r){}if(c(e,t))return o(!n.f.call(e,t),e[t])}},"0d03":function(e,t,r){var a=r("6eeb"),n=Date.prototype,o="Invalid Date",l="toString",s=n[l],c=n.getTime;new Date(NaN)+""!=o&&a(n,l,(function(){var e=c.call(this);return e===e?s.call(this):o}))},"0fc0":function(e,t,r){"use strict";r.r(t);var a=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",[r("el-breadcrumb",{attrs:{separator:"/"}},[r("el-breadcrumb-item",{attrs:{to:{path:"/welcome"}}},[e._v("首页")]),r("el-breadcrumb-item",{attrs:{to:{path:"/my/myclient"}}},[e._v("我的客户")]),r("el-breadcrumb-item",{attrs:{to:{path:"/update/customerUpdate",query:e.updateDetail}}},[e._v("客户跟进")]),r("el-breadcrumb-item",[e._v("跟进详情")])],1),r("el-card",[r("div",{staticClass:"clearfix",attrs:{slot:"header"},slot:"header"},[r("span",[e._v("跟进详情")]),r("el-button",{staticStyle:{float:"right",padding:"3px 0"},attrs:{type:"text",icon:"el-icon-d-arrow-left"},on:{click:e.returnHandle}},[e._v("返回")])],1),r("div",{staticClass:"cardContent"},[r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textLeft"},[e._v("客户名称")])]),r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textRight textRightColor"},[e._v(e._s(e.updateDetail.customerName))])])],1),r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textLeft"},[e._v("跟进类型")])]),r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textRight"},[0===e.updateDetail.followUpRecordType?r("el-tag",{attrs:{type:"danger"}},[e._v("电话")]):1===e.updateDetail.followUpRecordType?r("el-tag",[e._v("微信")]):r("el-tag",{attrs:{type:"info"}},[e._v("阿里旺旺")])],1)])],1),r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textLeft"},[e._v("跟进时间")])]),r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textRight"},[e._v(e._s(e.updateDetail.followUpRecordUpdateDate))])])],1),r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textLeft"},[e._v("跟进主题")])]),r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textRight"},[e._v(e._s(e.updateDetail.followUpTheme))])])],1),r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textLeft  "},[e._v("跟进内容")])]),r("el-col",{attrs:{span:12}},[r("div",{staticClass:"textRight textRightContent",domProps:{innerHTML:e._s(e.updateDetail.nextFollowUpContent)}})])],1),r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textLeft"},[e._v("下次提醒时间")])]),r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textRight textRightColor"},[e._v(e._s(e.updateDetail.nextRemindDate?e.updateDetail.nextRemindDate.split(" ")[0]:""))])])],1),r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textLeft"},[e._v("下次跟进主题")])]),r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textRight "},[e._v(e._s(e.updateDetail.nextFollowUpTheme))])])],1),r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textLeft "},[e._v("下次跟进内容")])]),r("el-col",{attrs:{span:12}},[r("div",{staticClass:"textRight textRightContent",domProps:{innerHTML:e._s(e.updateDetail.nextFollowUpContent)}})])],1)],1)])],1)},n=[],o=(r("d3b7"),r("96cf"),r("4328")),l=r.n(o),s={data:function(){return{updateDetail:{}}},created:function(){this.getCustomerUpDetail()},methods:{getCustomerUpDetail:function(){var e,t,r;return regeneratorRuntime.async((function(a){while(1)switch(a.prev=a.next){case 0:return e=l.a.stringify({followUpRecordId:this.$route.query.id}),a.next=3,regeneratorRuntime.awrap(this.$http.post("/followUpRecord/findFollowUpRecordById",e));case 3:if(t=a.sent,r=t.data,200===r.status){a.next=7;break}return a.abrupt("return",this.$message.error("获取客户详情失败！"));case 7:this.updateDetail=r.data;case 8:case"end":return a.stop()}}),null,this)},returnHandle:function(){this.$router.go(-1)}}},c=s,i=(r("fb60"),r("2877")),u=Object(i["a"])(c,a,n,!1,null,"36371661",null);t["default"]=u.exports},"14c3":function(e,t,r){var a=r("c6b6"),n=r("9263");e.exports=function(e,t){var r=e.exec;if("function"===typeof r){var o=r.call(e,t);if("object"!==typeof o)throw TypeError("RegExp exec method returned something other than an Object or null");return o}if("RegExp"!==a(e))throw TypeError("RegExp#exec called on incompatible receiver");return n.call(e,t)}},"1d80":function(e,t){e.exports=function(e){if(void 0==e)throw TypeError("Can't call method on "+e);return e}},"23cb":function(e,t,r){var a=r("a691"),n=Math.max,o=Math.min;e.exports=function(e,t){var r=a(e);return r<0?n(r+t,0):o(r,t)}},"23e7":function(e,t,r){var a=r("da84"),n=r("06cf").f,o=r("9112"),l=r("6eeb"),s=r("ce4e"),c=r("e893"),i=r("94ca");e.exports=function(e,t){var r,u,p,d,f,m,h=e.target,v=e.global,g=e.stat;if(u=v?a:g?a[h]||s(h,{}):(a[h]||{}).prototype,u)for(p in t){if(f=t[p],e.noTargetGet?(m=n(u,p),d=m&&m.value):d=u[p],r=i(v?p:h+(g?".":"#")+p,e.forced),!r&&void 0!==d){if(typeof f===typeof d)continue;c(f,d)}(e.sham||d&&d.sham)&&o(f,"sham",!0),l(u,p,f,e)}}},"241c":function(e,t,r){var a=r("ca84"),n=r("7839"),o=n.concat("length","prototype");t.f=Object.getOwnPropertyNames||function(e){return a(e,o)}},"428f":function(e,t,r){e.exports=r("da84")},"44ad":function(e,t,r){var a=r("d039"),n=r("c6b6"),o="".split;e.exports=a((function(){return!Object("z").propertyIsEnumerable(0)}))?function(e){return"String"==n(e)?o.call(e,""):Object(e)}:Object},"4d64":function(e,t,r){var a=r("fc6a"),n=r("50c4"),o=r("23cb"),l=function(e){return function(t,r,l){var s,c=a(t),i=n(c.length),u=o(l,i);if(e&&r!=r){while(i>u)if(s=c[u++],s!=s)return!0}else for(;i>u;u++)if((e||u in c)&&c[u]===r)return e||u||0;return!e&&-1}};e.exports={includes:l(!0),indexOf:l(!1)}},"50c4":function(e,t,r){var a=r("a691"),n=Math.min;e.exports=function(e){return e>0?n(a(e),9007199254740991):0}},5319:function(e,t,r){"use strict";var a=r("d784"),n=r("825a"),o=r("7b0b"),l=r("50c4"),s=r("a691"),c=r("1d80"),i=r("8aa5"),u=r("14c3"),p=Math.max,d=Math.min,f=Math.floor,m=/\$([$&'`]|\d\d?|<[^>]*>)/g,h=/\$([$&'`]|\d\d?)/g,v=function(e){return void 0===e?e:String(e)};a("replace",2,(function(e,t,r){return[function(r,a){var n=c(this),o=void 0==r?void 0:r[e];return void 0!==o?o.call(r,n,a):t.call(String(n),r,a)},function(e,o){var c=r(t,e,this,o);if(c.done)return c.value;var f=n(e),m=String(this),h="function"===typeof o;h||(o=String(o));var g=f.global;if(g){var b=f.unicode;f.lastIndex=0}var x=[];while(1){var y=u(f,m);if(null===y)break;if(x.push(y),!g)break;var R=String(y[0]);""===R&&(f.lastIndex=i(m,l(f.lastIndex),b))}for(var w="",U=0,F=0;F<x.length;F++){y=x[F];for(var _=String(y[0]),C=p(d(s(y.index),m.length),0),D=[],$=1;$<y.length;$++)D.push(v(y[$]));var T=y.groups;if(h){var k=[_].concat(D,C,m);void 0!==T&&k.push(T);var I=String(o.apply(void 0,k))}else I=a(_,m,C,D,T,o);C>=U&&(w+=m.slice(U,C)+I,U=C+_.length)}return w+m.slice(U)}];function a(e,r,a,n,l,s){var c=a+e.length,i=n.length,u=h;return void 0!==l&&(l=o(l),u=m),t.call(s,u,(function(t,o){var s;switch(o.charAt(0)){case"$":return"$";case"&":return e;case"`":return r.slice(0,a);case"'":return r.slice(c);case"<":s=l[o.slice(1,-1)];break;default:var u=+o;if(0===u)return t;if(u>i){var p=f(u/10);return 0===p?t:p<=i?void 0===n[p-1]?o.charAt(1):n[p-1]+o.charAt(1):t}s=n[u-1]}return void 0===s?"":s}))}}))},"56ef":function(e,t,r){var a=r("d066"),n=r("241c"),o=r("7418"),l=r("825a");e.exports=a("Reflect","ownKeys")||function(e){var t=n.f(l(e)),r=o.f;return r?t.concat(r(e)):t}},6547:function(e,t,r){var a=r("a691"),n=r("1d80"),o=function(e){return function(t,r){var o,l,s=String(n(t)),c=a(r),i=s.length;return c<0||c>=i?e?"":void 0:(o=s.charCodeAt(c),o<55296||o>56319||c+1===i||(l=s.charCodeAt(c+1))<56320||l>57343?e?s.charAt(c):o:e?s.slice(c,c+2):l-56320+(o-55296<<10)+65536)}};e.exports={codeAt:o(!1),charAt:o(!0)}},"6bdf":function(e,t,r){"use strict";var a=r("804c"),n=r.n(a);n.a},7418:function(e,t){t.f=Object.getOwnPropertySymbols},7839:function(e,t){e.exports=["constructor","hasOwnProperty","isPrototypeOf","propertyIsEnumerable","toLocaleString","toString","valueOf"]},"7b0b":function(e,t,r){var a=r("1d80");e.exports=function(e){return Object(a(e))}},"804c":function(e,t,r){},"8aa5":function(e,t,r){"use strict";var a=r("6547").charAt;e.exports=function(e,t,r){return t+(r?a(e,t).length:1)}},9263:function(e,t,r){"use strict";var a=r("ad6d"),n=RegExp.prototype.exec,o=String.prototype.replace,l=n,s=function(){var e=/a/,t=/b*/g;return n.call(e,"a"),n.call(t,"a"),0!==e.lastIndex||0!==t.lastIndex}(),c=void 0!==/()??/.exec("")[1],i=s||c;i&&(l=function(e){var t,r,l,i,u=this;return c&&(r=new RegExp("^"+u.source+"$(?!\\s)",a.call(u))),s&&(t=u.lastIndex),l=n.call(u,e),s&&l&&(u.lastIndex=u.global?l.index+l[0].length:t),c&&l&&l.length>1&&o.call(l[0],r,(function(){for(i=1;i<arguments.length-2;i++)void 0===arguments[i]&&(l[i]=void 0)})),l}),e.exports=l},"94ca":function(e,t,r){var a=r("d039"),n=/#|\.prototype\./,o=function(e,t){var r=s[l(e)];return r==i||r!=c&&("function"==typeof t?a(t):!!t)},l=o.normalize=function(e){return String(e).replace(n,".").toLowerCase()},s=o.data={},c=o.NATIVE="N",i=o.POLYFILL="P";e.exports=o},a691:function(e,t){var r=Math.ceil,a=Math.floor;e.exports=function(e){return isNaN(e=+e)?0:(e>0?a:r)(e)}},ac1f:function(e,t,r){"use strict";var a=r("23e7"),n=r("9263");a({target:"RegExp",proto:!0,forced:/./.exec!==n},{exec:n})},ad6d:function(e,t,r){"use strict";var a=r("825a");e.exports=function(){var e=a(this),t="";return e.global&&(t+="g"),e.ignoreCase&&(t+="i"),e.multiline&&(t+="m"),e.dotAll&&(t+="s"),e.unicode&&(t+="u"),e.sticky&&(t+="y"),t}},b40b:function(e,t,r){"use strict";r.r(t);var a=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",[r("el-breadcrumb",{attrs:{separator:"/"}},[r("el-breadcrumb-item",{attrs:{to:{path:"/welcome"}}},[e._v("首页")]),r("el-breadcrumb-item",{attrs:{to:{path:"/my/myclient"}}},[e._v("我的客户")]),r("el-breadcrumb-item",{attrs:{to:{path:"/update/customerUpdate",query:e.msg}}},[e._v("客户跟进")]),r("el-breadcrumb-item",[e._v("创建跟进")])],1),r("el-card",[r("div",{staticClass:"clearfix",attrs:{slot:"header"},slot:"header"},[r("span",[e._v("跟进详情")])]),r("el-form",{ref:"ruleForm",staticClass:"demo-ruleForm",attrs:{model:e.createUpdateRuleForm,rules:e.createUpdateRules,"label-width":"100px"}},[r("el-form-item",{attrs:{label:"跟进类型",prop:"updateType"}},[r("el-select",{attrs:{placeholder:"请选择跟进类型"},model:{value:e.createUpdateRuleForm.updateType,callback:function(t){e.$set(e.createUpdateRuleForm,"updateType",t)},expression:"createUpdateRuleForm.updateType"}},[r("el-option",{attrs:{label:"电话",value:"0"}}),r("el-option",{attrs:{label:"微信",value:"1"}}),r("el-option",{attrs:{label:"阿里旺旺",value:"2"}})],1)],1),r("el-form-item",{attrs:{label:"跟进时间",required:""}},[r("el-col",{attrs:{span:5}},[r("el-form-item",{attrs:{prop:"date1"}},[r("el-date-picker",{staticStyle:{width:"100%"},attrs:{type:"date",disabled:"",laceholder:"选择日期"},model:{value:e.createUpdateRuleForm.date1,callback:function(t){e.$set(e.createUpdateRuleForm,"date1",t)},expression:"createUpdateRuleForm.date1"}})],1)],1)],1),r("el-form-item",{attrs:{label:"跟进主题",prop:"theme1"}},[r("el-input",{staticClass:"textareaWidth",attrs:{type:"input"},model:{value:e.createUpdateRuleForm.theme1,callback:function(t){e.$set(e.createUpdateRuleForm,"theme1",t)},expression:"createUpdateRuleForm.theme1"}})],1),r("el-form-item",{attrs:{label:"跟进内容",prop:"desc1"}},[r("el-input",{staticClass:"textareaWidth",attrs:{type:"textarea",autosize:{minRows:4},placeholder:e.placeholderText},model:{value:e.createUpdateRuleForm.desc1,callback:function(t){e.$set(e.createUpdateRuleForm,"desc1",t)},expression:"createUpdateRuleForm.desc1"}})],1),r("el-form-item",{attrs:{label:"下次提醒时间",required:""}},[r("el-col",{attrs:{span:5}},[r("el-form-item",{attrs:{prop:"date2"}},[r("el-date-picker",{staticStyle:{width:"100%"},attrs:{type:"date",placeholder:"选择日期"},model:{value:e.createUpdateRuleForm.date2,callback:function(t){e.$set(e.createUpdateRuleForm,"date2",t)},expression:"createUpdateRuleForm.date2"}})],1)],1)],1),r("el-form-item",{attrs:{label:"下次跟进主题",prop:"theme2"}},[r("el-input",{staticClass:"textareaWidth",attrs:{type:"input"},model:{value:e.createUpdateRuleForm.theme2,callback:function(t){e.$set(e.createUpdateRuleForm,"theme2",t)},expression:"createUpdateRuleForm.theme2"}})],1),r("el-form-item",{attrs:{label:"下次跟进内容",prop:"desc2"}},[r("el-input",{staticClass:"textareaWidth",attrs:{type:"textarea",autosize:{minRows:4},placeholder:e.placeholderText},model:{value:e.createUpdateRuleForm.desc2,callback:function(t){e.$set(e.createUpdateRuleForm,"desc2",t)},expression:"createUpdateRuleForm.desc2"}})],1),r("el-form-item",[r("el-button",{attrs:{type:"primary"},on:{click:function(t){return e.createUpdateSubmitForm("ruleForm")}}},[e._v("提交")]),r("el-button",{on:{click:function(t){return e.createUpdateResetForm("ruleForm")}}},[e._v("重置")])],1)],1)],1)],1)},n=[],o=(r("0d03"),r("d3b7"),r("ac1f"),r("5319"),r("96cf"),r("4328")),l=r.n(o),s={data:function(){return{createUpdateRuleForm:{updateType:"",date1:new Date,date2:new Date,desc1:"",desc2:"",theme1:"",theme2:"",finallyDate1:"",finallyDate2:"",finallyContent1:"",finallyContent2:""},createUpdateRules:{updateType:[{required:!0,message:"请选择跟进类型",trigger:"change"}],date1:[{type:"date",required:!0,message:"请选择日期",trigger:"change"}],date2:[{type:"date",required:!0,message:"请选择时间",trigger:"change"}],desc1:[{required:!0,message:"请填写跟进内容",trigger:"blur"}],desc2:[{required:!0,message:"请填写下次跟进内容",trigger:"blur"}],theme1:[{required:!0,message:"请填写跟进主题",trigger:"blur"}],theme2:[{required:!0,message:"请填写下次跟进主题",trigger:"blur"}]},placeholderText:"1.xxxxxxx\n2.xxxxxxx\n3.xxxxxxx",msg:{}}},created:function(){this.msg=this.$route.query},methods:{createUpdateSubmitForm:function(e){var t=this;this.$refs[e].validate((function(e){var r,a,n,o;return regeneratorRuntime.async((function(s){while(1)switch(s.prev=s.next){case 0:if(!e){s.next=17;break}return t.createUpdateRuleForm.finallyDate1=t.timeChange(t.createUpdateRuleForm.date1),t.createUpdateRuleForm.finallyDate2=t.timeChange(t.createUpdateRuleForm.date2),t.createUpdateRuleForm.finallyContent1=t.preText(t.createUpdateRuleForm.desc1),t.createUpdateRuleForm.finallyContent2=t.preText(t.createUpdateRuleForm.desc2),r={UserId:t.$route.query.userId,UserName:t.$route.query.userName,CustomerId:t.$route.query.customerId,CustomerName:t.$route.query.customerName,FollowUpDate:t.createUpdateRuleForm.finallyDate1,FollowUpTheme:t.createUpdateRuleForm.theme1,FollowUpContent:t.createUpdateRuleForm.finallyContent1,NextRemindDate:t.createUpdateRuleForm.finallyDate2,NextFollowUpTheme:t.createUpdateRuleForm.theme2,NextFollowUpContent:t.createUpdateRuleForm.finallyContent2,FollowUpRecordType:t.createUpdateRuleForm.updateType},a=l.a.stringify(r),s.next=9,regeneratorRuntime.awrap(t.$http.post("/followUpRecord/addFollowUpRecord",a));case 9:if(n=s.sent,o=n.data,200===o.status){s.next=13;break}return s.abrupt("return",t.$message.error(o.msg));case 13:return t.$router.push({path:"/update/customerUpdate",query:t.msg}),s.abrupt("return",t.$message.success(o.msg));case 17:return s.abrupt("return",!1);case 18:case"end":return s.stop()}}))}))},createUpdateResetForm:function(e){this.$refs[e].resetFields()},timeChange:function(e){var t=e.getTime(),r=new Date(t),a=r.getFullYear()+"/",n=(r.getMonth()+1<10?"0"+(r.getMonth()+1):r.getMonth()+1)+"/",o=r.getDate(),l=a+n+o;return l},preText:function(e){return e.replace(/\r\n/g,"<br/>").replace(/\n/g,"<br/>").replace(/\s/g,"&nbsp;")},returnHandle:function(){this.$router.push("/update/customerUpdate")}}},c=s,i=(r("6bdf"),r("2877")),u=Object(i["a"])(c,a,n,!1,null,"2b58b5e7",null);t["default"]=u.exports},b722:function(e,t,r){},ca84:function(e,t,r){var a=r("5135"),n=r("fc6a"),o=r("4d64").indexOf,l=r("d012");e.exports=function(e,t){var r,s=n(e),c=0,i=[];for(r in s)!a(l,r)&&a(s,r)&&i.push(r);while(t.length>c)a(s,r=t[c++])&&(~o(i,r)||i.push(r));return i}},d066:function(e,t,r){var a=r("428f"),n=r("da84"),o=function(e){return"function"==typeof e?e:void 0};e.exports=function(e,t){return arguments.length<2?o(a[e])||o(n[e]):a[e]&&a[e][t]||n[e]&&n[e][t]}},d1e7:function(e,t,r){"use strict";var a={}.propertyIsEnumerable,n=Object.getOwnPropertyDescriptor,o=n&&!a.call({1:2},1);t.f=o?function(e){var t=n(this,e);return!!t&&t.enumerable}:a},d784:function(e,t,r){"use strict";var a=r("9112"),n=r("6eeb"),o=r("d039"),l=r("b622"),s=r("9263"),c=l("species"),i=!o((function(){var e=/./;return e.exec=function(){var e=[];return e.groups={a:"7"},e},"7"!=="".replace(e,"$<a>")})),u=!o((function(){var e=/(?:)/,t=e.exec;e.exec=function(){return t.apply(this,arguments)};var r="ab".split(e);return 2!==r.length||"a"!==r[0]||"b"!==r[1]}));e.exports=function(e,t,r,p){var d=l(e),f=!o((function(){var t={};return t[d]=function(){return 7},7!=""[e](t)})),m=f&&!o((function(){var t=!1,r=/a/;return"split"===e&&(r={},r.constructor={},r.constructor[c]=function(){return r},r.flags="",r[d]=/./[d]),r.exec=function(){return t=!0,null},r[d](""),!t}));if(!f||!m||"replace"===e&&!i||"split"===e&&!u){var h=/./[d],v=r(d,""[e],(function(e,t,r,a,n){return t.exec===s?f&&!n?{done:!0,value:h.call(t,r,a)}:{done:!0,value:e.call(r,t,a)}:{done:!1}})),g=v[0],b=v[1];n(String.prototype,e,g),n(RegExp.prototype,d,2==t?function(e,t){return b.call(e,this,t)}:function(e){return b.call(e,this)}),p&&a(RegExp.prototype[d],"sham",!0)}}},e893:function(e,t,r){var a=r("5135"),n=r("56ef"),o=r("06cf"),l=r("9bf2");e.exports=function(e,t){for(var r=n(t),s=l.f,c=o.f,i=0;i<r.length;i++){var u=r[i];a(e,u)||s(e,u,c(t,u))}}},fb60:function(e,t,r){"use strict";var a=r("b722"),n=r.n(a);n.a},fc6a:function(e,t,r){var a=r("44ad"),n=r("1d80");e.exports=function(e){return a(n(e))}},fe62:function(e,t,r){"use strict";r.r(t);var a=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",[r("el-breadcrumb",{attrs:{separator:"/"}},[r("el-breadcrumb-item",{attrs:{to:{path:"/welcome"}}},[e._v("首页")]),r("el-breadcrumb-item",{attrs:{to:{path:"/my/myclient"}}},[e._v("我的客户")]),r("el-breadcrumb-item",[e._v("客户跟进")])],1),r("el-card",[r("div",{staticClass:"clearfix",attrs:{slot:"header"},slot:"header"},[r("span",[e._v("客户跟进")]),r("el-button",{staticStyle:{float:"right",padding:"3px 0"},attrs:{type:"text",icon:"el-icon-d-arrow-left"},on:{click:e.returnHandle}},[e._v("返回")])],1),r("el-row",[r("el-col",{attrs:{span:3}},[r("el-button",{attrs:{type:"primary",icon:"el-icon-circle-plus-outline",size:"middle",plain:""},on:{click:e.createUpdateHandle}},[e._v("创建跟进")])],1)],1),r("el-table",{staticStyle:{width:"100%"},attrs:{data:e.tableData,stripe:"",border:""}},[r("el-table-column",{attrs:{prop:"followUpRecordUpdateDate",label:"跟进时间",width:"180"}}),r("el-table-column",{attrs:{prop:"followUpRecordType",label:"跟进类型",width:"180"},scopedSlots:e._u([{key:"default",fn:function(t){return[0===t.row.followUpRecordType?r("el-tag",{attrs:{type:"danger"}},[e._v("电话")]):1===t.row.followUpRecordType?r("el-tag",{attrs:{type:"success"}},[e._v("微信")]):r("el-tag",{attrs:{type:"info"}},[e._v("阿里旺旺")])]}}])}),r("el-table-column",{attrs:{prop:"followUpTheme",label:"主题"}}),r("el-table-column",{attrs:{prop:"followUpContent",label:"跟进内容"},scopedSlots:e._u([{key:"default",fn:function(t){return[r("div",{domProps:{innerHTML:e._s(t.row.followUpContent)}})]}}])}),r("el-table-column",{attrs:{prop:"nextRemindDate",label:"下次提醒时间"},scopedSlots:e._u([{key:"default",fn:function(t){return[e._v(" "+e._s(t.row.nextRemindDate.split(" ")[0])+" ")]}}])}),r("el-table-column",{attrs:{prop:"followUpRecordCreateDate",label:"保存时间"}}),r("el-table-column",{attrs:{prop:"opration",label:"操作"},scopedSlots:e._u([{key:"default",fn:function(t){return[r("el-button",{attrs:{size:"mini",type:"primary",plain:""},on:{click:function(r){return e.updateDetailHandle(t.row.followUpRecordId)}}},[e._v("详情")])]}}])})],1)],1)],1)},n=[],o=(r("d3b7"),r("96cf"),r("4328")),l=r.n(o),s={data:function(){return{tableData:[]}},created:function(){this.getCustomerUpdate()},methods:{getCustomerUpdate:function(){var e,t,r;return regeneratorRuntime.async((function(a){while(1)switch(a.prev=a.next){case 0:return e=l.a.stringify({customerId:this.$route.query.customerId}),a.next=3,regeneratorRuntime.awrap(this.$http.post("/followUpRecord/findFollowUpRecordByCustomerId",e));case 3:if(t=a.sent,r=t.data,this.tableData=r.data,200===r.status){a.next=8;break}return a.abrupt("return",this.$message.error("获取客户跟进列表失败！"));case 8:case"end":return a.stop()}}),null,this)},createUpdateHandle:function(){this.$router.push({path:"/update/createUpdate",query:{customerId:this.$route.query.customerId,customerName:this.$route.query.customerName,userId:this.$route.query.userId,userName:this.$route.query.userName}})},updateDetailHandle:function(e){this.$router.push({path:"/update/updateDetail",query:{id:e}})},returnHandle:function(){this.$router.push("/my/myclient")}}},c=s,i=r("2877"),u=Object(i["a"])(c,a,n,!1,null,"0bdd35a0",null);t["default"]=u.exports}}]);
//# sourceMappingURL=customerUpdate_createUpdate_updateDetail.a59b4588.js.map