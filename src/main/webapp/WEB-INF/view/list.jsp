<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>


<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resource/mystyles.css" rel="stylesheet">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>

<script type="text/javascript">
	//默认的排序方式
	var orderByMethod = '${movieVO.orderByMethod=="asc"?"desc":"asc"}'

	function myOrder(orderByColumn) {

		location.href = "/selects?orderByColumn=" + orderByColumn
				+ "&orderByMethod=" + orderByMethod

	}
	
	//改变状态
	function updateStatus(id,status){
		$.post("/update",{id:id,status:status},function(obj){
			if(obj){
				alert("操作成功");
				location.reload();
			}
		})
		
	}
</script>
</head>
<body>

	<form action="/selects" method="post">
		电影名称: <input type="text" name="name" value="${movieVO.name }">
		导演: <input type="text" name="actor" value="${movieVO.actor }">
		年份: <input type="text" name="year" value="${movieVO.year }"> <br>
		上映时间: <input type="text" name="uptimeStart"
			value="${movieVO.uptimeStart }"> -- <input type="text"
			name="uptimeEnd" value="${movieVO.uptimeEnd }"> <br> 价格:
		<input type="text" name="priceStart" value="${movieVO.priceStart }">
		-- <input type="text" name="priceEnd" value="${movieVO.priceEnd }"><br>
		时间长度: <input type="text" name="durationStart"
			value="${movieVO.durationStart }"> -- <input type="text"
			name="durationEnd" value="${movieVO.durationEnd }"><br>

		<button type="submit">查询</button>



	</form>




	<table>

		<tr>
			<td>序号</td>
			<td>电影名称</td>
			<td>导演</td>
			<td><a href="javascript:myOrder('uptime')">上映时间</a></td>
			<td><a href="javascript:myOrder('duration')">时间长度</a></td>
			<td><a href="javascript:myOrder('price')">价格</a></td>
			<td><a href="javascript:myOrder('year')"> 年份</a></td>
			<td>类型</td>
			<td>地区</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${movies }" var="m" varStatus="i">
			<tr>
				<td>${i.index+1 }</td>
				<td>${m.name }</td>
				<td>${m.actor }</td>
				<td>${m.uptime }</td>
				<td>${m.duration }</td>
				<td>${m.price}</td>
				<td>${m.year }</td>
				<td>${m.type }</td>
				<td>${m.area }</td>
				<td>${m.status==-1?"已经下架":m.status==0?"即将上映":"正在热映" }</td>
				<td>
				<c:if test="${m.status!=-1 }">
				   <button type="button"  onclick="updateStatus(${m.id},-1)">下架</button>
				</c:if>
					<c:if test="${m.status==-1 }">
				   <button type="button"  onclick="updateStatus(${m.id},1)">上架</button>
				</c:if>
				
				</td>
			</tr>



		</c:forEach>

		<tr>
			<td colspan="11">${page }</td>
		</tr>

	</table>



</body>
</html>