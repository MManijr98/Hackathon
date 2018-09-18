/**
 * 
 */

/**
 * @author Mike Manigault Jr
 *
 */
public class Array_Rotation {

	/**
	 * @param args
	 */
	public void rotate(int[] nums, int m) {
		// TODO Auto-generated method stub
         if (m > nums.length)
        	 m=m%nums.length;
         int[] result = new int[nums.length];
         
         for(int i=0; i < m; i++){
             result[i] = nums[nums.length-m+i];
         }
      
         int j=0;
         for(int i=m; i<nums.length; i++){
             result[i] = nums[j];
             j++;
         }
      
         System.arraycopy( result, 0, nums, 0, nums.length );  
        
	}

}
