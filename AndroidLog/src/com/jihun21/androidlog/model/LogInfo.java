/**
 * @author jihun21
 */
package com.jihun21.androidlog.model;

public class LogInfo {
	private String fileName;
	/**
	 * file name
	 */
	/**
	 * class name
	 */
	private String className;
	/**
	 * method name
	 */
	private String methodName;
	/**
	 * line number in java class file
	 */
	private int lineNumber;

	protected LogInfo() {}

	/**
	 * loginfo init
	 * 
	 * @param fileName
	 * @param className
	 * @param methodName
	 * @param lineNumber
	 */
	public LogInfo(String fileName, String className, String methodName, int lineNumber) {
		this.fileName = fileName;
		this.className = className;
		this.methodName = methodName;
		this.lineNumber = lineNumber;
	}

	// getter
	public String getFileName() {
		return fileName;
	}

	public String getClassName() {
		return className;
	}

	public String getMethodName() {
		return methodName;
	}

	public int getLineNumber() {
		return lineNumber;
	}
}