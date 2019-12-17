import org.junit.Assert;
import org.junit.Test;

public class InvertTest {

	
	@Test
	public void Test1(){
		NameInverter y=new NameInverter(" Andru Mazilescu ");
		Assert.assertEquals("Mazilescu, Andru",y.invertName());

		
	}
	@Test
	public void Test2(){
		NameInverter x=new NameInverter(" Andru ");;
		Assert.assertEquals("Andru",x.invertName());
		
	}
	@Test
	public void Test3(){
		NameInverter z=new NameInverter("Mr. Phd. Andru Mazilescu");
		Assert.assertEquals("Mazilescu, Andru Mr. Phd.",z.invertName());
		
	}
	
	@Test
	public void Test4(){
		NameInverter w=new NameInverter("Mr. Andru Mazilescu");
		Assert.assertEquals("Mazilescu, Andru Mr.",w.invertName());
		
	}
	
	@Test
	public void Test5(){
		NameInverter y=new NameInverter("Andru Mazilescu");
		Assert.assertEquals("Mazilescu, Andru",y.invertName());

	}
	
	@Test
	public void Test6(){
		NameInverter y=new NameInverter("Andru");
		Assert.assertEquals("Andru",y.invertName());

		
	}
	
	@Test
	public void Test7(){
		NameInverter y=new NameInverter("");
		Assert.assertEquals("",y.invertName());

		
	}
	

}
