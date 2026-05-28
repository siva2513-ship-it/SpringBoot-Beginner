var i=0;

var userArray = [
    {"name": "John Doe", "gender": "Male", "image": "/img/newImg.png"},
    {"name": "Jane Doe", "gender": "Female", "image": "/img/newImg2.png"}
];

function toggle(){
    i = 1-i;
    var nextUser = userArray[i];
    document.getElementById("userImage").src = nextUser.image;
    document.getElementById("userName").textContent = nextUser.name;
    document.getElementById("userGender").textContent = nextUser.gender;
}