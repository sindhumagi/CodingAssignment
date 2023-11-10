(function(){

    let screen = document.querySelector('.screen');
    let buttons = document.querySelectorAll('.btn');
    let clear = document.querySelector('.btn-clear');
    let equals = document.querySelector('.btn-equal');


    buttons.forEach(function(button){
        button.addEventListener('click',function(e){
            let value = e.target.dataset.num;
            screen.value += value;
            //screen.value = eval(screen.value);
            //console.log(value);
        })
    });

    equals.addEventListener('click', function(e){
        //screen.value += value;
        if(screen.value === '') {
          
            screen.value = "please enter";
            
        }else {
            let answer = eval(screen.value);
            screen.value = answer;
           
        }
        
    })
    clear.addEventListener('click',function(e){
       
        screen.value = "";
    //      if(screen === '='){
           
    //         let answer = eval(screen);
    //         screen  = answer;
    //      }
    })
})();
