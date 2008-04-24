public class Policy
{
	public String pol[] = new String [4];
	public Policy(String p1 , String p2 , String p3 , String p4)
	{
		pol[0] = p1;
	       	pol[1] = p2;
	       	pol[2] = p3;
	       	pol[3] = p4;
	        
	}
/*
	public IntType(int v)
	{
		value = v;
	}
	
	public void setValue(int v)
	{
		value = v;
	}
*/	
	public Policy getValue()
	{
		return this;
	}
}
