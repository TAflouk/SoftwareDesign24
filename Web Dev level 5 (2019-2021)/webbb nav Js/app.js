const navSlide = () => {
    const burger = document.querySelector('.burger');
    const nav = document.querySelector('.nav-links');
    const navLinks = document.querySelectorAll('.nav-links li');


    // toggle map
    burger.addEventListener('click',()=>{
        nav.classList.toggle('nav-active');

        //Animate links 
        navLinks.forEach((link,index) =>{
            if(link.style.animation){
                link.style.animation = ''
                //console.log(index); 
            
            } else {
                link.style.animation = 'navLinkFade 0.5s ease forwards ${index /7 + 0.3}s';
            }
        })
        //burger animation 
        burger.classList.toggle('toggle');
    });

}

navSlide();