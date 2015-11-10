 public class RedBlackNode {
        // Constructors
        RedBlackNode( Word theElement ) {
            this( theElement, null, null );
        }
         
        RedBlackNode( Word theElement, RedBlackNode lt, RedBlackNode rt ) {
            element  = theElement;
            left     = lt;
            right    = rt;
            color    = 1;
        }
         
        Word   element;    // The data in the node
        RedBlackNode left;       // Left child
        RedBlackNode right;      // Right child
        int          color;      // Color
    }
