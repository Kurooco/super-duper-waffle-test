class Tree
{
    public Node head;
    public Integer val;
    
    class Node
    {
        public Node leftNode;
        public Node rightNode;
        public Integer val;

        Node(Integer val)
        {
            this.val = val;
        }

        public Node add(Integer value)
        {
            if(value < this.val)
            {
                if(leftNode == null)
                {
                    leftNode = new Node(value);
                    return this;
                }

                return leftNode.add(value);
            }
            else
            {
                if(rightNode == null)
                {
                    rightNode = new Node(value);
                    return this;
                }

                return rightNode.add(value);
            }
        }
    }

    TreeNode()
    {}

    public Node add(Integer value)
    {
        if(head == null)
            head = new Node(value);
        this.head = head.add(value);
    }

    

    public static void main(String args[])
    {
        Tree tree = new Tree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        System.out.println(tree.head.left.val);
    }
    
}
