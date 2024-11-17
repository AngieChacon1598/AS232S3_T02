
    function validateForm() {
    const name = document.getElementById("name").value;
    const note = document.getElementById("note").value;
    const price = document.getElementById("price").value;

    // Verifica que el precio sea un número positivo
    if (price <= 0 || isNaN(price)) {
    alert("El precio debe ser un número positivo.");
    return false;
}

    // Evita caracteres especiales en el nombre y la descripción
    const regex = /^[a-zA-Z0-9 ]*$/;
    if (!regex.test(name) || !regex.test(note)) {
    alert("El nombre y la descripción solo deben contener letras, números y espacios.");
    return false;
}

    return true;
}
