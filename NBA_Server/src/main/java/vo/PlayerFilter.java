package vo;

/**
 * 球员数据查看筛选器
 * 
 * created by JaneLDQ on 2015年6月2日 下午7:18:33
 */
public class PlayerFilter {
	
	/**
	 * 赛季
	 */
	public String season;
	
	/**
	 * 常规赛/季后赛  = 1/0
	 */
	public int regular;
	
	/**
	 * 分区
	 */
	public String division;
	
	/**
	 * 联盟
	 */
	public String league;
	
	/**
	 * 位置
	 */
	public String position;
	
	/**
	 * 身高(e.g. "<6-6" 符号为"<>="，默认只占一位，后面为身高的值)
	 */
	public String height;
	
	/**
	 * 体重(e.g. "<275" )
	 */
	public String weight;
	
}
