function revealSpecializations(){
    console.log("started")
    const sections = document.querySelectorAll('.specialization-stripe');
    const observer = new IntersectionObserver(entries => {
        entries.forEach(entry => {
          if (entry.isIntersecting) {
            entry.target.style.opacity = 1;
          }
        });
      }, {
        threshold: 1
      });
    
      sections.forEach(section => {
        observer.observe(section);
      });
}
