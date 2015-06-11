package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import javax.swing.ImageIcon;

import util.FieldType;

/**
 * 统计服务接口 Created by Vboar on 2015/6/11.
 */
public interface StatsService extends Remote {

	/**
	 * 获得指定球员的某个赛季的常规赛/季后赛的雷达图
	 * 
	 * @param name
	 *            球员名字
	 * @param season
	 *            赛季 生涯为Career
	 * @param regular
	 *            常规赛/季后赛
	 * @return 雷达图
	 */
	public ImageIcon getPlayerRadar(String name, String season, int regular)
			throws RemoteException;

	/**
	 * 获得指定两个球员某赛季的常规赛/季后赛的雷达图
	 * 
	 * @param playerA
	 *            球员A
	 * @param playerB
	 *            球员B
	 * @param season
	 *            赛季，生涯为Career
	 * @param regular
	 *            常规赛/季后赛
	 * @return
	 * @throws RemoteException
	 */
	public ImageIcon getPlayerCompareRadar(String playerA, String playerB,
			String season, int regular) throws RemoteException;

	/**
	 * 获得指定球员指定数据的常规赛/季后赛历史折线图
	 * 
	 * @param player
	 *            球员姓名
	 * @param field
	 *            指定数据
	 * @param regular
	 *            常规赛/季后赛
	 * @return
	 * @throws RemoteException
	 */
	public ImageIcon getPlayerCareerLineChart(String player, FieldType field,
			int regular) throws RemoteException;

	/**
	 * 获得指定两个球队的指定基本数据的常规赛/季后赛历史对比直方图
	 * 
	 * @param playerA
	 *            球员A姓名
	 * @param playerB
	 *            球员B姓名
	 * @param season
	 *            赛季 ，生涯为Career
	 * @param field
	 *            带比较的数据
	 * @param regular
	 *            常规赛/季后赛
	 * @return
	 * @throws RemoteException
	 */
	public ImageIcon getPlayerBasicCompareBarChart(String playerA,
			String playerB, String season, List<FieldType> fields, int regular)
			throws RemoteException;

	/**
	 * 获得指定两个球队的指定高阶数据的常规赛/季后赛历史对比直方图
	 * @param playerA 球员A姓名
	 * @param playerB
	 * @param season
	 * @param fields
	 * @param regular
	 * @return
	 * @throws RemoteException
	 */
	public ImageIcon getPlayerAdvancedCompareBarChart(String playerA,
			String playerB, String season, List<FieldType> fields, int regular)
			throws RemoteException;

}
