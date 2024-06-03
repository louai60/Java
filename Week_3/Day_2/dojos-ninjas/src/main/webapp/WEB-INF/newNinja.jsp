<form action="/ninjas" method="POST">
    <label for="firstName">First Name:</label>
    <input type="text" name="firstName" id="firstName">
    <label for="lastName">Last Name:</label>
    <input type="text" name="lastName" id="lastName">
    <label for="dojo">Dojo:</label>
    <select name="dojo" id="dojo">
        <c:forEach var="dojo" items="${dojos}">
            <option value="${dojo.id}">${dojo.name}</option>
        </c:forEach>
    </select>
    <input type="submit" value="Create Ninja">
</form>
