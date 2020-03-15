

    $.ajax({
        url: "/selectPhoto",
        type: "GET",
        processData: false,
        contentType: false,
        success: function (d) {
            for(var i=0;i<d.length;i++){
                console.log(d[i]);
                $("#photo_msg").append("  <div  class=\"item picBlock\" style=\"margin: 35px; display: inline ;float: left\">\n" +
                    "                        <div class=\"boxgrid caption\">\n" +
                    "                            <div class=\"picImage\">\n" +
                    "                                <img src=\"/images/"+d[i]["pdata"]+"\" class=\"pic\"/>\n" +
                    "                            </div>\n" +
                    "                            <p class=\"picP\">"+d[i]["msg"]+"</p>\n" +
                    "                        </div>\n" +
                    "                    </div>")
            }
        }}
    )


