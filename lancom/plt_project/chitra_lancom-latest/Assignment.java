import java.io.IOException;

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
	 if(op.equals("="))
	  {
		if(s.type.equals("int_type_t"))
		{
			IntType temp = new IntType(value);
			System.out.println(temp.getValue());
			s.setValue(temp);
		}
	  }
	  if(op.equals( "+="))
	  {
		if(s.type.equals("int_type_t"))
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
	  if(op.equals("-="))
	  {
		if(s.type.equals("int_type_t"))
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
	  if(op.equals("*="))
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
	  if(op.equals("/="))
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

    public void assignValue(Symbol value) throws Exception
    {
	  if(op.equals("="))
	  {
		if(s.type.equals("int_type_t"))
		{
			IntType temp;
			temp = (IntType)value.lookupValue();
			s.setValue(temp);
		}
		else if(s.type.equals("char_type_t"))
		{
			CharType temp;
			temp = (CharType)value.lookupValue();
			s.setValue(temp);
		}
	  }
	  if(op.equals("+="))
	  {
		if(s.type.equals("int_type_t"))
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
		else
		{
			String error = "Operator " + op + " not define for type " + s.type;
			throw new Exception(error);
		}
	  }
	  if(op.equals("-="))
	  {
		if(s.type.equals("int_type_t"))
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
		else
		{
			String error = "Operator " + op + " not define for type " + s.type;
			throw new Exception(error);
		}
	  }
	  if(op.equals("*="))
	  {
		if(s.type.equals("int_type_t"))
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
		else
		{
			String error = "Operator " + op + " not define for type " + s.type;
			throw new Exception(error);
		}
	  }
	  if(op.equals("/="))
	  {
		if(s.type.equals("int_type_t"))
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