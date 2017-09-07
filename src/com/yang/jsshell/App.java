package com.yang.jsshell;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class App {
	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		if(args.length==0){
			System.out.println("请输入js文件路径!");
			return;
		}
		Reader r=new FileReader(args[0]);
		ScriptEngine nashorn = ScriptEngineHelper.getInstance();
		nashorn.eval(r);
	}
}
