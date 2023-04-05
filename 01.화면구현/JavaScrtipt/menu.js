const moreMenus = document.getElementById("more_menus");

const more = document.getElementById("more");
const close = document.getElementById("close");

more.addEventListener("click", function(){
    moreMenus.classList.add("on");
});

close.addEventListener("click", function(){
    moreMenus.classList.remove("on");
});