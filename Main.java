abstract class Seasoning {}

class Salt extends Seasoning {
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Pepper extends Seasoning {
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Thyme extends Seasoning {
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

abstract class Point{}

class CartesianPt extends Point{
	int x;
	int y;
	CartesianPt(int _x, int _y){
		x = _x;
		y = _y;
	}
	public String toString(){
		return "new" + getClass().getName() + "(" + x + "," +y+")";
	}
}

class ManhattanPt extends Point{
	int x;
	int y;
	ManhattanPt(int _x, int _y){
		x = _x;
		y = _y;
	}
	public String toString(){
		return "new" + getClass().getName() + "(" + x + "," +y+")";
	}
}
 
abstract class Num {}

class Zero extends Num {
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}


class OneMoreThan extends Num {
    
    Num predecessor;
    
    OneMoreThan(Num _p) {
        predecessor = _p;
    }

    public String toString() {
        return "new " + getClass().getName() + "(" + predecessor + ")";
    }
}

abstract class Layer{}

class Base extends Layer{
	Object o;
	Base(Object _o){
		o = _o;
	}
	public String toString(){
		return "new" + getClass().getName() + "(" + o + ")";
	}
}

class Slice extends Layer{
	Layer l;
	Slice(Layer _l){
		l =_l;
	}
	public String toString(){
		return "new" + getClass().getName() + "(" + l + ")";
	}
}


/**
 * To run this Main class, compile from the terminal with javac Main.java
 * Once combiled, run on the JVM with java Main
 */
public class Main {

    public static void main(String[] args) {
        Seasoning seasoning1 = new Salt();
        Seasoning seasoning2 = new Pepper();
        System.out.println(seasoning2);
        System.out.println(seasoning1);

        Num a = new Zero();
        System.out.println(a);


        Num b = new OneMoreThan(a);
        System.out.println(b);
    }
}