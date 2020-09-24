
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍信息</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<form class="form-horizontal" style="width: 500px;margin: 0 auto" action="/book/toUpdateBook" method="post">
    <h3 style="text-align: center;	">修改书籍信息</h3>
    <input type="hidden" name="bookId" value="${bookTemp.bookId}">

    <div class="form-group">
        <label  class="col-sm-2 control-label">书籍名称</label>
        <div class="col-sm-10">
            <input type="text" class="form-control"  name="bookName" value="${bookTemp.bookName}" required>
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-2 control-label">书籍数量</label>
        <div class="col-sm-10">
            <input type="text" class="form-control"  name="bookCounts" value="${bookTemp.bookCounts}" required>
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-2 control-label">书籍详情</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="detail" value="${bookTemp.detail}" required>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default"  style="width: 413px;">确认修改</button>
        </div>
    </div>

</form>

</body>
</html>
