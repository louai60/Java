<h1>${dojo.name}</h1>
<h2>Ninjas:</h2>
<c:forEach var="ninja" items="${ninjas}">
    <p>${ninja.firstName} ${ninja.lastName}</p>
</c:forEach>
