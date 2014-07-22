/**
 * @author jihun21
 */
package com.jihun21.androidlog;

import android.util.Log;

import com.jihun21.androidlog.model.LogInfo;
import com.jihun21.androidlog.util.StringUtil;

public class AndroidLog {
	/**
	 * log type
	 */
	public enum LOG_TYPE {
		DEBUG, INFO, VERSE, WARNING, ERROR
	};

	private static LogInfo createLogInfoByStackTraceElement(StackTraceElement[] stackTraceElementArr, int level) {
		if (stackTraceElementArr == null) {
			return null;
		}
		if (stackTraceElementArr.length <= 2) {
			return null;
		}
		StackTraceElement stackTraceElement = stackTraceElementArr[level];
		LogInfo logInfo = new LogInfo(stackTraceElement.getFileName(), stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getLineNumber());

		return logInfo;
	}

	/**
	 * tag and msg string format file name "alc %FILE_NAME" class name "%CLASS_NAME" method name "%METHOD_NAME" line number "%LINE_NUMBER"
	 * 
	 * @param type
	 * @param tag
	 * @param msg
	 */
	public static void log(LOG_TYPE type, String tag, String msg, int level) {
		LogInfo logInfo = createLogInfoByStackTraceElement(new Throwable().getStackTrace(), level);

		tag = StringUtil.format(tag, logInfo);
		msg = StringUtil.format(msg, logInfo);

		switch (type) {
		case DEBUG:
			Log.d(tag, msg);
			break;
		case INFO:
			Log.i(tag, msg);
			break;
		case VERSE:
			Log.v(tag, msg);
			break;
		case WARNING:
			Log.w(tag, msg);
			break;
		case ERROR:
			Log.e(tag, msg);
			break;
		default:
			break;
		}
	}

	public static void d(String tag, String msg) {
		log(LOG_TYPE.DEBUG, tag, msg, 1);
	}

	public static void w(String tag, String msg) {
		log(LOG_TYPE.WARNING, tag, msg, 1);
	}

	public static void i(String tag, String msg) {
		log(LOG_TYPE.INFO, tag, msg, 1);
	}

	public static void v(String tag, String msg) {
		log(LOG_TYPE.VERSE, tag, msg, 1);
	}

	public static void e(String tag, String msg) {
		log(LOG_TYPE.ERROR, tag, msg, 1);
	}
}