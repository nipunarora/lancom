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

    public String getValue()
    {
	  String val;
	  	if(this.type == "int_type_t")
		{
			IntType temp = (IntType)this.value;
			Integer n = temp.getValue();
			val = n.toString();
		}
		else
		{ 
			val = this.type;
		}
		return val;
    }
}