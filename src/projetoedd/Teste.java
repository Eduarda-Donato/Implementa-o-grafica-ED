 package projetoedd;

// import Estruturas.Arvore.SearchBinaryTree;
// import Estruturas.Pilha.Stack;
// import Estruturas.Queue.Queue;

public class Teste {
   public static void main(String[] args) throws EmptyStructureException {
    //    Stack<String> stack = new Stack<String>();
    //    stack.push("Opa");
    //    stack.push("Segundo");
    //    stack.push("Terceiro");
    //    stack.push("Nada");

    //    stack.pop();
    //    stack.pop();

    //    System.out.println(stack.printStack());

    //    Queue<Integer> queue = new Queue<Integer>();
    //    queue.add(10);
    //    queue.add(20);
    //    queue.add(30);
    //    queue.add(50);
    //    queue.remove();
    //    queue.remove();

    //    System.out.println(queue.printQueue());

    //    SearchBinaryTree tree = new SearchBinaryTree();
    //    tree.insert(10);
    //    tree.insert(8);
    //    tree.insert(20);
    //    tree.insert(5);
    //    tree.insert(9);
    //    tree.insert(6);
    //    tree.insert(13);
    //    tree.insert(25);

    //    System.out.println(tree.showAscendingOrder());     
    
    Pilha pilha = new Pilha();
    pilha.push(5);
    pilha.push(8);
    pilha.push(10);

    pilha.pop();
    int[] array = pilha.array();
    for(int i = 0; i < array.length; i++){
      System.out.println(array[i]);
    }
   }
}
