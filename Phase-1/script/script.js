function search_result() {
    var x = document.forms["searchForm"]["search-result"].value;
    if (x == "Spring" || x == "spring") {
        var y = document.getElementById("search-result");
        y.style.display = "block";
    }
    return false;
}

function validateLogIn() {
    var x = document.forms["logInForm"]["account-type"].value;
    if (x == "Trainee") {
        window.location.href = "user-landing-page.html";
        return false;
    } else if (x == "Trainer") {
        window.location.href = "mentor-landing-page.html";
        return false;
    }
    return false;
}

function validateAdmin() {
    var userName = document.forms["adminSignInForm"]["admin-username"].value;
    var password = document.forms["adminSignInForm"]["admin-password"].value;
    if (userName == "admin" && password == "admin") {
        window.location.href = "admin-landing-page.html";
        return false;
    } else {
        alert("Wrong Credentials");
    }
    return false;
}

function training_result() {
    var x = document.forms["trainingForm"]["trainingTechnology"].value;
    if (x == "spring") {
        var y = document.getElementById("training-result");
        y.style.display = "block";
    }
    return false;
}

function addskill(res, idb) {
    var id = "#" + res;
    $(id).appendTo('#mentor-skills');
    document.getElementById(idb).disabled = true;
    return false;
}

function action(button) {
    if (document.getElementById(button).classList.contains('btn-primary')) {
        document.getElementById(button).className = "btn btn-danger";
        document.getElementById(button).value = "Block";
    } else if (document.getElementById(button).classList.contains('btn-danger')) {
        document.getElementById(button).className = "btn btn-primary";
        document.getElementById(button).value = "Unblock";
    }
}