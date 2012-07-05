var footer = Handlebars.compile(pa.footer);
$('.footer').replaceWith(footer());

$('.settings-button').click(function() {
    localStorage.setItem($('.settings input').attr('name'), $('.settings input').attr('value'));
    $.each($('.settings input'), function(num, item) {
        var name = $('.settings input')[num].name;
        localStorage.setItem(name, $('.settings input')[num].value);
    });
    return false;
});

$('#date-of-birth').scroller({
    preset: 'date',
    theme: 'ios',
    display: 'modal',
    mode: 'scroller'
});
$('#date-of-injury').scroller({
    preset: 'date',
    theme: 'ios',
    display: 'modal',
    mode: 'scroller'
});

$(document).ready(function() {
    $('#add-patient-form .submit').click(function() {

        $.ajax({
            type: 'POST',
            url: '/addPatient',
            data: $('#add-patient-form').serialize(),
            success: function(data){
                alert(data);
                var thankyou = Handlebars.compile(pa.patientSuccess);
                $('#two .ui-content').replaceWith(thankyou);
            }
        });

        return false;
    })

})


$(document).ready(function() {
    $.each($('.settings input'), function(num, item) {
        var name = $('.settings input')[num].name;
        $('.settings input')[num].value = localStorage.getItem(name);
    });
});
