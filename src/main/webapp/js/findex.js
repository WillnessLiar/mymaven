$('#upto').on('click', function () {
    var fd = new FormData();
    fd.append("name", $("#name").val());
    fd.append("email",$("#email").val());
    fd.append("phone", $("#phone").val());
    fd.append("msg", $("#msg").val());
    $.ajax({
        url: "/insertMsg",
        type: "POST",
        processData: false,
        contentType: false,
        data:fd,
        success: function (d) {
            if(d.code===0){
                layer.alert("发送成功")
            }else {
                layer.confirm('发送失败请先登录！！', {
                    btn: ['去登录', '算了'] //可以无限个按钮
                }, function(index, layero){
                    parent.location.href = 'login.html';
                });
            }

        }
    });
});



