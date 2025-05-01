<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>カウント結果</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
  <div class="text">
    
    <h1>カウント結果</h1>
    
    <p><strong>入力された文章：</strong><br>
    	<%= request.getAttribute("sentence") %></p>
       
    <p><strong>文字数：<%= request.getAttribute("count") %> 文字</strong></p>
   
    <div class="textbox">
      <form action="index.html">
        <input type="submit" value="戻る">
      </form>
    </div>
    
  </div>
</body>
</html>
