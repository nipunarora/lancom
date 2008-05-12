public class Expression {
    public Symbol s;
    public String op;
    
    public Expression(Symbol s, String op) 
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

    public void assignValue(Symbol value1, Symbol value2, Symbol value3)
    {
	  if(op.equals("?:"))
	  {
		if(s.type.equals("int_type_t") && 
			value1.type.equals("int_type_t") &&
			value2.type.equals("int_type_t"))
		{
			int n1;
			n1 = ((IntType)value1.lookupValue()).getValue();
			if(n1 == 1)
				s.setValue(value2.lookupValue());
			else
				s.setValue(value3.lookupValue());
			return;	
		}
	  }
    }


    public void assignValue(Symbol value1, Symbol value2) throws Exception
    {
	  if(!value1.type.equals(value2.type))
	  {
		String error = "Type " + value1.type + "does not match type " + value2.type;
		throw new Exception(error);
	  }
	
	  if(op.equals("+"))
	  {
		if(s.type.equals("int_type_t") && 
			value1.type.equals("int_type_t") &&
			value2.type.equals("int_type_t"))
		{
			int n;
			IntType temp;
			temp = (IntType)value1.lookupValue();
			n = temp.getValue();
			temp = (IntType)value2.lookupValue();
			n += temp.getValue();
			temp.setValue(n);
			s.setValue(temp);	
			return;	
		}
		else
		{
			String error = "Operator " + op + " not define for type " + s.type;
			throw new Exception(error);
		}
	  }
	  if(op.equals("-"))
	  {
		if(s.type.equals("int_type_t") && 
			value1.type.equals("int_type_t") &&
			value2.type.equals("int_type_t"))
		{
			int n;
			IntType temp;
			temp = (IntType)value1.lookupValue();
			n = temp.getValue();
			temp = (IntType)value2.lookupValue();
			n -= temp.getValue();
			temp.setValue(n);
			s.setValue(temp);		
			return;	
		}
		else
		{
			String error = "Operator " + op + " not define for type " + s.type;
			throw new Exception(error);
		}
	  }
	  if(op.equals("*"))
	  {
		if(s.type.equals("int_type_t") && 
			value1.type.equals("int_type_t") &&
			value2.type.equals("int_type_t"))
		{
			int n;
			IntType temp;
			temp = (IntType)value1.lookupValue();
			n = temp.getValue();
			temp = (IntType)value2.lookupValue();
			n *= temp.getValue();
			temp.setValue(n);
			s.setValue(temp);
			return;		
		}
		else
		{
			String error = "Operator " + op + " not define for type " + s.type;
			throw new Exception(error);
		}
	  }
	  if(op.equals("/"))
	  {
		if(s.type.equals("int_type_t") && 
			value1.type.equals("int_type_t") &&
			value2.type.equals("int_type_t"))
		{
			int n;
			IntType temp;
			temp = (IntType)value1.lookupValue();
			n = temp.getValue();
			temp = (IntType)value2.lookupValue();
			n /= temp.getValue();
			temp.setValue(n);
			s.setValue(temp);	
			return;	
		}
		else
		{
			String error = "Operator " + op + " not define for type " + s.type;
			throw new Exception(error);
		}
	  }
	  if(op.equals("|"))
	  {
		if(s.type.equals("int_type_t") && 
			value1.type.equals("int_type_t") &&
			value2.type.equals("int_type_t"))
		{
			int n;
			IntType temp;
			temp = (IntType)value1.lookupValue();
			n = temp.getValue();
			temp = (IntType)value2.lookupValue();
			n |= temp.getValue();
			temp.setValue(n);
			s.setValue(temp);	
			return;	
		}
		else if(s.type.equals("char_type_t") && 
			value1.type.equals("char_type_t") &&
			value2.type.equals("char_type_t"))
		{
			char n;
			CharType temp;
			temp = (CharType)value1.lookupValue();
			n = temp.getValue();
			temp = (CharType)value2.lookupValue();
			n |= temp.getValue();
			temp.setValue(n);
			s.setValue(temp);	
			return;	
		}
		else
		{
			String error = "Operator " + op + " not define for type " + s.type;
			throw new Exception(error);
		}
	  }
	  if(op.equals("&"))
	  {
		if(s.type.equals("int_type_t") && 
			value1.type.equals("int_type_t") &&
			value2.type.equals("int_type_t"))
		{
			int n;
			IntType temp;
			temp = (IntType)value1.lookupValue();
			n = temp.getValue();
			temp = (IntType)value2.lookupValue();
			n &= temp.getValue();
			temp.setValue(n);
			s.setValue(temp);	
			return;	
		}
		else if(s.type.equals("char_type_t") && 
			value1.type.equals("char_type_t") &&
			value2.type.equals("char_type_t"))
		{
			char n;
			CharType temp;
			temp = (CharType)value1.lookupValue();
			n = temp.getValue();
			temp = (CharType)value2.lookupValue();
			n &= temp.getValue();
			temp.setValue(n);
			s.setValue(temp);	
			return;	
		}
		else
		{
			String error = "Operator " + op + " not define for type " + s.type;
			throw new Exception(error);
		}
	  }
	  if(op.equals("&&"))
	  {
		if(s.type.equals("int_type_t") && 
			value1.type.equals("int_type_t") &&
			value2.type.equals("int_type_t"))
		{
			int n1, n2;
			IntType temp = new IntType(0);
			n1 = ((IntType)value1.lookupValue()).getValue();
			n2 = ((IntType)value2.lookupValue()).getValue();
			if(n1 == 0)
				temp.setValue(0);
			else
			{			
				if(n2 == 0)
					temp.setValue(0);
				else
					temp.setValue(1);
			}
			s.setValue(temp);	
			return;	
		}
		else
		{
			String error = "Operator " + op + " not define for type " + s.type;
			throw new Exception(error);
		}
	  }
	  if(op.equals("||"))
	  {
		if(s.type.equals("int_type_t") && 
			value1.type.equals("int_type_t") &&
			value2.type.equals("int_type_t"))
		{
			int n1, n2;
			IntType temp = new IntType(0);
			n1 = ((IntType)value1.lookupValue()).getValue();
			n2 = ((IntType)value2.lookupValue()).getValue();
			if(n1 == 1)
				temp.setValue(1);
			else
			{			
				if(n2 == 1)
					temp.setValue(1);
				else
					temp.setValue(0);
			}
			s.setValue(temp);	
			return;	
		}
		else
		{
			String error = "Operator " + op + " not define for type " + s.type;
			throw new Exception(error);
		}
	  }
	  if(op.equals("<"))
	  {
		if(s.type.equals("int_type_t") && 
			value1.type.equals("int_type_t") &&
			value2.type.equals("int_type_t"))
		{
			int n1, n2;
			IntType temp = new IntType(0);
			n1 = ((IntType)value1.lookupValue()).getValue();
			n2 = ((IntType)value2.lookupValue()).getValue();
			if(n1 < n2)
				temp.setValue(1);
			s.setValue(temp);	
			return;	
		}
		else if(s.type.equals("char_type_t") && 
			value1.type.equals("char_type_t") &&
			value2.type.equals("char_type_t"))
		{
			char n1, n2;
			IntType temp = new IntType(0);
			n1 = ((CharType)value1.lookupValue()).getValue();
			n2 = ((CharType)value2.lookupValue()).getValue();
			if(n1 < n2)
				temp.setValue(1);
			s.setValue(temp);	
			return;	
		}
		else
		{
			String error = "Operator " + op + " not define for type " + s.type;
			throw new Exception(error);
		}
	  }
	  if(op.equals("<="))
	  {
		if(s.type.equals("int_type_t") && 
			value1.type.equals("int_type_t") &&
			value2.type.equals("int_type_t"))
		{
			int n1, n2;
			IntType temp = new IntType(0);
			n1 = ((IntType)value1.lookupValue()).getValue();
			n2 = ((IntType)value2.lookupValue()).getValue();
			if(n1 <= n2)
				temp.setValue(1);
			s.setValue(temp);	
			return;	
		}
		else if(s.type.equals("char_type_t") && 
			value1.type.equals("char_type_t") &&
			value2.type.equals("char_type_t"))
		{
			char n1, n2;
			IntType temp = new IntType(0);
			n1 = ((CharType)value1.lookupValue()).getValue();
			n2 = ((CharType)value2.lookupValue()).getValue();
			if(n1 <= n2)
				temp.setValue(1);
			s.setValue(temp);	
			return;	
		}
		else
		{
			String error = "Operator " + op + " not define for type " + s.type;
			throw new Exception(error);
		}
	  }
	  if(op.equals(">"))
	  {
		if(s.type.equals("int_type_t") && 
			value1.type.equals("int_type_t") &&
			value2.type.equals("int_type_t"))
		{
			int n1, n2;
			IntType temp = new IntType(0);
			n1 = ((IntType)value1.lookupValue()).getValue();
			n2 = ((IntType)value2.lookupValue()).getValue();
			if(n1 > n2)
				temp.setValue(1);
			s.setValue(temp);	
			return;	
		}
		else if(s.type.equals("char_type_t") && 
			value1.type.equals("char_type_t") &&
			value2.type.equals("char_type_t"))
		{
			char n1, n2;
			IntType temp = new IntType(0);
			n1 = ((CharType)value1.lookupValue()).getValue();
			n2 = ((CharType)value2.lookupValue()).getValue();
			if(n1 > n2)
				temp.setValue(1);
			s.setValue(temp);	
			return;	
		}
		else
		{
			String error = "Operator " + op + " not define for type " + s.type;
			throw new Exception(error);
		}
	  }
	  if(op.equals(">="))
	  {
		if(s.type.equals("int_type_t") && 
			value1.type.equals("int_type_t") &&
			value2.type.equals("int_type_t"))
		{
			int n1, n2;
			IntType temp = new IntType(0);
			n1 = ((IntType)value1.lookupValue()).getValue();
			n2 = ((IntType)value2.lookupValue()).getValue();
			if(n1 >= n2)
				temp.setValue(1);
			s.setValue(temp);	
			return;	
		}
		else if(s.type.equals("char_type_t") && 
			value1.type.equals("char_type_t") &&
			value2.type.equals("char_type_t"))
		{
			char n1, n2;
			IntType temp = new IntType(0);
			n1 = ((CharType)value1.lookupValue()).getValue();
			n2 = ((CharType)value2.lookupValue()).getValue();
			if(n1 >= n2)
				temp.setValue(1);
			s.setValue(temp);	
			return;	
		}
		else
		{
			String error = "Operator " + op + " not define for type " + s.type;
			throw new Exception(error);
		}
	  }
	  if(op.equals("=="))
	  {
		if(s.type.equals("int_type_t") && 
			value1.type.equals("int_type_t") &&
			value2.type.equals("int_type_t"))
		{
			int n1, n2;
			IntType temp = new IntType(0);
			n1 = ((IntType)value1.lookupValue()).getValue();
			n2 = ((IntType)value2.lookupValue()).getValue();
			if(n1 == n2)
				temp.setValue(1);
			s.setValue(temp);	
			return;	
		}
		else if(s.type.equals("char_type_t") && 
			value1.type.equals("char_type_t") &&
			value2.type.equals("char_type_t"))
		{
			char n1, n2;
			IntType temp = new IntType(0);
			n1 = ((CharType)value1.lookupValue()).getValue();
			n2 = ((CharType)value2.lookupValue()).getValue();
			if(n1 == n2)
				temp.setValue(1);
			s.setValue(temp);	
			return;	
		}
		else
		{
			String error = "Operator " + op + " not define for type " + s.type;
			throw new Exception(error);
		}
	  }
	  if(op.equals("!="))
	  {
		if(s.type.equals("int_type_t") && 
			value1.type.equals("int_type_t") &&
			value2.type.equals("int_type_t"))
		{
			int n1, n2;
			IntType temp = new IntType(0);
			n1 = ((IntType)value1.lookupValue()).getValue();
			n2 = ((IntType)value2.lookupValue()).getValue();
			if(n1 != n2)
				temp.setValue(1);
			s.setValue(temp);	
			return;	
		}
	  	else if(s.type.equals("char_type_t") && 
			value1.type.equals("char_type_t") &&
			value2.type.equals("char_type_t"))
		{
			char n1, n2;
			IntType temp = new IntType(0);
			n1 = ((CharType)value1.lookupValue()).getValue();
			n2 = ((CharType)value2.lookupValue()).getValue();
			if(n1 != n2)
				temp.setValue(1);
			s.setValue(temp);	
			return;	
		}
		else
		{
			String error = "Operator " + op + " not define for type " + s.type;
			throw new Exception(error);
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