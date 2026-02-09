			public static void tree11a (BinNode<Integer> t) 
	{
        if (t == null) 
            return;
        
        if (t.getValue() % 2 == 0) 
        {
            boolean hasEvenChild = false;

            if (t.hasLeft() && t.getLeft().getValue() % 2 == 1) 
                hasEvenChild = true;

            if (t.hasRight() && t.getRight().getValue() % 2 == 1) 
                hasEvenChild = true;

            if (!hasEvenChild) 
                System.out.println(t.getValue());
        }
        tree11a(t.getLeft());
        tree11a(t.getRight());
	}
	
	
	
	
	
	
	public static int tree11b (BinNode<Integer> t) 
	{
        if (t == null) 
            return 0;
        
        int count=0;
        
        if (t.getValue() % 2 == 0) 
        {
            boolean hasEvenChild = false;

            if (t.hasLeft() && t.getLeft().getValue() % 2 == 1) 
                hasEvenChild = true;

            if (t.hasRight() && t.getRight().getValue() % 2 == 1) 
                hasEvenChild = true;

            if (!hasEvenChild) 
                count=1;
        }
        return count + tree11b(t.getLeft()) + tree11b(t.getRight());
	}
	
	
	
	
    public static boolean tree11c(BinNode<Integer> t)
    {
        if (t == null)
            return false;
    
        boolean bool = false;
    
        if (t.getValue() % 2 == 0)
        {
            boolean hasOddChild = false;
    
            if (t.hasLeft() && t.getLeft().getValue() % 2 == 1)
                hasOddChild = true;
    
            if (t.hasRight() && t.getRight().getValue() % 2 == 1)
                hasOddChild = true;
    
            if (!hasOddChild)
                bool = true;
        }
        return bool || tree11c(t.getLeft()) || tree11c(t.getRight());
    }
    
    
   
    
    public static boolean tree11d(BinNode<Integer> t)
    {
        if (t == null)
            return false;   
    
        boolean bool = true;
    
        if (t.getValue() % 2 == 0)
        {
            if (t.hasLeft() && t.getLeft().getValue() % 2 == 1)
                bool = false;
    
            if (t.hasRight() && t.getRight().getValue() % 2 == 1)
                bool = false;
        }
        return bool && tree11d(t.getLeft()) && tree11d(t.getRight());
    }

	public class Main {

    public static int ex12(BinNode<Integer> t) {
        if (t == null)
            return 0;

        if (t.getValue() >= 10 && t.getValue() < 100)
            return 1 + ex12(t.getLeft()) + ex12(t.getRight());

        return ex12(t.getLeft()) + ex12(t.getRight());
    }

    public static int ex14(BinNode<Integer> t) {
        if (t == null)
            return 0;

        if (!t.hasLeft() && !t.hasRight())
            return 1;

        return ex14(t.getLeft()) + ex14(t.getRight());
    }

    public static int ex16(BinNode<Integer> t) {
        if (t == null)
            return 0;

        if (t.hasLeft() && t.hasRight())
            return t.getValue() + ex16(t.getLeft()) + ex16(t.getRight());

        return ex16(t.getLeft()) + ex16(t.getRight());
    }

    public static int ex17(BinNode<Integer> t) {
        if (t == null)
            return 0;

        if (t.hasLeft() && t.hasRight() &&
            t.getLeft().hasLeft() && t.getLeft().hasRight() &&
            t.getRight().hasLeft() && t.getRight().hasRight())
            return 1 + ex17(t.getLeft()) + ex17(t.getRight());

        return ex17(t.getLeft()) + ex17(t.getRight());
    }
	    public static boolean allevenleaves(BinNode<Integer> t){
        if (t == null) {
            return true;
        }

        if (!t.hasLeft() && !t.hasRight()) {
            return t.getValue() % 2 == 0;
        }

        return allevenleaves(t.getLeft()) && allevenleaves(t.getRight());
    }
	   public static boolean rightleftree(BinNode<Integer> t) {
        if (t == null) {
            return true;
        }

        if (t.hasRight() && t.getRight().hasLeft()) {
            return true;
        }

        return rightleftree(t.getLeft()) && rightleftree(t.getRight());
    }
	public static int a10b100(BinNode<Integer> t) {
    if (t == null)
        return 0;

    if (t.getValue() >= 10 && t.getValue() < 100)
        return 1 + a10b100(t.getLeft()) + a10b100(t.getRight());

    return a10b100(t.getLeft()) + a10b100(t.getRight());
}

public static int twosonsum(BinNode<Integer> t) {
    if (t == null)
        return 0;

    if (t.hasLeft() && t.hasRight())
        return 1 + twosonsum(t.getLeft()) + twosonsum(t.getRight());

    return twosonsum(t.getLeft()) + twosonsum(t.getRight());
}

public static int leaf(BinNode<Integer> t) {
    if (t == null)
        return 0;

    if (!t.hasLeft() && !t.hasRight())
        return 1;

    return leaf(t.getLeft()) + leaf(t.getRight());
}

public static int twosonnotleaf(BinNode<Integer> t) {
    if (t == null)
        return 0;

    if (t.hasLeft() && t.hasRight() &&
        (t.getLeft().hasLeft() || t.getLeft().hasRight()) &&
        (t.getRight().hasLeft() || t.getRight().hasRight()))
        return 1 + twosonnotleaf(t.getLeft()) + twosonnotleaf(t.getRight());

    return twosonnotleaf(t.getLeft()) + twosonnotleaf(t.getRight());
}

public static boolean contains(BinNode<Integer> t1, BinNode<Integer> t2) {
    if (t2 == null)
        return true;

    if (t1 == null)
        return false;

    if (t1.getValue().equals(t2.getValue()))
        return contains(t1, t2.getLeft()) && contains(t1, t2.getRight());

    return contains(t1.getLeft(), t2) || contains(t1.getRight(), t2);
}

public static boolean ex20(BinNode<Integer> t, int n) {
    if (n == 0)
        return true;

    if (t == null)
        return false;

    if (t.getValue() == n)
        return ex20(t, n - 1);

    return ex20(t.getLeft(), n) || ex20(t.getRight(), n);
}
    public static int maxNode(BinNode<Integer> t, int max) //ex23a
    {
        if (t == null) {
            return max;  
        }

        if (t.getValue() > max) {
            max = t.getValue();
        }

        max = maxNode(t.getLeft(), max);
        max = maxNode(t.getRight(), max);

        return max;  
    }
    public static int minNode(BinNode<Integer> t, int min) //ex23b
    {
        if (t == null) {
            return min;  
        }

        if (t.getValue() < min) {
            min = t.getValue();
        }

        min = maxNode(t.getLeft(), min);
        min = maxNode(t.getRight(), min);

        return min;  
    }
    public static int diffNode(BinNode<Integer>t,int diff) //ex23c 
    {
    	return(max(t)-min(t));
    	
    }
    public static int TreeHeight(BinNode<Integer> t)//ex27
    {
        if (t == null) {
            return 0;  
        }
        int leftHeight = TreeHeight(t.getLeft());
        int rightHeight = TreeHeight(t.getRight());

        return 1 + Math.max(leftHeight, rightHeight);
    }
    public static boolean perfTree(BinNode<Integer>t) {
    	
    	return leaf(t)==Math.pow(2, TreeHight(t));
    	
    }
    public static int leaf(BinNode<Integer> t) {
        if (t == null)
            return 0;

        if (!t.hasLeft() && !t.hasRight())
            return 1;

        return leaf(t.getLeft()) + leaf(t.getRight());
    }
    public static boolean equalsons(BinNode<Integer> t)//ex22
    {
        if (t == null) {
            return true;
        }

        if ((t.hasLeft() && !t.hasRight()) || (!t.hasLeft() && t.hasRight())) {
            return false;
        }

        return equalsons(t.getLeft()) && equalsons(t.getRight());
    }

	

