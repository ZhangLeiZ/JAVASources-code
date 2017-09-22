<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="renderer" content="webkit">
<meta name="applicable-device" content="pc">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta http-equiv="Cache-Control" content="no-transform" >
<meta name="application-name" content="美团网－吃喝玩乐全都有">
<meta name="baidu-site-verification" content="TiWCN4h5v3" />
<meta name="description" content="海口美团网精选海口美食餐厅,酒店预订,电影票,旅游景点,外卖订餐,海口团购信息,您可查询商家评价店铺信息。海口生活,下载美团官方APP,吃喝玩乐1折起">
<link rel="alternate" media="only screen and (max-width:640px)" href="http://i.meituan.com/?city=haikou">
<meta name="keywords" content="海口美食,海口酒店,海口团购">
<link rel="dns-prefetch" href="//c.meituan.net">
<link rel="dns-prefetch" href="//s0.meituan.net">
<link rel="dns-prefetch" href="//s1.meituan.net">
<link rel="dns-prefetch" href="//p0.meituan.net">
<link rel="dns-prefetch" href="//p1.meituan.net">
<link rel="dns-prefetch" href="//analytics.meituan.com">
<link rel="alternate" href="http://haikou.meituan.com/feed" title="订阅更新" type="application/rss+xml">
<link rel="apple-touch-icon" href="//s0.meituan.net/bs/file/?f=fewww:/www/img/apple-touch-icon-ipad.png@b8186a3">
<link rel="shortcut icon" href="//p1.meituan.net/meismis/44f8f3736d61a550dc0fa7bc1a70b6056518.ico">
<link rel="icon" href="//p1.meituan.net/meismis/44f8f3736d61a550dc0fa7bc1a70b6056518.ico" sizes="16x16 32x32">
<link rel="canonical" href="http://haikou.meituan.com">
<title>海口美团网-海口美食_酒店_旅游_团购_电影_吃喝玩乐</title>
<script>(function(a,b){var c={exports:{}};c.exports;a[b]=c.exports;var d=c.exports;d.polyfill=function(a){var b=this.filter(this.detect(),a);a=[];for(var c in b)b.hasOwnProperty(c)&&b[c]&&a.push(c+".min.js");a.length&&this.request(a)},d.request=function(b){a.document.write(['<script src="',this.getUrl(b),'"></',"script>"].join(""))},d.getUrl=function(b){var c=this.config,d=a.location.protocol,e="https:"===d?c.httpsHost:c.httpHost;return d+"//"+e+c.publicPath+b.join(",")+"@v"+c.version},d.iev=function(){for(var b,c=3,d=a.document.createElement("div"),e=d.getElementsByTagName("i");d.innerHTML="<!--[if gt IE "+ ++c+"]><i></i><![endif]-->",e[0];);return c>4?c:b},d.detect=function(){var b=this.iev();return{promise:!("Promise"in a&&"resolve"in a.Promise&&"reject"in a.Promise&&"all"in a.Promise&&"race"in a.Promise&&function(){var b;return new a.Promise(function(a){b=a}),"function"==typeof b}()),pngfix:b&&7>b,html5:b&&9>b,es5:b&&9>b||"function"!=typeof Function.prototype.bind}},d.filter=function(a,b){if(!b||!b.length)return a;var c=!0,d=0;"!"===b[0]&&(c=!1,d=1);for(var e,f=c?{}:a,g=b.length;g>d;++d)e=b[d],a.hasOwnProperty(e)&&(f[e]=c&&a[e]);return f},c.exports.config={httpHost:"s0.meituan.net",httpsHost:"s0.meituan.com",publicPath:"/bs/jsm?f=polyfill:",version:"1.0.7"},c.exports.polyfill(c.polyfills)}).call(window,window,"Polyfill");</script>
<script>
    var M = {}, _gaq = [], Y, _mbq = function () {
        (_mbq._q = _mbq._q || []).push(arguments);
    };
    (function (P) {"function"!=typeof Date.now&&(Date.now=function(){return(new Date).getTime()}),window.M=window.M||{},M.TimeTracker={start:Date.now(),reqtime:P.ts},M.DELTA_TIME=M.TimeTracker.reqtime-M.TimeTracker.start,M.Env={},M.subresources={names:[]},M.logFirstScreenTime=function(a){M.TimeTracker.fst=Date.now(),a&&a.src&&(M.subresources.names.push(a.src),M.subresources.lastImage=a.src,M.subresources.firstImage||(M.subresources.firstImage=a.src))},M.delayImg=function(a){var b=a.getAttribute("data-src");a.removeAttribute("data-src"),b&&window.setTimeout(function(){a.src=b},200)},M._autoinit=[];}).call(window, {"ts":1493203780000,"action":["index","default"]});(function (P) {function packOrganic(a,b){var c,d,e,f,g,h,i=a.lastIndexOf("?"),j=[["baidu","wd"],["baidu","word"],["baidu","kw"],["google","q"],["soso","w"],["bing","q"],["sogou","query"],["yahoo","p"],["youdao","q"],["vnet","kw"],["haosou","q"]];if(c=a.match(/(?:\/\/)([^:\/?#]*)/),i>-1&&c){if(d=c[1],d.indexOf("meituan.com")>-1)return null;for(e=parse(a.substring(i+1)),f=0,g=j.length;g>f;++f)if(h=j[f],d.indexOf("."+h[0]+".")>-1&&e.hasOwnProperty(h[1]))return{utm_campaign:h[0],utm_medium:"organic",utm_source:h[0],utm_content:b,utm_term:encode(e[h[1]])}}return null}function redirect(a){var b,c=[];for(b in a)a.hasOwnProperty(b)&&c.push(encode(b)+"="+encode(a[b]));window.location.href=url+(-1===url.indexOf("?")?"?":"&")+c.join("&")}function parse(a){var b,c,d,e={};if(a)for(a=a.split("&"),b=0,c=a.length;c>b;++b)d=a[b].split("="),e[decode(d[0])]=d[1]?decode(d[1]):"";return e}var referrer=document.referrer,url=window.location.href,organic,encode=encodeURIComponent,decode=decodeURIComponent;referrer&&-1===url.indexOf("utm_source=")&&(organic=packOrganic(referrer,P.page),organic&&redirect(organic));}).call(window, {"page":"homepage"});
    !function(e,t,n){function s(){var e=t.createElement("script");e.async=!0,e.src="https://s0.meituan.net/bs/js/?f=mta-js:mta.min.js";;var n=t.getElementsByTagName("script")[0];n.parentNode.insertBefore(e,n)}if(e.MeituanAnalyticsObject=n,e[n]=e[n]||function(){(e[n].q=e[n].q||[]).push(arguments)},"complete"===t.readyState)s();else{var r="addEventListener",i="attachEvent";if(e[r])e[r]("load",s,!1);else if(e[i])e[i]("onload",s);else{var a=e.onload;e.onload=function(){s(),a&&a()}}}}(window,document,"mta");
    mta('create','5371750ce87460c1504d7ca2');
    mta('config','sampleRate',5);
    mta('config','beaconImage','https://frep.meituan.com/_.gif');
    mta('tag','page','index-floornew');
    mta('send','page');
</script>
    <script class="cached-resources" id="CR-js-asyncjs">
    !function(a,b){"use strict";function c(a,b){var c=a.length;return~b&&c>b&&(c=b),c}function d(a,b){v.setTimeout(a,b||0)}function e(a){d(function(){throw a})}function f(a){return/(^(https?:)?\/\/)|(\.(js|php)$)/.test(a)&&!/(\n|\r)/m.test(a)}function g(a){return a&&a.constructor&&a.call&&a.apply}function h(a){var b;return(b=Array.isArray)?b(a)?a:[a]:w.concat(a)}function i(a){return w.slice.call(a)}function j(){var a=i(arguments);return function(){return z.apply(z,a.concat(i(arguments)))}}function k(a,b){var c=this;if((!c.readyState||/^c|loade/.test(c.readyState))&&!c.loadStatus){if(c.onload=c.onreadystatechange=c.onerror=null,c.loadStatus=!0,b&&"error"===b.type){var d=c.src||"Resource",f=" fails to load.",g={name:"ConnectionError",source:d,evt:b,stack:d+f,message:f,toString:function(){return this.source+this.message}};return e(g),void a.reject(g)}a.resolve()}}function l(a,b){var c="script",d=u.createElement(c),e=u.getElementsByTagName(c),f=e[e.length-1];if(d.async=!0,d.src=a,b){d.loadStatus=!1;var g=j(k,d,b);d.onload=d.onreadystatechange=d.onerror=g;var h=f;h=h||document.body.firstChild,h.parentNode.insertBefore(d,h)}}function m(a,b){y(function(){try{a.call(null,b)}catch(c){b.reject(c)}})}function n(a,b){if(!g(a)){if(f(a))return void l(a,b);if(x)return a=s+encodeURIComponent(a),void l(a,b)}var c=g(a)?a:Function(a);if(!b.async){var d=c;c=function(a){try{d.call(null),a.resolve()}catch(b){a.reject(b)}}}m(c,b)}function o(a,b){var c=this;c.tasks=[],c.callbacks=[],c.errors=[],c.data={},c.nextTask=0,c.nextCallback=0,c.until=-1,c.digest=!1,c.add(a).whenDone(b)}function p(){var a=this;if(a.digest)return void d(j(p,a),50/3);a.digest=!0;for(var b,e,f=a.nextCallback;f<c(a.callbacks,a.until);f++)if(a.nextTask===a.tasks.length){if(e=a.nextCallback,b=a.callbacks[e]){if(a.nextCallback=f+1,b.call(null,a.data,a.nextTask-1,a.errors),!b.untilThen)continue;a.nextCallback--,a.until=-1}a.callbacks.splice(e,1)}a.digest=!1}function q(){var a=this;return a.nextTask<a.tasks.length&&++a.nextTask!==a.tasks.length?a:(p.call(a),a)}function r(a,b){return new o(a,b)}var s="data:application/javascript,",t="OMITTED",u=document,v=window,w=Array.prototype,x=!0;u.all&&!u.addEventListener&&(x=!1);var y=v.requestAnimationFrame||v.webkitRequestAnimationFrame||v.mozRequestAnimationFrame||d,z=Function.call;o.prototype.resolve=function(a,b){var c=this;return a&&a!==t&&(c.data[a]=b),q.call(c)},o.prototype.reject=function(a){var b=this;return a&&(e(a),b.errors.push(a)),q.call(b)},o.prototype.whenDone=function(a){var b=this;return a?b.nextTask>b.tasks.length?b:(b.callbacks.push(a),b.nextTask===b.tasks.length&&b.resolve(),b):b},o.prototype.add=function(a,b){var c=this;if(!a)return c;if(b&&c[b]){var d=new Error("Callback value name: "+b+" is registered");e(d),c.errors.push(d)}a=h(a);for(var f,g={resolve:j(c.resolve,c,b),reject:c.reject,async:!!b},i=0;i<a.length;i++)f=a[i],f&&(c.tasks.push(f),n(f,g));return c},o.prototype.then=function(a,b){function c(){d.until=d.nextCallback,d.add(a,b)}var d=this;return a?(c.untilThen=!0,d.whenDone(c)):d},"undefined"!=typeof module&&module.exports?module.exports=r:"function"==typeof define&&define.amd?define(function(){return r}):b[a]=r}("asyncJS",this);
</script>
<script>M.Env["data-conf"] = {"domainHost":"meituan.com","cdnDomainHost":"meituan.net","rootHost":"www.meituan.com","app":"www","comboBase":"\/\/s0.meituan.net\/bs\/css\/?f=","yuiVersion":"3.16.0","httpReferer":"http:\/\/www.meituan.com\/","debug":false,"pageview":"\/","pageviewData":{"page":"index\/floornew"},"asyncPageviewData":[],"gaCustomVar":"","coreCssUrl":"\/\/s0.meituan.net\/bs\/css\/?f=fewww:www\/css\/common.css,www\/css\/base.css,www\/css\/seo.css@b8186a3","moreCssUrl":"","coreJsUrl":"\/\/s0.meituan.net\/bs\/js\/?f=require(@mtfe\/yui):build\/mt-web-core\/mt-web-core.js@3.16.0;fewww:www\/js\/inline\/conf.js@b8186a3;require(@mtfe\/fe.core):mt-core\/mt-core.js,mt-base\/mt-base.js,mt-uiutil\/mt-uiutil.js,mt-window\/mt-window.js,mt-event\/mt-event.js,mt-event-hover\/mt-event-hover.js,mt-component\/mt-component.js,mt-viewporttracker\/mt-viewporttracker.js,mt-bigrender\/mt-bigrender.js,mt-imageloader\/mt-imageloader.js,mt-ajax\/mt-ajax.js,uix-dropdown\/uix-dropdown.js,p-node-placeholder\/p-node-placeholder.js,p-node-effect\/p-node-effect.js@0.2.125;fewww:www\/js\/base.js,www\/js\/tracker.js,www\/js\/hub.js,www\/component\/search-box\/search-box.js,www\/component\/cate-nav\/cate-nav.js@b8186a3;require(@mtfe\/fe.core):mt-ngparser\/mt-ngparser.js,mt-scope\/mt-scope.js,mt-validator\/mt-validator.js,mt-autoinit\/mt-autoinit.js,mt-bind\/mt-bind.js@0.2.125","jsDepsUrl":"\/\/s0.meituan.net\/bs\/js\/?f=require(@mtfe\/fe.core):deps.js@0.2.125;fewww:www\/deps.js,\/www\/js\/inline\/init.js,\/www\/js\/inline\/pg-shwg.js@b8186a3","ravenUrl":"\/\/s0.meituan.net\/bs\/js\/?f=fewww:vendor\/js\/raven-helper.min.js@b8186a3","ag":"\/\/s0.meituan.net\/bs\/file\/?f=fewww:\/vendor\/js\/ag.js@b8186a3","DEV":0,"nodelogin":false,"repoHash":{"yui":"3.16.0","fecore":"0.2.125","fewww":"b8186a3"},"useBS":true,"BSTypeJs":"js","BSTypeCss":"css","BSName":"fewww"};</script>


<script>
    M._mtq = asyncJS();
    M._mtq.then("//s0.meituan.net/bs/js/?f=require(@mtfe/yui):build/mt-web-core/mt-web-core.js@3.16.0;fewww:www/js/inline/conf.js@b8186a3;require(@mtfe/fe.core):mt-core/mt-core.js,mt-base/mt-base.js,mt-uiutil/mt-uiutil.js,mt-window/mt-window.js,mt-event/mt-event.js,mt-event-hover/mt-event-hover.js,mt-component/mt-component.js,mt-viewporttracker/mt-viewporttracker.js,mt-bigrender/mt-bigrender.js,mt-imageloader/mt-imageloader.js,mt-ajax/mt-ajax.js,uix-dropdown/uix-dropdown.js,p-node-placeholder/p-node-placeholder.js,p-node-effect/p-node-effect.js@0.2.125;fewww:www/js/base.js,www/js/tracker.js,www/js/hub.js,www/component/search-box/search-box.js,www/component/cate-nav/cate-nav.js@b8186a3;require(@mtfe/fe.core):mt-ngparser/mt-ngparser.js,mt-scope/mt-scope.js,mt-validator/mt-validator.js,mt-autoinit/mt-autoinit.js,mt-bind/mt-bind.js@0.2.125");
    M._mtq.then("//s0.meituan.net/bs/js/?f=require(@mtfe/fe.core):deps.js@0.2.125;fewww:www/deps.js,/www/js/inline/init.js,/www/js/inline/pg-shwg.js@b8186a3");
    M._mtq.then("//s0.meituan.net/bs/js/?f=fewww:vendor/js/analytics.js@b8186a3");
</script>

    <link rel="stylesheet" type="text/css" href="//s0.meituan.net/bs/css/?f=fewww:/www/css/common.css,/www/css/base.css,/www/css/search-box.css,/www/css/cate-nav.css@b8186a3" />
    <link rel="stylesheet" type="text/css" href="//s0.meituan.net/bs/css/?f=fewww:/www/css/index-hotfilter.css,/www/css/floor-fsnew.css,/www/css/floor-elevator.css,/www/css/deallist.css,/www/css/banner-index.css,/www/css/floor-new-v2.css,/www/css/slides.css@b8186a3" />

<noscript hidden style="display:none;" class="J-hub" data-hublaziness="load" data-hubcss="fewww:www/css/lazyload.css,iconfont/css/global-iconfont.css@b8186a3"></noscript>

</head>
<body class="pg-floor-new-v2" >
    <header id="site-mast"  class="site-mast" >
    <div class="site-mast__user-nav-w" id="J-site-mast__user-nav-w">
        <div class="site-mast__user-nav cf">
            <ul class="basic-info">
                <li class="site-mast__keep">
                    <a rel="nofollow" class="fav" id="J-favorite" gaevent="header/addFavorite" data-mod="fa" href="javascript:;">
                        <i class="F-glob F-glob-star-border icon-keep"></i>
                        收藏美团
                    </a>
                </li>
                <li class="user-info cf"  data-comboajax-uri='/combo/userinfo' data-comboajax-onsuccess='this.setHTML($response.html);' data-comboajax-state='0'>
                    <a  class="user-info__login"  id="J-login" href="https://passport.meituan.com/account/unitivelogin?service=www&amp;continue=http%3A%2F%2Fwww.meituan.com%2Faccount%2Fsettoken%3Fcontinue%3Dhttp%253A%252F%252Fhaikou.meituan.com%252F" gaevent="top/login">登录</a>
                    <a class="user-info__signup" href="https://passport.meituan.com/account/unitivesignup?service=www&amp;continue=http%3A%2F%2Fwww.meituan.com%2Faccount%2Fsettoken%3Fcontinue%3Dhttp%253A%252F%252Fhaikou.meituan.com%252F%253Futm_campaign%253Dbaidu%2526utm_medium%253Dorganic%2526utm_source%253Dbaidu%2526utm_content%253Dhomepage%2526utm_term%253D" gaevent="top/signup">注册</a>
                </li>
                <li data-uix="dropdown" class="dropdown dropdown--msg"  data-comboajax-uri='/index/message' data-comboajax-onsuccess='$request.listen("www-tips", "www.MsgCenter");' data-comboajax-state='0' style="display:none;">
                    <a id="J-my-msg" rel="nofollow" class="dropdown__toggle" href="http://www.meituan.com/message/" gaevent="nav/mymsg">
                        <span class="J-title">消息</span>
                        <i class="tri tri--dropdown"></i>
                    </a>
                </li>
            </ul>
            <ul class="site-mast__user-w">
                <li class="user-orders">
                    <a href="http://www.meituan.com/orders/">我的订单</a>
                </li>
                <li data-uix="dropdown" class="dropdown dropdown--account">
                    <a id="J-my-account-toggle" rel="nofollow" class="dropdown__toggle" href="http://www.meituan.com/orders/" gaevent="nav/my" data-mttcode="Amymeituan">
                        <span>我的美团</span>
                        <i class="tri tri--dropdown"></i>
                        <i class="vertical-bar"></i>
                    </a>
                    <ul id="J-my-account-menu" class="dropdown-menu dropdown-menu--text dropdown-menu--account account-menu" data-mtnode="Amymeituan">
                        <li><a class="dropdown-menu__item first " rel="nofollow" gaevent="nav/my/orders" href="http://www.meituan.com/orders/" data-mttcode="Borders">我的订单</a></li>
                        <li><a class="dropdown-menu__item  " rel="nofollow" gaevent="nav/my/feedback" href="http://www.meituan.com/rates/" data-mttcode="Brates">我的评价</a></li>
                        <li><a class="dropdown-menu__item  " rel="nofollow" gaevent="nav/my/collections" href="http://www.meituan.com/collections/" data-mttcode="Bcollections">我的收藏</a></li>
                        <li><a class="dropdown-menu__item  " rel="nofollow" gaevent="nav/my/card" href="http://www.meituan.com/card/list" data-mttcode="Bvoucher">抵用券</a></li>
                        <li><a class="dropdown-menu__item  " rel="nofollow" gaevent="nav/my/credit" href="http://www.meituan.com/account/credit" data-mttcode="Bcredit">我的余额</a></li>
                        <li><a class="dropdown-menu__item  last" rel="nofollow" gaevent="nav/my/settings" href="http://www.meituan.com/account/settings" data-mttcode="Bsettings">账户设置</a></li>
                    </ul>
                </li>
                <li data-uix="dropdown" data-params='{"classname": "dropdown--open dropdown--open-history"}' class="dropdown dropdown--history"  data-comboajax-uri='/index/rvd' data-comboajax-config='www.History.nav' data-comboajax-state='0'>
                    <a id="J-my-history-toggle" rel="nofollow" class="dropdown__toggle" href="javascript:;" gaevent="nav/history">
                        <span>最近浏览</span>
                        <i class="tri tri--dropdown"></i>
                        <i class="vertical-bar"></i>
                    </a>
                    <div id="J-my-history-menu" class="dropdown-menu dropdown-menu--deal dropdown-menu--history"></div>
                </li>
                <li data-uix="dropdown" id="J-site-help" class="dropdown dropdown--help">
                    <a class="dropdown__toggle" href="http://www.meituan.com/help/selfservice" gaevent="top/service">
                        <span>联系客服</span>
                        <i class="tri tri--dropdown"></i>
                        <i class="vertical-bar"></i>
                    </a>
                    <div class="dropdown-menu dropdown-menu--text dropdown-menu--help">
                        <ul class="site-help-info">
                            <li><a rel="nofollow" class="J-selfservice-tab dropdown-menu__item" data-tab="0" href="http://www.meituan.com/help/selfservice" gaevent="top/service/refund">申请退款</a></li>
                            <li><a rel="nofollow" class="J-selfservice-tab dropdown-menu__item" data-tab="1" href="http://www.meituan.com/help/selfservice?tab=1" gaevent="top/service/returns">申请退换货</a></li>
                            <li><a rel="nofollow" class="J-selfservice-tab dropdown-menu__item" data-tab="2" href="http://www.meituan.com/help/selfservice?tab=2" gaevent="top/service/code">查看美团券</a></li>
                            <li><a rel="nofollow" class="J-selfservice-tab dropdown-menu__item" data-tab="3" href="http://www.meituan.com/help/selfservice?tab=3" gaevent="top/service/tel">换绑手机号</a></li>
                            <li><a rel="nofollow" class="dropdown-menu__item" href="http://www.meituan.com/help/faq" gaevent="top/service/faq">常见问题</a></li>
                        </ul>
                    </div>
                </li>
                <li data-uix="dropdown" id="J-site-merchant" class="dropdown dropdown--merchant">
                    <a class="dropdown__toggle dropdown__toggle--merchant" href="javascript:;" gaevent="top/merchant">
                        <span>我是商家</span>
                        <i class="tri tri--dropdown"></i>
                        <i class="vertical-bar"></i>
                    </a>
                    <div class="dropdown-menu dropdown-menu--text dropdown-menu--merchant">
                        <ul>
                            <li><a rel="nofollow" class="dropdown-menu__item" href="http://e.meituan.com/" gaevent="top/merchant/ecom">登录商家中心</a></li>
                            <li><a rel="nofollow" class="dropdown-menu__item" href="http://emis.meishi.meituan.com/merchantsSettled" gaevent="top/merchant/cooperation">我想合作</a></li>
                            <li><a rel="nofollow" class="dropdown-menu__item" href="http://e.meituan.com/mobile/?fr=tuantop" target="_blank">手机免费开店</a></li>
                            <li><a rel="nofollow" class="dropdown-menu__item" href="http://zhaoshang.meituan.com" gaevent="top/merchant/mmp">商家营销平台</a></li>
                        </ul>
                    </div>
                </li>
                <li class="dropdown dropdown--recruit" data-uix="dropdown" >
                    <a class="dropdown__toggle" href="javascript:;">
                        <span>代理商招募</span>
                        <i class="tri tri--dropdown"></i>
                        <i class="vertical-bar"></i>
                    </a>
                    <div class="dropdown-menu dropdown-menu--text dropdown-menu--recruit">
                        <ul>
                            <li><a rel="nofollow" class="dropdown-menu__item" href="//daili.meituan.com/?comeFrom=mtwebMenu" target="_blank">餐饮代理商招募</a></li>
                            <li><a rel="nofollow" class="dropdown-menu__item" href="//www.dianping.com/apollo/agent/index?source=mtpcd" target="_blank">非餐饮代理商招募</a></li>
                        </ul>
                    </div>
                </li>
                <li data-uix="dropdown" id="J-my-more" class="dropdown dropdown--more dropdown--last">
                    <a id="J-my-more-toggle" class="dropdown__toggle dropdown__toggle--my-more" href="javascript:;" gaevent="nav/more">
                        <span>更多</span>
                        <i class="tri tri--dropdown"></i>
                    </a>
                    <div id="J-my-more-menu" class="dropdown-menu dropdown-menu--text dropdown-menu--more">
                        <ul>
                            <li>
                                <a rel="nofollow" class="mobile dropdown-menu__item" href="http://www.meituan.com/mobile/" target="_blank" gaevent="header/mobile"><span></span>手机版</a>
                            </li>
                            <li>
                                <a rel="nofollow" id="J-subscribe" class="subscribe dropdown-menu__item" gaevent="header/subscribe" href="http://www.meituan.com/account/subscription"><span></span>邮件订阅</a>
                            </li>
                            <li class="last">
                                <a rel="nofollow" class="refer dropdown-menu__item" href="http://www.meituan.com/account/referrals" target="_blank" gaevent="header/refferals">邀请好友</a>
                            </li>
                        </ul>
                    </div>
                </li>
            </ul>
            <noscript hidden style="display:none;"  data-comboajax-uri='/index/vipbubble' data-comboajax-data='{"ref":"\/index\/floornewV2"}' data-comboajax-onsuccess='$request.listen("www-tips", "www.VipBubble");' data-comboajax-state='0'></noscript>
        </div>
    </div>
    
    
    <noscript hidden style="display:none;"  data-comboajax-uri='/combo/unfoldbanner/index/floornewV2' data-comboajax-onsuccess='$request.listen("www-banner", "www.Banner.Unfold");' data-comboajax-state='0'></noscript>
    <div class="site-mast__branding cf" id="J-site-mast__branding">
            <h1><a class="site-logo" href="http://haikou.meituan.com" gaevent="header/logo">
                <img src="http://p0.meituan.net/tuanpic/3df525af5a3f7fe04077567d2a6caf794904.png" alt="海口美团网" width="82px" height="54px"/>
            </a></h1>
 
        <div  class="city-info" >
            <h2><a class="city-info__name" href="http://haikou.meituan.com" gaevent="header/cityname">海口</a></h2>
            <a class="city-info__toggle" href="http://www.meituan.com/index/changecity/initiative" gaevent="header/changecity">切换城市</a>
        </div>
         
            <div data-component="search-box" class="component-search-box" mt-scope='[]'  data-component-config='{"lazyRender":false,"afterLoad":false}'><img src='data:image/png,' onerror='M._autoinit.push(this.parentNode);this.parentNode.removeChild(this);' width=1 height=1 style='position:absolute;'><div  data-comboajax-uri='/index/hotqueries' data-comboajax-data='{"isshowshops":true,"isshopspage":false}' data-comboajax-onsuccess='this.append($response.html);' data-comboajax-state='0' class="J-search-box search-box ">
    <form action="/s/" class="search-box__form J-search-form cf" name="searchForm" method="get">
                        <div class="search-box__tabs-container" style="float:left">
            <span class="tri"></span>
            <ul class="J-search-box__tabs search-box__tabs">
                                <li class="search-box__tab J-search-box__tab--deal search-box__tab--current">团购</li>
                <li class="search-box__tab J-search-box__tab--shops" gaevent="search/biz">商家</li>
                            </ul>
        </div>
                <input tabindex="1" type="text" name="w" autocomplete="off" data-smartbox="/search/smartboxv2/" class="s-text search-box__input J-search-box__input" value="" placeholder="请输入商品名称、地址等">
        <input type="submit" class="s-submit search-box__button" hidefocus="true" value="搜索"  data-mod="sr">
    </form>
    <ul class="search-suggest J-search-suggest" style="display:none;">
    </ul>
    <div class="smart-query-panel" style="display:none">
        <div class="smart-query-content"></div>
    </div>
    </div>
</div>
        <a class="site-commitment" gaevent="top/commitment" href="http://www.meituan.com/commitment/" target="_blank" rel="nofollow">
            <span class="commitment-item"><i class="F-glob F-glob-commitment-retire"></i>随时退</span>
            <span class="commitment-item"><i class="F-glob F-glob-commitment-free"></i>不满意免单</span>
            <span class="commitment-item"><i class="F-glob F-glob-commitment-expire"></i>过期退</span>
        </a>
    </div>
    <div class="site-mast__site-nav-w">
        <div class="site-mast__site-nav">
            <div  class="site-mast__site-nav-inner" >
                <div data-component="cate-nav" class="component-cate-nav" mt-scope='[]'  data-component-config='{"lazyRender":false}'><img src='data:image/png,' onerror='M._autoinit.push(this.parentNode);this.parentNode.removeChild(this);' width=1 height=1 style='position:absolute;'><span class="mt-cates J-nav__trigger">
    
全部分类</span>
<div class="cate-nav J-nav__list J-nav__list--present cateNavNew" data-mtnode="Acategory.Enavcategory"  data-mod="nc" >
    <div class="J-nav-item">
    <div class="cate-nav__item J-cate-nav__item--1 cate-nav__item--1 cate-nav__item--has-l2 " >
        <div  class="nav-level1 nav-level1--first" >
            <dl >
                <dt><a class="nav-level1__label" href="http://haikou.meituan.com/category/meishi" hidefocus="true"> 美食</a> </dt>
                <dd class="nav-level1__item"><a href="http://haikou.meituan.com/category/zizhucan"   gaevent="nav/category/zizhucan">自助餐</a></dd>
                <dd class="nav-level1__item"><a href="http://haikou.meituan.com/category/daijinquan_meishi"   gaevent="nav/category/daijinquan_meishi">代金券</a></dd>
            </dl>
            <i class="nav-level2-indication F-glob F-glob-caret-right-thin"></i>
        </div>
        <div class="nav-level2 J-nav-level2 nav-waterfall" data-level1="1" style="display:none;">
            <div class="nav-level2-item nav-level2-keywords">
                <div class="nav-level2-keywords--title"><a href="http://haikou.meituan.com/category/meishi"   gaevent="nav/category/meishi">美食</a></div>
                    <ul class="nav-level2-keywords--content">
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/daijinquan_meishi"   gaevent="nav/category/daijinquan_meishi">代金券</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/dangaotiandian"   gaevent="nav/category/dangaotiandian">甜点饮品</a></li>
                        <li><a class="keywords__item  bribe" href="http://haikou.meituan.com/category/huoguo"   gaevent="nav/category/huoguo">火锅</a></li>
                        <li><a class="keywords__item  bribe" href="http://haikou.meituan.com/category/zizhucan"   gaevent="nav/category/zizhucan">自助餐</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/kuaican"   gaevent="nav/category/kuaican">小吃快餐</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/ribenliaoli"   gaevent="nav/category/ribenliaoli">日韩料理</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/xican"   gaevent="nav/category/xican">西餐</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/jucanyanqing"   gaevent="nav/category/jucanyanqing">聚餐宴请</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/kaorou"   gaevent="nav/category/kaorou">烧烤烤肉</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/dongbeicai"   gaevent="nav/category/dongbeicai">东北菜</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/chuancai"   gaevent="nav/category/chuancai">川湘菜</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/jiangzhecai"   gaevent="nav/category/jiangzhecai">江浙菜</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/xiangguokaoyu"   gaevent="nav/category/xiangguokaoyu">香锅烤鱼</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/yuegangcai"   gaevent="nav/category/yuegangcai">粤港菜</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/shaokaokaochuan"   gaevent="nav/category/shaokaokaochuan">中式烧烤/烤串</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/xibeicai"   gaevent="nav/category/xibeicai">西北菜</a></li>
                    </ul>
                    <ul class="nav-level2-keywords--content">
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/kafeijiuba"   gaevent="nav/category/kafeijiuba">咖啡酒吧茶馆</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/lucaibeijingcai"   gaevent="nav/category/lucaibeijingcai">京菜鲁菜</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/yunguicai"   gaevent="nav/category/yunguicai">云贵菜</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/dongnanya"   gaevent="nav/category/dongnanya">东南亚菜</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/haixian"   gaevent="nav/category/haixian">海鲜</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/sushi"   gaevent="nav/category/sushi">素食</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/taiwancai"   gaevent="nav/category/taiwancai">台湾/客家菜</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/chuangyicai"   gaevent="nav/category/chuangyicai">创意菜</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/zhoutangduncai"   gaevent="nav/category/zhoutangduncai">汤/粥/炖菜</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/mengcan"   gaevent="nav/category/mengcan">蒙餐</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/xinjiangcai"   gaevent="nav/category/xinjiangcai">新疆菜</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/qitameishi"   gaevent="nav/category/qitameishi">其他美食</a></li>
                    </ul>
            </div>
            
            
        </div>
    </div>
</div>
<div class="J-nav-item">
    <div class="cate-nav__item J-cate-nav__item--20 cate-nav__item--20 cate-nav__item--has-l2 " >
        <div  class="nav-level1" >
            <dl >
                <dt><a class="nav-level1__label" href="http://hotel.meituan.com/haikou" hidefocus="true"> 酒店</a><span class="sperator">/</span><a href="http://trip.meituan.com/inn/" gaevent="nav/category/inn" data-mttcode="Bhotel" class="nav-extralink">客栈</a> </dt>
                <dd class="nav-level1__item"><a href="http://hotel.meituan.com/haikou/c-jingjijiudian"   gaevent="nav/category/jingjijiudian">经济型酒店</a></dd>
            </dl>
            <i class="nav-level2-indication F-glob F-glob-caret-right-thin"></i>
        </div>
        <div class="nav-level2 J-nav-level2 nav-waterfall" data-level1="20" style="display:none;">
            <div class="nav-level2-item nav-level2-keywords">
                <div class="nav-level2-keywords--title"><a href="http://hotel.meituan.com/haikou"   gaevent="nav/category/jiudian">酒店</a></div>
                    <ul class="nav-level2-keywords--content">
                        <li><a class="keywords__item  bribe" href="http://hotel.meituan.com/haikou/c-jingjijiudian"   gaevent="nav/category/jingjijiudian">经济型酒店</a></li>
                        <li><a class="keywords__item " href="http://hotel.meituan.com/haikou/c-haohuajiudian"   gaevent="nav/category/haohuajiudian">豪华酒店</a></li>
                        <li><a class="keywords__item " href="http://hotel.meituan.com/haikou/c-zhutijiudian"   gaevent="nav/category/zhutijiudian">主题酒店</a></li>
                        <li><a class="keywords__item " href="http://hotel.meituan.com/haikou/c-dujiajiudiandujiacun"   gaevent="nav/category/dujiajiudiandujiacun">度假酒店/度假村</a></li>
                        <li><a class="keywords__item " href="http://hotel.meituan.com/haikou/c-gongyuxingjiudian"   gaevent="nav/category/gongyuxingjiudian">公寓型酒店</a></li>
                        <li><a class="keywords__item " href="http://trip.meituan.com/inn/"   gaevent="nav/category/kezhan">客栈</a></li>
                        <li><a class="keywords__item " href="http://hotel.meituan.com/haikou/c-qingnianlvshe"   gaevent="nav/category/qingnianlvshe">青年旅社</a></li>
                    </ul>
            </div>
            
            
        </div>
    </div>
</div>
<div class="J-nav-item">
    <div class="cate-nav__item J-cate-nav__item--99 cate-nav__item--99 cate-nav__item--has-l2 " >
        <div  class="nav-level1" >
            <dl >
                <dt><a class="nav-level1__label" href="http://haikou.meituan.com/dianying/" hidefocus="true"> 猫眼电影</a><span class="sperator">/</span><a href="http://www.meituan.com/dianying/cinemalist/all/all/seat" gaevent="nav/category/nav/category/xuanzuo" data-mttcode="Bxuanzuo" class="nav-extralink">在线选座</a> </dt>
            </dl>
            <i class="nav-level2-indication F-glob F-glob-caret-right-thin"></i>
        </div>
        <div class="nav-level2 J-nav-level2 nav-waterfall" data-level1="99" style="display:none;">
            <div class="nav-level2-item nav-level2-keywords">
                <div class="nav-level2-keywords--title"><a href="http://haikou.meituan.com/dianying/"   gaevent="nav/category/dianying">当前热映</a></div>
                    <ul class="nav-level2-keywords--content">
                        <li><a class="keywords__item " href="http://haikou.meituan.com/dianying/248700"   gaevent="nav/category/HotMovie_0">速度与激情8</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/dianying/345672"   gaevent="nav/category/HotMovie_1">记忆大师</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/dianying/346103"   gaevent="nav/category/HotMovie_2">拆弹&middot;专家</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/dianying/672175"   gaevent="nav/category/HotMovie_3">喜欢&middot;你</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/dianying/672114"   gaevent="nav/category/HotMovie_4">春娇救志明</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/dianying/343669"   gaevent="nav/category/HotMovie_5">傲娇与偏见</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/dianying/248683"   gaevent="nav/category/HotMovie_6">银河护卫队2</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/dianying/78610"   gaevent="nav/category/HotMovie_7">蓝精灵：寻找神秘...</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/dianying/158"   gaevent="nav/category/HotMovie_8">大话西游之大圣娶...</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/dianying/247086"   gaevent="nav/category/HotMovie_9">神秘家族</a></li>
                    </ul>
            </div>
            <div class="nav-level2-poi nav-level2-item "><div class="nav-level2-poi--title">热门影院</div><div class="nav-level2-poi--content"><a class="poi-item-text" href="http://haikou.meituan.com/dianying/cinemalist/all/24251" target="_blank"  data-mod-idx="HotCinema_0" title="奥斯卡国际影城">奥斯卡国际影城</a><a class="poi-item-text" href="http://haikou.meituan.com/dianying/cinemalist/all/384262" target="_blank"  data-mod-idx="HotCinema_1" title="大地影院">大地影院</a><a class="poi-item-text" href="http://haikou.meituan.com/dianying/cinemalist/all/1319936" target="_blank"  data-mod-idx="HotCinema_2" title="恒大影城">恒大影城</a><a class="poi-item-text" href="http://haikou.meituan.com/dianying/cinemalist/all/1079568" target="_blank"  data-mod-idx="HotCinema_3" title="金逸影城">金逸影城</a><a class="poi-item-text" href="http://haikou.meituan.com/dianying/cinemalist/all/102642" target="_blank"  data-mod-idx="HotCinema_4" title="万达影城">万达影城</a><a class="poi-item-text" href="http://haikou.meituan.com/dianying/cinemalist/all/30032" target="_blank"  data-mod-idx="HotCinema_5" title="星美国际影城">星美国际影城</a><a class="poi-item-text" href="http://haikou.meituan.com/dianying/cinemalist/all/30227" target="_blank"  data-mod-idx="HotCinema_6" title="耀莱成龙国际影城">耀莱成龙国际影城</a><a class="poi-item-text" href="http://haikou.meituan.com/dianying/cinemalist/all/1097333" target="_blank"  data-mod-idx="HotCinema_7" title="银龙电影院">银龙电影院</a><a class="poi-item-text" href="http://haikou.meituan.com/dianying/cinemalist/all/23745" target="_blank"  data-mod-idx="HotCinema_8" title="中影国际影城">中影国际影城</a><a class="poi-item-text" href="http://haikou.meituan.com/dianying/cinemalist/all/25988" target="_blank"  data-mod-idx="HotCinema_9" title="和平电影城">和平电影城</a></div></div>
            
        </div>
    </div>
</div>
<div class="J-nav-item">
    <div class="cate-nav__item J-cate-nav__item--10 cate-nav__item--10 cate-nav__item--no-l2 " >
        <div  class="nav-level1" >
            <dl >
                <dt><a class="nav-level1__label" href="http://haikou.meituan.com/category/pc_ktv" hidefocus="true"> KTV</a> </dt>
            </dl>
        </div>
    </div>
</div>
<div class="J-nav-item">
    <div class="cate-nav__item J-cate-nav__item--2 cate-nav__item--2 cate-nav__item--has-l2 " >
        <div  class="nav-level1" >
            <dl >
                <dt><a class="nav-level1__label" href="http://haikou.meituan.com/category/xiuxianyule" hidefocus="true"> 休闲娱乐</a> </dt>
                <dd class="nav-level1__item"><a href="http://haikou.meituan.com/category/zuliaoxiuxian"   gaevent="nav/category/zuliaoxiuxian">足疗按摩</a></dd>
                <dd class="nav-level1__item"><a href="http://haikou.meituan.com/category/wenquan"   gaevent="nav/category/wenquan">温泉</a></dd>
            </dl>
            <i class="nav-level2-indication F-glob F-glob-caret-right-thin"></i>
        </div>
        <div class="nav-level2 J-nav-level2 nav-waterfall" data-level1="2" style="display:none;">
            <div class="nav-level2-item nav-level2-keywords">
                <div class="nav-level2-keywords--title"><a href="http://haikou.meituan.com/category/xiuxianyule"   gaevent="nav/category/xiuxianyule">休闲娱乐</a></div>
                    <ul class="nav-level2-keywords--content">
                        <li><a class="keywords__item  bribe" href="http://haikou.meituan.com/category/pc_ktv"   gaevent="nav/category/pc_ktv">KTV</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/gengduoxiuxianyule"   gaevent="nav/category/gengduoxiuxianyule">更多休闲娱乐</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/yanchu"   gaevent="nav/category/yanchu">演出赛事</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/dianwanyouxiting"   gaevent="nav/category/dianwanyouxiting">电玩/游戏厅</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/jianshen"   gaevent="nav/category/jianshen">运动健身</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/sirenyingyuan"   gaevent="nav/category/sirenyingyuan">私人影院</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/zuliaoxiuxian"   gaevent="nav/category/zuliaoxiuxian">足疗按摩</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/xiyuhanzheng"   gaevent="nav/category/xiyuhanzheng">洗浴/汗蒸</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/zhongyiyangsheng"   gaevent="nav/category/zhongyiyangsheng">中医养生</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/chaguan"   gaevent="nav/category/chaguan">茶馆</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/qipaishi"   gaevent="nav/category/qipaishi">棋牌室</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/桌游"   gaevent="nav/category/桌游">桌游</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/hongpaguan"   gaevent="nav/category/hongpaguan">轰趴馆</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/wenquan"   gaevent="nav/category/wenquan">温泉</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/caizhainongjiale"   gaevent="nav/category/caizhainongjiale">采摘/农家乐</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/diy"   gaevent="nav/category/diy">DIY手工坊</a></li>
                    </ul>
                    <ul class="nav-level2-keywords--content">
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/mishitaotuo"   gaevent="nav/category/mishitaotuo">密室逃脱</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/jiuba"   gaevent="nav/category/jiuba">酒吧</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/zhenrencs"   gaevent="nav/category/zhenrencs">真人CS</a></li>
                    </ul>
            </div>
            
            
        </div>
    </div>
</div>
<div class="J-nav-item">
    <div class="cate-nav__item J-cate-nav__item--195 cate-nav__item--195 cate-nav__item--has-l2 " >
        <div  class="nav-level1" >
            <dl >
                <dt><a class="nav-level1__label" href="http://haikou.meituan.com/category/mobile_poi_zhoubianyou" hidefocus="true"> 周边游</a><span class="sperator">/</span><a href="http://trip.meituan.com" gaevent="nav/category/nav/category/lvyou" data-mttcode="Blvyou" class="nav-extralink">旅游</a> </dt>
            </dl>
            <i class="nav-level2-indication F-glob F-glob-caret-right-thin"></i>
        </div>
        <div class="nav-level2 J-nav-level2 nav-waterfall" data-level1="195" style="display:none;">
            <div class="nav-level2-item nav-level2-keywords">
                <div class="nav-level2-keywords--title"><a href="http://haikou.meituan.com/category/mobile_poi_zhoubianyou"   gaevent="nav/category/mobile_poi_zhoubianyou">周边游</a></div>
                    <ul class="nav-level2-keywords--content">
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/wenquan"   gaevent="nav/category/wenquan">温泉</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/youle"   gaevent="nav/category/youle">景点</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/zhutigongyuan"   gaevent="nav/category/zhutigongyuan">主题公园</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/shuishangleyuan"   gaevent="nav/category/shuishangleyuan">水上乐园</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/dongzhiwuyuan"   gaevent="nav/category/dongzhiwuyuan">动植物园</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/zhanlanguan"   gaevent="nav/category/zhanlanguan">展览馆</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/youchuan"   gaevent="nav/category/youchuan">游船</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/zhenrencs"   gaevent="nav/category/zhenrencs">真人CS</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/danchechuzu"   gaevent="nav/category/danchechuzu">单车出租</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/qitayouwan"   gaevent="nav/category/qitayouwan">其他游玩</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/piaoliu"   gaevent="nav/category/piaoliu">漂流</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/nongjiale"   gaevent="nav/category/nongjiale">农家乐</a></li>
                    </ul>
            </div>
            
            
        </div>
    </div>
</div>
<div class="J-nav-item">
    <div class="cate-nav__item J-cate-nav__item--3 cate-nav__item--3 cate-nav__item--has-l2 " >
        <div  class="nav-level1" >
            <dl >
                <dt><a class="nav-level1__label" href="http://haikou.meituan.com/category/shenghuo" hidefocus="true"> 生活服务</a> </dt>
                <dd class="nav-level1__item"><a href="http://haikou.meituan.com/category/hunshaphoto"   gaevent="nav/category/hunshaphoto">婚纱摄影</a></dd>
                <dd class="nav-level1__item"><a href="http://haikou.meituan.com/category/gexingxiezhen"   gaevent="nav/category/gexingxiezhen">个性写真</a></dd>
            </dl>
            <i class="nav-level2-indication F-glob F-glob-caret-right-thin"></i>
        </div>
        <div class="nav-level2 J-nav-level2 nav-waterfall" data-level1="3" style="display:none;">
            <div class="nav-level2-item nav-level2-keywords">
                <div class="nav-level2-keywords--title"><a href="http://haikou.meituan.com/category/shenghuo"   gaevent="nav/category/shenghuo">生活服务</a></div>
                    <ul class="nav-level2-keywords--content">
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/hunshaphoto"   gaevent="nav/category/hunshaphoto">婚纱摄影</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/gexingxiezhen"   gaevent="nav/category/gexingxiezhen">个性写真</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/ertongsheying"   gaevent="nav/category/ertongsheying">亲子摄影</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/sheying"   gaevent="nav/category/sheying">其他摄影</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/peixun"   gaevent="nav/category/peixun">培训课程</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/qitashenghuo"   gaevent="nav/category/qitashenghuo">其他生活</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/aiche"   gaevent="nav/category/aiche">汽车服务</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/tijian"   gaevent="nav/category/tijian">体检/齿科</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/yiwupijuxihu"   gaevent="nav/category/yiwupijuxihu">衣物/皮具洗护</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/xianhua"   gaevent="nav/category/xianhua">鲜花</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/muyingqinzi"   gaevent="nav/category/muyingqinzi">母婴亲子</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/peijing"   gaevent="nav/category/peijing">配镜</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/zhaopianchongyin"   gaevent="nav/category/zhaopianchongyin">照片冲印</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/gouwuka"   gaevent="nav/category/gouwuka">商场购物卡</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/fushixiebao"   gaevent="nav/category/fushixiebao">服饰鞋包</a></li>
                    </ul>
            </div>
            
            
        </div>
    </div>
</div>
<div class="J-nav-item">
    <div class="cate-nav__item J-cate-nav__item--22 cate-nav__item--22 cate-nav__item--has-l2 " >
        <div  class="nav-level1" >
            <dl >
                <dt><a class="nav-level1__label" href="http://haikou.meituan.com/category/jiankangliren" hidefocus="true"> 丽人</a> </dt>
                <dd class="nav-level1__item"><a href="http://haikou.meituan.com/category/meifa"   gaevent="nav/category/meifa">美发</a></dd>
                <dd class="nav-level1__item"><a href="http://haikou.meituan.com/category/meijiameijie"   gaevent="nav/category/meijiameijie">美甲美睫</a></dd>
            </dl>
            <i class="nav-level2-indication F-glob F-glob-caret-right-thin"></i>
        </div>
        <div class="nav-level2 J-nav-level2 nav-waterfall" data-level1="22" style="display:none;">
            <div class="nav-level2-item nav-level2-keywords">
                <div class="nav-level2-keywords--title"><a href="http://haikou.meituan.com/category/jiankangliren"   gaevent="nav/category/jiankangliren">丽人</a></div>
                    <ul class="nav-level2-keywords--content">
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/meifa"   gaevent="nav/category/meifa">美发</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/meirongmeiti"   gaevent="nav/category/meirongmeiti">美容美体</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/meijiameijie"   gaevent="nav/category/meijiameijie">美甲美睫</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/yujiawudao"   gaevent="nav/category/yujiawudao">瑜伽舞蹈</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/shoushenxianti"   gaevent="nav/category/shoushenxianti">瘦身纤体</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/hanshidingzhuang"   gaevent="nav/category/hanshidingzhuang">韩式定妆</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/qudou"   gaevent="nav/category/qudou">祛痘</a></li>
                        <li><a class="keywords__item " href="http://haikou.meituan.com/category/wenshen"   gaevent="nav/category/wenshen">纹身</a></li>
                    </ul>
            </div>
            
            
        </div>
    </div>
</div>
<div class="J-nav-item">
    <div class="cate-nav__item J-cate-nav__item--211 cate-nav__item--211 cate-nav__item--no-l2 " >
        <div  class="nav-level1" >
            <dl >
                <dt><a class="nav-level1__label" href="http://haikou.meituan.com/category/new" hidefocus="true"> 今日新单</a> </dt>
            </dl>
        </div>
    </div>
</div>

</div>
</div>
                <nav>
                    <ul class="navbar cf "  data-mod="lz" data-mod-deepview="1">
                        <li class="navbar__item-w ">
                            <a  class="navbar__item"  href="http://haikou.meituan.com"   gaevent="nav/today" hidefocus="true"><span class="nav-label">首页</span></a>
                        </li>
                        <li class="navbar__item-w ">
                            <a  class="navbar__item"  href="http://haikou.meituan.com/category/new"   gaevent="nav/new" hidefocus="true"><span class="nav-label">今日新单</span></a>
                        </li>
                        <li class="navbar__item-w ">
                            <a  class="navbar__item"  href="http://haikou.meituan.com/category/meishi"  data-mttcode="Acategory.Bmeishi"  gaevent="nav/meishi" hidefocus="true"><span class="nav-label">美食</span></a>
                        </li>
                        <li class="navbar__item-w ">
                            <a  class="navbar__item"  href="http://waimai.meituan.com?utm_source=3001&amp;utm_medium=shenbian&amp;utm_campaign=normal&amp;city=94"   target="_blank" gaevent="nav/waimai" hidefocus="true"><span class="nav-label">身边外卖</span></a>
                        </li>
                        <li class="navbar__item-w ">
                            <a  class="navbar__item navbar__item-hots"  href="http://haikou.meituan.com/hots/"   target="_blank" gaevent="nav/hots" hidefocus="true"><span class="nav-label">名店抢购</span></a>
                        </li>
                    </ul>
                </nav>

            </div>
        </div>
    </div>
</header>


    

    
    <div id="bdw" class="bdw">
        <div id="bd" class="cf">
            



<noscript hidden style="display:none;"  data-comboajax-uri='/index/tips/index/floornewV2' data-comboajax-onsuccess='$request.listen("www-tips", "www.Tips");' data-comboajax-data='{"sysmsg":true,"commontips":true,"page":"index"}' data-comboajax-state='0' data-parent="body"></noscript>

<div class="content">
    <div class="content__header">
        <!-- 首屏 -->
        <div data-component="floor-fsnew" class="component-floor-fsnew" mt-scope='[]'  data-component-config='{"lazyRender":false}'><img src='data:image/png,' onerror='M._autoinit.push(this.parentNode);this.parentNode.removeChild(this);' width=1 height=1 style='position:absolute;'><div class="floor-fsnew cf">
    <div class="fs site-fs J-site-fs__content">
        <div data-component="index-hotfilter" class="component-index-hotfilter" mt-scope='[]'  data-component-config='{"lazyRender":false}'><img src='data:image/png,' onerror='M._autoinit.push(this.parentNode);this.parentNode.removeChild(this);' width=1 height=1 style='position:absolute;'><div class="content__cell content__cell--hot content__cell-small">
    <h3 class="label"><i class="F-glob F-glob-hot"></i><span>热门团购</span></h3>
    <div class="filter-strip">
        <ul class="filter-strip__list">
            <li><a href="http://haikou.meituan.com/category/?attrs=isvoucher%3A1"  class="hot" >代金券</a></li>
            <li><a href="http://haikou.meituan.com/category/kuaican" >小吃快餐</a></li>
            <li><a href="http://haikou.meituan.com/category/huoguo"  class="hot" >火锅</a></li>
            <li><a href="http://haikou.meituan.com/category/zizhucan"  class="hot" >自助餐</a></li>
            <li><a href="http://haikou.meituan.com/category/xiangguokaoyu" >香锅烤鱼</a></li>
            <li><a href="http://haikou.meituan.com/category/dangaotiandian" >甜点饮品</a></li>
            <li><a href="http://haikou.meituan.com/category/xican" >西餐</a></li>
            <li><a href="http://haikou.meituan.com/category/haixian" >海鲜</a></li>
            <li><a href="http://haikou.meituan.com/category/kaorou" >烧烤烤肉</a></li>
            <li><a href="http://haikou.meituan.com/category/chuancai" >川湘菜</a></li>
            <li><a href="http://haikou.meituan.com/category/kafeijiuba" >咖啡酒吧茶馆</a></li>
            <li><a href="http://haikou.meituan.com/category/jucanyanqing" >聚餐宴请</a></li>
            <li><a href="http://haikou.meituan.com/category/ribenliaoli" >日韩料理</a></li>
            <li><a href="http://haikou.meituan.com/category/chuangyicai" >创意菜</a></li>
            <li><a href="http://haikou.meituan.com/category/zuliaoxiuxian" >足疗按摩</a></li>
            <li><a href="http://haikou.meituan.com/category/shaokaokaochuan" >中式烧烤/烤串</a></li>
            <li><a href="http://haikou.meituan.com/category/yuegangcai" >粤港菜</a></li>
            <li><a href="http://haikou.meituan.com/category/meifa" >美发</a></li>
            <li><a href="http://haikou.meituan.com/category/pc_ktv"  class="hot" >KTV</a></li>
            <li><a href="http://haikou.meituan.com/category/zhoutangduncai" >汤/粥/炖菜</a></li>
            <li><a href="http://haikou.meituan.com/category/dongbeicai" >东北菜</a></li>
            <li><a href="http://haikou.meituan.com/category/meijiameijie" >美甲美睫</a></li>
            <li><a href="http://haikou.meituan.com/category/taiwancai" >台湾/客家菜</a></li>
        </ul>
    </div>
</div>
<div class="content__cell content__cell--geo J-filter__geo content__cell-small">
    <h3 class="label"><i class="F-glob F-glob-position"></i><span>全部区域</span></h3>
    <div class="filter-strip">
        <a href="http://haikou.meituan.com/category/" class="filter-strip__all J-geo-more">更多<span class="tri"></span></a>
        <ul class="filter-strip__list">
            <li><a href="http://haikou.meituan.com/category/all/longhuaqu" >龙华区</a></li>
            <li><a href="http://haikou.meituan.com/category/all/meilanqu" >美兰区</a></li>
            <li><a href="http://haikou.meituan.com/category/all/xiuyingqu" >秀英区</a></li>
            <li><a href="http://haikou.meituan.com/category/all/qiongshanqu" >琼山区</a></li>
            <li><a href="http://haikou.meituan.com/category/all/baisha" >白沙县</a></li>
            <li><a href="http://haikou.meituan.com/category/all/changjiang" >昌江县</a></li>
            <li><a href="http://haikou.meituan.com/category/all/dingxian" >定安县</a></li>
            <li><a href="http://haikou.meituan.com/category/all/lingaoxian" >临高县</a></li>
            <li><a href="http://haikou.meituan.com/category/all/tunchangxian" >屯昌县</a></li>
            <li><a href="http://haikou.meituan.com/category/all/qionghaishi" >琼海市</a></li>
            <li><a href="http://haikou.meituan.com/category/all/chengmaixian" >澄迈县</a></li>
            <li><a href="http://haikou.meituan.com/category/all/danzhoushi" >儋州市</a></li>
            <li><a href="http://haikou.meituan.com/category/all/wenchangshi" >文昌市</a></li>
            <li><a href="http://haikou.meituan.com/category/all/dongfangshi" >东方市</a></li>
            <li><a href="http://haikou.meituan.com/category/" ></a></li>
        </ul>
    </div>
</div>
<div class="content__cell content__cell--area content__cell-small">
    <h3 class="label"><i class="F-glob F-glob-shangquan"></i><span>热门商圈</span></h3>
    <div class="filter-strip">
        <ul class="filter-strip__list">
            <li><a href="http://haikou.meituan.com/category/all/nanyaguangchang" >南亚广场</a></li>
            <li><a href="http://haikou.meituan.com/category/all/jiefangxitailongcheng" >解放西/泰龙城</a></li>
            <li><a href="http://haikou.meituan.com/category/all/haidianwuxilu" >海甸五西路</a></li>
            <li><a href="http://haikou.meituan.com/category/all/wenhualaishichang" >文华菜市场</a></li>
            <li><a href="http://haikou.meituan.com/category/all/jinlonglu" >金龙路</a></li>
            <li><a href="http://haikou.meituan.com/category/all/haidiandao01" >海甸岛</a></li>
            <li><a href="http://haikou.meituan.com/category/all/bailongluyanxian" >白龙路沿线</a></li>
            <li><a href="http://haikou.meituan.com/category/all/shangbangbaihuicheng" >上邦百汇城</a></li>
            <li><a href="http://haikou.meituan.com/category/all/jinghuacheng" >京华城</a></li>
            <li><a href="http://haikou.meituan.com/category/all/yushalu" >玉沙路</a></li>
            <li><a href="http://haikou.meituan.com/category/all/gaodengjie" >高登街</a></li>
            <li><a href="http://haikou.meituan.com/category/all/longkunnanlu" >龙昆南路</a></li>
        </ul>
    </div>
</div>
</div>
        <div class="floor-fs-new__activity">
    <div class="promotion"  data-mod="ip" data-mod-selector=".left,.right">
        <ul class="promotion__slider J-promotion__slider cf">
            <li class="sheet" style="">
                        <div  class="left choice__item" >
                            <em  class="J-discount discount discount-big"  data-lazyicon--slide="discount">9</em>
                            <a class="link ccf" target="_blank" href="http://haikou.meituan.com/deal/44364189.html">
                                <img class="img" width="333" height="232" src="http://p1.meituan.net/366.220/deal/04cf6a6bc9333f56bf40710c689f18e635442.jpg@0_21_702_425a%7C388h_640w_2e_90Q" alt="拾味馆-美团" onload="M.logFirstScreenTime(this)"/>
                            </a>
                            <div class="title">
                                <a class="xtitle link ccf" target="_blank" href="http://haikou.meituan.com/deal/44364189.html">拾味馆</a>
                                <p class="desc">100元代金券1张，全场通用，可叠加使用</p>
                            </div>
                            <span class="price">¥<strong>90</strong></span>
                        </div>
                        <div  class="right choice__item choice__item--right" >
                            <em  class="J-discount discount discount-big"  data-lazyicon--slide="discount">9</em>
                            <a class="link ccf" target="_blank" href="http://haikou.meituan.com/deal/44344072.html">
                                <img class="img" width="333" height="232" src="http://p0.meituan.net/366.220/deal/75b713df7df76569956363876516742c96596.jpg" alt="匠子烤鱼-美团" onload="M.logFirstScreenTime(this)"/>
                            </a>
                            <div class="title">
                                <a class="xtitle link ccf" target="_blank" href="http://haikou.meituan.com/deal/44344072.html">匠子烤鱼</a>
                                <p class="desc">100元代金券1张，可叠加使用，提供免费WiFi</p>
                            </div>
                            <span class="price">¥<strong>90</strong></span>
                        </div>
            </li>
            <li class="sheet" style=" display:none ">
                        <div  class="left choice__item" >
                            <em  class="J-discount discount discount-big"  data-lazyicon--slide="discount">9</em>
                            <a class="link ccf" target="_blank" href="http://haikou.meituan.com/deal/44337524.html">
                                <img class="img" width="333" height="232" src="http://p1.meituan.net/366.220/deal/349c05236dbe86db7917667b35db5d6b55536.jpg@0_239_532_322a%7C388h_640w_2e_90Q" alt="超牛扒房-美团" />
                            </a>
                            <div class="title">
                                <a class="xtitle link ccf" target="_blank" href="http://haikou.meituan.com/deal/44337524.html">超牛扒房</a>
                                <p class="desc">100元全场通用代金券1张，可叠加使用</p>
                            </div>
                            <span class="price">¥<strong>90</strong></span>
                        </div>
                        <div  class="right choice__item choice__item--right" >
                            <em  class="J-discount discount discount-big"  data-lazyicon--slide="discount">8</em>
                            <a class="link ccf" target="_blank" href="http://haikou.meituan.com/deal/28617224.html">
                                <img class="img" width="333" height="232" src="http://p0.meituan.net/366.220/deal/e13003f0a448871b33055b5e04bfb9c935087.jpg@0_7_702_425a%7C388h_640w_2e_90Q" alt="海岛8号-美团" />
                            </a>
                            <div class="title">
                                <a class="xtitle link ccf" target="_blank" href="http://haikou.meituan.com/deal/28617224.html">海岛8号</a>
                                <p class="desc">标准中号虾6选1，建议2人使用，包间免费</p>
                            </div>
                            <span class="price">¥<strong>78</strong></span>
                        </div>
            </li>
            <li class="sheet" style=" display:none ">
                        <div  class="left choice__item" >
                            <em  class="J-discount discount"  data-lazyicon--slide="discount">6.1</em>
                            <a class="link ccf" target="_blank" href="http://haikou.meituan.com/deal/27388259.html">
                                <img class="img" width="333" height="232" src="http://p1.meituan.net/366.220/deal/__5734219__1860618.jpg@0_13_440_266a%7C388h_640w_2e_100q" alt="大嘴鱼乡-美团" />
                            </a>
                            <div class="title">
                                <a class="xtitle link ccf" target="_blank" href="http://haikou.meituan.com/deal/27388259.html">大嘴鱼乡</a>
                                <p class="desc">精致4人套餐，提供免费WiFi</p>
                            </div>
                            <span class="price">¥<strong>158</strong></span>
                        </div>
                        <div  class="right choice__item choice__item--right" >
                            <em  class="J-discount discount"  data-lazyicon--slide="discount">4.3</em>
                            <a class="link ccf" target="_blank" href="http://haikou.meituan.com/deal/25309588.html">
                                <img class="img" width="333" height="232" src="http://p1.meituan.net/366.220/deal/__46237882__5229172.jpg" alt="跳跳香辣坊机器人主题餐厅-美团" />
                            </a>
                            <div class="title">
                                <a class="xtitle link ccf" target="_blank" href="http://haikou.meituan.com/deal/25309588.html">跳跳香辣坊机器人主题餐厅</a>
                                <p class="desc">香辣黑蛙套餐一份，建议3-4人使用</p>
                            </div>
                            <span class="price">¥<strong>99.9</strong></span>
                        </div>
            </li>
            <li class="sheet" style=" display:none ">
                        <div  class="left choice__item" >
                            <em  class="J-discount discount"  data-lazyicon--slide="discount">8.9</em>
                            <a class="link ccf" target="_blank" href="http://haikou.meituan.com/deal/39785306.html">
                                <img class="img" width="333" height="232" src="http://p1.meituan.net/366.220/deal/74a3d2fc2df6f4029f3b2d2055669aba127003.jpg@0_30_1000_606a%7C388h_640w_2e_90Q" alt="椰子不语-美团" />
                            </a>
                            <div class="title">
                                <a class="xtitle link ccf" target="_blank" href="http://haikou.meituan.com/deal/39785306.html">椰子不语</a>
                                <p class="desc">100元代金券1张，除酒水饮料，特价菜外全场通用</p>
                            </div>
                            <span class="price">¥<strong>89</strong></span>
                        </div>
                        <div  class="right choice__item choice__item--right" >
                            <em  class="J-discount discount"  data-lazyicon--slide="discount">8.3</em>
                            <a class="link ccf" target="_blank" href="http://haikou.meituan.com/deal/43937079.html">
                                <img class="img" width="333" height="232" src="http://p0.meituan.net/366.220/deal/df450b90d6c081fd63228038706e58b2115078.jpg@0_30_1000_606a%7C388h_640w_2e_90Q" alt="朝牛集市-美团" />
                            </a>
                            <div class="title">
                                <a class="xtitle link ccf" target="_blank" href="http://haikou.meituan.com/deal/43937079.html">朝牛集市</a>
                                <p class="desc">100元代金券1张，除酒水，特价菜，杂项外全场通用</p>
                            </div>
                            <span class="price">¥<strong>83</strong></span>
                        </div>
            </li>
            <li class="sheet" style=" display:none ">
                        <div  class="left choice__item" >
                            <em  class="J-discount discount discount-big"  data-lazyicon--slide="discount">8</em>
                            <a class="link ccf" target="_blank" href="http://haikou.meituan.com/deal/43933495.html">
                                <img class="img" width="333" height="232" src="http://p1.meituan.net/366.220/deal/5226be9350458140e5e7f4ee54f1308d11435.jpg@0_87_440_266a%7C388h_640w_2e_100Q" alt="逗捞坊-美团" />
                            </a>
                            <div class="title">
                                <a class="xtitle link ccf" target="_blank" href="http://haikou.meituan.com/deal/43933495.html">逗捞坊</a>
                                <p class="desc">100元代金券1张，除酒水外全场通用，可叠加使用</p>
                            </div>
                            <span class="price">¥<strong>79.9</strong></span>
                        </div>
                        <div  class="right choice__item choice__item--right" >
                            <em  class="J-discount discount discount-big"  data-lazyicon--slide="discount">9</em>
                            <a class="link ccf" target="_blank" href="http://haikou.meituan.com/deal/44729917.html">
                                <img class="img" width="333" height="232" src="http://p0.meituan.net/366.220/deal/6d3ebea7f82d3b3057ab60360f277c0b73900.jpg@0_20_660_400a%7C388h_640w_2e_90Q" alt="小龙坎老火锅-美团" />
                            </a>
                            <div class="title">
                                <a class="xtitle link ccf" target="_blank" href="http://haikou.meituan.com/deal/44729917.html">小龙坎老火锅</a>
                                <p class="desc">100元代金券1张，仅适用于菜品，可叠加使用3张</p>
                            </div>
                            <span class="price">¥<strong>90</strong></span>
                        </div>
            </li>
            <li class="sheet" style=" display:none ">
                        <div  class="left choice__item" >
                            <em  class="J-discount discount"  data-lazyicon--slide="discount">7.8</em>
                            <a class="link ccf" target="_blank" href="http://haikou.meituan.com/deal/28364064.html">
                                <img class="img" width="333" height="232" src="http://p1.meituan.net/366.220/deal/270f5b85301f9535e74830d8707ab6a782046.jpg" alt="浩仔艺术蛋糕-美团" />
                            </a>
                            <div class="title">
                                <a class="xtitle link ccf" target="_blank" href="http://haikou.meituan.com/deal/28364064.html">浩仔艺术蛋糕</a>
                                <p class="desc">数码蛋糕1个，约14英寸，圆形</p>
                            </div>
                            <span class="price">¥<strong>116</strong></span>
                        </div>
                        <div  class="right choice__item choice__item--right" >
                            <em  class="J-discount discount"  data-lazyicon--slide="discount">8.5</em>
                            <a class="link ccf" target="_blank" href="http://haikou.meituan.com/deal/39246553.html">
                                <img class="img" width="333" height="232" src="http://p0.meituan.net/366.220/deal/4b9c1ec0775f06d087ba5d011c05c9f375708.jpg@0_21_702_425a%7C388h_640w_2e_90Q" alt="东北庄园骨头锅-美团" />
                            </a>
                            <div class="title">
                                <a class="xtitle link ccf" target="_blank" href="http://haikou.meituan.com/deal/39246553.html">东北庄园骨头锅</a>
                                <p class="desc">自助快餐1份，包间免费，提供免费WiFi</p>
                            </div>
                            <span class="price">¥<strong>12.8</strong></span>
                        </div>
            </li>
        </ul>
        <div class="pre-next">
            <a style="display:none;" href="javascript:void(0);" hidefocus="true" class="mt-slider-previous sp-slide--previous"></a>
            <a style="display:none;" href="javascript:void(0);" hidefocus="true" class="mt-slider-next sp-slide--next">
                <span class="J-slider-index slider-index">1</span><span class="slider-count">/6</span>
            </a>
        </div>
    </div>
</div>

    </div>
    <div class="qrcode-image">
    <img src="//s0.meituan.net/bs/file/?f=fewww:/www/img/app-qrcode.png@b8186a3" />
</div>

    <div class="side__new-topic ui-slider"  data-mod="ii" data-mod-deepview="1">
    <ul class="new-topic__slider J-new-topic__slider cf">
            <li class="sheet" style="">
                <a class="wrapper"  href="http://www.meituan.com/category/new" target="_blank" title="每日上新" data-mod-idx="">
                    <div class="title__main">
                        <div>每日上新</div>
                        <div class="title__deputy">
                            吃喝玩乐最低价
                        </div>
                    </div>
                    <img width="198" src="http://p0.meituan.com/tuanpic/a90e6f506f86cb29f4b4eb70a628ccba37411.png" />
                </a>
            </li>
    </ul>
</div>

</div>
</div>
    </div>
    <div class="content__body">
        <div  data-comboajax-uri='/index/hotsandrec' data-comboajax-onsuccess='this.setHTML($response.html);' data-comboajax-state='0'></div>

        <div data-component="category-list" class="component-category-list" mt-scope='[]'  data-component-config='{"css":"fewww:\/www\/css\/category-list.css@b8186a3"}'><img src='data:image/png,' onerror='M._autoinit.push(this.parentNode);this.parentNode.removeChild(this);' width=1 height=1 style='position:absolute;'><textarea rel="lazyrender" style="display:none"><img src='data:image/png,' onerror='M._autoinit.push(this.parentNode);this.parentNode.removeChild(this);' width=1 height=1 style='position:absolute;'><div class="category-list"  data-mod="im">
    <div class="category-floor ">
    <div id="floor-category--meishi" class="category-floor__head cf" data-mtnode="Acategory">
    <ul class="sub-categories">
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/meishi" class="link">美食</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/daijinquan_meishi" class="link">代金券</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/zizhucan" class="link">自助餐</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/huoguo" class="link">火锅</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/kaorou" class="link">烧烤烤肉</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/xiangguokaoyu" class="link">香锅烤鱼</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/xican" class="link">西餐</a>
            </li>
        <li class="sub-categories__cell sub-categories__cell--all">
            <a target="_blank" href="/category/meishi" class="link" data-mttcode="Call">
                全部<i class="F-glob F-glob-caret-right-small"></i>
            </a>
        </li>
    </ul>
    <a class="title" href="/category/meishi" target="_blank" data-mttcode="Cmeishi">
        <i class="icon F-glob F-glob-meishi"></i>
        美食
    </a>
</div>

        <div class="category-floor__body cf deal-list--floor-new" data-mtnode="Anone">
            <div data-component="deal-list" class="component-deal-list" mt-scope='[]'  data-component-config='{"lazyRender":false,"afterLoad":false}'><img src='data:image/png,' onerror='M._autoinit.push(this.parentNode);this.parentNode.removeChild(this);' width=1 height=1 style='position:absolute;'>    <div  class="deal-tile"   data-mteventnd='{"id":28617224,"pos":1}' data-mttcode="C1"  >
                <a href="http://haikou.meituan.com/deal/28617224.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【2店通用】海岛8号-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/deal/e13003f0a448871b33055b5e04bfb9c935087.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/28617224.html" class="w-link J-mtad-link" title="海岛8号" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【2店通用】海岛8号</span>
        <span class="short-title">标准中号虾6选1，建议2人使用，包间免费</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>78</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>98</del></span>
    <span class="sales">
            已售<strong class="num">42991</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/28617224.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 80%;"></span>
                </span>
            <span class="rate-info__count">6812人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":39713142,"pos":2}' data-mttcode="C2"  >
                <a href="http://haikou.meituan.com/deal/39713142.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【2店通用】圣琼美食百汇自助餐厅-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/deal/8679c269aae4f77fcdf5538cc0375f9349050.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/39713142.html" class="w-link J-mtad-link" title="圣琼美食百汇自助餐厅" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【2店通用】圣琼美食百汇自助餐厅</span>
        <span class="short-title">自助中午工作餐</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>28</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>29</del></span>
    <span class="sales">
            已售<strong class="num">3439</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/39713142.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 86%;"></span>
                </span>
            <span class="rate-info__count">243人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":37953855,"pos":3}' data-mttcode="C3"  >
                <a href="http://www.meituan.com/deal/37953855.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【3店通用】薇薇安千层蛋糕-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/deal/cff6b0ba8b89fe20249dac9dafaacd6132431.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/37953855.html" class="w-link J-mtad-link" title="薇薇安千层蛋糕" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【3店通用】薇薇安千层蛋糕</span>
        <span class="short-title">薇薇安千层蛋糕切件7选1，建议单人使用</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>16.9</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>22</del></span>
    <span class="sales">
            已售<strong class="num">66642</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <span class="campaign">新客减7</span>
                <a href="http://www.meituan.com/deal/37953855.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 88%;"></span>
                </span>
            <span class="rate-info__count">8327人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile deal-tile--even"   data-mteventnd='{"id":26540488,"pos":4}' data-mttcode="C4"  >
                <a href="http://www.meituan.com/deal/26540488.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【43店通用】华莱士-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/deal/7ccec8fb3d4c52d8bb2b8242ac94bfb0141515.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/26540488.html" class="w-link J-mtad-link" title="华莱士" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【43店通用】华莱士</span>
        <span class="short-title">单人套餐</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>10.9</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>20</del></span>
    <span class="sales">
            已售<strong class="num">344796</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/26540488.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 78%;"></span>
                </span>
            <span class="rate-info__count">63894人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":43760767,"pos":5}' data-mttcode="C5"  >
                <a href="http://haikou.meituan.com/deal/43760767.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【5店通用】一只酸奶牛-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/deal/3e03d0b6f5c42f823a45eb5d9a66cd6945264.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/43760767.html" class="w-link J-mtad-link" title="一只酸奶牛" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【5店通用】一只酸奶牛</span>
        <span class="short-title">经典酸奶紫米露3选1，建议单人使用，包间免费</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>7.8</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>12</del></span>
    <span class="sales">
            已售<strong class="num">10270</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/43760767.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 94%;"></span>
                </span>
            <span class="rate-info__count">575人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":28475546,"pos":6}' data-mttcode="C6"  >
                <a href="http://www.meituan.com/deal/28475546.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【27店通用】华莱士-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/deal/e8d363ba36b0d7078a6cde4566e795a748983.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/28475546.html" class="w-link J-mtad-link" title="华莱士" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【27店通用】华莱士</span>
        <span class="short-title">套餐3选1</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>10.9</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>20</del></span>
    <span class="sales">
            已售<strong class="num">244856</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/28475546.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 78%;"></span>
                </span>
            <span class="rate-info__count">36738人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":44344072,"pos":7}' data-mttcode="C7"  >
                <a href="http://haikou.meituan.com/deal/44344072.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【13店通用】匠子烤鱼-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/deal/75b713df7df76569956363876516742c96596.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--voucher" title="代金券">代金券</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/44344072.html" class="w-link J-mtad-link" title="匠子烤鱼" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【13店通用】匠子烤鱼</span>
        <span class="short-title">100元代金券1张，可叠加使用，提供免费WiFi</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>90</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>100</del></span>
    <span class="sales">
            已售<strong class="num">5229</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/44344072.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 86%;"></span>
                </span>
            <span class="rate-info__count">267人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile deal-tile--even"   data-mteventnd='{"id":39369504,"pos":8}' data-mttcode="C8"  >
                <a href="http://haikou.meituan.com/deal/39369504.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【7店通用】豪约客中西餐厅-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/deal/4e5eb08ef390ff44d0e005d4de083441996997.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/39369504.html" class="w-link J-mtad-link" title="豪约客中西餐厅" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【7店通用】豪约客中西餐厅</span>
        <span class="short-title">单人牛排西餐套餐，提供免费WiFi</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>59</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>91</del></span>
    <span class="sales">
            已售<strong class="num">26488</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/39369504.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 88%;"></span>
                </span>
            <span class="rate-info__count">2060人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":37830162,"pos":9}' data-mttcode="C9"  >
                <a href="http://haikou.meituan.com/deal/37830162.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【京华城】爱尚客韩式烤肉自助餐厅-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/deal/f7e6aed19cb4792f349c75cfb1c6467d79239.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/37830162.html" class="w-link J-mtad-link" title="爱尚客韩式烤肉自助餐厅" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【京华城】爱尚客韩式烤肉自助餐厅</span>
        <span class="short-title">单人自助午餐，提供免费WiFi</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>44.9</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>49</del></span>
    <span class="sales">
            已售<strong class="num">17114</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/37830162.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 84%;"></span>
                </span>
            <span class="rate-info__count">1005人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":36419413,"pos":10}' data-mttcode="C10"  >
                <a href="http://haikou.meituan.com/deal/36419413.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【9店通用】玛格利塔-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/deal/17cbb5c56d85af23515d50b5b01f9254180784.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/36419413.html" class="w-link J-mtad-link" title="玛格利塔" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【9店通用】玛格利塔</span>
        <span class="short-title">6寸单人披萨套餐，提供免费WiFi</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>16.8</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>20</del></span>
    <span class="sales">
            已售<strong class="num">10150</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/36419413.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 80%;"></span>
                </span>
            <span class="rate-info__count">1728人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":36480719,"pos":11}' data-mttcode="C11"  >
                <a href="http://haikou.meituan.com/deal/36480719.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【上邦百汇城】周记黑鸭-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/deal/48c7249f0ab9df73fdfb40de92e2397e10998.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--voucher" title="代金券">代金券</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/36480719.html" class="w-link J-mtad-link" title="周记黑鸭" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【上邦百汇城】周记黑鸭</span>
        <span class="short-title">10元代金券1张，除酒水、特价菜外全场通用</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>8.9</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>10</del></span>
    <span class="sales">
            已售<strong class="num">14728</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/36480719.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 86%;"></span>
                </span>
            <span class="rate-info__count">853人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile deal-tile--even"   data-mteventnd='{"id":33066308,"pos":12}' data-mttcode="C12"  >
                <a href="http://haikou.meituan.com/deal/33066308.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【6店通用】么二抱罗粉-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/deal/36524c43ae9185d248214feff88d9819305891.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/33066308.html" class="w-link J-mtad-link" title="么二抱罗粉" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【6店通用】么二抱罗粉</span>
        <span class="short-title">牛肉抱罗粉1份，提供免费WiFi</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>10.8</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>12</del></span>
    <span class="sales">
            已售<strong class="num">41226</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/33066308.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 80%;"></span>
                </span>
            <span class="rate-info__count">4451人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":28054882,"pos":13}' data-mttcode="C13"  >
                <a href="http://haikou.meituan.com/deal/28054882.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【东湖】香辣美-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/deal/989e548d0d3b713a69f9ef0a754fce83442489.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/28054882.html" class="w-link J-mtad-link" title="香辣美" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【东湖】香辣美</span>
        <span class="short-title">美味田鸡，建议2人使用，提供免费WiFi</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>68</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>142</del></span>
    <span class="sales">
            已售<strong class="num">10211</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/28054882.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 78%;"></span>
                </span>
            <span class="rate-info__count">1992人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":32806765,"pos":14}' data-mttcode="C14"  >
                <a href="http://www.meituan.com/deal/32806765.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【全国】正新鸡排-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/deal/df8df7d29e80b8e25849058543ce5d2636614.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/32806765.html" class="w-link J-mtad-link" title="正新鸡排" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【全国】正新鸡排</span>
        <span class="short-title">【官方】正新鸡排尊享版单人餐，提供免费WiFi</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>9.5</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>20</del></span>
    <span class="sales">
            已售<strong class="num">14695100</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/32806765.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 86%;"></span>
                </span>
            <span class="rate-info__count">1933484人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":44302450,"pos":15}' data-mttcode="C15"  >
                <a href="http://haikou.meituan.com/deal/44302450.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【上邦百汇城】西贡越南餐厅-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/deal/a2f3714a577cdf5d99ca11edd9ed0b6a36857.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/44302450.html" class="w-link J-mtad-link" title="西贡越南餐厅" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【上邦百汇城】西贡越南餐厅</span>
        <span class="short-title">超值下午茶，建议单人使用，提供免费WiFi</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>16.8</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>51</del></span>
    <span class="sales">
            已售<strong class="num">1310</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/44302450.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 92%;"></span>
                </span>
            <span class="rate-info__count">39人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile deal-tile--even"   data-mteventnd='{"id":44050928,"pos":16}' data-mttcode="C16"  >
                <a href="http://haikou.meituan.com/deal/44050928.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【3店通用】朝牛集市-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/deal/df450b90d6c081fd63228038706e58b2115078.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--voucher" title="代金券">代金券</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/44050928.html" class="w-link J-mtad-link" title="朝牛集市" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【3店通用】朝牛集市</span>
        <span class="short-title">100元午市代金券1张，可叠加使用</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>69.9</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>100</del></span>
    <span class="sales">
            已售<strong class="num">516</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/44050928.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 86%;"></span>
                </span>
            <span class="rate-info__count">13人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":33806105,"pos":17}' data-mttcode="C17"  >
                <a href="http://haikou.meituan.com/deal/33806105.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【国贸大道】700&amp;deg;品质新伊真素食馆-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/deal/3e6f6fbcc14a55b15dc2345738d45db9151016.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/33806105.html" class="w-link J-mtad-link" title="700&amp;deg;品质新伊真素食馆" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【国贸大道】700&amp;deg;品质新伊真素食馆</span>
        <span class="short-title">素膳美食自助餐，提供免费WiFi</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>19.5</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>19.9</del></span>
    <span class="sales">
            已售<strong class="num">28593</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/33806105.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 84%;"></span>
                </span>
            <span class="rate-info__count">2626人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":44011605,"pos":18}' data-mttcode="C18"  >
                <a href="http://haikou.meituan.com/deal/44011605.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【3店通用】逗捞坊-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/deal/5226be9350458140e5e7f4ee54f1308d11435.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--voucher" title="代金券">代金券</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/44011605.html" class="w-link J-mtad-link" title="逗捞坊" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【3店通用】逗捞坊</span>
        <span class="short-title">100元代金券1张，除酒水、杂项外全场通用</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>69.9</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>100</del></span>
    <span class="sales">
            已售<strong class="num">894</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/44011605.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 96%;"></span>
                </span>
            <span class="rate-info__count">53人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":41160670,"pos":19}' data-mttcode="C19"  >
                <a href="http://haikou.meituan.com/deal/41160670.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【2店通用】大嘴鱼乡-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/deal/0e3dc5c1cedb90ae6a7ff6d94b79070974926.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/41160670.html" class="w-link J-mtad-link" title="大嘴鱼乡" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【2店通用】大嘴鱼乡</span>
        <span class="short-title">大嘴老坛酸菜鱼1位，提供免费WiFi</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>42</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>76</del></span>
    <span class="sales">
            已售<strong class="num">847</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/41160670.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 84%;"></span>
                </span>
            <span class="rate-info__count">44人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile deal-tile--even"   data-mteventnd='{"id":43924046,"pos":20}' data-mttcode="C20"  >
                <a href="http://haikou.meituan.com/deal/43924046.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【日月广场】mihimihi奶脆店-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/deal/d6fc3bb4667369f26d1dc2b14432f83348580.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/43924046.html" class="w-link J-mtad-link" title="mihimihi奶脆店" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【日月广场】mihimihi奶脆店</span>
        <span class="short-title">原味奶脆1份，提供免费WiFi</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>10.8</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>12</del></span>
    <span class="sales">
            已售<strong class="num">2395</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/43924046.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 92%;"></span>
                </span>
            <span class="rate-info__count">193人评价</span>
        </a>

    </p>
</div>

    </div>
</div>
        </div>
        <div class="category-floor__foot" data-mtnode="Acategory">
            <a href="/category/meishi" target="_blank" class="link">
                <span>更多美食团购，请点击查看<i class="link__icon F-glob F-glob-caret-right-small"></i></span>
            </a>
        </div>
    </div>
    <div class="category-floor ">
    <div id="floor-category--xiuxianyule" class="category-floor__head cf" data-mtnode="Acategory">
    <ul class="sub-categories">
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/xiuxianyule" class="link">休闲娱乐</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/jianshen" class="link">运动健身</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/zuliaoxiuxian" class="link">足疗按摩</a>
            </li>
        <li class="sub-categories__cell sub-categories__cell--all">
            <a target="_blank" href="/category/xiuxianyule" class="link" data-mttcode="Call">
                全部<i class="F-glob F-glob-caret-right-small"></i>
            </a>
        </li>
    </ul>
    <a class="title" href="/category/xiuxianyule" target="_blank" data-mttcode="Cxiuxianyule">
        <i class="icon F-glob F-glob-xiuxianyule"></i>
        休闲娱乐
    </a>
</div>

        <div class="category-floor__body cf deal-list--floor-new" data-mtnode="Anone">
            <div data-component="deal-list" class="component-deal-list" mt-scope='[]'  data-component-config='{"lazyRender":false,"afterLoad":false}'><img src='data:image/png,' onerror='M._autoinit.push(this.parentNode);this.parentNode.removeChild(this);' width=1 height=1 style='position:absolute;'>    <div  class="deal-tile"   data-mteventnd='{"id":37396223,"pos":1}' data-mttcode="C1"  >
                <a href="http://haikou.meituan.com/deal/37396223.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【上邦百汇城】欢乐故事电玩城-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/dpdeal/4cbe78685f2adc6b87c1b0988bd50cc4382972.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/37396223.html" class="w-link J-mtad-link" title="欢乐故事电玩城" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【上邦百汇城】欢乐故事电玩城</span>
        <span class="short-title">欢乐故事游戏币50枚</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>39</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>50</del></span>
    <span class="sales">
            已售<strong class="num">68956</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/37396223.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 84%;"></span>
                </span>
            <span class="rate-info__count">10847人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":39212940,"pos":2}' data-mttcode="C2"  >
                <a href="http://haikou.meituan.com/deal/39212940.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【明珠广场】宝岛ktv-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/dpdeal/26f6b3298f4575b704ca0fee740097f9177635.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/39212940.html" class="w-link J-mtad-link" title="宝岛ktv" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【明珠广场】宝岛ktv</span>
        <span class="short-title">周一至周日白天场欢唱8小时</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>52</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>297</del></span>
    <span class="sales">
            已售<strong class="num">8406</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/39212940.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 82%;"></span>
                </span>
            <span class="rate-info__count">1095人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":35171516,"pos":3}' data-mttcode="C3"  >
                <a href="http://haikou.meituan.com/deal/35171516.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【2店通用】uk派对ktv-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/dpdeal/d7a32526fcf32bd5f466fc0b3e1fd843249138.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/35171516.html" class="w-link J-mtad-link" title="uk派对ktv" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【2店通用】uk派对ktv</span>
        <span class="short-title">白天场欢唱3小时套餐</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>38</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>60</del></span>
    <span class="sales">
            已售<strong class="num">28187</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/35171516.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 80%;"></span>
                </span>
            <span class="rate-info__count">5824人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile deal-tile--even"   data-mteventnd='{"id":35118955,"pos":4}' data-mttcode="C4"  >
                <a href="http://haikou.meituan.com/deal/35118955.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【玉沙路】佳和时尚台球会所-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/dpdeal/c7290b83050485b3d003c7e2e1e52fec204545.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/35118955.html" class="w-link J-mtad-link" title="佳和时尚台球会所" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【玉沙路】佳和时尚台球会所</span>
        <span class="short-title">佳和时尚台球会所畅打1小时</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>18.8</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>42</del></span>
    <span class="sales">
            已售<strong class="num">38643</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/35118955.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 86%;"></span>
                </span>
            <span class="rate-info__count">3144人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":35117555,"pos":5}' data-mttcode="C5"  >
                <a href="http://haikou.meituan.com/deal/35117555.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【4店通用】香港之春-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/dpdeal/31abf10ebd849c718ed6d7e2fd05c7741407943.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/35117555.html" class="w-link J-mtad-link" title="香港之春" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【4店通用】香港之春</span>
        <span class="short-title">单人港式沐足1次</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>69.9</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>89</del></span>
    <span class="sales">
            已售<strong class="num">58626</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/35117555.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 88%;"></span>
                </span>
            <span class="rate-info__count">8947人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":35098921,"pos":6}' data-mttcode="C6"  >
                <a href="http://haikou.meituan.com/deal/35098921.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【高登街】足凤凰养生会所-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/dpdeal/d384bb0ba5f2eeed3673e77c7c6fd3db53775.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/35098921.html" class="w-link J-mtad-link" title="足凤凰养生会所" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【高登街】足凤凰养生会所</span>
        <span class="short-title">单人美发一条龙套餐</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>60</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>68</del></span>
    <span class="sales">
            已售<strong class="num">1016</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/35098921.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 86%;"></span>
                </span>
            <span class="rate-info__count">192人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":42449364,"pos":7}' data-mttcode="C7"  >
                <a href="http://haikou.meituan.com/deal/42449364.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【2店通用】新天足(世贸、西站店)-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/dpdeal/7e6a3de973f24651d6fe3edd5d06b6a4127689.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/42449364.html" class="w-link J-mtad-link" title="新天足(世贸、西站店)" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【2店通用】新天足(世贸、西站店)</span>
        <span class="short-title">【特惠新客】单人足疗1次</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>49.9</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>78</del></span>
    <span class="sales">
            已售<strong class="num">9035</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/42449364.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 92%;"></span>
                </span>
            <span class="rate-info__count">949人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile deal-tile--even"   data-mteventnd='{"id":44314783,"pos":8}' data-mttcode="C8"  >
                <a href="http://haikou.meituan.com/deal/44314783.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【蓝天路沿线】甲壳虫KTV（蓝天路店）-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/dpdeal/41cee66f2a8ed030d622a539c43f1fe1218681.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/44314783.html" class="w-link J-mtad-link" title="甲壳虫KTV（蓝天路店）" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【蓝天路沿线】甲壳虫KTV（蓝天路店）</span>
        <span class="short-title">周一至周五自助餐+K歌套餐（4份起售）</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>39</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>78</del></span>
    <span class="sales">
            已售<strong class="num">632</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/44314783.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 96%;"></span>
                </span>
            <span class="rate-info__count">17人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":38246966,"pos":9}' data-mttcode="C9"  >
                <a href="http://haikou.meituan.com/deal/38246966.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【高登街】海南干部疗养院温泉游泳中心-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/dpdeal/130afcaf48f4116fe64c5a582c46f77474611.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/38246966.html" class="w-link J-mtad-link" title="海南干部疗养院温泉游泳中心" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【高登街】海南干部疗养院温泉游泳中心</span>
        <span class="short-title">1人游泳单次体验券（含泡温泉）</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>18.8</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>25</del></span>
    <span class="sales">
            已售<strong class="num">8149</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/38246966.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 80%;"></span>
                </span>
            <span class="rate-info__count">445人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":40461028,"pos":10}' data-mttcode="C10"  >
                <a href="http://haikou.meituan.com/deal/40461028.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【蓝天路沿线】茜贝精典造型-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/dpdeal/3ebd4be943e990754fcbcdb77a6d5829103531.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/40461028.html" class="w-link J-mtad-link" title="茜贝精典造型" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【蓝天路沿线】茜贝精典造型</span>
        <span class="short-title">单人洗吹造型</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>28</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>68</del></span>
    <span class="sales">
            已售<strong class="num">79</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/40461028.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 94%;"></span>
                </span>
            <span class="rate-info__count">14人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":44235672,"pos":11}' data-mttcode="C11"  >
                <a href="http://www.meituan.com/deal/44235672.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【3店通用】大文静养生堂-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/dpdeal/1e8d7d91258cf49776bb2643154760e867259.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/44235672.html" class="w-link J-mtad-link" title="大文静养生堂" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【3店通用】大文静养生堂</span>
        <span class="short-title">文静养生足疗单人套组一【周一至周五白天优惠活动】</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>66</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>89</del></span>
    <span class="sales">
            已售<strong class="num">213</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/44235672.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 88%;"></span>
                </span>
            <span class="rate-info__count">12人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile deal-tile--even"   data-mteventnd='{"id":35156343,"pos":12}' data-mttcode="C12"  >
                <a href="http://haikou.meituan.com/deal/35156343.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【解放西/泰龙城】英伦台球-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/dpdeal/d607bfbec23d002a2d03722b0f6d2bec215057.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/35156343.html" class="w-link J-mtad-link" title="英伦台球" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【解放西/泰龙城】英伦台球</span>
        <span class="short-title">中式八球白天畅打1小时</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>11.8</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>30</del></span>
    <span class="sales">
            已售<strong class="num">16581</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/35156343.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 84%;"></span>
                </span>
            <span class="rate-info__count">1432人评价</span>
        </a>

    </p>
</div>

    </div>
</div>
        </div>
        <div class="category-floor__foot" data-mtnode="Acategory">
            <a href="/category/xiuxianyule" target="_blank" class="link">
                <span>更多休闲娱乐团购，请点击查看<i class="link__icon F-glob F-glob-caret-right-small"></i></span>
            </a>
        </div>
    </div>
    <div class="category-floor ">
    <div id="floor-category--jiudian" class="category-floor__head cf" data-mtnode="Acategory">
    <ul class="sub-categories">
            <li class="sub-categories__cell ">
                <a target="_blank" href="http://hotel.meituan.com/haikou" class="link">酒店</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="http://hotel.meituan.com/haikou/c-jingjijiudian" class="link">经济型酒店</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="http://hotel.meituan.com/haikou/c-zhutijiudian" class="link">主题酒店</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="http://hotel.meituan.com/haikou/c-haohuajiudian" class="link">豪华酒店</a>
            </li>
        <li class="sub-categories__cell sub-categories__cell--all">
            <a target="_blank" href="http://hotel.meituan.com/haikou" class="link" data-mttcode="Call">
                全部<i class="F-glob F-glob-caret-right-small"></i>
            </a>
        </li>
    </ul>
    <a class="title" href="http://hotel.meituan.com/haikou" target="_blank" data-mttcode="Cjiudian">
        <i class="icon F-glob F-glob-jiudian"></i>
        酒店
    </a>
</div>

        <div class="category-floor__body cf deal-list--floor-new" data-mtnode="Anone">
            <div data-component="deal-list" class="component-deal-list" mt-scope='[]'  data-component-config='{"lazyRender":false,"afterLoad":false}'><img src='data:image/png,' onerror='M._autoinit.push(this.parentNode);this.parentNode.removeChild(this);' width=1 height=1 style='position:absolute;'>    <div  class="deal-tile"   data-mteventnd='{"id":33743757,"pos":1}' data-mttcode="C1"  >
                <a href="http://www.meituan.com/deal/33743757.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【海甸岛】猫途电影主题客栈-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/hotel/9e76c10b4ffa0d0482d995ecfb0d7072998079.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/33743757.html" class="w-link J-mtad-link" title="猫途电影主题客栈" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【海甸岛】猫途电影主题客栈</span>
        <span class="short-title">六人间床位房入住1晚，免费WiFi。驿海南青年旅舍位于海甸五西路白沙门公寓内，地处高校繁华地段，</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>50</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>80</del></span>
    <span class="sales">
            已售<strong class="num">14</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/33743757.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 100%;"></span>
                </span>
            <span class="rate-info__count">10人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":26122773,"pos":2}' data-mttcode="C2"  >
                <a href="http://www.meituan.com/deal/26122773.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【海甸岛】恒运宾馆-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/deal/a7debfae4f9c9213a82c954dd48e622b44634.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/26122773.html" class="w-link J-mtad-link" title="恒运宾馆" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【海甸岛】恒运宾馆</span>
        <span class="short-title">钟点房3小时钟点房3小时，免费WiFi。</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>38</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>48</del></span>
    <span class="sales">
            已售<strong class="num">91</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/26122773.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 92%;"></span>
                </span>
            <span class="rate-info__count">21人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":36124639,"pos":3}' data-mttcode="C3"  >
                <a href="http://www.meituan.com/deal/36124639.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【文明路/和平南路】格莱登时尚酒店-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/deal/__21289910__6782026.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/36124639.html" class="w-link J-mtad-link" title="格莱登时尚酒店" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【文明路/和平南路】格莱登时尚酒店</span>
        <span class="short-title">情侣大床房A钟点房3小时，免费WiFi。时尚雅居旅馆地处和平路（省中医院斜对面），临近海甸岛，交</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>40</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>60</del></span>
    <span class="sales">
            已售<strong class="num">70</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/36124639.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 90%;"></span>
                </span>
            <span class="rate-info__count">10人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile deal-tile--even"   data-mteventnd='{"id":28443901,"pos":4}' data-mttcode="C4"  >
                <a href="http://haikou.meituan.com/deal/28443901.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【海甸岛】黑咖啡豆咖啡客栈咖啡厅-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/deal/106b2a458617fd45f467242348436a6775510.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--voucher" title="代金券">代金券</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/28443901.html" class="w-link J-mtad-link" title="黑咖啡豆咖啡客栈咖啡厅" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【海甸岛】黑咖啡豆咖啡客栈咖啡厅</span>
        <span class="short-title">30元代金券1张，全场通用，可叠加使用</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>24</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>30</del></span>
    <span class="sales">
            已售<strong class="num">100</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/28443901.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 86%;"></span>
                </span>
            <span class="rate-info__count">19人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":33279771,"pos":5}' data-mttcode="C5"  >
                <a href="http://www.meituan.com/deal/33279771.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【南站/南海大道】6+1精品时尚宾馆-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/hotel/a8df54bc611ac8709cd3b2bb97d0ab71255316.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/33279771.html" class="w-link J-mtad-link" title="6+1精品时尚宾馆" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【南站/南海大道】6+1精品时尚宾馆</span>
        <span class="short-title">精品大床房钟点房3小时，免费WiFi。与海口汽车南站、火车南站及火车东站相距不足1.0公里；距离</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>38</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>58</del></span>
    <span class="sales">
            已售<strong class="num">25</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/33279771.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 100%;"></span>
                </span>
            <span class="rate-info__count">2人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":40149329,"pos":6}' data-mttcode="C6"  >
                <a href="http://www.meituan.com/deal/40149329.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【海甸岛】幸福小住客栈-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/hotel/911696682cc8a13957b9372064e84984148270.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/40149329.html" class="w-link J-mtad-link" title="幸福小住客栈" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【海甸岛】幸福小住客栈</span>
        <span class="short-title">钟点房3小时，秘密花园大床房/海洋主题大床房2选1，免费WiFi。幸福小住客栈位于海甸岛五西路7</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>39</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>60</del></span>
    <span class="sales">
            已售<strong class="num">23</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/40149329.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 92%;"></span>
                </span>
            <span class="rate-info__count">3人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":33314981,"pos":7}' data-mttcode="C7"  >
                <a href="http://www.meituan.com/deal/33314981.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【高登街】缘来青年旅舍-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/hotel/7ca8a137a85e2c62a78c47c7bb9cf8c792410.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/33314981.html" class="w-link J-mtad-link" title="缘来青年旅舍" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【高登街】缘来青年旅舍</span>
        <span class="short-title">女生四人间(床位)钟点房3小时，免费WiFi。与海口汽车南站、火车南站及火车东站相距不足2.0公</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>18</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>28</del></span>
    <span class="sales">
            已售<strong class="num">1</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <span class="rate-info rate-info--noreviews">暂无评价</span>

    </p>
</div>

    </div>
    <div  class="deal-tile deal-tile--even"   data-mteventnd='{"id":39029048,"pos":8}' data-mttcode="C8"  >
                <a href="http://www.meituan.com/deal/39029048.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【文明路/和平南路】国力酒店-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/hotel/4b8d4ffeed68682a66182301781f8bf77664982.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/39029048.html" class="w-link J-mtad-link" title="国力酒店" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【文明路/和平南路】国力酒店</span>
        <span class="short-title">钟点房3小时，豪华双床房(全面装修体验价)/豪华大床房(全面装修体验价)2选1，免费WiFi。优</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>49</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>58</del></span>
    <span class="sales">
            已售<strong class="num">43</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/39029048.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 76%;"></span>
                </span>
            <span class="rate-info__count">5人评价</span>
        </a>

    </p>
</div>

    </div>
</div>
        </div>
        <div class="category-floor__foot" data-mtnode="Acategory">
            <a href="http://hotel.meituan.com/haikou" target="_blank" class="link">
                <span>更多酒店团购，请点击查看<i class="link__icon F-glob F-glob-caret-right-small"></i></span>
            </a>
        </div>
    </div>
    <div class="category-floor ">
    <div id="floor-category--shenghuo" class="category-floor__head cf" data-mtnode="Acategory">
    <ul class="sub-categories">
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/shenghuo" class="link">生活服务</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/peixun" class="link">培训课程</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/muyingqinzi" class="link">母婴亲子</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/peijing" class="link">配镜</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/sheying" class="link">其他摄影</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/tijian" class="link">体检/齿科</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/aiche" class="link">汽车服务</a>
            </li>
        <li class="sub-categories__cell sub-categories__cell--all">
            <a target="_blank" href="/category/shenghuo" class="link" data-mttcode="Call">
                全部<i class="F-glob F-glob-caret-right-small"></i>
            </a>
        </li>
    </ul>
    <a class="title" href="/category/shenghuo" target="_blank" data-mttcode="Cshenghuo">
        <i class="icon F-glob F-glob-shenghuo"></i>
        生活服务
    </a>
</div>

        <div class="category-floor__body cf deal-list--floor-new" data-mtnode="Anone">
            <div data-component="deal-list" class="component-deal-list" mt-scope='[]'  data-component-config='{"lazyRender":false,"afterLoad":false}'><img src='data:image/png,' onerror='M._autoinit.push(this.parentNode);this.parentNode.removeChild(this);' width=1 height=1 style='position:absolute;'>    <div  class="deal-tile"   data-mteventnd='{"id":38065601,"pos":1}' data-mttcode="C1"  >
                <a href="http://www.meituan.com/deal/38065601.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【宜欣广场】宝岛眼镜-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/dpdeal/a72d05a742a689d84eaa2995a4ec236756633.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/38065601.html" class="w-link J-mtad-link" title="宝岛眼镜" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【宜欣广场】宝岛眼镜</span>
        <span class="short-title">爱心老花镜1副（广东）</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>27.99</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>28</del></span>
    <span class="sales">
            已售<strong class="num">109</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/38065601.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 82%;"></span>
                </span>
            <span class="rate-info__count">28人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":43280970,"pos":2}' data-mttcode="C2"  >
                <a href="http://haikou.meituan.com/deal/43280970.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【2店通用】椰树口腔-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/dpdeal/7b226a22ee9fe964d9137bc28aad8460474142.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/43280970.html" class="w-link J-mtad-link" title="椰树口腔" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【2店通用】椰树口腔</span>
        <span class="short-title">单人口腔检查1次</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>9.8</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>20</del></span>
    <span class="sales">
            已售<strong class="num">3</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <span class="rate-info rate-info--noreviews">暂无评价</span>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":35471400,"pos":3}' data-mttcode="C3"  >
                <a href="http://haikou.meituan.com/deal/35471400.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【解放西/泰龙城】盛昌眼镜-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/dpdeal/ebd027ac0d60bbb5789def9ffe9f9bbd62804.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/35471400.html" class="w-link J-mtad-link" title="盛昌眼镜" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【解放西/泰龙城】盛昌眼镜</span>
        <span class="short-title">盛昌眼镜回馈配镜套餐</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>8.8</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>258</del></span>
    <span class="sales">
            已售<strong class="num">1262</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/35471400.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 80%;"></span>
                </span>
            <span class="rate-info__count">402人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile deal-tile--even"   data-mteventnd='{"id":38989774,"pos":4}' data-mttcode="C4"  >
                <a href="http://haikou.meituan.com/deal/38989774.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【海甸岛】白沙门高尔夫汽车美容养护中心-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/dpdeal/4798643d065d8e3db4bc667b5ea669e027426.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/38989774.html" class="w-link J-mtad-link" title="白沙门高尔夫汽车美容养护中心" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【海甸岛】白沙门高尔夫汽车美容养护中心</span>
        <span class="short-title">科能蜡水洗车服务</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>33.8</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>40</del></span>
    <span class="sales">
            已售<strong class="num">2045</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/38989774.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 88%;"></span>
                </span>
            <span class="rate-info__count">457人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":38978045,"pos":5}' data-mttcode="C5"  >
                <a href="http://haikou.meituan.com/deal/38978045.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【南沙路】植之道口腔-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/dpdeal/d73a7655c65dda6bb1f25fefdb6f6f6919920.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/38978045.html" class="w-link J-mtad-link" title="植之道口腔" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【南沙路】植之道口腔</span>
        <span class="short-title">单人口腔保健洗牙套餐1次</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>38</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>220</del></span>
    <span class="sales">
            已售<strong class="num">3889</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/38978045.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 88%;"></span>
                </span>
            <span class="rate-info__count">1295人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":39717957,"pos":6}' data-mttcode="C6"  >
                <a href="http://www.meituan.com/deal/39717957.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【36店通用】阳光花卉-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/dpdeal/f5106d942ffb9269bed16c31c21b3e9893969.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/39717957.html" class="w-link J-mtad-link" title="阳光花卉" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【36店通用】阳光花卉</span>
        <span class="short-title">阳光花卉11朵粉玫瑰</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>89</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>628</del></span>
    <span class="sales">
            已售<strong class="num">3375</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/39717957.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 78%;"></span>
                </span>
            <span class="rate-info__count">620人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":37080716,"pos":7}' data-mttcode="C7"  >
                <a href="http://haikou.meituan.com/deal/37080716.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【白龙路沿线】吉童岛儿童乐园-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/dpdeal/0424822b05a8a333a8a38dc0a6e33aa8178380.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/37080716.html" class="w-link J-mtad-link" title="吉童岛儿童乐园" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【白龙路沿线】吉童岛儿童乐园</span>
        <span class="short-title">淘气堡单人全天票</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>29.9</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>35</del></span>
    <span class="sales">
            已售<strong class="num">1308</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/37080716.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 76%;"></span>
                </span>
            <span class="rate-info__count">182人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile deal-tile--even"   data-mteventnd='{"id":38963487,"pos":8}' data-mttcode="C8"  >
                <a href="http://haikou.meituan.com/deal/38963487.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【南沙路】黄文婷口腔诊所-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/dpdeal/749cca921bd1d143f9a4710d691bbf9e76900.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/38963487.html" class="w-link J-mtad-link" title="黄文婷口腔诊所" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【南沙路】黄文婷口腔诊所</span>
        <span class="short-title">单人口腔保健洗牙套餐</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>29</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>200</del></span>
    <span class="sales">
            已售<strong class="num">408</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/38963487.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 78%;"></span>
                </span>
            <span class="rate-info__count">95人评价</span>
        </a>

    </p>
</div>

    </div>
</div>
        </div>
        <div class="category-floor__foot" data-mtnode="Acategory">
            <a href="/category/shenghuo" target="_blank" class="link">
                <span>更多生活服务团购，请点击查看<i class="link__icon F-glob F-glob-caret-right-small"></i></span>
            </a>
        </div>
    </div>
    <div class="category-floor ">
    <div id="floor-category--jiankangliren" class="category-floor__head cf" data-mtnode="Acategory">
    <ul class="sub-categories">
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/jiankangliren" class="link">丽人</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/meifa" class="link">美发</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/yujiawudao" class="link">瑜伽舞蹈</a>
            </li>
        <li class="sub-categories__cell sub-categories__cell--all">
            <a target="_blank" href="/category/jiankangliren" class="link" data-mttcode="Call">
                全部<i class="F-glob F-glob-caret-right-small"></i>
            </a>
        </li>
    </ul>
    <a class="title" href="/category/jiankangliren" target="_blank" data-mttcode="Cjiankangliren">
        <i class="icon F-glob F-glob-jiankangliren"></i>
        丽人
    </a>
</div>

        <div class="category-floor__body cf deal-list--floor-new" data-mtnode="Anone">
            <div data-component="deal-list" class="component-deal-list" mt-scope='[]'  data-component-config='{"lazyRender":false,"afterLoad":false}'><img src='data:image/png,' onerror='M._autoinit.push(this.parentNode);this.parentNode.removeChild(this);' width=1 height=1 style='position:absolute;'>    <div  class="deal-tile"   data-mteventnd='{"id":34886837,"pos":1}' data-mttcode="C1"  >
                <a href="http://www.meituan.com/deal/34886837.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【美兰区】佛伦斯私人订制烫染国际连锁-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/dpdeal/b9f1daad8a7f4f615208e3dfa995e105137326.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/34886837.html" class="w-link J-mtad-link" title="佛伦斯私人订制烫染国际连锁" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【美兰区】佛伦斯私人订制烫染国际连锁</span>
        <span class="short-title">单人首席洗剪吹套餐</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>39</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>78</del></span>
    <span class="sales">
            已售<strong class="num">118598</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/34886837.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 94%;"></span>
                </span>
            <span class="rate-info__count">51357人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":35511882,"pos":2}' data-mttcode="C2"  >
                <a href="http://haikou.meituan.com/deal/35511882.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【9店通用】Dior美汇-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/dpdeal/32acb00397b781b536363bd27e4af19b23925.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/35511882.html" class="w-link J-mtad-link" title="Dior美汇" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【9店通用】Dior美汇</span>
        <span class="short-title">Dior美汇洗剪吹1次</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>49</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>79</del></span>
    <span class="sales">
            已售<strong class="num">46844</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/35511882.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 86%;"></span>
                </span>
            <span class="rate-info__count">13698人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":34621506,"pos":3}' data-mttcode="C3"  >
                <a href="http://www.meituan.com/deal/34621506.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【3店通用】瑞豪专业烫染连锁-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/dpdeal/07d802af59f284abd7eb33c2ddd7a7bd98108.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/34621506.html" class="w-link J-mtad-link" title="瑞豪专业烫染连锁" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【3店通用】瑞豪专业烫染连锁</span>
        <span class="short-title">【资深设计师】提案+精致裁剪+造型</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>28.8</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>38</del></span>
    <span class="sales">
            已售<strong class="num">97285</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/34621506.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 96%;"></span>
                </span>
            <span class="rate-info__count">46432人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile deal-tile--even"   data-mteventnd='{"id":36109568,"pos":4}' data-mttcode="C4"  >
                <a href="http://haikou.meituan.com/deal/36109568.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【临高县】康丽美甲纹秀坊-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/dpdeal/dc8dd741ad7060914c8ac66cd2d6518964283.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/36109568.html" class="w-link J-mtad-link" title="康丽美甲纹秀坊" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【临高县】康丽美甲纹秀坊</span>
        <span class="short-title">单人时尚美甲套餐一份</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>25</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>70</del></span>
    <span class="sales">
            已售<strong class="num">4309</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/36109568.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 80%;"></span>
                </span>
            <span class="rate-info__count">558人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":34736641,"pos":5}' data-mttcode="C5"  >
                <a href="http://www.meituan.com/deal/34736641.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【2店通用】施华蔻美发连锁-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/dpdeal/e6f7924201d0e8d8542aade37d3a9a6754650.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/34736641.html" class="w-link J-mtad-link" title="施华蔻美发连锁" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【2店通用】施华蔻美发连锁</span>
        <span class="short-title">单人洗剪吹</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>38</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>128</del></span>
    <span class="sales">
            已售<strong class="num">33097</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/34736641.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 96%;"></span>
                </span>
            <span class="rate-info__count">16132人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":36467654,"pos":6}' data-mttcode="C6"  >
                <a href="http://www.meituan.com/deal/36467654.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【2店通用】欧莱雅私人定制美发连锁-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/dpdeal/0230837c17c9559481475b766ab471b370413.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/36467654.html" class="w-link J-mtad-link" title="欧莱雅私人定制美发连锁" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【2店通用】欧莱雅私人定制美发连锁</span>
        <span class="short-title">单人洗剪吹/护理套餐2选1</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>38</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>128</del></span>
    <span class="sales">
            已售<strong class="num">72621</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/36467654.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 96%;"></span>
                </span>
            <span class="rate-info__count">31018人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":35164423,"pos":7}' data-mttcode="C7"  >
                <a href="http://www.meituan.com/deal/35164423.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【7店通用】三说丽人-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/dpdeal/47f275ae8721805b7a282683970fecbb118143.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--pois" title="多套餐">多套餐</span>
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/35164423.html" class="w-link J-mtad-link" title="三说丽人" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【7店通用】三说丽人</span>
        <span class="short-title">单人三说丽人美甲</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>28</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>160</del></span>
    <span class="sales">
            已售<strong class="num">14047</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/35164423.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 84%;"></span>
                </span>
            <span class="rate-info__count">3779人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile deal-tile--even"   data-mteventnd='{"id":43833117,"pos":8}' data-mttcode="C8"  >
                <a href="http://haikou.meituan.com/deal/43833117.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【2店通用】苏黎世-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/dpdeal/4e7f931e7cc121a34377506d5622b024717257.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://haikou.meituan.com/deal/43833117.html" class="w-link J-mtad-link" title="苏黎世" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【2店通用】苏黎世</span>
        <span class="short-title">洗剪吹单人</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>39.8</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>58</del></span>
    <span class="sales">
            已售<strong class="num">480</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://haikou.meituan.com/deal/43833117.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 90%;"></span>
                </span>
            <span class="rate-info__count">51人评价</span>
        </a>

    </p>
</div>

    </div>
</div>
        </div>
        <div class="category-floor__foot" data-mtnode="Acategory">
            <a href="/category/jiankangliren" target="_blank" class="link">
                <span>更多丽人团购，请点击查看<i class="link__icon F-glob F-glob-caret-right-small"></i></span>
            </a>
        </div>
    </div>
    <div class="category-floor ">
    <div id="floor-category--lvyou" class="category-floor__head cf" data-mtnode="Acategory">
    <ul class="sub-categories">
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/lvyou" class="link">旅游</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/jingdianmenpiao" class="link">景点门票</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/guoneiyou" class="link">国内游</a>
            </li>
            <li class="sub-categories__cell ">
                <a target="_blank" href="/category/jingwaiyou" class="link">境外游</a>
            </li>
        <li class="sub-categories__cell sub-categories__cell--all">
            <a target="_blank" href="/category/lvyou" class="link" data-mttcode="Call">
                全部<i class="F-glob F-glob-caret-right-small"></i>
            </a>
        </li>
    </ul>
    <a class="title" href="/category/lvyou" target="_blank" data-mttcode="Clvyou">
        <i class="icon F-glob F-glob-lvyou"></i>
        旅游
    </a>
</div>

        <div class="category-floor__body cf deal-list--floor-new" data-mtnode="Anone">
            <div data-component="deal-list" class="component-deal-list" mt-scope='[]'  data-component-config='{"lazyRender":false,"afterLoad":false}'><img src='data:image/png,' onerror='M._autoinit.push(this.parentNode);this.parentNode.removeChild(this);' width=1 height=1 style='position:absolute;'>    <div  class="deal-tile"   data-mteventnd='{"id":35202632,"pos":1}' data-mttcode="C1"  >
                <a href="http://www.meituan.com/deal/35202632.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【海口等】海口星海湾豪生大酒店1晚+双人早餐+双人晚餐1次-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/zeus/be9cd7fc9c16472200b04ce433d81ee761454.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/35202632.html" class="w-link J-mtad-link" title="海口星海湾豪生大酒店1晚+双人早餐+双人晚餐1次" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【海口等】海口星海湾豪生大酒店1晚+双人早餐+双人晚餐1次</span>
        <span class="short-title">海口星海湾豪生大酒店1晚+双人早餐+双人晚餐1次</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>938</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>1488</del></span>
    <span class="sales">
            已售<strong class="num">44</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <span class="rate-info rate-info--noreviews">暂无评价</span>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":27094523,"pos":2}' data-mttcode="C2"  >
                <a href="http://www.meituan.com/deal/27094523.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【2店通用】驴行天下旅业有限公司-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/deal/5a81733b5da0e90d9ddd08d850f5054a171755.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/27094523.html" class="w-link J-mtad-link" title="驴行天下旅业有限公司" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【2店通用】驴行天下旅业有限公司</span>
        <span class="short-title">森林公园餐，提供免费WiFi</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>58</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>68</del></span>
    <span class="sales">
            已售<strong class="num">0</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <span class="rate-info rate-info--noreviews">暂无评价</span>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":40452385,"pos":3}' data-mttcode="C3"  >
                <a href="http://www.meituan.com/deal/40452385.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【海口等】琼海博鳌亚洲论坛大酒店1晚+双早+双人酒店内东屿岛温泉/泳池等门票任选-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/zeus/c60d4ad00d8f5e85703090bdd78912b142968.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/40452385.html" class="w-link J-mtad-link" title="琼海博鳌亚洲论坛大酒店1晚+双早+双人酒店内东屿岛温泉/泳池等门票任选" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【海口等】琼海博鳌亚洲论坛大酒店1晚+双早+双人酒店内东屿岛温泉/泳池等门票任选</span>
        <span class="short-title">琼海博鳌亚洲论坛大酒店1晚+双早+双人酒店内东屿岛温泉/泳池等门票任选</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>399</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>1000</del></span>
    <span class="sales">
            已售<strong class="num">100</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <span class="rate-info rate-info--noreviews">暂无评价</span>

    </p>
</div>

    </div>
    <div  class="deal-tile deal-tile--even"   data-mteventnd='{"id":40875715,"pos":4}' data-mttcode="C4"  >
                <a href="http://www.meituan.com/deal/40875715.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【官塘镇】白石岭风景区门票+缆车(成人票)-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/deal/0d66d00bf1c99593792c5d2d96ce4e65127634.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/40875715.html" class="w-link J-mtad-link" title="白石岭风景区门票+缆车(成人票)" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【官塘镇】白石岭风景区门票+缆车(成人票)</span>
        <span class="short-title">仅售32.0元！最高价值55.0元的白石岭风景区门票+缆车(成人票),入园前均可购买</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>32</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>55</del></span>
    <span class="sales">
            已售<strong class="num">441</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/40875715.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 88%;"></span>
                </span>
            <span class="rate-info__count">19人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":40057622,"pos":5}' data-mttcode="C5"  >
                <a href="http://www.meituan.com/deal/40057622.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【秀英区】海南热带野生动植物园门票儿童票-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/deal/d191531f964c0bd042bb9e27db9e2de3692984.png@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/40057622.html" class="w-link J-mtad-link" title="海南热带野生动植物园门票儿童票" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【秀英区】海南热带野生动植物园门票儿童票</span>
        <span class="short-title">仅售40.0元！最高价值50.0元的海南热带野生动植物园门票儿童票,请至少提前2小时购买</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>40</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>50</del></span>
    <span class="sales">
            已售<strong class="num">1819</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <span class="campaign">返五一礼包</span>
                <a href="http://www.meituan.com/deal/40057622.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 90%;"></span>
                </span>
            <span class="rate-info__count">213人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":44668257,"pos":6}' data-mttcode="C6"  >
                <a href="http://www.meituan.com/deal/44668257.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【博鳌】博鳌亚洲湾水上乐园门票（成人票）-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p1.meituan.net/deal/83876dd865fc27fcef9e92b10b600cb870070.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/44668257.html" class="w-link J-mtad-link" title="博鳌亚洲湾水上乐园门票（成人票）" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【博鳌】博鳌亚洲湾水上乐园门票（成人票）</span>
        <span class="short-title">仅售77.9元！最高价值120.0元的博鳌亚洲湾水上乐园门票（成人票）,入园前均可购买</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>77.9</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>120</del></span>
    <span class="sales">
            已售<strong class="num">7</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <span class="rate-info rate-info--noreviews">暂无评价</span>

    </p>
</div>

    </div>
    <div  class="deal-tile"   data-mteventnd='{"id":39973886,"pos":7}' data-mttcode="C7"  >
                <a href="http://www.meituan.com/deal/39973886.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【定安县】海南文笔峰盘古文化旅游区门票(成人票)-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/deal/5a7a26aef68a9899a78862f4cf32c7d451614.jpg@260w_154h_1e" />
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/39973886.html" class="w-link J-mtad-link" title="海南文笔峰盘古文化旅游区门票(成人票)" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【定安县】海南文笔峰盘古文化旅游区门票(成人票)</span>
        <span class="short-title">仅售32.0元！最高价值84.0元的海南文笔峰盘古文化旅游区门票(成人票),请至少提前2小时购买</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>32</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>84</del></span>
    <span class="sales">
            已售<strong class="num">13800</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <a href="http://www.meituan.com/deal/39973886.html#anchor-reviews" class="rate-info J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"rating"}'>
                <span class="rate-info__bar common-rating">
                    <span class="rate-stars" style="width: 88%;"></span>
                </span>
            <span class="rate-info__count">1026人评价</span>
        </a>

    </p>
</div>

    </div>
    <div  class="deal-tile deal-tile--even"   data-mteventnd='{"id":39690902,"pos":8}' data-mttcode="C8"  >
                <a href="http://www.meituan.com/deal/39690902.html" class="deal-tile__cover J-mtad-link" hidefocus="true" target="_blank"  data-mtevent='{"sr":"cover"}'>
            <img class="lazy-img J-lazy-img J-webp" width="260" height="154" alt="【龙华区】海口观澜湖温泉度假酒店-美团" src="data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7" data-src="http://p0.meituan.net/deal/ec8b997c800e4c0284357e3b9d171c03211031.jpg@260w_154h_1e" />
        <span class="deal-mark">
                <span class="deal-mark__item deal-mark__item--nnbooking" title="免预约">免预约</span>
        </span>
</a>

<h3 class="deal-tile__title">
    <a href="http://www.meituan.com/deal/39690902.html" class="w-link J-mtad-link" title="海口观澜湖温泉度假酒店" hidefocus="true" target="_blank"  data-mtevent='{"sr":"title"}'>
        <span class="xtitle">【龙华区】海口观澜湖温泉度假酒店</span>
        <span class="short-title">仅售40.0元！最高价值50.0元的海口观澜湖温泉度假酒店室内泳池(儿童票)，入园前均可购买</span>
    </a>
</h3>

<p class="deal-tile__detail">
    <span class="price">¥<strong>40</strong></span>
    <span class="value">门店价 <del class="num"><span>¥</span>50</del></span>
    <span class="sales">
            已售<strong class="num">1</strong>
</span>

</p>

<div class="deal-tile__extra">
    <p class="extra-inner">
                <span class="campaign">返五一礼包</span>
                <span class="rate-info rate-info--noreviews">暂无评价</span>

    </p>
</div>

    </div>
</div>
        </div>
        <div class="category-floor__foot" data-mtnode="Acategory">
            <a href="/category/lvyou" target="_blank" class="link">
                <span>更多旅游团购，请点击查看<i class="link__icon F-glob F-glob-caret-right-small"></i></span>
            </a>
        </div>
    </div>
</div>
</textarea></div>
    </div>

    <div data-component="floor-elevator" class="component-floor-elevator" mt-scope='[]'  data-component-params='{"topEdge":".category-floor__body"}' data-component-config='{"lazyRender":false}'><img src='data:image/png,' onerror='M._autoinit.push(this.parentNode);this.parentNode.removeChild(this);' width=1 height=1 style='position:absolute;'><div class="J-elevator floor-elevator" data-uix="smoothscroll" data-params="{easing: 'easeOut'}">
    <ul class="elevator" data-uix="scrollspy" data-params="{currentClass: 'current'}">
        <li class="elevator__floor meishi">
            <a class="link" hidefocus="true" data-target="#floor-category--meishi" data-scroll="#floor-category--meishi">
                <i class="link__icon F-glob F-glob-meishi"></i>
                <span>美食</span>
            </a>
        </li>
        <li class="elevator__floor xiuxianyule">
            <a class="link" hidefocus="true" data-target="#floor-category--xiuxianyule" data-scroll="#floor-category--xiuxianyule">
                <i class="link__icon F-glob F-glob-xiuxianyule"></i>
                <span>休闲娱乐</span>
            </a>
        </li>
        <li class="elevator__floor jiudian">
            <a class="link" hidefocus="true" data-target="#floor-category--jiudian" data-scroll="#floor-category--jiudian">
                <i class="link__icon F-glob F-glob-jiudian"></i>
                <span>酒店</span>
            </a>
        </li>
        <li class="elevator__floor shenghuo">
            <a class="link" hidefocus="true" data-target="#floor-category--shenghuo" data-scroll="#floor-category--shenghuo">
                <i class="link__icon F-glob F-glob-shenghuo"></i>
                <span>生活服务</span>
            </a>
        </li>
        <li class="elevator__floor jiankangliren">
            <a class="link" hidefocus="true" data-target="#floor-category--jiankangliren" data-scroll="#floor-category--jiankangliren">
                <i class="link__icon F-glob F-glob-jiankangliren"></i>
                <span>丽人</span>
            </a>
        </li>
        <li class="elevator__floor lvyou">
            <a class="link" hidefocus="true" data-target="#floor-category--lvyou" data-scroll="#floor-category--lvyou">
                <i class="link__icon F-glob F-glob-lvyou"></i>
                <span>旅游</span>
            </a>
        </li>
    </ul>
</div>
</div>



    
</div>

        </div>
    </div>

    <div data-component="holy-reco" class="component-holy-reco" mt-scope='[]'  data-component-config='{"css":"fewww:\/www\/css\/holy-reco.css@b8186a3"}'><img src='data:image/png,' onerror='M._autoinit.push(this.parentNode);this.parentNode.removeChild(this);' width=1 height=1 style='position:absolute;'><textarea rel="lazyrender" style="display:none"><img src='data:image/png,' onerror='M._autoinit.push(this.parentNode);this.parentNode.removeChild(this);' width=1 height=1 style='position:absolute;'><div class="J-holy-reco holy-reco">
    <div>
        <ul class="ccf cf nav-tabs--small">
            <li  class="J-holy-reco__label current" >
                <a href="javascript:void(0)" class="tab-item">团购分类</a>
            </li>
            <li  class="J-holy-reco__label" >
                <a href="javascript:void(0)" class="tab-item">热门地标</a>
            </li>
            <li  class="J-holy-reco__label" >
                <a href="javascript:void(0)" class="tab-item">周边城市</a>
            </li>
            <li  class="J-holy-reco__label" >
                <a href="javascript:void(0)" class="tab-item">品牌推荐</a>
            </li>
            <li  class="J-holy-reco__label" >
                <a href="javascript:void(0)" class="tab-item">专题推荐</a>
            </li>
            <li  class="J-holy-reco__label" >
                <a href="javascript:void(0)" class="tab-item">品类推荐</a>
            </li>
            <li  class="J-holy-reco__label" >
                <a href="javascript:void(0)" class="tab-item">友情链接</a>
            </li>
        </ul>
    </div>
        <div class="J-holy-reco__content holy-reco__content" >
            <a href="http://haikou.meituan.com/category/meishi" title="美食团购">美食团购</a>
            <a href="http://haikou.meituan.com/dianying/" title="电影团购">电影团购</a>
            <a href="http://haikou.meituan.com/category/xuxianyule" title="休闲娱乐团购">休闲娱乐团购</a>
            <a href="http://haikou.meituan.com/category/lvyou" title="旅游团购">旅游团购</a>
            <a href="http://haikou.meituan.com/category/shenghuo" title="生活服务团购">生活服务团购</a>
            <a href="http://haikou.meituan.com/category/wanggou" title="购物团购">购物团购</a>
            <a href="http://haikou.meituan.com/category/jiangkangliren" title="丽人团购">丽人团购</a>
            <a href="http://www.meituan.com/sitemap/comment/" title="团购评论">团购评论</a>
            <a href="http://www.meituan.com/brandsitemap/" title="品牌团购">品牌团购</a>
            <a href="zhao.meituan.com/attached/sitemap/all.xml" title="专题团购">专题团购</a>
            <a href="http://i.meituan.com/s/" title="美团团购">美团团购</a>
        </div>
        <div class="J-holy-reco__content holy-reco__content" style="display:none">
            <a href="http://haikou.meituan.com/category/all/longkunnanlu" title="龙昆南路团购">龙昆南路团购</a>
            <a href="http://haikou.meituan.com/category/all/jinghuacheng" title="京华城团购">京华城团购</a>
            <a href="http://haikou.meituan.com/category/all/wanguodadouhui" title="万国大都会团购">万国大都会团购</a>
            <a href="http://haikou.meituan.com/category/all/mingmenguangchang" title="名门广场团购">名门广场团购</a>
            <a href="http://haikou.meituan.com/category/all/nznhdd" title="南站/南海大道团购">南站/南海大道团购</a>
            <a href="http://haikou.meituan.com/category/all/jiefangxitailongcheng" title="解放西/泰龙城团购">解放西/泰龙城团购</a>
            <a href="http://haikou.meituan.com/category/all/bailongluyanxian" title="白龙路沿线团购">白龙路沿线团购</a>
            <a href="http://haikou.meituan.com/category/all/nanyaguangchang" title="南亚广场团购">南亚广场团购</a>
            <a href="http://haikou.meituan.com/category/all/wanghaiguojiguangchang" title="望海国际广场团购">望海国际广场团购</a>
            <a href="http://haikou.meituan.com/category/all/boao" title="博鳌团购">博鳌团购</a>
            <a href="http://haikou.meituan.com/category/all/zhongjielu" title="忠介路团购">忠介路团购</a>
            <a href="http://haikou.meituan.com/category/all/jinpan" title="金盘团购">金盘团购</a>
            <a href="http://haikou.meituan.com/category/all/hongchenghu" title="红城湖团购">红城湖团购</a>
        </div>
        <div class="J-holy-reco__content holy-reco__content" style="display:none">
            <a href="http://hld.meituan.com" title="葫芦岛团购">葫芦岛团购</a>
            <a href="http://jn.meituan.com" title="济南团购">济南团购</a>
            <a href="http://jiaozuo.meituan.com" title="焦作团购">焦作团购</a>
            <a href="http://jinzhou.meituan.com" title="锦州团购">锦州团购</a>
            <a href="http://nn.meituan.com" title="南宁团购">南宁团购</a>
            <a href="http://ty.meituan.com" title="太原团购">太原团购</a>
            <a href="http://wuhu.meituan.com" title="芜湖团购">芜湖团购</a>
            <a href="http://xx.meituan.com" title="新乡团购">新乡团购</a>
            <a href="http://yt.meituan.com" title="烟台团购">烟台团购</a>
            <a href="http://hrb.meituan.com" title="哈尔滨团购">哈尔滨团购</a>
            <a href="http://lf.meituan.com" title="廊坊团购">廊坊团购</a>
            <a href="http://gy.meituan.com" title="贵阳团购">贵阳团购</a>
            <a href="http://zh.meituan.com" title="珠海团购">珠海团购</a>
            <a href="http://qqhr.meituan.com" title="齐齐哈尔团购">齐齐哈尔团购</a>
            <a href="http://qz.meituan.com" title="泉州团购">泉州团购</a>
            <a href="http://sanya.meituan.com" title="三亚团购">三亚团购</a>
            <a href="http://wz.meituan.com" title="温州团购">温州团购</a>
            <a href="http://zs.meituan.com" title="中山团购">中山团购</a>
            <a href="http://km.meituan.com" title="昆明团购">昆明团购</a>
            <a href="http://jj.meituan.com" title="九江团购">九江团购</a>
            <a href="http://cc.meituan.com" title="长春团购">长春团购</a>
            <a href="http://st.meituan.com" title="汕头团购">汕头团购</a>
            <a href="http://hk.meituan.com" title="香港团购">香港团购</a>
            <a href="http://xz.meituan.com" title="徐州团购">徐州团购</a>
            <a href="http://yz.meituan.com" title="扬州团购">扬州团购</a>
            <a href="http://ts.meituan.com" title="唐山团购">唐山团购</a>
        </div>
        <div class="J-holy-reco__content holy-reco__content" style="display:none">
            <a href="http://www.meituan.com/brand/onemore" title="ONEMORE">ONEMORE</a>
            <a href="http://www.meituan.com/brand/yijiayoudian" title="益家优点">益家优点</a>
            <a href="http://www.meituan.com/brand/hushidapanji" title="胡氏大盘鸡">胡氏大盘鸡</a>
            <a href="http://www.meituan.com/brand/dezhuang" title="德庄">德庄</a>
            <a href="http://www.meituan.com/brand/gosselincakegeselin" title="GOSSELINcake阁瑟林">GOSSELINcake阁瑟林</a>
            <a href="http://www.meituan.com/brand/zhenweiliaozizhuwuyanshaokao" title="真味料自助无烟烧烤">真味料自助无烟烧烤</a>
            <a href="http://www.meituan.com/brand/zhugekaoyu" title="诸葛烤鱼">诸葛烤鱼</a>
            <a href="http://www.meituan.com/brand/jiuyuehongbeigongfang" title="九月烘焙工坊">九月烘焙工坊</a>
            <a href="http://www.meituan.com/brand/dongjingsigujiangtaigong" title="东京四谷姜太公">东京四谷姜太公</a>
            <a href="http://www.meituan.com/brand/jinikafei" title="吉尼咖啡">吉尼咖啡</a>
            <a href="http://www.meituan.com/brand/ouyiqiankelibing" title="欧依茜可丽饼">欧依茜可丽饼</a>
            <a href="http://www.meituan.com/brand/goubuli" title="狗不理">狗不理</a>
            <a href="http://www.meituan.com/brand/weierdeke" title="维尔德克">维尔德克</a>
            <a href="http://www.meituan.com/brand/huatingzizhubaihui" title="华庭自助百汇">华庭自助百汇</a>
            <a href="http://www.meituan.com/brand/jinchengdajiudian" title="锦程大酒店">锦程大酒店</a>
            <a href="http://www.meituan.com/brand/mianbaoxinyu" title="面包新语">面包新语</a>
            <a href="http://www.meituan.com/brand/haocaijiujia" title="好彩酒家">好彩酒家</a>
            <a href="http://www.meituan.com/brand/benniuniupai" title="笨牛牛排">笨牛牛排</a>
            <a href="http://www.meituan.com/brand/hongduomatou" title="红舵码头">红舵码头</a>
            <a href="http://www.meituan.com/brand/baicaotang" title="百草堂">百草堂</a>
            <a href="http://www.meituan.com/brand/fengtaifangjindingdapaidang" title="凤台坊金鼎大排档">凤台坊金鼎大排档</a>
            <a href="http://www.meituan.com/brand/laobeijinglvdoubing" title="老北京绿豆饼">老北京绿豆饼</a>
            <a href="http://www.meituan.com/brand/kubakeyanchengqijiandian" title="酷巴客盐城旗舰店">酷巴客盐城旗舰店</a>
            <a href="http://www.meituan.com/brand/xinsidonghanguokaorou" title="新寺洞韩国烤肉">新寺洞韩国烤肉</a>
            <a href="http://www.meituan.com/brand/500cc" title="500CC">500CC</a>
            <a href="http://www.meituan.com/brand/oukaiteniurouhuoguo" title="欧凯特牛肉火锅">欧凯特牛肉火锅</a>
            <a href="http://www.meituan.com/brand/chunmianlilingtxu" title="纯棉立领T恤">纯棉立领T恤</a>
            <a href="http://www.meituan.com/brand/yanhechunjiulou" title="宴和春酒楼">宴和春酒楼</a>
            <a href="http://www.meituan.com/brand/juchensheyinggongzuoshi" title="聚晨摄影工作室">聚晨摄影工作室</a>
            <a href="http://www.meituan.com/brand/jinjiangzhixingliansuojiudian" title="锦江之星连锁酒店">锦江之星连锁酒店</a>
            <a href="http://www.meituan.com/brand/jinpingguodangao" title="金苹果蛋糕">金苹果蛋糕</a>
            <a href="http://www.meituan.com/brand/xidiankafei" title="西典咖啡">西典咖啡</a>
            <a href="http://www.meituan.com/brand/shankeyangshenghuisuo" title="善客养生会所">善客养生会所</a>
            <a href="http://www.meituan.com/brand/kaiyuekafei" title="凯悦咖啡">凯悦咖啡</a>
            <a href="http://www.meituan.com/brand/tiantianxiangshang" title="甜甜向上">甜甜向上</a>
            <a href="http://www.meituan.com/brand/dapaidang" title="大排档">大排档</a>
        </div>
        <div class="J-holy-reco__content holy-reco__content" style="display:none">
            <a href="http://www.meituan.com/ztgljdmptg" title="桂林景点门票团购">桂林景点门票团购</a>
            <a href="http://www.meituan.com/ztwytgdhw" title="无忧团购导航网">无忧团购导航网</a>
            <a href="http://www.meituan.com/ztmxtg" title="美心团购">美心团购</a>
            <a href="http://www.meituan.com/ztshtg" title="实惠团购">实惠团购</a>
            <a href="http://www.meituan.com/ztxztgwz" title="胶州团购网站">胶州团购网站</a>
            <a href="http://www.meituan.com/ztlsdyptg" title="乐山电影票 团购">乐山电影票 团购</a>
            <a href="http://www.meituan.com/ztkdgcmstg" title="凯德广场美食团购">凯德广场美食团购</a>
            <a href="http://www.meituan.com/ztsjzhgtg" title="石家庄火锅团购">石家庄火锅团购</a>
            <a href="http://www.meituan.com/zthdmptg" title="横店门票团购">横店门票团购</a>
            <a href="http://www.meituan.com/ztszjdtg" title="宿州酒店团购">宿州酒店团购</a>
            <a href="http://www.meituan.com/ztgzslgtg" title="广州水疗馆团购">广州水疗馆团购</a>
            <a href="http://www.meituan.com/ztcmsjttg" title="纯棉四件套团购">纯棉四件套团购</a>
            <a href="http://www.meituan.com/ztzdtgw" title="最大团购网">最大团购网</a>
            <a href="http://www.meituan.com/ztsyyfgtg" title="丝域养发馆团购">丝域养发馆团购</a>
            <a href="http://www.meituan.com/ztdgtggz" title="蛋糕团购 广州">蛋糕团购 广州</a>
            <a href="http://www.meituan.com/ztgsytg" title="古摄影 团购">古摄影 团购</a>
            <a href="http://www.meituan.com/zthzlctg" title="杭州绿茶团购">杭州绿茶团购</a>
            <a href="http://www.meituan.com/ztynctg" title="云南菜团购">云南菜团购</a>
            <a href="http://www.meituan.com/ztnbmstgw" title="宁波美食团购网">宁波美食团购网</a>
            <a href="http://www.meituan.com/ztxazdftg" title="西安钟点房团购">西安钟点房团购</a>
            <a href="http://www.meituan.com/ztsstg" title="三上团购">三上团购</a>
            <a href="http://www.meituan.com/ztmjtgw" title="美甲团购网">美甲团购网</a>
            <a href="http://www.meituan.com/zthlztg" title="红蜡烛团购">红蜡烛团购</a>
            <a href="http://www.meituan.com/ztdyptgw" title="电影票团购网">电影票团购网</a>
            <a href="http://www.meituan.com/ztsmxyytg" title="厦门小鱿鱼团购">厦门小鱿鱼团购</a>
            <a href="http://www.meituan.com/zttpytgw" title="太平洋团购网">太平洋团购网</a>
            <a href="http://www.meituan.com/ztdqtgw" title="大千团购网">大千团购网</a>
            <a href="http://www.meituan.com/zttgtg" title="途观团购">途观团购</a>
            <a href="http://www.meituan.com/ztftqtg" title="佛跳墙团购">佛跳墙团购</a>
            <a href="http://www.meituan.com/ztmndjktjzxtg" title="美年大健康体检中心团购">美年大健康体检中心团购</a>
            <a href="http://www.meituan.com/ztyfsrtg" title="阳坊涮肉团购">阳坊涮肉团购</a>
            <a href="http://www.meituan.com/ztxgmstgwz" title="香港美食团购网站">香港美食团购网站</a>
            <a href="http://www.meituan.com/ztetyytg" title="儿童游泳团购">儿童游泳团购</a>
            <a href="http://www.meituan.com/ztmwgstg" title="美味故事团购">美味故事团购</a>
            <a href="http://www.meituan.com/ztyjptg" title="杨家坪团购">杨家坪团购</a>
            <a href="http://www.meituan.com/ztjfsmptg" title="金佛山门票团购">金佛山门票团购</a>
        </div>
        <div class="J-holy-reco__content holy-reco__content" style="display:none">
            <a href="http://hld.meituan.com/category/aiche" title="葫芦岛汽车服务">葫芦岛汽车服务</a>
            <a href="http://hld.meituan.com/category/hanguoliaoli" title="葫芦岛韩国料理">葫芦岛韩国料理</a>
            <a href="http://hld.meituan.com/category/yuegangcai" title="葫芦岛粤港菜">葫芦岛粤港菜</a>
            <a href="http://hld.meituan.com/category/gouwuka" title="葫芦岛商场购物卡">葫芦岛商场购物卡</a>
            <a href="http://hld.meituan.com/category/sheying" title="葫芦岛摄影写真">葫芦岛摄影写真</a>
            <a href="http://hld.meituan.com/category/jiadian" title="葫芦岛电器/数码">葫芦岛电器/数码</a>
            <a href="http://hld.meituan.com/category/qitaxiuxian" title="葫芦岛其他娱乐">葫芦岛其他娱乐</a>
            <a href="http://hld.meituan.com/category/ertongsheying" title="葫芦岛儿童摄影">葫芦岛儿童摄影</a>
            <a href="http://hld.meituan.com/category/haohuajiudian" title="葫芦岛豪华酒店">葫芦岛豪华酒店</a>
            <a href="http://hld.meituan.com/category/sirenyingyuan" title="葫芦岛私人影院">葫芦岛私人影院</a>
            <a href="http://hld.meituan.com/category/kuaican" title="葫芦岛小吃快餐">葫芦岛小吃快餐</a>
            <a href="http://hld.meituan.com/category/huazhuangpin" title="葫芦岛个护化妆">葫芦岛个护化妆</a>
            <a href="http://hld.meituan.com/category/shipinyinliao" title="葫芦岛食品饮料">葫芦岛食品饮料</a>
            <a href="http://hld.meituan.com/category/ktv" title="葫芦岛KTV">葫芦岛KTV</a>
            <a href="http://hld.meituan.com/category/dianying" title="葫芦岛全部">葫芦岛全部</a>
            <a href="http://hld.meituan.com/category/mengcan" title="葫芦岛蒙餐">葫芦岛蒙餐</a>
            <a href="http://hld.meituan.com/category/jingdianmenpiao" title="葫芦岛景点门票">葫芦岛景点门票</a>
            <a href="http://hld.meituan.com/category/yujiawudao" title="葫芦岛瑜伽/舞蹈">葫芦岛瑜伽/舞蹈</a>
            <a href="http://hld.meituan.com/category/kaorou" title="葫芦岛烧烤烤肉">葫芦岛烧烤烤肉</a>
            <a href="http://hld.meituan.com/category/fushi" title="葫芦岛服装">葫芦岛服装</a>
            <a href="http://hld.meituan.com/category/yanchu" title="葫芦岛演出/赛事/展览">葫芦岛演出/赛事/展览</a>
            <a href="http://hld.meituan.com/category/youyong" title="葫芦岛游泳/水上运动">葫芦岛游泳/水上运动</a>
            <a href="http://hld.meituan.com/category/ertongleyuan" title="葫芦岛儿童乐园">葫芦岛儿童乐园</a>
            <a href="http://hld.meituan.com/category/meifa" title="葫芦岛美发">葫芦岛美发</a>
            <a href="http://hld.meituan.com/category/qitameishi" title="葫芦岛其他美食">葫芦岛其他美食</a>
            <a href="http://hld.meituan.com/category/jiafang" title="葫芦岛家纺">葫芦岛家纺</a>
            <a href="http://hld.meituan.com/category/dangao" title="葫芦岛蛋糕">葫芦岛蛋糕</a>
            <a href="http://hld.meituan.com/category/zhuoyou" title="葫芦岛桌游/电玩">葫芦岛桌游/电玩</a>
            <a href="http://hld.meituan.com/category/lucaibeijingcai" title="葫芦岛鲁菜/北京菜">葫芦岛鲁菜/北京菜</a>
            <a href="http://hld.meituan.com/category/qitagouwu" title="葫芦岛其他">葫芦岛其他</a>
            <a href="http://hld.meituan.com/category/mishitaotuo" title="葫芦岛密室逃脱">葫芦岛密室逃脱</a>
            <a href="http://hld.meituan.com/category/haixian" title="葫芦岛海鲜">葫芦岛海鲜</a>
            <a href="http://hld.meituan.com/category/jingjijiudian" title="葫芦岛经济型酒店">葫芦岛经济型酒店</a>
            <a href="http://hld.meituan.com/category/zhoutangduncai" title="葫芦岛汤/粥/炖菜">葫芦岛汤/粥/炖菜</a>
            <a href="http://hld.meituan.com/category/xiyuhanzheng" title="葫芦岛洗浴/汗蒸">葫芦岛洗浴/汗蒸</a>
            <a href="http://hld.meituan.com/category/sushi" title="葫芦岛素食">葫芦岛素食</a>
        </div>
        <div class="J-holy-reco__content holy-reco__content" style="display:none">
            <a href="http://www.dianping.com" title="大众点评网">大众点评网</a>
            <a href="http://www.dianping.com/events/m/index.htm" title="大众点评下载">大众点评下载</a>
            <a href="http://www.dianping.com/shanghai/baby" title="亲子">亲子</a>
            <a href="http://www.dianping.com/shanghai/home" title="家装">家装</a>
            <a href="http://www.dianping.com/shanghai/wedding" title="结婚">结婚</a>
            <a href="http://www.dianping.com/shanghai/education" title="教育">教育</a>
            <a href="http://www.dianping.com/shanghai/hall" title="宴会">宴会</a>
        </div>
</div></textarea></div>
    

    
    <footer class="site-info-w J-br" style="min-height:298px;">
    <a href="//www.meituan.com/sitemap/citysitemap.php" target="_blank" title="网站地图"></a>
<textarea style="display:none;" class="J-bigrender-data" data-br-beforerender='e.target.one(&#039;a&#039;).remove(true);'>    <div class="site-outer">
        <div class="site-info">
            <div class="site-info__item">
                <h3>获取更新</h3>
                <ul>
                    <li><a rel="nofollow" href="http://www.meituan.com/maillist/subscribe">邮件订阅</a></li>
                    <li><a href="http://www.meituan.com/mobile/">iPhone/Android</a></li>
                    <li><a rel="nofollow" href="http://user.qzone.qq.com/97231705" target="_blank">美团QQ空间</a></li>
                    <li><a rel="nofollow" href="http://t.sina.com.cn/meituanhk" target="_blank">美团新浪微博</a></li>
                    <li><a href="//www.meituan.com/sitemap/citysitemap.php" target="_blank">sitemap</a></li>
                    <li><a rel="nofollow" href="/feed/haikou" target="_blank">RSS订阅</a></li>
                </ul>
            </div>
            <div class="site-info__item">
                <h3>商务合作</h3>
                <ul>
                    <li><a rel="nofollow" href="http://emis.meishi.meituan.com/merchantsSettled" gaevent="footer/seller">商家合作</a></li>
                    <li><a rel="nofollow" href="http://zhaoshang.meituan.com/" gaevent="footer/mmp">美团商家营销平台</a></li>
                    <li><a rel="nofollow" href="//daili.meituan.com/?comeFrom=mtwebBusinesscoopd" target="_blank">到店餐饮代理商招募</a></li>
                    <li><a rel="nofollow" href="http://www.meituan.com/about#contact">市场合作</a></li>
                    <li><a rel="nofollow" href="http://union.meituan.com/" target="_blank">美团联盟</a></li>
                    <li><a rel="nofollow" target="_blank" href="http://mos.meituan.com">美团云</a></li>
                    <li><a rel="nofollow" target="_blank" href="mailto:lianzheng@meituan.com">廉正邮箱</a></li>
                    <li><a rel="nofollow" target="_blank" href="http://developer.meituan.com/?applyFrom=meituan_c_pc_home#/home?_k=876stc">聚宝盆餐饮开放平台</a></li>
                    <li><a rel="nofollow" target="_blank" href="http://shouyin.meituan.com/home">美团点评智能收银机</a></li>
                </ul>
            </div>
            <div class="site-info__item">
                <h3>公司信息</h3>
                <ul>
                    <li><a rel="nofollow" href="http://www.meituan.com/about/">关于美团</a></li>
                    <li><a rel="nofollow" href="http://www.meituan.com/commitment/">美团承诺</a></li>
                    <li><a rel="nofollow" href="http://www.meituan.com/about/press">媒体报道</a></li>
                    <li><a rel="nofollow" href="http://zhaopin.meituan.com" gaevent="footer/job">加入我们</a></li>
                    <li><a rel="nofollow" href="http://www.meituan.com/about/law">法律声明</a></li>
                    <li><a rel="nofollow" href="http://www.meituan.com/about/terms">用户协议</a></li>
                    <li><a rel="nofollow" href="http://www.meituan.com/about/bizlicense">商户服务协议</a></li>
                    <li><a rel="nofollow" href="http://www.meituan.com/about/saferule">美团点评餐饮安全管理办法</a></li>
                    <li><a href="http://www.meituan.com/about/license">营业执照</a></li>
                </ul>
            </div>
            <div class="site-info__item">
                <h3>用户帮助</h3>
                <ul>
                    <li><a rel="nofollow" class="J-selfservice-tab" data-tab="0" href="http://www.meituan.com/help/selfservice">申请退款</a></li>
                    <li><a rel="nofollow" class="J-selfservice-tab" data-tab="2" href="http://www.meituan.com/help/selfservice?tab=2">查看美团券密码</a></li>
                    <li><a rel="nofollow" href="http://www.meituan.com/help/faq">常见问题</a></li>
                    <li><a rel="nofollow" href="http://www.meituan.com/help/api">开放API</a></li>
                    <li><a rel="nofollow" href="http://www.meituan.com/about/anticheat">反诈骗公告</a></li>
                </ul>
            </div>
            <div class="site-info__item site-info__item--service">
		<div class="site-info-service-content">
                    <i class="hotline"></i>
                    <p class="contact-name">客服电话</p>
                    <p class="contact-info">
		        <span class="contact-numbers">10107888</span>
		        <span class="contact-time">(9:00-23:00)</span>
		    </p>
                    <p class="desc">退款、退换货、查看美团券</p>
                    <p><a href="http://www.meituan.com/help/selfservice" class="selfservice-link" gaevent="footer/selfservice">参考教程，轻松搞定!</a></p>
	        </div>
            </div>
	    <div class="clear"></div> 
	</div>
    </div>
    <div class="copyright">
        <p>&amp;copy;<span title="I:1; Q:3; S:3; C:17; F:3; T:2,339.31; H:com">2017</span><a href="http://www.meituan.com/">美团网团购</a> meituan.com <a href="http://www.beianbeian.com/beianxinxi/283f39a9-4c00-427a-97ef-3c7a9e1e0af1.html" target="_blank" rel="nofollow">京ICP证070791号</a> |
        <a href="http://www.miitbeian.gov.cn/" target="_blank" rel="nofollow">京ICP备10211739号</a> |
        <a href="http://www.meituan.com/about/rules" target="_blank" rel="nofollow"> 电子公告服务规则</a></p>
        <div style="width:300px;margin:0 auto; padding:20px 0; text-align: center;">
        <a target="_blank" href="http://i.meituan.com/brunch/default/right" style="display: block; height: 20px;">广播电视节目制作经营许可证（京）字第03889号</a>
        <a target="_blank" href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=11010502025545" style="display:inline-block;text-decoration:none;height:20px;line-height:20px;" rel="nofollow"><img src="//s0.meituan.net/bs/file/?f=fewww:/www/img/wangan.png@b8186a3" style="float:left;"/><p style="float:left;height:20px;line-height:20px;margin: 0px 0px 0px 5px; color:#939393;">京公网安备11010502025545号</p></a>
        </div>
    </div>
    <ul class="cert cf">
        <li class="cert__item"><a class="sp-ft sp-ft--record" title="备案信息" href="http://www.meituan.com/about/openinfo" hidefocus="true" target="_blank">备案信息</a></li>
        <li class="cert__item"><a class="sp-ft sp-ft--knet" href="http://t.knet.cn/index_new.jsp" target="_blank" title="可信网站认证" rel="nofollow">可信网站</a></li>
        <li class="cert__item"><a class="sp-ft sp-ft--12315" href="http://www.bj315.org/xfwq/lstd/201209/t20120910_3344.shtml?dnrpluojqxbceiqq" target="_blank" title="12315消费争议" rel="nofollow">12315消费争议</a></li>
    </ul>
</textarea></footer>
<div data-component="rightbottom-sticky" class="component-rightbottom-sticky" mt-scope='[]'  data-component-config='{"css":"fewww:\/www\/css\/rightbottom-sticky.css@b8186a3"}'><img src='data:image/png,' onerror='M._autoinit.push(this.parentNode);this.parentNode.removeChild(this);' width=1 height=1 style='position:absolute;'><textarea rel="lazyrender" style="display:none"><img src='data:image/png,' onerror='M._autoinit.push(this.parentNode);this.parentNode.removeChild(this);' width=1 height=1 style='position:absolute;'><div id="fixbar-container" class="new-index-triffle-w" data-config="{&amp;quot;feedbackConfig&amp;quot;:{&amp;quot;url&amp;quot;:&amp;quot;\/feedback\/default\/serach&amp;quot;,&amp;quot;ga&amp;quot;:&amp;quot;survey\/floornew&amp;quot;}}">
    <div id="fixbar-item-top">
        <a class="J-go-top lift-nav new-index-triffle" hidefocus="true" href="javascript:;">
            <i></i><span>回到顶部</span>
        </a>
    </div>
    <div id="fixbar-item-vote">
        <a target="_blank" class="new-index-triffle lift-nav lift-nav--vote" hidefocus="true" href="http://survey.meituan.com/index.php?r=survey/index/sid/278592/lang/zh-Hans"><i></i><span>问卷调查</span></a>
    </div>
    <div id="fixbar-item-help"> 
        <a class="J-lift-help new-index-triffle lift-nav lift-nav--help" href="javascript:;">
            <i></i><span>帮助中心</span>
        </a>
    </div>
    <div id="fixbar-item-feedback"> 
    </div>
</div>
</textarea></div>
<iframe src="http://ck.dsp.meituan.com/beacon?adx=tanx" frameborder="0" style="width: 1px; height: 1px; position: absolute; top: 0px; left: -9999px; display: none !important; visibility: hidden !important; opacity: 0 !important;" width="0" height="0"></iframe>

    
    

    
</body>
</html>
