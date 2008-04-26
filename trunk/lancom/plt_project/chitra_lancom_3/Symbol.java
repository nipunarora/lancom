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
		if(this.type.equals("role_type_t"))
		{
			Role temp = (Role)this.value;
			return (new String(temp.getString()));
			
			//val = n.toString();
		}
		if(this.type.equals("policy_type_t"))
		{
			Policy temp = (Policy)this.value;
			return (new String(temp.getString()));
			
			//val = n.toString();
		}
		
		if(this.type.equals("host_group_type_t"))
		{
			Hostgroup temp = (Hostgroup)this.value;
			return (new String(temp.getString()));
			
			//val = n.toString();
		}
	
		if(this.type.equals("route_type_t"))
		{
			Route temp = (Route)this.value;
			return (new String(temp.getString()));
			
			//val = n.toString();
		}

		if(this.type.equals("interface_type_t"))
		{
			if(this.value == null)
			{
				System.out.println("this value is null");
				
			}
			
			Interface temp = (Interface)this.value;
			if(temp.getString() == null)
			{
				System.out.println("interf string is null");
				
			}		
		
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
