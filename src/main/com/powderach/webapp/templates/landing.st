<script>
    jQuery(function() {
        jQuery( "input[type=submit]" )
            .button()
            .click(function( event ) {
                event.preventDefault();
        });
    });
</script>
<input type="submit" value="Plan me a retrospective!" onclick="location.href=location.href+'results'" />