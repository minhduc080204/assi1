<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form method="post" action="${title=='create'?'create-post':'edit-post'} " modelAttribute="post" cssClass="d-flex flex-column gap-2 w-50">
    <h3>${title=='create'?'Create Post':'Edit Post'}</h3>
    <form:hidden path="id" value="${post.id}"/>
    <form:hidden path="createTime" value="${post.createTime}"/>

    <div>
        <label for="title">Title</label>
        <form:input path="title" id="title" class="form-control"
                    placeholder="Enter title" required="true" value="${post.title}"/>
    </div>
    <div>
        <label for="content">Content</label>
        <form:input path="content" id="content" class="form-control"
                    placeholder="Enter content" required="true" value="${post.content}"/>
    </div>
    <div>
        <label for="tags">Tags</label>
        <form:input path="tags" id="tags" class="form-control"
                    placeholder="Enter tags" required="true" value="${post.tags}"/>
    </div>
    <div>
        <label for="status">Status</label>
        <form:select path="status" class="form-select" aria-label="Default select example">
            <form:option value="Draft" selected="true">Draft</form:option>
            <form:option value="Published">Published</form:option>
        </form:select>
    </div>
    <button type="submit" class="btn btn-success">Submit</button>
</form:form>