package com.jihun21.androidlog.util;

import com.jihun21.androidlog.model.LogInfo;

public class StringUtil {
	public final static String FORMAT_FILE = "%FILE_NAME";
	public final static String FORMAT_CLASS = "%CLASS_NAME";
	public final static String FORMAT_METHOD = "%METHOD_NAME";
	public final static String FORMAT_LINE_NUMBER = "%LINE_NUMBER";

	public static String format(String text, LogInfo logInfo) {
		text.replace(FORMAT_FILE, logInfo.getFileName());
		text.replace(FORMAT_CLASS, logInfo.getClassName());
		text.replace(FORMAT_METHOD, logInfo.getMethodName());
		text.replace(FORMAT_LINE_NUMBER, String.valueOf(logInfo.getLineNumber()));

		return text;
	}
}
