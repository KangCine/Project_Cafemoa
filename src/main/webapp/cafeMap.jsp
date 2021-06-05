<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./resources/css/CafeMap.css" rel="stylesheet"/>
</head>
<body>
	<div class="map_wrap">
		<div id="map"
			style="width: 100%; height: 100%; position: relative; overflow: hidden;"></div>
		<ul id="category">
			<li id="CE7" data-order="4"><span class="category_bg cafe"></span>
				카페</li>
		</ul>
	</div>
	
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=c2d5c2de50d337d5b2fb9c0f913e02f7&libraries=services"></script>
	<script type="text/javascript" src="resources/js/CafeMap.js"></script>
</body>
</html>