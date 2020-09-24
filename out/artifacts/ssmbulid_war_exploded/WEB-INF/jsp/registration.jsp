<%--
  Created by IntelliJ IDEA.
  User: HP--
  Date: 2020/9/3
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form class="form-horizontal" style="width:500px;margin: 100px auto;" method="post" action="${pageContext.request.contextPath}/user/registrated">

    <div class="form-group">
        <label  class="col-sm-2 control-label">用户名</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="userName" required style="width:300px">
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">密码</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" name="password" required style="width:300px">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
        </div>
    </div>
    <div class="form-group" >
        <div class="col-sm-offset-2 col-sm-10" >
            <button type="submit" class="btn btn-default" style="width:300px;">注册</button>
        </div>
    </div>
</form>
</body>
</html>
