package corejava21_SingltonClass;
//If any class if you want to allow/create to only one object then such type of class is called singlton class.eg, Runtime,
//adv of singlton: if sevaral peaople have same requirments, it is not recomend to cerate seprate object each time. we can create calss in such way like whenever we need 
//that object we can simply call or use that.that is mainly singlton class use for memory utilization and improve performance.


class Singleton {
    // Static variable reference of single_instance
    // of type Singleton
    private static Singleton single_instance = null;
 
    // Declaring a variable of type String
    public String s;
 
    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }
 
    // Static method
    // Static method to create instance of Singleton class
    public static synchronized Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
 
        return single_instance;
    }
}
 
