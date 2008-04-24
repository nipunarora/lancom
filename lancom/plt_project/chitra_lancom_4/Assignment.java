public class Assignment {
    public Symbol s;
    public String op;
    
    public Assignment(Symbol s, String op) 
    {
        this.s = s;
        this.op = op;
    }

    public String getName()
    {
	  return this.s.name;
    }

    public String getType()
    {
	  return this.s.type;
    }

    public Symbol getSymbol()
    {
	  return this.s;
    }

    public void assignValue(int value)
    {
	 if(op == "=")
	  {
		if(s.type == "int_type_t")
		{
			IntType temp = new IntType(value);
			System.out.println(temp.getValue());
			s.setValue(temp);
		}
	  }
	  if(op == "+=")
	  {
		if(s.type == "int_type_t")
		{
			int n;
			IntType temp;
			temp = (IntType)s.lookupValue();
			n = temp.getValue();
			n += value;
			temp.setValue(n);
			s.setValue(temp);		
		}
	  }
	  if(op == "-=")
	  {
		if(s.type == "int_type_t" && s.type == "int_type_t")
		{
			int n;
			IntType temp;
			temp = (IntType)s.lookupValue();
			n = temp.getValue();
			n -= value;
			temp.setValue(n);
			s.setValue(temp);		
		}
	  }
	  if(op == "*=")
	  {
		if(s.type == "int_type_t" && s.type == "int_type_t")
		{
			int n;
			IntType temp;
			temp = (IntType)s.lookupValue();
			n = temp.getValue();
			n *= value;
			temp.setValue(n);
			s.setValue(temp);			
		}
	  }
	  if(op == "/=")
	  {
		if(s.type == "int_type_t" && s.type == "int_type_t")
		{
			int n;
			IntType temp;
			temp = (IntType)s.lookupValue();
			n = temp.getValue();
			n /= value;
			temp.setValue(n);
			s.setValue(temp);				
		}
	  }
    }

    public void assignValue(Symbol value)
    {
	  if(op == "=")
	  {
		if(s.type == "int_type_t" && s.type == "int_type_t")
		{
			IntType temp;
			temp = (IntType)value.lookupValue();
			s.setValue(temp);
		}
	  }
	  if(op == "+=")
	  {
		if(s.type == "int_type_t" && s.type == "int_type_t")
		{
			int n;
			IntType temp;
			temp = (IntType)s.lookupValue();
			n = temp.getValue();
			temp = (IntType)value.lookupValue();
			n += temp.getValue();
			temp.setValue(n);
			s.setValue(temp);		
		}
	  }
	  if(op == "-=")
	  {
		if(s.type == "int_type_t" && s.type == "int_type_t")
		{
			int n;
			IntType temp;
			temp = (IntType)s.lookupValue();
			n = temp.getValue();
			temp = (IntType)value.lookupValue();
			n -= temp.getValue();
			temp.setValue(n);
			s.setValue(temp);					
		}
	  }
	  if(op == "*=")
	  {
		if(s.type == "int_type_t" && s.type == "int_type_t")
		{
			int n;
			IntType temp;
			temp = (IntType)s.lookupValue();
			n = temp.getValue();
			temp = (IntType)value.lookupValue();
			n *= temp.getValue();
			temp.setValue(n);
			s.setValue(temp);		
			
		}
	  }
	  if(op == "/=")
	  {
		if(s.type == "int_type_t" && s.type == "int_type_t")
		{
			int n;
			IntType temp;
			temp = (IntType)s.lookupValue();
			n = temp.getValue();
			temp = (IntType)value.lookupValue();
			n /= temp.getValue();
			temp.setValue(n);
			s.setValue(temp);		
			
		}
	  }
    }

    public String getValue()
    {
	  String val;
	  	if(	s.type == "int_type_t" ||
			s.type == "char_type_t" ||
			s.type == "string_type_t")
		{
			val = (String)s.value;
		}
		else
		{ 
			val = "junk";
		}
		return val;
    }
}