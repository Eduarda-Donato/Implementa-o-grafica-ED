 package projetoedd;

// import Estruturas.EmptyStructureException;
// import Estruturas.SimpleNode;

public class Stack<T> {

    private SimpleNode<T> top;
    private int size;

    public Stack(){
        top = null;
        size = 0;
    }

    public boolean isEmpty(){
        if (size == 0){
            return true;
        }

        return false;
    }

    public T getTop(){
        return this.top.getValue();
    }

    public int getSize() {
        return this.size;
    }

    public boolean push(T value){
        SimpleNode<T> aux = new SimpleNode<T>();

        aux.setValue(value);
        aux.setNext(top);

        top = aux;

        // System.out.println("Aux = " + aux.getValue());
        // System.out.println("Aux.getNext = " + aux.getNext().getValue());

        sizePlus(1);

        return true;
    }

    public boolean pop() throws EmptyStructureException{

        if(isEmpty()){
            throw new EmptyStructureException();
        }
        
        SimpleNode<T> aux = top;

        top = aux.getNext();
        aux.setNext(null);

        sizePlus(-1);

        return true;
    }

    public SimpleNode<T> getterTop() {
        return this.top;
    }

    public void setTop(SimpleNode<T> top) {
        this.top = top;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void sizePlus(int update){
        this.size += update;
    }

    public String printStack(){
        String ret = "[ ";
        SimpleNode<T> aux = top;

        while(aux != null){
            ret += aux.getValue() + " ";
            aux = aux.getNext();
        }

        ret += "]";

        return ret;
    }

}
