$(document).ready(function() {
    $.ajax({
        url: 'tbd',
        datatype: 'json',
        type: 'get',
        async: true,
        success: function (data) {
            console.log("success\n" + data);
            data.forEach(element => {
                console.log(element); // hurray
            })
        },
        error: function () {
            console.log("Server is still starting.");
        }
    });
});