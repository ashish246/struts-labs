package com.struts.upload.actions;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Notice that action class is implementing ServletContextAware interface that
 * contains single method setServletContext(). This is done to get the
 * ServletContext reference in action class and use it to get the web
 * application root directory. This will be used in saving the file from temp
 * directory to another directory inside web application.
 * 
 * Did you noticed filesPath parameter defined for UploadFile action, that’s why
 * we have setFilesPath() method. This method is used by Struts 2 params
 * interceptor to read the params configured in struts.xml file and invoke it’s
 * setter method.
 * 
 * The three variables that are set by fileUpload and params interceptors are
 * File, file name and content type.
 * 
 * If the file element name in request is “pic” then these variables should be –
 * File pic, String picContentType and String picFileName. Since our
 * UploadFile.jsp file element name is “file”, we have variables file,
 * fileFileName and fileContentType with their getter and setters.
 * 
 * @author Administrator
 *
 */
public class UploadFileAction extends ActionSupport implements
		ServletContextAware {

	private static final long serialVersionUID = -4748500436762141116L;

	@Override
	public String execute() {
		System.out.println("File Name is:" + getFileFileName());
		System.out.println("File ContentType is:" + getFileContentType());
		System.out.println("Files Directory is:" + filesPath);
		try {
			FilesUtil.saveFile(getFile(), getFileFileName(),
					context.getRealPath("") + File.separator + filesPath);
		} catch (IOException e) {
			e.printStackTrace();
			return INPUT;
		}
		return SUCCESS;

	}

	private File file;
	private String fileContentType;
	private String fileFileName;
	private String filesPath;
	private ServletContext context;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public void setFilesPath(String filesPath) {
		this.filesPath = filesPath;
	}

	@Override
	public void setServletContext(ServletContext ctx) {
		this.context = ctx;
	}

}