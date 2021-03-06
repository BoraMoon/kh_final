<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Profile Update</title>
<link rel="stylesheet"
   href="${pageContext.request.contextPath }/resources/css/main/afterLoginCommon.css">
<script src="https://kit.fontawesome.com/5e1e16b3f4.js"
   crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/748cfe3a61.js"
   crossorigin="anonymous"></script>
<link
   href="https://fonts.googleapis.com/css?family=Fredoka+One&display=swap"
   rel="stylesheet">
<script
   src="${pageContext.request.contextPath }/resources/js/jquery-3.4.1.js"></script>
<link rel="stylesheet"
   href="${pageContext.request.contextPath }/resources/css/main/mypage.css">
<link rel="stylesheet"
   href="${pageContext.request.contextPath }/resources/css/member/makeProfile.css">
<link rel="stylesheet"
   href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script>

/* 파일 등록 취소시 취소되는구문     */

</script>



<style>
input#inputProfileName {
   width: 200px;
   position: relative;
   margin-left: 10%;   
}

#inputProfileName {
   display: none;
}

#liProfileName{
	margin-left:10%;
}

</style>
</head>


<body>
   <jsp:include page="/WEB-INF/views/common/mainInclude.jsp"></jsp:include>


   <section>

      <form name="profileFrm"
         action="${pageContext.request.contextPath}/member/profileUpdate.do"
         method="post" enctype="multipart/form-data" id="tag-form">

         <article class="first">
            <div class="intro-div">


               <div class="img-div">
                  <img
                     src="${pageContext.request.contextPath }/resources/upload/profile/${profile.profileImgRe!=null?profile.profileImgRe:''}"
                     alt="">
               </div>

               <div class="myname-div font-kor">
               	  
                  <div style="font-size: 25px; margin: 0 10%">@
                     ${memberLoggedIn.memberId } <i class="fas fa-pencil-alt settingNickname"></i></div>
                  


                  <div
                     style="font-size: 30px; font-weight: 900;">
                     
                     <input type="text" placeholder="닉네임정하기" id="inputProfileName"
                        value="${profile.profileName }" name="profileName"></input>
                     <div id="liProfileName">${profile.profileName } </div>
                  </div>
               </div>
            </div>
            <div class="btn-div">
               <input type="button" value="회원정보 수정" class="update-btn font-kor" onclick="location.href='${pageContext.request.contextPath}/member/update.do'">
            </div>
          <!--   <div class="list-div">
               <div class="list-title">
                  <p
                     style="color: white; font-size: 20px; font-weight: bold; padding: 6%;"
                     class="font-kor">소모임 목록</p>
                  <div class="list-ul-container">
                     <ul class="font-kor list-ul" style="padding: 0;">
                        <li><p class="p-class">윙스터디 모임</p></li>
                        <li><p class="p-class">윙스터디</p></li>
                        <li><p class="p-class">윙</p></li>
                     </ul>
                  </div>
               </div>
            </div> -->
         </article>

         <article class="makeProfile-article font-kor">
            <div class="makeProfile-article-title font-kor">
               <p>소개글</p>
            </div>
            
            <div class="makeProfile-article-contents font-kor">
            <input type="text" class="makeProfile-infotext1 font-kor"
               placeholder="프로필소개글" name="profileComment" id="profileComment"
               value="${profile.profileComment }">
               <input type="text" class="makeProfile-infotext2 font-kor"
                  placeholder="    #관심사 입력" id="tag" size="6"> <input
                  type="hidden" value="" name="contentsCateCodes" id="rdTag" />
               <ul id="tag-list">
		       		<c:forEach items="${profile.contentsCateCodes }" var="list">
		       			<input type="hidden" name="testValue" value="${list }"/>
		                <!-- <li class='tag-item' >#${list }<span class='del-btn' idx='"+counter+"'>x</span></li> -->			                         
               		</c:forEach>
               </ul>
            </div>
         
         <div class="makeProfile-article-inputImg font-kor">
               <p>프로필 이미지 등록</p>

                  <div class="uploadImg-div">
                     <div>
                        <span id="fileNameForProfile"></span>
                     </div>
                     <div class="custom-file">
                        <label for="upFile">파일 첨부</label> 
                        <input type="file" name="upFile" id="upFile" style="display:none;">
                         <!-- style="display: none -->   

                     </div>
                  </div>
               
            </div>
            <div class="makeProfile-article-button font-kor">
               <input type="submit" value="프로필 카드 등록"
                  class="makeProfile-btn-insert font-kor">
            </div>
         <input type="hidden" name="memberCode" id="memberCode"
            value="${memberLoggedIn.memberCode }" /> 
            <input type="hidden"
            name="memberCode" id="profileAge"
            value="${memberLoggedIn.memberBirth }" /> 
            <input type="hidden"
            name="memberCode" id="profileGender"
            value="${memberLoggedIn.memberGender }" />
            
            
      </article>
      </form>
      <!-- <article class="mypage-third">
         <div class="friend-container">
            <div class="friend-title font-kor">
               <p
                  style="color: white; font-size: 20px; font-weight: bold; padding: 6%;">친구
                  목록</p>
            </div>
            <div class="friend-lists">
               
            </div>
         </div>
      </article> -->
      

</section>
</body>


<script type="text/javascript">

      
      
      
      
      
      
      
      /*프로필 네임 수정  */
      jQuery('.settingNickname').click(function () {  
          if($("#inputProfileName").css("display") == "none"){   
              jQuery('#inputProfileName').css("display", "block");   
              jQuery('#liProfileName').css("display", "none");              
          } else {  
              jQuery('#liProfileName').css("display", "block");
              jQuery('#inputProfileName').css("display", "none");
          }  
      });  
      
      
      
      
      
      


/*  친구 프로필들 출력 */

$(()=>{
	
   $("#upFile").on("change",function(){
      /* console.log(this.value); */
      $("#fileNameForProfile").text(this.value);
   });
   console.log("onload On");
      /*친구찾기  */
   /*    location.href="${pageContext.request.contextPath}/Friend/selectFriendList.do?memberCode="+41; */
      var a = ${memberLoggedIn.memberCode };
      $.ajax({
         url:"<%=request.getContextPath()%>/friend/selectFriendList",
         type: "GET", 
          data:{"memberCode":a},
   /*       dataType: "text",  */
         beforeSend: function(){
            console.log("beforeSend");
         },
         success: function(data){
            
            console.log("success");
            console.log("data :", data);
            
      /*       $(".friend-lists").append("<div class='friend-list'><div class='friend-img'><img src='${pageContext.request.contextPath }/resources/upload/member/frofileimg/ex2.jpg' alt='' /></div><div class='friend-name font-kor friend-name-profile'>김원재</div></div>"); 
       */      
            
            $.each(data,function(idx,value){
               console.log(idx);
               console.log(value);
               
               var sam = value.profileImgRe!=null?value.profileImgRe:'';
               console.log("삼="+sam);
               /*             
               $(".friend-lists").append("<div class='friend-list'    ><div class='friend-img'><img src='${pageContext.request.contextPath }/resources/upload/member/frofileimg/ex2.jpg' id='profileImg' value='"+value.memberCode+"'  alt='' /></div><div class='friend-name font-kor friend-name-profile' id='profileId' value='"+value.memberCode+"' >"+value.memberPname+"</div></div>"); 
                 */
         
                $(".friend-lists").append("<div class='friend-list'    ><div class='friend-img'><img src='${pageContext.request.contextPath }/resources/upload/profile/"+sam+"' alt=''></div><div class='friend-name font-kor friend-name-profile' id='profileId' value='"+value.memberId+"' >"+value.memberPname+"</div></div>"); 
                
            })
            
         },
         error: function(jqxhr, textStatus, errorThrown){
      
            console.log("ajax처리실패!", jqxhr, textStatus, errorThrown);
         }, 
         complete: function(){
      
            console.log("complete");
            
         }
         
      });
   
   
      

      /* 마우스 클릭했을때, 프로필 출력  */
   <%--    $(document).on("click",".friend-name",function(){
         var a = $(this).attr('value');
         console.log("a val ="+a);
         $.ajax({
            url:"<%=request.getContextPath()%>/profile/findProfile",
            type: "GET", 
             data:{"profileMemberCode":a},
      /*       dataType: "text",  */
            beforeSend: function(){
               console.log("beforeSend");
            },
            success: function(data){
               
               console.log("success");
               console.log("data :", data);
               

               location.href="${pageContext.request.contextPath}/profile/profileview.do?profileMemberId="+a;
            },error: function(jqxhr, textStatus, errorThrown){
         
               console.log("ajax처리실패!", jqxhr, textStatus, errorThrown);
            }, 
            complete: function(){
         
               console.log("complete");
               
            }
            
         });

         
      }); --%>
      
      $(document).on("click",".friend-name",function(){
         var a = $(this).attr('value');
         console.log("a val ="+a);
         

               location.href="${pageContext.request.contextPath}/profile/profileview.do?profileMemberId="+a;
         
         });

      
      
      
      
      
   });/*onload  */








   </script>
   
   
   
<script>

/* 파일 등록 취소시 취소되는구문     */
$(()=>{
   
   $("[name=upFile]").on("change", e => {
      let $file = $(e.target); //사용자가 작성한 file input 태그
      
      //취소한 경우
      if($file.prop('files')[0] === undefined){
         $file.next(".custom-file-label").html("파일을 선택하세요.");
      }
      else{
         let fileName = $file.prop('files')[0].name;
         $file.next(".custom-file-label").html(fileName);
      }
   });
   
   
   
});





$(()=>{

		
	
	
   //*****************해쉬태그 생성 **********************
   var tag = {};
   var counter = 0;   
   
   // 태그를 추가한다.
   function addTag (value) {
	   console.log(value);
       tag[counter] = value; // 태그를 Object 안에 추가
       counter++; // counter 증가 삭제를 위한 del-btn 의 고유 id 가 된다.
   }
   // 최종적으로 서버에 넘길때 tag 안에 있는 값을 array type 으로 만들어서 넘긴다.
   function marginTag () {
       return Object.values(tag).filter(function (word) {
           return word !== "";
       });
   }
   // 서버에 넘기기
   $("#tag-form").on("submit", function (e) {
       var value = marginTag(); // return array
       $("#rdTag").val(value);
       $(this).submit();
   });
   $("#tag").on("keypress", function (e) {
       var self = $(this);
       // input 에 focus 되있을 때 엔터 및 스페이스바 입력시 구동
       if (e.key === "Enter" || e.keyCode == 32) {
           var tagValue = self.val(); // 값 가져오기
          var reg = /^[가-힣]{1,8}$/;
           // 값이 없으면 동작 ㄴㄴ
           if (tagValue !== "" && reg.test(tagValue)) {
               // 같은 태그가 있는지 검사한다. 있다면 해당값이 array 로 return 된다.
               var result = Object.values(tag).filter(function (word) {
                   return word === tagValue;
               })
               // 태그 중복 검사
               if (result.length == 0) {
                   $("#tag-list").append("<li class='tag-item' >#"+tagValue+"<span class='del-btn' idx='"+counter+"'>x</span></li>");
                   addTag(tagValue);
                   self.val("");
               } else {
                   alert("태그값이 중복됩니다.");
               }
           }else{
             $("#tag").val('');
           }
           e.preventDefault(); // SpaceBar 시 빈공간이 생기지 않도록 방지
       }
   });
   // 삭제 버튼
   // 삭제 버튼은 비동기적 생성이므로 document 최초 생성시가 아닌 검색을 통해 이벤트를 구현시킨다.
   $(document).on("click", ".del-btn", function (e) {
       var index = $(this).attr("idx");
       tag[index] = "";
       $(this).parent().remove();
   });
   //****************해쉬태그 끝 ********************
   	
	var arrayForTag = $("input[name=testValue]");
	
	$.each(arrayForTag,function(idx, elem){
		
		/* console.log(elem.value); */		
		var tagValue = elem.value; // 값 가져오기
          var reg = /^[가-힣]{1,8}$/;
           // 값이 없으면 동작 ㄴㄴ
           if (tagValue !== "" && reg.test(tagValue)) {
               // 같은 태그가 있는지 검사한다. 있다면 해당값이 array 로 return 된다.
               var result = Object.values(tag).filter(function (word) {
                   return word === tagValue;
               })
               // 태그 중복 검사
               if (result.length == 0) {
                   $("#tag-list").append("<li class='tag-item' >#"+tagValue+"<span class='del-btn' idx='"+counter+"'>x</span></li>");
                   addTag(tagValue);
                   
               } else {
                   alert("태그값이 중복됩니다.");
               }
           }else{
             $("#tag").val('');
           }
           
	});
});








</script>

<style>
.list-ul li{
      padding: 0%;
      margin: 0;
}
.list-ul-container{
   margin: 0;
   margin-left: 12%;
}
#fileNameForProfile{
   font-size: 24px;
}
.uploadImg-div div:first-child{
   font-size : 24px;
}
.fa-pencil-alt{
	position : relative;	
    margin : 0;     
    color: #cbcbcb;
}
.makeProfile-infotext1{
	padding-left: 25px;
}
.makeProfile-infotext2{
	width : 1024px;	
}
#tag-list{
	width : 1024px;
	margin : 0 auto;
}
</style>

</html>