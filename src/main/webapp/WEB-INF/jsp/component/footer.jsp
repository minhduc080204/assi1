<footer class="d-flex justify-content-center mt-3">
    <div>
        Copyringt Minh duc chim to
    </div>
</footer>

<%
    String message = (String) request.getAttribute("message");
    String type = (String) request.getAttribute("type");

%>
<script src="./js/bootstrap.min.js"></script>
<script>
    const toastLive = document.getElementById('liveToast')
    const toastMessage = document.getElementById('liveMessage')
    const toastMessageContainer = document.getElementById('liveMessageContainer')
    function showAlert(type, message){
        toastMessageContainer.className='alert m-0 alert-'+type;
        toastMessage.innerHTML=message;
        bootstrap.Toast.getOrCreateInstance(toastLive).show();
    }

    const messageFromServer = "<%= message %>";
    const typeFromServer = "<%= type %>";
    if(messageFromServer!='null'){
        showAlert(typeFromServer, messageFromServer);
    }
</script>
</body>
</html>
