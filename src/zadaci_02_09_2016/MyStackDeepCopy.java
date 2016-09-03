package zadaci_02_09_2016;

import java.util.ArrayList;

public class MyStackDeepCopy {

	public static void main(String[] args) {
		//kreiraj instancu klase MyStack
		  MyStack stack1 = new MyStack();
	        for (int i = 0; i < 20; i++) {
	            stack1.push(i);
	        }
	        //kreiraj stack2 kao clone prvog stacka
	        MyStack stack2 = (MyStack) stack1.clone();
	       //ubaci dva elementa da bi vidjeli da se drugi stack ne mijenja istovremeno
	        stack1.push(17);
	        stack1.push(12);

	        // prikazi njihove velicine kako bi vidjeli da su razliciti
	        System.out.println("Velicina prvog objekta instance MyStack klase = " + stack1.getSize());
	        System.out.println("Velicina drugog objekta instance MyStack klase = " + stack2.getSize());
	}

}

class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();
    //provjerava je li lista prazna
    public boolean isEmpty() {
        return list.isEmpty();
    }
//vraca velicinu liste
    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }
//izbacivanje elementa iz liste
    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }
//ubacivanje elementa u listu
    public void push(Object o) {
        list.add(o);
    }

    @Override 
    public String toString() {
        return "stack: " + list.toString();
    }
    //kreiranje novog objekta
    @Override
    protected Object clone()  {
        MyStack myStack = null;
        try {
            myStack = (MyStack) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        myStack.list = new ArrayList<>(list);
        return myStack;
    }
}
