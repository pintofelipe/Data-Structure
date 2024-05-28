package com.coco.binarioarbol;

import java.util.List;

public class BinaryTree {
    TreeNode root;
    StringBuilder traversalResult;  // Campo para almacenar el resultado del recorrido

    BinaryTree() {
        root = null;
        traversalResult = new StringBuilder();  // Inicializar el StringBuilder
    }

    // Insertar nodo al árbol binario
    void insert(String name) {
        root = insertRec(root, name);
    }

    // Recursividad
    TreeNode insertRec(TreeNode root, String value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value.compareTo(root.name) <= 0) {  // Permitir duplicados a la izquierda
            root.left = insertRec(root.left, value);
        } else {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    // Método para realizar un recorrido en orden (inorder traversal) del árbol
    void inorder() {
        traversalResult.setLength(0);  // Limpiar el resultado previo
        inorderRec(root);
    }

    // Función recursiva para el recorrido en orden del árbol binario
    void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            traversalResult.append(root.name).append(" ");
            inorderRec(root.right);
        }
    }

    // Método para realizar un recorrido en postorden (postorder traversal) del árbol
    void postorder() {
        traversalResult.setLength(0);  // Limpiar el resultado previo
        postorderRec(root);
    }

    // Función recursiva para el recorrido en postorden del árbol binario
    void postorderRec(TreeNode root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            traversalResult.append(root.name).append(" ");
        }
    }

    // Obtener el resultado del recorrido
    String getTraversalResult() {
        return traversalResult.toString();
    }

    // Método para realizar un recorrido en orden inverso para obtener el arreglo ordenado de mayor a menor
    void reverseInorder(List<String> result) {
        reverseInorderRec(root, result);
    }

    // Función recursiva para el recorrido en orden inverso del árbol binario
    void reverseInorderRec(TreeNode root, List<String> result) {
        if (root != null) {
            reverseInorderRec(root.right, result);
            result.add(root.name);
            reverseInorderRec(root.left, result);
        }
    }
}

class TreeNode {
    String name;
    TreeNode left, right;

    TreeNode(String name) {
        this.name = name;
        left = right = null;
    }
}
