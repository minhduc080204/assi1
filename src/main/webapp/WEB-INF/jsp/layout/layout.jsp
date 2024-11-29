<%@ include file="../component/header.jsp" %>

<main>
<%--    <%@ include file="../component/menu.jsp" %>--%>
    <div class="px-4 py-2 d-flex gap-5 justify-content-between">
        <jsp:include page="${component}" />
<%--        <%@ include file="../component/navBar.jsp" %>--%>
    </div>
</main>

<%@ include file="../component/footer.jsp" %>
