(function($){
    $.fn.accordeon = function(){
        return $(this)
                    .children()
                    .children()
					.filter(".header")
					.click(function() {
						$(this)
						.children()
						.slideToggle();
						$(this)
						.parent()
						.parent()
						.children()
						.children()
						.not(this)
						.children()
						.slideUp();
					})
    };
})(jQuery);	