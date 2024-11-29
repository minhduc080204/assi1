<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<table class="table table-hover">
    <thead>
    <tr>
        <th scope="col">Title</th>
        <th scope="col">Status</th>
        <th scope="col">Create time</th>
        <th scope="col" class="text-center">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${posts}" var="post">
        <tr>
            <td>${post.title}</td>
            <td>${post.status}</td>
            <td>${post.createTime.toLocalDate()} | ${post.createTime.toLocalTime()}</td>
            <td class="d-flex justify-content-center gap-3 h-100">
                <a class="btn btn-success" href="/editpost?id=${post.id}">View</a>
                <a class="btn btn-info" href="/edit-post?id=${post.id}">Edit</a>
                <form:form method="POST" action="/delete-post?id=${post.id}">
                    <button type="submit" class="btn btn-danger">Delete</button>
                </form:form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>