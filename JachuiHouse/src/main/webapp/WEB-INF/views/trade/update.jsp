<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	 <title>사방팔아방 상세페이지</title>
        <link rel="stylesheet" href="/resources/css/include/header.css">
	    <link rel="stylesheet" href="/resources/css/trade/update.css">
	    <link rel="stylesheet" href="/resources/css/include/footer.css">
      </head>
      <body>
        <div id="container">
             <jsp:include page="/WEB-INF/views/include/header.jsp" />
    
        <main class="detail-container">
          <h2>사방팔아방 수정페이지</h2>
      
          <div class="detail-box">
            <div class="info-row">
              <div class="label">작성자</div>
              <div class="value">${trade.userId}USER01</div>
            </div>
      
            <div class="info-row">
              <div class="label">물품명</div>
              <div class="value">${trade.tradeTitle}중고 옷걸이</div>
            </div>
      
            <div class="info-row">
                <div class="label">이미지</div>
                <div class="value image-wrapper">
                    <img src="/resources/img/중고 옷걸이.jpg" alt="이미지 썸네일">
                </div>
              </div>
      
            <div class="info-row">
                <div class="label">상세내용</div>
                <div class="value description">${trade.tradeContent}좁은 공간 또는 여행지에서 빨래를 건조하거나,<br>
                  옷을 걸 때 유용한 도구<br><br>
                  창틀, 등(0.15~8.3cm)에 고정시켜주면<br>
                  간단한 옷걸이가 완성돼요<br>
                  색상은 랜덤입니다
                </div>
              </div>
              
              <div class="info-row">
                <div class="label">첨부파일</div>
                <div class="value">
                  <span class="file-button">첨부파일</span>
                  <span class="file-name">
                    <a href="../..${trade.fileName}" download alt>${trade.fileName}중고 옷걸이</a>
                </span>
                </div>
              </div>
          </div>
          
          <div class="button-container">
            <button class="custom-button" onclick="handleUpdate()">수정</button>
            <button class="custom-button" onclick="handleDelete()">삭제</button>
          </div>

          <script>
            function handleUpdate() {
              alert("게시글이 수정되었습니다");
              // 실제 수정 동작 연결은 여기에
              location.href = "/trade/list";
            }
          
            function handleDelete() {
              alert("게시글이 삭제되었습니다");
              // 실제 삭제 동작 연결은 여기에
              location.href = "/trade/list";
            }
          </script>

        </main>
         <jsp:include page="/WEB-INF/views/include/footer.jsp" />
        </div>
      </body>
</html>