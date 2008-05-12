class IfElse {
    IfElse parent = null;
    boolean ignore = false;
 

    public IfElse(IfElse parent) 
    {
        this.parent = parent;
	  this.ignore = false;
    }

    public IfElse(IfElse parent, boolean b) 
    {
        this.parent = parent;
	  this.ignore = b;
    }   

    /* getEnclosingIfElse() */
    public IfElse getParent() 
    { 
        return parent; 
    } 

    boolean getIgnore()
    {
	  return ignore;
    }

    void setIgnore(boolean b)
    {
	  ignore = b;
    }
}