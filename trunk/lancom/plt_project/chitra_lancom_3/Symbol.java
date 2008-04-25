public class Symbol {
    public String name;
    public String type;
    Object value;
    
    public Symbol(String name) 
    {
        this.name = name;
    }

    public Symbol(String name, String type) 
    {
        this.name = name;
        this.type = type;
    }

    public Symbol(String name, String type, Object val)
    {
        this.name = name;
        this.type = type;
        this.value = val;
    } 

    public void setValue(Object val)
    {
        this.value = val;
    } 

    public String getName()
    {
	  return this.name;
    }

    public String getType()
    {
	  return this.type;
    }

    public Object lookupValue()
    {
	  return this.value;
    }


    public String getString()
    {
	  String val ;
	  	if(this.type.equals("int_type_t"))
		{
			IntType temp = (IntType)this.value;
			Integer n = temp.getValue();

			return (new String(n.toString()));
				
		}

		if(this.type.equals("policy_type_t"))
		{
			Policy temp = (Policy)this.value;
			return (new String(temp.getString()));
			
			//val = n.toString();
		}
		if(this.type.equals("interface_type_t"))
		{
			Interface temp = (Interface)this.value;
			return (new String(temp.getString()));
			
			//val = n.toString();
		}

		else
		{ 
			val = this.type;
		}
		return val; 
    }
}
