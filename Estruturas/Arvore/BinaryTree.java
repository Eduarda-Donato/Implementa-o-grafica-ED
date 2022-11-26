package Estruturas.Arvore;

public class BinaryTree<T>{
    private TreeNode<T> root;

    public BinaryTree(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    private TreeNode<T> searchNode(TreeNode<T> node, T value){
        if(node == null){
            return null;
        }

        if(node.getValue().equals(value)){
            return node;
        }

        TreeNode<T> aux = searchNode(node.getLeft(), value);
        if(aux == null){
            aux = searchNode(node.getRight(), value);
        }

        return aux;
    }

    public TreeNode<T> searchNode(T value){
        if(isEmpty()){
            return null;
        }

        return searchNode(root, value);
    }

    public boolean setRoot(T value){
        if(!isEmpty()){
            return false;
        }

        TreeNode<T> newNode = new TreeNode<T>();
        newNode.setValue(value);

        root = newNode;

        return true;
    }

    public boolean insertLeft(T insertValue, T nodeOfInsertion){

        TreeNode<T> sonNode = searchNode(insertValue);
        if(sonNode != null){
            return false;
        }

        TreeNode<T> fatherNode = searchNode(nodeOfInsertion);
        if(fatherNode == null){
            return false;
        }

        if(fatherNode.getLeft() != null){
            return false;
        }

        TreeNode<T> newNode = new TreeNode<T>();
        newNode.setValue(insertValue);
        
        fatherNode.setLeft(newNode);

        return true;
    }

    public boolean insertRight(T insertValue, T nodeOfInsertion){

        TreeNode<T> sonNode = searchNode(insertValue);
        if(sonNode != null){
            return false;
        }

        TreeNode<T> fatherNode = searchNode(nodeOfInsertion);
        if(fatherNode == null){
            return false;
        }

        if(fatherNode.getRight() != null){
            return false;
        }

        TreeNode<T> newNode = new TreeNode<T>();
        newNode.setValue(insertValue);
        
        fatherNode.setRight(newNode);

        return true;
    }

    public String showPreOrder(){
        if(isEmpty()){
            return "Tree is empty";
        }

        String ret = showPreOrder(root, "");
        String auxiliar = "";
        for(int i = 0; i < ret.length(); i++){
            auxiliar += ret.charAt(i);
            auxiliar += " ";
        }

        return auxiliar;
    }

    private String showPreOrder(TreeNode<T> node, String ret){

        if(node == null){
            return "";
        }

        return node.getValue() + showPreOrder(node.getLeft(), ret) + showPreOrder(node.getRight(), ret);
    }


    public String showInOrder(){
        if(isEmpty()){
            return "Tree is empty";
        }

        String ret = showInOrder(root, "");
        String auxiliar = "";
        for(int i = 0; i < ret.length(); i++){
            auxiliar += ret.charAt(i);
            auxiliar += " ";
        }

        return auxiliar;
    }

    private String showInOrder(TreeNode<T> node, String ret){

        if(node == null){
            return "";
        }

        return showInOrder(node.getLeft(), ret) + node.getValue() + showInOrder(node.getRight(), ret);
    }

    public String showPostOrder(){
        if(isEmpty()){
            return "Tree is empty";
        }

        String ret = showPostOrder(root, "");
        String auxiliar = "";
        for(int i = 0; i < ret.length(); i++){
            auxiliar += ret.charAt(i);
            auxiliar += " ";
        }

        return auxiliar;
    }

    private String showPostOrder(TreeNode<T> node, String ret){

        if(node == null){
            return "";
        }

        return showPostOrder(node.getLeft(), ret) + showPostOrder(node.getRight(), ret) + node.getValue();
    }

    public TreeNode<T> getRoot() {
        return this.root;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

}
