<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<h1>Blog</h1>
<div class="px-4 py-2 bg-info d-flex gap-1">
    <a class="p-2 text-light text-decoration-none text-capitalize ${title == 'home' ? 'bg-light text-dark' : ''}" href="/home"><b>Home</b></a>
    <a class="p-2 text-light text-decoration-none text-capitalize ${title == 'about' ? 'bg-light text-dark' : ''}" href="/about"><b>About</b></a>
    <a class="p-2 text-light text-decoration-none text-capitalize ${title == 'contact' ? 'bg-light text-dark' : ''}" href="/contact"><b>Contact</b></a>
    <c:choose>
        <c:when test="${user.id!=null}">
            <form:form action="/logout" method="post">
                <button type="submit"
                        class="p-2 text-light text-decoration-none bg-transparent border border-0"
                        href="/logout"><b>Logout (<%= USERNAME %>)</b></button>
            </form:form>
        </c:when>
        <c:otherwise>
            <a class="p-2 text-light text-decoration-none ${title == 'login' ? 'bg-light text-dark' : ''}" href="/login"><b>Login</b></a>
        </c:otherwise>
    </c:choose>

</div>


<p class="${title=='home'? 'visually-hidden':''} p-2">
    <a href="/home">Home</a>
    >> <a class="text-capitalize" href="/${title}">${title}</a>
</p>