package com.biz.dept.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service("fileService")
public class FileServiceImpl implements FileService {

	@Autowired
	private String winPath;

	private String fileUploadPath;

	@Autowired
	public void fileUploadPath() {
		this.fileUploadPath = winPath;
	}

	@Override
	public String fileUp(MultipartFile file) {
		if (file == null) {
			return null;
		}

		String originalFilelName = file.getOriginalFilename();
		String strUUID = UUID.randomUUID().toString();

		if (file != null) {
			File dir = new File(this.fileUploadPath);
			if (!dir.exists()) {
				dir.mkdirs();
			}

			String saveFileName = strUUID + originalFilelName;
			File saveFile = new File(this.fileUploadPath, saveFileName);

			try {
				file.transferTo(saveFile);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return saveFileName;

		}

		return null;
	}

	@Override
	public List<String> filesUp(MultipartHttpServletRequest files) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int fileDelete(String fileName) {
		File delFile = new File(this.fileUploadPath, fileName);

		if (delFile.exists()) {
			delFile.delete();
		}

		return 0;
	}

}
