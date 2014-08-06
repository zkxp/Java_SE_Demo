package javadoc;
/**
 * @see kxp.blog.user
 * @author zkxp
 * @version 3.5
 * @since 2014Äê2ÔÂ18ÈÕ15:01:15
 */
/**
 * you can <em>even</em> insert a list
 * <ol>
 * <li>first</li>
 * <li>second</li>
 * </ol>
 * @author zkxp
 *
 */
public class JavaDocDemo {
	
	/**
	 * @link kxp.blog.user
	 * @docRoot
	 */
	int age;

	/**
	 * 
	 * @return a
	 * @throws null
	 */
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public static void main(String[] args) {
		System.out.println(new JavaDocDemo().age);
	}
}
