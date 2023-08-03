package forEach;

public class program   {
    public static void main(String[] args) {
        String []vect = new String[]{"maria","bab","jose"};

        for (int i=0;i<vect.length;i++){
            System.out.println(vect[i]);
        }
        System.out.println("______________________");
        for (String obj : vect){
            System.out.println(obj);
        }
    }
}
