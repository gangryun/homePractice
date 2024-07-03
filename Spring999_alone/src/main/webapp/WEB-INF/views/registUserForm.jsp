<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>회원가입</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript">
var check="N";

$( document ).ready(function() {
	$("#id").on("change keyup paste", function(){
 		document.getElementById("checkText").style.display = "inline";
		document.getElementById("checkText").style.color = "green";
		document.getElementById("checkText").innerHTML = "중복확인을 진행해주세요.";
		document.getElementById("id").style.width="60%";
		check = "N";
	})
});


function duplicateCheck(){

	
	var id = document.getElementById("id").value;
	var text = document.getElementById("checkText");
	const idRegex =  /^[a-zA-Z](?=.*[a-zA-Z])(?=.*[0-9]).{4,12}$/g;
	
	
	
	if(id == ""){
		alert('아이디를 입력해주세요.');
		id.focus();
		return;
	}
	if(id.length <4){
		alert("4글자 이상을 입력해주세요.");
		id.focus();
		return;
	}
	
	if (!id.match(idRegex)) {
	    alert("영문/숫자만 입력해주세요.");
	    return;
	}
	
	
	
	return ;
	fetch("./duplicateId.do",{
		
		method:"post",
		headers:{
			"Content-Type":"application/x-www-form-urlencoded"
		},
		body: "id="+id.value
		
	})
	.then(response => {
		if(!response.ok){
			throw new Error;
		} else{
			return response.text();
		}
	})
	.then(msg=>{
		
		if(msg == "true"){
			text.style.color = "red";
			text.textContent= "사용할 수 없는 아이디입니다."
			document.getElementById("useId").style.display="none";
			document.getElementById("id").style.width="60%";
		} else{
			check="Y";
			text.style.color = "blue";
			text.textContent= "사용할 수 있는 아이디입니다."
			document.getElementById("useId").style.display="block";
			document.getElementById("id").style.width="60%";
			document.getElementById("id").hidden = "Y";
		}
		
		
	})
}
	
	function idUse(){
		var id = document.getElementById("id");
		var text = document.getElementById("checkText");
		var btn = document.getElementById("duplicateBtn");
		console.log("check : " + check);
		text.style.display = "none";
		document.getElementById("useId").style.display = "none";
		
	}
	
	

</script>
</head>
<body>
	<div class="container" style="margin-top: 100px;">
		<form action="./registUser.do" method="post">
			<table class="table table-hover">
				<tr>
					<td>아이디</td>
					<td>
						<input type="text" class="form-control" name="id" id="id" placeholder="아이디" style="display: inline; width: 80%;">
						<p id="checkText" style="display: inline;"></p>
						<button type="button" id="duplicateBtn" class="btn btn-success btn-sm" style="float: right;" onclick="duplicateCheck()">중복확인</button>
						<button type="button" id="useId" class="btn btn-info btn-sm" style="float: right; margin-right:6px; display: none;" onclick="idUse()">사용</button>
					</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td>
						<input type="text" class="form-control" name="password" id="pw" placeholder="비밀번호">
					</td>
				</tr>
				<tr>
					<td>비밀번호확인</td>
					<td>
						<input type="text" class="form-control" id="pwCheck" placeholder="비밀번호확인">
					</td>
				</tr>
				<tr>
					<td>이름</td>
					<td>
						<input type="text" class="form-control" name="name" id="name" placeholder="이름">
					</td>
				</tr>
				<tr>
					<td>핸드폰번호</td>
					<td>
						<input type="text" class="form-control" name="phone" id="phone" placeholder="핸드폰번호">
					</td>
				</tr>
				<tr>
					<td>이메일</td>
					<td>
						<input type="text" class="form-control" name="email" id="email" placeholder="이메일">
					</td>
				</tr>
				<tr style="text-align: center;">
					<td colspan="2">
						<input class="btn btn-danger" type="submit" value="등록">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>