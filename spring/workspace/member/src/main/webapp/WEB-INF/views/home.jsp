<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>회원목록 출력</title>
</head>
<body>
<h2>
	회원정보 입력하기  
</h2>
<form name="myform" method="post" id="myform">
<table>
	<thead>
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>이메일</th>
			<th>전화번호</th>
			<th>관리자</th>
		</tr>
		</thead>
	<tbody>
	
		<tr>
		<td><input type="text" size="14" name="userid" id="userid"/>
			<span>중복결과여부</span>
		<td><input type="password" size="14" name="pwd" id="pwd"></td>
		<td><input type="text" size="14" name="usernm" id="usernm"></td>
		<td><input type="email" size="14" name="email" id="email"></td>
		<td><input type="text" size="14" name="phone" id="phone"></td>
		<td><input type="text" size="14" name="admin" id="admin"></td>
		</tr>
</tbody>
<tfoot>
	<tr>
		<td colspan="6" align="center">
			<input type="button" value="가입하기" id="btnReg"/>
		</td>
	</tr>
</tfoot>	
</table>
</form>
<h1>회원목록</h1>
<input type="button" id="btnlist" value="회원목록표시">
<table>
<tr>
	<th>아이디</th>
	<th>비밀번호</th>
	<th>성별</th>
	<th>이메일</th>
	<th>연락처</th>
	<th>삭제</th>	
</tr>
<tbody id="tbody">

</tbody>
</table>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$("table").on("click","#btnDel", function(){
		$.ajax({
			url:"/deleteMember",
			type:"post",
			dataType:"text",
			data:"userid="+$(this).attr("name"),
			success:function(data){
				if(data == 1){
					alert("삭제성공");
					$("#tbody").empty();
					getList();
				}else{
					alert("삭제실패");
				}
			},
			error:function(data){
				alert("삭제실패");
			}
		});
	})
	function getList(){
		$.ajax({
			url:"/memberList", 
			type:"get",
			/* 서버에서 데이터를 성공적으로 받았으면 처리되는 영역  */
			success:function(data){
				var tr = "";
				for(var member in data){
					tr += "<tr>"
						tr += "<td>"+ data[member]['userid']+"</td>";
						tr += "<td>"+ data[member]['pwd']+"</td>";
						tr += "<td>"+ data[member]['usernm']+"</td>";
						tr += "<td>"+ data[member]['email']+"</td>";
						tr += "<td>"+ data[member]['phone']+"</td>";
						tr += "<td>"+ "<input type='button' value='삭제' id='btnDel' name='" 
								+ data[member]['userid']
								+ "'/>"
								+"</td>";
					tr += "</tr>"
				}
				$("#tbody").append(tr);
			},
			error: function(error){
				alert("실패");
			}
		});
	}
	$("#btnReg").click(function(){
		var formdata = $("#myform").serialize();
		$.ajax({
			url:"/insertMember",
			type:"post",
			dataType:"text", /* 서버에서 전송될 데이터의 타입을 지정 */
			data: formdata, /* 서버로 전송할 데이터를 지정 serialize(한번에 말아줌) */
			success:function(data){
				/* 회원가입 성공시, 처리하는 부분  */
				
				if(data==1){
					/* 1.성공메세지 출력 */
					alert("회원가입을 축하합니다");
					/* 2.목록갱신 */
					$("#tbody").empty();   /* 기존목록 삭제 */
					getList();				/* 서버에서 가져온 데이터로 다시 목록을 갱신 */
					/* 3.기존 입력값을 초기화해야함 */
					$("tbody input[type]").each(function(){
						$(this).val("");
					})
				}else{
					alert("회원가입실패");
				}								
			},
			error:function(data){
				alert("실패");
			}
		});
	});
	
	$("#btnlist").click(function(){
		getList();
	});
	
</script>
</body>
</html>










