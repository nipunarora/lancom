import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

class Scope {
    Scope parent = null;
   /* symbolMap in scope */
    Map<String, Symbol> symbolMap = new HashMap<String, Symbol>(); 

    public Scope(Scope parent) 
    {
        this.parent = parent;
    }

    /* getEnclosingScope() */
    public Scope pop() 
    { 
        return parent; 
    } 

    public void defineSymbol(String name, String type, Object value) 
    {
        Symbol s = new Symbol(name, type, value);
	  if(symbolMap.containsKey(name) == false)
        {
		symbolMap.put(name, s);		
        }
    }

    public void defineSymbol(String name, String type) 
    {
        Symbol s = new Symbol(name, type);
	  if(symbolMap.containsKey(name) == false)
        {
		symbolMap.put(name, s);		
        }
    }

    public String getType(String name)
    {
        Symbol s = symbolMap.get(name);
    
	  /* First look in the current scope */
        if ( s != null ) 
        {
            return s.type;  // found it
        }
	  
        /* if not, then check parent's scope */
        if ( parent != null ) 
        {
            return parent.getType(name);
        }
        return null; // couldn't find it

    }

    public Symbol getSymbol(String name) 
    {
        Symbol s = symbolMap.get(name);
    
	  /* First look in the current scope */
        if ( s != null ) 
        {
            return s;  // found it
        }
	  
        /* if not, then check parent's scope */
        if ( parent != null ) 
        {
            return parent.getSymbol(name);
        }
        return null; // couldn't find it
    }


    public Object lookup(String name) 
    {
        Symbol s = symbolMap.get(name);
    
	  /* First look in the current scope */
        if ( s != null ) 
        {
            return s.value;  // found it
        }
	  
        /* if not, then check parent's scope */
        if ( parent != null ) 
        {
            return parent.lookup(name);
        }
        return null; // couldn't find it
    }
    
    public int setSymbolValue(String name, Symbol sym) 
    {
        Symbol s = symbolMap.get(name);
        if( s == null)
	{
	 System.out.println("S== NULL for name :"+name+" sym.getName()"+sym.getName());
	 return -1;
	}	
	  /* First look in the current scope */
	System.out.println("s.type : "+s.type+"Sym.type : "+sym.type);
        if ( (s != null) && s.type.equals(sym.type)) 
        {
		symbolMap.remove(name);
		symbolMap.put(name, sym);
		return 0;
        }
	  
        /* if not, then check parent's scope */
        if ( parent != null ) 
        {
            parent.setSymbolValue(name, sym);
	    
        }
        return -1; // couldn't find it
    }

    public void printSymbols()
    {
        Set entries = symbolMap.entrySet();
	  Iterator iter = entries.iterator();
	  while(iter.hasNext())
	  {
		Map.Entry entry = (Map.Entry)iter.next();
		Symbol s = symbolMap.get(entry.getKey());
	  	System.out.println(s.getName() + " " + s.getType() + " " + 			s.getString());
	  }
    }
}
