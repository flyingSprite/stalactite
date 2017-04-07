package com.duastone.stalactite.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Feb 9, 2016 11:16:58 PM 
 */
public class FileTools {

	public static final String FILE_CHARSET = "utf-8";
	
	public static String readFileToString(String path, String name) throws IOException{
		File file = new File(path, name);
		return readFileToString(file);
	}
	
	public static String readFileToString(String pathname) throws IOException{
		File file = new File(pathname);
		return readFileToString(file);
	}

	public static String readFileToString(File file) throws IOException {
		return FileUtils.readFileToString(file, FILE_CHARSET);
	}

    /**
     * Using InputSteam to write a new file.
     *
     * Using {@link FileUtils} to write {@link InputStream} to file.
     *
     * @param strema {@link InputStream} file input stream.
     * @param filename {@link String} filename.
     * @param mimeType {@link String} file mime type.
     * @throws IOException
     */
    public static void writeToFile(InputStream strema, String filename, String mimeType) throws IOException{
        FileUtils.copyInputStreamToFile(strema, new File(filename));
    }
}
