(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["editDetail_custoerPublicAreaDetail"],{"06cf":function(t,e,r){var a=r("83ab"),n=r("d1e7"),s=r("5c6c"),o=r("fc6a"),c=r("c04e"),i=r("5135"),u=r("0cfb"),l=Object.getOwnPropertyDescriptor;e.f=a?l:function(t,e){if(t=o(t),e=c(e,!0),u)try{return l(t,e)}catch(r){}if(i(t,e))return s(!n.f.call(t,e),t[e])}},"159b":function(t,e,r){var a=r("da84"),n=r("fdbc"),s=r("17c2"),o=r("9112");for(var c in n){var i=a[c],u=i&&i.prototype;if(u&&u.forEach!==s)try{o(u,"forEach",s)}catch(l){u.forEach=s}}},"17c2":function(t,e,r){"use strict";var a=r("b727").forEach,n=r("b301");t.exports=n("forEach")?function(t){return a(this,t,arguments.length>1?arguments[1]:void 0)}:[].forEach},"1c0b":function(t,e){t.exports=function(t){if("function"!=typeof t)throw TypeError(String(t)+" is not a function");return t}},"1d80":function(t,e){t.exports=function(t){if(void 0==t)throw TypeError("Can't call method on "+t);return t}},"23cb":function(t,e,r){var a=r("a691"),n=Math.max,s=Math.min;t.exports=function(t,e){var r=a(t);return r<0?n(r+e,0):s(r,e)}},"23e7":function(t,e,r){var a=r("da84"),n=r("06cf").f,s=r("9112"),o=r("6eeb"),c=r("ce4e"),i=r("e893"),u=r("94ca");t.exports=function(t,e){var r,l,f,m,p,d,h=t.target,v=t.global,g=t.stat;if(l=v?a:g?a[h]||c(h,{}):(a[h]||{}).prototype,l)for(f in e){if(p=e[f],t.noTargetGet?(d=n(l,f),m=d&&d.value):m=l[f],r=u(v?f:h+(g?".":"#")+f,t.forced),!r&&void 0!==m){if(typeof p===typeof m)continue;i(p,m)}(t.sham||m&&m.sham)&&s(p,"sham",!0),o(l,f,p,t)}}},"241c":function(t,e,r){var a=r("ca84"),n=r("7839"),s=n.concat("length","prototype");e.f=Object.getOwnPropertyNames||function(t){return a(t,s)}},"30ae":function(t,e,r){"use strict";var a=r("c107"),n=r.n(a);n.a},4160:function(t,e,r){"use strict";var a=r("23e7"),n=r("17c2");a({target:"Array",proto:!0,forced:[].forEach!=n},{forEach:n})},"428f":function(t,e,r){t.exports=r("da84")},"44ad":function(t,e,r){var a=r("d039"),n=r("c6b6"),s="".split;t.exports=a((function(){return!Object("z").propertyIsEnumerable(0)}))?function(t){return"String"==n(t)?s.call(t,""):Object(t)}:Object},"463b":function(t,e,r){"use strict";r.r(e);var a=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",[r("el-breadcrumb",{attrs:{separator:"/"}},[r("el-breadcrumb-item",{attrs:{to:{path:"/welcome"}}},[t._v("首页")]),r("el-breadcrumb-item",[t._v("我的客户")]),r("el-breadcrumb-item",[t._v("客户详情")])],1),r("el-card",{staticClass:"box-card"},[r("div",{staticClass:"clearfix",attrs:{slot:"header"},slot:"header"},[r("span",[t._v("客户详情")])]),r("el-form",{ref:"ruleForm",staticClass:"demo-ruleForm",attrs:{model:t.editDetailRuleForm,rules:t.rules,"label-width":"100px"}},[r("el-form-item",{attrs:{label:"客户状态",prop:"customerStatusId"}},[r("el-select",{attrs:{placeholder:"请选择客户状态"},model:{value:t.editDetailRuleForm.customerStatusId,callback:function(e){t.$set(t.editDetailRuleForm,"customerStatusId",e)},expression:"editDetailRuleForm.customerStatusId"}},[r("el-option",{attrs:{label:"跟进中",value:"1"}}),r("el-option",{attrs:{label:"已成交",value:"2"}}),r("el-option",{attrs:{label:"已失效",value:"3"}})],1)],1),r("el-form-item",{attrs:{label:"客户名称",prop:"customerName"}},[r("el-input",{staticClass:"el-input-width",attrs:{disabled:""},model:{value:t.editDetailRuleForm.customerName,callback:function(e){t.$set(t.editDetailRuleForm,"customerName",e)},expression:"editDetailRuleForm.customerName"}})],1),r("el-form-item",{attrs:{label:"联系人",prop:"contactPersonName"}},[r("el-input",{staticClass:"el-input-width",model:{value:t.editDetailRuleForm.contactPersonName,callback:function(e){t.$set(t.editDetailRuleForm,"contactPersonName",e)},expression:"editDetailRuleForm.contactPersonName"}})],1),r("el-form-item",{attrs:{label:"客户电话",prop:"contactPersonPhone"}},[r("el-input",{staticClass:"el-input-width",model:{value:t.editDetailRuleForm.contactPersonPhone,callback:function(e){t.$set(t.editDetailRuleForm,"contactPersonPhone",e)},expression:"editDetailRuleForm.contactPersonPhone"}})],1),r("el-form-item",{attrs:{label:"客户微信",prop:"contactPersonWechat"}},[r("el-input",{staticClass:"el-input-width",model:{value:t.editDetailRuleForm.contactPersonWechat,callback:function(e){t.$set(t.editDetailRuleForm,"contactPersonWechat",e)},expression:"editDetailRuleForm.contactPersonWechat"}})],1),r("el-form-item",{attrs:{label:"阿里旺旺号",prop:"contactPersonWangwang"}},[r("el-input",{staticClass:"el-input-width",model:{value:t.editDetailRuleForm.contactPersonWangwang,callback:function(e){t.$set(t.editDetailRuleForm,"contactPersonWangwang",e)},expression:"editDetailRuleForm.contactPersonWangwang"}})],1),r("el-form-item",[r("el-button",{attrs:{type:"primary",plain:""},on:{click:function(e){return t.editDetailSubmitForm("ruleForm")}}},[t._v("提交修改")]),r("el-button",{attrs:{plain:"",type:"danger"},on:{click:function(e){return t.editDetailResetForm("ruleForm")}}},[t._v("重置")])],1)],1)],1)],1)},n=[],s=(r("d3b7"),r("498a"),r("96cf"),{data:function(){return{editDetailRuleForm:{customerStatusId:"",customerName:"",contactPersonName:"",contactPersonPhone:"",contactPersonWechat:"",contactPersonWangwang:""},rules:{customerStatusId:[{required:!0,message:"请选择客户状态",trigger:"change"}]}}},created:function(){},methods:{getCustomerDetail:function(){return regeneratorRuntime.async((function(t){while(1)switch(t.prev=t.next){case 0:case"end":return t.stop()}}))},editDetailSubmitForm:function(t){var e=this;this.$refs[t].validate((function(t){if(t){var r=e.addCustomRuleForm.CustomerPhone.trim()||e.addCustomRuleForm.CustomerWechat.trim()||e.addCustomRuleForm.CustomerWangwang.trim();if(!r)return e.$message.error("至少输入一种联系方式！");var a=/^[1](([3][0-9])|([4][5-9])|([5][0-3,5-9])|([6][5,6])|([7][0-8])|([8][0-9])|([9][1,8,9]))[0-9]{8}$/;return a.test(e.addCustomRuleForm.CustomerPhone.trim())?e.$message.success("提交成功！未写"):e.$message.error("请输入合法得手机号！")}return e.$message.error("提交失败！")}))},editDetailResetForm:function(t){this.$refs[t].resetFields()},returnHandle:function(){this.editDetailResetForm("ruleForm"),this.$router.push("/detail/customerDetail")}}}),o=s,c=(r("30ae"),r("2877")),i=Object(c["a"])(o,a,n,!1,null,"756be19e",null);e["default"]=i.exports},"498a":function(t,e,r){"use strict";var a=r("23e7"),n=r("58a8").trim,s=r("e070");a({target:"String",proto:!0,forced:s("trim")},{trim:function(){return n(this)}})},"4d64":function(t,e,r){var a=r("fc6a"),n=r("50c4"),s=r("23cb"),o=function(t){return function(e,r,o){var c,i=a(e),u=n(i.length),l=s(o,u);if(t&&r!=r){while(u>l)if(c=i[l++],c!=c)return!0}else for(;u>l;l++)if((t||l in i)&&i[l]===r)return t||l||0;return!t&&-1}};t.exports={includes:o(!0),indexOf:o(!1)}},"50c4":function(t,e,r){var a=r("a691"),n=Math.min;t.exports=function(t){return t>0?n(a(t),9007199254740991):0}},"56ef":function(t,e,r){var a=r("d066"),n=r("241c"),s=r("7418"),o=r("825a");t.exports=a("Reflect","ownKeys")||function(t){var e=n.f(o(t)),r=s.f;return r?e.concat(r(t)):e}},5899:function(t,e){t.exports="\t\n\v\f\r                　\u2028\u2029\ufeff"},"58a8":function(t,e,r){var a=r("1d80"),n=r("5899"),s="["+n+"]",o=RegExp("^"+s+s+"*"),c=RegExp(s+s+"*$"),i=function(t){return function(e){var r=String(a(e));return 1&t&&(r=r.replace(o,"")),2&t&&(r=r.replace(c,"")),r}};t.exports={start:i(1),end:i(2),trim:i(3)}},"65f0":function(t,e,r){var a=r("861d"),n=r("e8b5"),s=r("b622"),o=s("species");t.exports=function(t,e){var r;return n(t)&&(r=t.constructor,"function"!=typeof r||r!==Array&&!n(r.prototype)?a(r)&&(r=r[o],null===r&&(r=void 0)):r=void 0),new(void 0===r?Array:r)(0===e?0:e)}},7418:function(t,e){e.f=Object.getOwnPropertySymbols},7839:function(t,e){t.exports=["constructor","hasOwnProperty","isPrototypeOf","propertyIsEnumerable","toLocaleString","toString","valueOf"]},"7b0b":function(t,e,r){var a=r("1d80");t.exports=function(t){return Object(a(t))}},"7b1d":function(t,e,r){"use strict";r.r(e);var a=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",[r("el-breadcrumb",{attrs:{separator:"/"}},[r("el-breadcrumb-item",{attrs:{to:{path:"/welcome"}}},[t._v("首页")]),r("el-breadcrumb-item",{attrs:{to:{path:"/my/CustomerPublicArea"}}},[t._v("客户公海")]),r("el-breadcrumb-item",[t._v("公海详情")])],1),r("el-card",{staticClass:"box-card"},[r("div",{staticClass:"clearfix",attrs:{slot:"header"},slot:"header"},[r("span",[t._v("公海详情")]),r("el-button",{staticStyle:{float:"right",padding:"3px 0"},attrs:{type:"text",icon:"el-icon-d-arrow-left"},on:{click:t.returnHandle}},[t._v("返回")])],1),r("div",{staticClass:"cardContent"},[2!==t.currentUserType?r("el-row",[r("el-button",{staticStyle:{float:"right"},attrs:{type:"primary",plain:"",size:"large"},on:{click:t.removeOtherHandle}},[t._v("转入")]),r("el-select",{staticStyle:{float:"right"},attrs:{placeholder:"请选择"},on:{change:t.selectChange},model:{value:t.userValue,callback:function(e){t.userValue=e},expression:"userValue"}},t._l(t.userList,(function(t){return r("el-option",{key:t.userId,attrs:{label:t.userName,value:t.userId}})})),1)],1):t._e(),r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textLeft"},[t._v("客户名称")])]),r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textRight textRightColor"},[t._v(t._s(t.customerPublicAreaMsg.customerName))])])],1),r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textLeft"},[t._v("客户状态")])]),r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textRight"},["1"===t.customerPublicAreaMsg.customerStatusId?r("el-tag",{attrs:{type:"danger"}},[t._v("跟进中")]):"2"===t.customerPublicAreaMsg.customerStatusId?r("el-tag",{attrs:{type:"success"}},[t._v("已成交")]):r("el-tag",{attrs:{type:"info"}},[t._v("已失效")])],1)])],1),r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textLeft"},[t._v("上次跟进时间")])]),r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textRight"},[t._v(t._s(t.customerPublicAreaMsg.contactPersonUpdatedDate))])])],1),r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textLeft"},[t._v("联系人")])]),r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textRight"},[t._v(" "+t._s(t.customerPublicAreaMsg.contactPersonName)+" ")])])],1),r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textLeft"},[t._v("联系电话")])]),r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textRight"},[t._v(t._s(t.customerPublicAreaMsg.contactPersonPhone))])])],1),r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textLeft"},[t._v("微信")])]),r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textRight"},[t._v(t._s(t.customerPublicAreaMsg.contactPersonWechat))])])],1),r("el-row",{attrs:{gutter:20}},[r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textLeft"},[t._v("阿里旺旺号")])]),r("el-col",{attrs:{span:12}},[r("span",{staticClass:"textRight"},[t._v(t._s(t.customerPublicAreaMsg.contactPersonWangwang))])])],1)],1)])],1)},n=[],s=(r("4160"),r("d3b7"),r("159b"),r("96cf"),r("4328")),o=r.n(s),c={data:function(){return{customerPublicAreaMsg:{},currentUserType:null,userList:[],userValue:null,userName:""}},created:function(){this.currentUserType=window.sessionStorage.getItem("userType")-0,this.customerPublicAreaMsg=this.$route.query,this.getUserList(),this.getCustomerAreaDetail()},methods:{returnHandle:function(){this.$router.push({path:"/my/CustomerPublicArea"})},removeOtherHandle:function(){var t,e,r;return regeneratorRuntime.async((function(a){while(1)switch(a.prev=a.next){case 0:return t=o.a.stringify({customerId:this.$route.query.id,userId:this.userValue,customerPublicAreaStatus:1,userName:this.userName}),a.next=3,regeneratorRuntime.awrap(this.$http.post("/customer/updateCustomer",t));case 3:if(e=a.sent,r=e.data,200===r.status){a.next=7;break}return a.abrupt("return",this.$message.error("修改用户信息失败"));case 7:this.$router.push({path:"/my/CustomerPublicArea"}),this.$message.success(r.msg);case 9:case"end":return a.stop()}}),null,this)},getUserList:function(){var t,e,r,a,n=this;return regeneratorRuntime.async((function(s){while(1)switch(s.prev=s.next){case 0:return s.next=2,regeneratorRuntime.awrap(this.$http.post("/user/findUser"));case 2:t=s.sent,e=t.data,r=e.data.items,a=[],a=r.forEach((function(t){2===t.userType&&a.push(t),n.userList=a}));case 7:case"end":return s.stop()}}),null,this)},getCustomerAreaDetail:function(){var t,e,r;return regeneratorRuntime.async((function(a){while(1)switch(a.prev=a.next){case 0:return t=o.a.stringify({customerId:this.$route.query.id}),a.next=3,regeneratorRuntime.awrap(this.$http.post("/customer/findCustomerById",t));case 3:e=a.sent,r=e.data,this.customerPublicAreaMsg={customerName:r.data.customer.customerName||"",customerStatusId:r.data.customer.customerStatusId||"",contactPersonName:r.data.contactPersonList[0].contactPersonName||"",contactPersonPhone:r.data.contactPersonList[0].contactPersonPhone||"",contactPersonWechat:r.data.contactPersonList[0].contactPersonPhone||"",contactPersonWangwang:r.data.contactPersonList[0].contactPersonWangwang||"",contactPersonUpdatedDate:r.data.contactPersonList[0].contactPersonUpdatedDate||""};case 6:case"end":return a.stop()}}),null,this)},selectChange:function(t){var e,r,a;return regeneratorRuntime.async((function(n){while(1)switch(n.prev=n.next){case 0:if(!t){n.next=7;break}return e=o.a.stringify({userId:t}),n.next=4,regeneratorRuntime.awrap(this.$http.post("/user/findUser",e));case 4:r=n.sent,a=r.data,this.userName=a.data.userName;case 7:case"end":return n.stop()}}),null,this)}}},i=c,u=(r("878c"),r("2877")),l=Object(u["a"])(i,a,n,!1,null,"300db4a2",null);e["default"]=l.exports},"878c":function(t,e,r){"use strict";var a=r("986e"),n=r.n(a);n.a},"94ca":function(t,e,r){var a=r("d039"),n=/#|\.prototype\./,s=function(t,e){var r=c[o(t)];return r==u||r!=i&&("function"==typeof e?a(e):!!e)},o=s.normalize=function(t){return String(t).replace(n,".").toLowerCase()},c=s.data={},i=s.NATIVE="N",u=s.POLYFILL="P";t.exports=s},"986e":function(t,e,r){},a691:function(t,e){var r=Math.ceil,a=Math.floor;t.exports=function(t){return isNaN(t=+t)?0:(t>0?a:r)(t)}},b301:function(t,e,r){"use strict";var a=r("d039");t.exports=function(t,e){var r=[][t];return!r||!a((function(){r.call(null,e||function(){throw 1},1)}))}},b727:function(t,e,r){var a=r("f8c2"),n=r("44ad"),s=r("7b0b"),o=r("50c4"),c=r("65f0"),i=[].push,u=function(t){var e=1==t,r=2==t,u=3==t,l=4==t,f=6==t,m=5==t||f;return function(p,d,h,v){for(var g,b,P=s(p),x=n(P),y=a(d,h,3),w=o(x.length),C=0,R=v||c,L=e?R(p,w):r?R(p,0):void 0;w>C;C++)if((m||C in x)&&(g=x[C],b=y(g,C,P),t))if(e)L[C]=b;else if(b)switch(t){case 3:return!0;case 5:return g;case 6:return C;case 2:i.call(L,g)}else if(l)return!1;return f?-1:u||l?l:L}};t.exports={forEach:u(0),map:u(1),filter:u(2),some:u(3),every:u(4),find:u(5),findIndex:u(6)}},c107:function(t,e,r){},ca84:function(t,e,r){var a=r("5135"),n=r("fc6a"),s=r("4d64").indexOf,o=r("d012");t.exports=function(t,e){var r,c=n(t),i=0,u=[];for(r in c)!a(o,r)&&a(c,r)&&u.push(r);while(e.length>i)a(c,r=e[i++])&&(~s(u,r)||u.push(r));return u}},d066:function(t,e,r){var a=r("428f"),n=r("da84"),s=function(t){return"function"==typeof t?t:void 0};t.exports=function(t,e){return arguments.length<2?s(a[t])||s(n[t]):a[t]&&a[t][e]||n[t]&&n[t][e]}},d1e7:function(t,e,r){"use strict";var a={}.propertyIsEnumerable,n=Object.getOwnPropertyDescriptor,s=n&&!a.call({1:2},1);e.f=s?function(t){var e=n(this,t);return!!e&&e.enumerable}:a},e070:function(t,e,r){var a=r("d039"),n=r("5899"),s="​᠎";t.exports=function(t){return a((function(){return!!n[t]()||s[t]()!=s||n[t].name!==t}))}},e893:function(t,e,r){var a=r("5135"),n=r("56ef"),s=r("06cf"),o=r("9bf2");t.exports=function(t,e){for(var r=n(e),c=o.f,i=s.f,u=0;u<r.length;u++){var l=r[u];a(t,l)||c(t,l,i(e,l))}}},e8b5:function(t,e,r){var a=r("c6b6");t.exports=Array.isArray||function(t){return"Array"==a(t)}},f8c2:function(t,e,r){var a=r("1c0b");t.exports=function(t,e,r){if(a(t),void 0===e)return t;switch(r){case 0:return function(){return t.call(e)};case 1:return function(r){return t.call(e,r)};case 2:return function(r,a){return t.call(e,r,a)};case 3:return function(r,a,n){return t.call(e,r,a,n)}}return function(){return t.apply(e,arguments)}}},fc6a:function(t,e,r){var a=r("44ad"),n=r("1d80");t.exports=function(t){return a(n(t))}},fdbc:function(t,e){t.exports={CSSRuleList:0,CSSStyleDeclaration:0,CSSValueList:0,ClientRectList:0,DOMRectList:0,DOMStringList:0,DOMTokenList:1,DataTransferItemList:0,FileList:0,HTMLAllCollection:0,HTMLCollection:0,HTMLFormElement:0,HTMLSelectElement:0,MediaList:0,MimeTypeArray:0,NamedNodeMap:0,NodeList:1,PaintRequestList:0,Plugin:0,PluginArray:0,SVGLengthList:0,SVGNumberList:0,SVGPathSegList:0,SVGPointList:0,SVGStringList:0,SVGTransformList:0,SourceBufferList:0,StyleSheetList:0,TextTrackCueList:0,TextTrackList:0,TouchList:0}}}]);
//# sourceMappingURL=editDetail_custoerPublicAreaDetail.4776fcbd.js.map