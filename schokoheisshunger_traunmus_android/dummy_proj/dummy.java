
/**
 * dummy
 */
public class dummy {
    
	public double getCosts() {
		Comparable<AbstractMember>[] memberArr = members.toArray(true);
		double costs = 0;
		for (int i = 0; i < memberArr.length; i++) {
			costs += ((AbstractMember) memberArr[i]).getCosts();
		}
		return costs;
	}
    
    public void thisIsANewMethod(){
        
    }
}
