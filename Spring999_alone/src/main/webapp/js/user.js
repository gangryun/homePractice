
function login(){
	
	var id = document.getElementById("id").value;
	var pw = document.getElementById("password").value;
	
	if(id.trim() == ""){
		alert("아이디를 입력해주세요.");
		return;
	}
	
	if(pw.trim() == ""){
		alert("비밀번호를 입력해주세요.");
		return;
	}
	
	if(id.indexOf(" ") !== -1){
		alert("아이디에 공백이 포함되어있습니다.");
		return;
	}

	if(pw.indexOf(" ") !== -1){
		alert("비밀번호에 공백이 포함되어있습니다.");
		return;
	}
	
	$.ajax({
		url:"./login.do",
		type:"post",
		data: {id:id, password:pw},
		success:function(msg){
			
			if(msg=="Y"){
				location.href='./index.do';
				
			}else{
				alert('로그인 정보가 없습니다.');
				return;
			}
			
		},
		error:function(){
			alert('에러');
		}
	});
}


function findId(){
	
  	var chk = $("input[name=type]:checked").val();	
  	console.log(chk);
	
	var param ;

	if(chk == "N"){
		if($("#userName").val() == ""){
			alert('이름을 입력해주세요.');
			return;
		}
		if($("#phone").val() == ""){
			alert('전화번호를 입력해주세요.');
			return;
		}
		
		param = {
			name : $("#userName").val(),
			phone : $("#phone").val() 
		}
		
	} else{
		if($("#email").val() == ""){
			alert('이메일을 입력해주세요.');
			return;
		}
		
		param = {
			email : $("#email").val()		 
		}
	}
	
	console.log(param);
		
	$.ajax({
		url:"./findId.do",
		data: param, 
		success:function(data){
			console.log(data);
			if(data != ""){
				$("#id").text("아이디 : " + data);
							
			} else{
				$("#id").text("");
				alert('아이디가 없습니다.');
			}
		}
		
	});
}

function checkRadio(data){
	console.log(data);
	if(data=="N"){
	
		$("#emailTable").attr('style', "display:none;");
		$("#nameTable").attr('style', "display:block;");
		$("#email").val("");
		
	} else{
		
	 	$("#nameTable").attr('style', "display:none;");
	 	$("#emailTable").attr('style', "display:block;");	
	 	$("#userName").val("");
	 	$("#phone").val("");

	}
}


