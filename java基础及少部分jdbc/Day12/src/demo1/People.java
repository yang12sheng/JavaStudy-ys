/**
 *  @version:
 */
package demo1;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��11������11:34:55 ;
 */
public class People {
	private String pname;

	public People(String pname) {
		super();
		this.pname = pname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "People [pname=" + pname + "]";
	}
}
