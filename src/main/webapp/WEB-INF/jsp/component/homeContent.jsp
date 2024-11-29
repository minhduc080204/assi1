<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
    <c:forEach items="${posts}" var="post">
        <div class="p-1 mb-2">
            <div class="m-1">
                <p class="fs-4 fw-bold m-0">${post.title}</p>
                <hr class="m-0">
                <p class="m-0 text-secondary">posted by ${post.user.userName} on ${post.createTime.toLocalDate()}</p>
                <p>${post.content}</p>
                <div class="bg-primary-subtle">
                    <div class="d-flex">
                        <b>Tags: </b>
                        <a href="/">${post.tags}</a>
                    </div>
                    <div class="d-flex">
                        <a href="/post?id=${post.id}">Permalink</a>
                        <b> | </b>
                        <a href="/">Comnent (${post.comments.size()})</a>
                        <p> Last Update on 2024</p>
                    </div>
                </div>
            </div>
        </div>
    </c:forEach>
</div>

