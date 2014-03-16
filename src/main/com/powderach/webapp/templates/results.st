<script>
            jQuery(function() {
            jQuery( "#accordion" ).accordion({
                collapsible: true
            });
          });
</script>
<div id="accordion">
    $activities:{ activity |
    <h3>$activity.type.title$</h3>

    <div>
        <h4>$activity.title$</h4>

        <p>$activity.description$</p>
    </div>
    }$
</div>