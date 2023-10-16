document.getElementById("generate-password").addEventListener("click", function () {
    var length = document.getElementById("password-length").value;
    var password = generatePassword(length);
    document.getElementById("password").value = password;
});

function generatePassword(length) {
    var charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
    var password = "";
    for (var i = 0; i < length; i++) {
        var randomIndex = Math.floor(Math.random() * charset.length);
        password += charset.charAt(randomIndex);
    }
    return password;
}