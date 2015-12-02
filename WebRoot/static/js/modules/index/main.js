require.config({
	paths : lt.getPaths(),
	// 这个配置是你在引入依赖的时候的包名
	shim : lt.shim,
	// 禁止缓存
	"urlArgs" : "bust=" + (new Date()).getTime()
});

require.config({
	paths : {
		// app
		"app" : [ lt.getJsPath() + "modules/app" ],
		// 方向悬停特效
		"hoverdir" : [ lt.getJsPath() + "common/temp/jquery.hoverdir" ],
		// 图片无缝轮播
		"slides" : [ lt.getJsPath() + "common/temp/jquery.slides" ],
		// 图片延迟加载
		"imgLazyload" : [ lt.getJsPath() + "common/temp/jquery.imglazyload" ]
	},
	shim : {
		'hoverdir' : {
			deps : [ "jquery" ],
			exports : 'hoverdir'
		},
		'slides' : {
			deps : [ "jquery" ],
			exports : 'slides'
		},
		'imgLazyload' : {
			deps : [ "jquery" ],
			exports : 'imgLazyload'
		}
	}
});

require([ "jquery", 'angular', 'ui-router', "app", "hoverdir", "slides", "imgLazyload" ], function($, angular) {
	$(function() {
		// 启动angularjs
		// angular.bootstrap(document, ["app"]);
		// 创建图片轮播
		$('#slides').slidesjs({
			play : {
				active : true,
				auto : true,
				interval : 2000,
				swap : false
			}
		});
		// 创建方向悬停特效
		$('.da-thumbs li').hoverdir();
		// 创建图片延迟加载
		$("img.imglazy").lazyload();
	});

})