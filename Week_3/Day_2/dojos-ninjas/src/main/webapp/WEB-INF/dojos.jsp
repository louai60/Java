<h1>All Dojos</h1>
<c:forEach var="dojo" items="${dojos}">
    <p><a href="/dojos/${dojo.id}">${dojo.name}</a></p>
</c:forEach>
