package com.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import com.config.DriverManage;


public class CommonMethord {
	/**
	 * 处理编译后的文件路径
	 * 
	 * @param filepath
	 * @return
	 */
	public static String convertFilepath(String filepath) throws Exception {

		if (filepath.contains("bin")) {
			filepath = filepath.replace("bin/", "");
		}
		return filepath;
	}
	
	/**
	 * 获取绝对路径(工程根目录)为了启动浏览器
	 * 
	 * @param filepath
	 * @return
	 */
	public static String getRealath() throws Exception {

		String path = "";
		try {
			path = DriverManage.class.getClassLoader().getResource("").toURI()
					.getPath();

			try {
				path = CommonMethord.convertFilepath(path);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return path;
	}

}
