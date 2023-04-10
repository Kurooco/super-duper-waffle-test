class Tree
{
    public Node head;
    public Integer val;

    public Tree()
    {}
    
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

                leftNode.add(value);
                return this;
            }
            else
            {
                if(rightNode == null)
                {
                    rightNode = new Node(value);
                    return this;
                }

                rightNode.add(value);
                return this;
            }
        }

        public void preOrder()
        {
            System.out.println(this.val);
            if(leftNode != null)
                leftNode.preOrder();
            if(rightNode != null)
                rightNode.preOrder();
        }
    }

    public void add(Integer value)
    {
        if(head == null)
        {
            head = new Node(value);
            return;
        }
        this.head = head.add(value);
    }

    public void preOrder()
    {
        head.preOrder();
    }

    public static void main(String args[])
    {
        Tree tree = new Tree();
        tree.add(10);
        tree.add(6);
        tree.add(11);
        tree.add(4);
        tree.add(7);
        tree.add(20);
        tree.add(5);
        tree.add(15);
        tree.add(14);
        tree.add(16);
        tree.preOrder();
        //System.out.println(tree.head.leftNode.leftNode.rightNode.val);
    }
    
}
