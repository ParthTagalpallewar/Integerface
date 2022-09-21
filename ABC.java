public class ABC {
    
    MyInterface myInterface;

    public ABC(MyInterface  myInterface){
        this.myInterface = myInterface;
    }



    public void acb(){
        for(int i=0; i<10; i++){
            myInterface.onClickListener(i);
        }
    }

}
