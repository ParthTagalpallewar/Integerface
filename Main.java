public class Main implements MyInterface{

    public static void main(String[] args) {
        Main a = new Main();
        ABC abc = new ABC(a);
        abc.acb();
    }

    @Override
    public void onClickListener(int a) {
        
        System.out.println(a);
        
    }

}