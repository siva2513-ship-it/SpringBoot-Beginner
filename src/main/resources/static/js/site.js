console.log("Hello from JS");

function changeImage(){
    let image = document.getElementById("myImage");

    if(image.src.includes("/img/img1.png")){
        image.src = "/img/img2.jpg";
    }else{
        image.src = "/img/img1.png";
    }

    let heading = document.getElementById("heading");

    if(heading.innerHTML === "Virat Kohli"){
        heading.innerHTML = "King Kohli";
    }else{
        heading.innerHTML = "Virat Kohli";
    }

    let para = document.getElementById("text");

    if(para.innerHTML === "Cricketer(Right-Hand Batsman)<br>2008-2014"){
        para.innerHTML = "Cricketer(Called as King)<br>2014-2026";
    }else{
        para.innerHTML = "Cricketer(Right-Hand Batsman)<br>2008-2014";
    }
}