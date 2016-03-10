package P03_ACloserLookAtArgumentPassing;

// Objects are passed through their references.

class Test2 {
    int a;
    int b;
    
    Test2(int i, int j) {
        a = i;
        b = j;
    }
    
    // Pass an object.
    void meth(Test2 o) {
        o.a *= 2;
        o.b /= 2;
    }
}

public class PassObjRef {
    public static void main(String args[]) {
        Test2 ob = new Test2(15, 20);
        
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        
        ob.meth(ob);
        
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
