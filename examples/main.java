class Node {
  int data;
  Node next;

  public Node(int valor) {
    this.data = valor;
    this.next = null;
  }
}

class Lista {
  Node root;

  public Lista insert(Lista lista, int valor) {
    Node novo = new Node(valor);
    if (lista.root == null) {
      lista.root = novo;
    } else {
      Node last = lista.root;

      while (last.next != null) {
        last = last.next;
      }
      last.next = novo;
    }

    return lista;
  }

  public void print_list(Lista lista) {
    Node cur = lista.root;
    while (cur.next != null) {
      System.out.print(cur.data + " ");
      cur = cur.next;
    }
    System.out.println(cur.data);
  }
}

class Pilha {
  Lista l;

  public void push(Lista l, int value) {
    // igual ao adicionar da Lista
  }

  public void pop(Lista l) {
    Node cur = l.root;
    while (cur.next.next != null) {
      cur = cur.next;
    }

    cur.next = null;
  }
}

class Fila {
  Lista l;

  public void deq() {}
  public void enq(Lista l, int valor) {
    Node novo = new Node(valor);
    novo.next = l.root;
    l.root = novo;
  }
}

public class main {
  public static void main(String[] args) {
    Lista l = new Lista();
    l = l.insert(l, 1);
    l = l.insert(l, 2);
    l = l.insert(l, 3);

    l.print_list(l);
  }
}
