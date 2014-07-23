package com.jihun21.androidlog.util;

import com.jihun21.androidlog.model.LogInfo;

public class StringUtil {
	public final static String FORMAT_FILE = "%FILE_NAME";
	public final static String FORMAT_CLASS = "%CLASS_NAME";
	public final static String FORMAT_METHOD = "%METHOD_NAME";
	public final static String FORMAT_LINE_NUMBER = "%LINE_NUMBER";

	public static String format(String text, LogInfo logInfo) {
		text = text.replace(FORMAT_FILE, logInfo.getFileName()).replace(FORMAT_CLASS, logInfo.getClassName()).replace(FORMAT_METHOD, logInfo.getMethodName())
				.replace(FORMAT_LINE_NUMBER, String.valueOf(logInfo.getLineNumber()));

		return text;
	}
}
