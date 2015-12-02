require.config({
	paths : lt.getPaths(),
	// 这个配置是你在引入依赖的时候的包名
	shim : lt.shim,
	// 禁止缓存
	"urlArgs" : "bust=" + (new Date()).getTime()
});

require.config({
	paths : {
		// 图片无缝轮播
		"slides" : [ lt.getJsPath()+"common/temp/jquery.slides" ]
	},
	shim : {
		'slides' : {
			deps : [ "jquery" ],
			exports : 'slides'
		}
	}
});

require([ "jquery", "slides" ], function($, angular) {
	$(function() {
		// 创建图片轮播
		$('#slides').slidesjs(
				{
					play : {
						active : true,
						auto : true,
						interval : 2000,
						swap : false
					},
					callback : {
						loaded : function() {
							$(".img_wall").each(
									function(i, v) {
										$("ul.slidesjs-pagination li:eq(" + i + ")").find("a").css("background-image",
												"url(" + $(v).attr("src") + ")").text("");
									});
						}
					}
				});

		// 日期table切换事件
		$(".data-switch").on("click", "a", function() {
			var $this = $(this);
			$(".data-switch .active").removeClass("active");
			$this.parent().addClass("active");

			$(".dates").find("table").addClass("hide");
			$($this.attr("data-switch")).removeClass("hide");
		});

		// 选择时间事件
		$(".dates").on("click", "td.enable", function() {
			var $this = $(this);
			$(".dates").find("td.selected").removeClass("selected");
			$this.addClass("selected");
			var date = $this.attr('travel-data-date');
			$("#date").val(date);
		});

		// 日期提醒事件
		$(".select-data").click(function() {
			sh_add(0, 100);
		});

	});

	// 闪烁提示
	function sh_add(times, time) {
		setTimeout(function() { // 此处是过一定时间后自动消失
			if (times == 3) {
				return;
			}
			$("#sale_date").addClass("remind");
			sh_remove(times, time);
		}, time);
	}

	function sh_remove(times, time) {
		setTimeout(function() { // 此处是过一定时间后自动消失
			$("#sale_date").removeClass("remind");
			sh_add(times / 1 + 1, time);
		}, time);
	}

});