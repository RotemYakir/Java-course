
// -------------- REGISTER --------------
function register(email,password,firstName,lastName,userName,role) {
    // create a user here
    let user = new User(0,email,password,firstName,lastName,userName,role);
    console.log(user);
    // convert object to JSON
    let userAsJson=JSON.stringify(user);
  let xhttp=new XMLHttpRequest();
  xhttp.onload = function(){
    if(this.status==200){
        // save token in the browser memory
        sessionStorage.setItem("token",this.response);
        document.getElementById("mode").innerHTML="Logged In";
        handleSuccessMsg(this);
    }else{
        handleErrorMsg(this);
    }
};
let url ="http://localhost:8080/register";
// inform the server that we send a json in the request body
xhttp.open("POST",url);
xhttp.setRequestHeader("Content-Type","application/json");
xhttp.send(userAsJson);

}

// -------------- LOGIN --------------
function login(email,password) {
    let userCredentials = new UserCredentials(email,password);
    let userCredentialsAsJson=JSON.stringify(userCredentials);
  let xhttp=new XMLHttpRequest();
  xhttp.onload = function(){
    if(this.status==200){
        sessionStorage.setItem("token",this.response);
        document.getElementById("mode").innerHTML="Logged In";
        handleSuccessMsg(this);
    }else{
        handleErrorMsg(this);
    }
};
let url ="http://localhost:8080/login";
xhttp.open("POST",url);
xhttp.setRequestHeader("Content-Type","application/json");
xhttp.send(userCredentialsAsJson);
}

function logout(){
    sessionStorage.removeItem("token");
    document.getElementById("mode").innerHTML="Logged Out";
}