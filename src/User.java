public class User {
    private String _name;
    private String _membership;


    //Created the constructor automatically in the main function, no return type.
    //For constructors you don't need a return type.
    public User(String name, String membership) {
        //When using the constructor ensure to use your setters
        //This is an example of encapsulation.
        set_name(name);
        set_membership(membership);
    }
    void set_name(String name){
        _name = name;
    }
    String get_name() {
        return _name;
    }
    void set_membership(String membership){
        _membership = membership;
    }
    void set_membership(Membership membership){
        _membership = membership.name();
    }

    //The enum is used to help select different variations of the membership.
    public enum Membership {
        Bronze,Silver,Gold;
    }
    String get_membership(){
        return _membership;
    }



}
