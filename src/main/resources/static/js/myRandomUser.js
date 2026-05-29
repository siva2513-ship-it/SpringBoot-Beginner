function displayUser(user){
    document.getElementById("userImage").src = user.image;
    document.getElementById("userName").textContent=user.name;
    document.getElementById("userGender").textContent=user.gender;
}

function getRandomIndex(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}


function getAndDisplayNextMyRandomUser(){
    fetch("/api/users")
    .then(function(res){
        return res.json();
    })
    .then(function(data){
        var i=getRandomIndex(0,1);
        var userData = data[i];
        var myUserObject = {};
        myUserObject.name = userData.name;
        myUserObject.gender = userData.gender;
        myUserObject.image = userData.image;
        displayUser(myUserObject);
    })
    .catch(function(err){
        console.error("Error fetching random user:", err);
    });
}