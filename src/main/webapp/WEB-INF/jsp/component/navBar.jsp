<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="d-flex flex-column gap-3 p-1 ${title=='login'?'visually-hidden':''}">
    <div class="bg-primary-subtle d-flex flex-column">
        <h4 class="text-light bg-primary"><%= USERNAME %></h4>
        <a href="/create-post">Create New Post</a>
        <a href="/manage-post">Manage Post</a>
        <a href="">Approve Comment</a>
        <form:form action="/logout" method="post">
            <button type="submit"
                    class="p-2 text-danger bg-transparent border border-0"
                    href="/logout"><b>Logout</b></button>
        </form:form>
    </div>
    <div class="bg-primary-subtle d-flex flex-column">
        <h4 class="text-light bg-primary">Tags</h4>
        <div>
            <a href="">Create New Post</a>
            <a href="">Manage Post</a>
        </div>
    </div>
    <div class="bg-primary-subtle d-flex flex-column">
        <h4 class="text-light bg-primary">Recent Comment</h4>
        <p>Tester on <a href="">A test blog</a></p>
    </div>
</div>