

/* jQuery 版 */
$('#upJQuery').on('click', function () {
    var fd = new FormData();
    fd.append("file", $("#file").get(0).files[0]);
    fd.append("msg",$("#msg").val());
    $.ajax({
        url: "/uploadImage",
        type: "POST",
        processData: false,
        contentType: false,
        data:fd,
        success: function (d) {
            if(d.code===0){
                alert("上传成功")
            }else {
                alert("上传失败，没有权限")
            }

        }
    });
});



