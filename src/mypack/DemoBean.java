package mypack;

public class DemoBean implements Demo 
{
	private TestBean testBean;
	
	
	
	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}



	public void showData()
	{
		System.out.println(testBean);
	}
}
