package com.config;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadWriteConfig {
	private Properties prop;
	private String filePath;
	/**
	 * 构造方法
	 * */
	public ReadWriteConfig(String filePath){
		this.filePath = filePath;
		this.prop = readProperties();
	}
	
	/**
	 * 读取配置文件
	 * */
	private Properties readProperties(){
		Properties properties = new Properties();
		try {
			InputStream inputStream = new FileInputStream(filePath);
			BufferedInputStream in = new BufferedInputStream(inputStream);
			properties.load(in);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
	
	/**
	 * 根据key读取关键字内容
	 * */
	public String  getValue(String key){
		if(prop.containsKey(key)){
			String value = prop.getProperty(key);
			return value;
		}else{
			System.out.println("你获取key值不对");
			return "";
		}	
	}
	
	/**
	 * 写入内容
	 * */
	public void writeValue(String key,String value){
		Properties pro = new Properties();
			try {
				FileOutputStream file = new FileOutputStream(filePath);
				pro.setProperty(key, value);
				pro.store(file, key);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}