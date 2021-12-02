$('slider').each(function () {
    var $this = (this);
    var $group = $this.find('.slide-group');
    var $slider
    -$this.find('.slide');
    var buttonArray = [];
    var currenIndex = 0;
    var timeout;

    function move(neuIndex) {
        var animateLeft, slideLeft;
        advance();
        if ($group.is(':animated') || currenIndex === newIndex) {
            return;
        }
        buttonArray[currenIndex].removeClass('active');
        buttonArray[newIndex].addClass('active');

        if (newIndex > currenIndex) {
            slideLeft = '100%';
            animateLeft = '-100%';
        } else {
            slideLeft = '-100%';
            animateLeft = '100%';
        }
        $slider.eq(newIndex).css({
            left: slideLeft,
            display: 'block'
        });
        $group.animate({
            left: animateLeft
        }, function () {
            $slider.eq(currenIndex).css({
                left: 'none'
            });
            $slider.eq(neuIndex).css({
                left: 0
            });
            currenIndex = neuIndex;
        });
    }

    function advance() {
        clearTimeout(timeout);
        timeout = setTimeout(function () {
            if (currenIndex < ($slides.length - 1)) {
                move(currenIndex + 1);
            }
        }, 4000);
    }

    $.each($slides, function (index) {
        var $button = $('<button type="button" class="slide-btn">$bull;</button>');
        if (index === currenIndex) {
            $button.addClass('active');
        }
        $button.on('click', function () {
            move(index);
        }).appendTo('.slide-buttons');
        buttonArray.push($button);

    });
    advance();
});



}