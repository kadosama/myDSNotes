
// Searching a key on a B-tree in Java 
package btreeexample;

public class BTree {

  private final int T;

  // Node creation
  public class Node {
    int n;
    int key[]       = new int[2 * T - 1];
    Node child[]    = new Node[2 * T];
    boolean leaf    = true;

    public int Find(int k) {
      for (int i = 0; i < this.n; i++) {
        if (this.key[i] == k) {
          return i;
        }
      }
      return -1;
    };
  }

  public BTree(int t) {
    T = t;
    root = new Node();
    root.n = 0;
    root.leaf = true;
  }
  
  //for BTree Root
  private Node root;



  // Splitting the node
  private void Split(Node x, int pos, Node y) {
    Node z = new Node();
    z.leaf = y.leaf;
    z.n = T - 1;
    for (int j = 0; j < T - 1; j++) {
      z.key[j] = y.key[j + T];
    }
    //If y-node or z-node has childs
    if (!y.leaf) {
      for (int j = 0; j < T; j++) {
        z.child[j] = y.child[j + T];
      }
    }
    y.n = T - 1;
    for (int j = x.n; j >= pos + 1; j--) {
      x.child[j + 1] = x.child[j];
    }
    x.child[pos + 1] = z;

    for (int j = x.n - 1; j >= pos; j--) {
      x.key[j + 1] = x.key[j];
    }
    //move median to parent
    x.key[pos] = y.key[T - 1];
    x.n = x.n + 1;
  }

  // Inserting a value
  public void Insert(final int key) {
      
    Node r = root;
    if (r.n == 2 * T - 1) {
      Node s = new Node();
      root = s;
      s.leaf = false;
      s.n = 0;
      s.child[0] = r;
      Split(s, 0, r);
      insertValue(s, key);
    } else {
      insertValue(r, key);
    }
  }

  // Insert the node
  private void insertValue(Node x, int k) {
    
    //if node is leaf...  
    if (x.leaf) {
      int i;
      //sliding keys for inserted nodes...
      for (i = x.n - 1; i >= 0 && k < x.key[i]; i--) {
        x.key[i + 1] = x.key[i];
      }
      x.key[i + 1] = k;
      x.n = x.n + 1;
    } else {
      int i;
      //which child key to insert
      for (i = x.n - 1; i >= 0 && k < x.key[i]; i--) {
          
      }
      i++;
      Node tmp = x.child[i];
      //is child on limit ?
      if (tmp.n == 2 * T - 1) {
        Split(x, i, tmp);
        //which child key to insert
        if (k > x.key[i]) {
          i++;
        }
      }
      insertValue(x.child[i], k);
    }

  }

  public void Show() {
    Show(root);
  }

  // Display
  private void Show(Node x) {
      
    if(x == null)
        return;
    
    for (int i = 0; i < x.n; i++) {
       System.out.print(x.key[i] + " ");
    }
    if (!x.leaf) {
      for (int i = 0; i < x.n + 1; i++) {
        Show(x.child[i]);
      }
    }
  }




}