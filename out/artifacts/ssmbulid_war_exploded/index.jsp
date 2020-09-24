
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>

    <style>
      h3{
        width: 180px;
        height: 38px;
        text-align: center;
        margin: 100px auto;
        line-height: 38px;
        border-radius: 5px;
        background-color: cornflowerblue;
      }
      h3:hover{transform: scale(1.1);}
      a{
        text-decoration: none;
        font-size: 18px;
        font-family: 微软雅黑;
        color: black;
      }
      a:hover{
        transform: scale(1.1);
        color: white;
      }
    </style>
  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allbook">Enter BookList</a>
  </h3>
  <h3>
    <a href="${pageContext.request.contextPath}/user/toLogin">LoginPage</a>
  </h3>
  <h3>
    <a href="${pageContext.request.contextPath}/user/toRegistration">Registration</a>
  </h3>
  </body>
</html>
