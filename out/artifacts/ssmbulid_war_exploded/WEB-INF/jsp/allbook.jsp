<%@ taglib uri="/WEB-INF/jstl/c.tld" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示页面</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header" style="float: left;display: inline;">
                <h1 style="display: inline;">
                    <small>书籍列表</small>
                </h1>
            </div>
            <div class="page-header"style="float: right;display: inline;margin-left: 5px">
                <a href="${pageContext.request.contextPath}/user/logout">注销</a>
            </div>
            <div class="page-header" style="float: right;display: inline">
                欢迎${user.userName}
            </div>

        </div>
    </div>



    <div style="display: inline;float:left">
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/addBook">增加书籍</a>
    </div>

    <div style="display: inline;float:left;margin-left: 5px" >
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allbook">显示所有书籍</a>
    </div>

    <div class="col-md-8 column">

        <form style="float:right;" class="form-inline" action="${pageContext.request.contextPath}/book/toQueryBookByName" method="post">
            <h3 style="color: indianred">${error.toString()}</h3>
            <input name="bookName" type="text" value="${book.bookName}">
            <input type="submit" value="查询">
        </form>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>书籍编号</th>
                    <th>书籍名称</th>
                    <th>书籍数量</th>
                    <th>书籍详情</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                 <c:forEach var="book" items="${list}">
                     <tr>
                         <td>${book.bookId}</td>
                         <td>${book.bookName}</td>
                         <td>${book.bookCounts}</td>
                         <td>${book.detail}</td>
                         <td>
                             <a href="${pageContext.request.contextPath}/book/updateBook?bookId=${book.bookId}">修改</a>
                             &nbsp;|&nbsp;
                             <a href="${pageContext.request.contextPath}/book/toDeleteBook?bookId=${book.bookId}">删除</a>
                         </td>
                     </tr>
                 </c:forEach>

                </tbody>
            </table>
        </div>
    </div>

</div>

</body>
</html>
