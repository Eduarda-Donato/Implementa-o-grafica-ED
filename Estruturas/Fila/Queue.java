import Estruturas.EmptyStructureException;
import Estruturas.SimpleNode;

public class Queue<Type> {
    private SimpleNode<Type> head;
    private SimpleNode<Type> tail;
    private int size;

    public Queue(){
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }

        return false;
    }

    public Type first(){
        return head.getValue();
    }

    public boolean add(Type value){
        SimpleNode<Type> newNode = new SimpleNode<Type>();

        newNode.setValue(value);
        newNode.setNext(null);

        if(size == 0){
            head = newNode;
        }
        else{
            tail.setNext(newNode);
        }

        tail = newNode;
        size++;

        return true;
    }

    public Type remove() throws EmptyStructureException{

        if(isEmpty()){
            throw new EmptyStructureException();
        }

        SimpleNode<Type> aux = head;

        head = head.getNext();
        size--;

        if(size == 1){
            tail = head;
        }

        aux.setNext(null);

        return aux.getValue();
    }

    public String printQueue(){

        String ret = "[ ";
        SimpleNode<Type> aux = head;

        while(aux != null){
            ret+= aux.getValue() + " ";
            aux = aux.getNext();
        }

        ret += "]";

        return ret;
    }

    public SimpleNode<Type> getHead() {
        return this.head;
    }

    public void setHead(SimpleNode<Type> head) {
        this.head = head;
    }

    public SimpleNode<Type> getTail() {
        return this.tail;
    }

    public void setTail(SimpleNode<Type> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
