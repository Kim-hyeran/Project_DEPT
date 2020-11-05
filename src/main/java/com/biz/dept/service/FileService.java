package com.biz.dept.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface FileService {
	
	public String fileUp(MultipartFile file);
	public List<String> filesUp(MultipartHttpServletRequest files);

	public int fileDelete(String fileName);

}
