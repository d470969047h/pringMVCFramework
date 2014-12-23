package com.shinowit.actions;

import com.opensymphony.xwork2.ActionSupport;

import java.io.File;

public class UserAction extends ActionSupport {
    //格式必须为"文件名"+FileName
    private String fileFileName;
    //必须与前台的name相同才可以接收到
    private File file;
    private boolean success;

    public String upload(){
        //对文件进行操作，这里只是输出一下文件名
        System.out.println(fileFileName);
        success = true;
        return SUCCESS;
    }

    public String getFileFileName() {
        return fileFileName;
    }
    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }
    public File getFile() {
        return file;
    }
    public void setFile(File file) {
        this.file = file;
    }
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
}
