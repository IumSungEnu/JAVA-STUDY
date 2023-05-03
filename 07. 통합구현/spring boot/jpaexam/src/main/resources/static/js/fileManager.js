var koreait = koreait || {};

upload(files){
    try{
        if(!files || files.length){

        }
    }catch{

    }
}


window.addEventListener("DOMContentLoaded", function(){

/* 파일 선택 이벤트 처리 S */
const fileUploadEls = document.getElementsByClassName("fileUpload");
for(const el of fileUploadEls){
    const dataset = el.dataset;
    const fileId = dataset.targetId;

    const fileEl = document.getElementById(fileId);
    if(fileEl){
    const dataset = el.dataset;
        koreait.fileManager.upload(files);
    }

    //console.log(dataset);
}
/* 파일 선택 이벤트 처리 E */

});