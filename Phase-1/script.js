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
    if (x == "Trainer") {
        window.location.href = "user-landing-page.html";
        return false;
    } else if (x == "Trainee") {
        window.location.href = "mentor-landing-page.html";
        return false;
    }
    return false;
}