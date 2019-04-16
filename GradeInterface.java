package Lab12;
/**Represents behaviors of a generic grade
 * @author Devin O'Brien
 * @version 1.0
 */
public interface GradeInterface 
{
	/**Name of the assignment
	 */
	public static String name = "";
	
	/**Total grade value achievable
	 */
	public static int max = 0;
	
	/**Actual grade achieved
	 */
	public static int actual = 0;
	
	/**Returns name of assignment
	 * @return the name of this assignment
	 */
	public String getName();
	
	/**Returns the maximum value of this assignment
	 * @return the maximum value of this assignment
	 */
	public int getMax();
	
	/**Returns achieved value of this assignment
	 * @return achieved value of this assignment
	 */
	public int getActual();
	
	/**Returns calculated grade of this assignment
	 * @returns ratio of achieved value over max value of this assignment
	 */
	public int getGrade();
	
	/**Sets the name of this assignment
	 * @param str - name of assignment
	 */
	public void setName(String str);
	
	/**Sets the maximum achievable grade value of this assignment
	 * @param max - maximum grade achievable
	 */
	public void setMax(int max);
	
	/**Sets the grade achieved on this assignment
	 * @param actual - percentage achieved on this assignment
	 */
	public void setActual(int actual);
}
