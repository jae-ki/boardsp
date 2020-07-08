package kr.co.ca;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.util.utils;

@Controller
public class iframeUploadController {
	
	@RequestMapping(value = "/iuploadform", method = RequestMethod.POST)
	public String iuploadform(MultipartHttpServletRequest request, Model model) throws Exception {
		
		MultipartFile file = request.getFile("file");
		String originalName = file.getOriginalFilename();
		
		String newName = utils.saveFile(originalName, file);
		model.addAttribute("newName", newName);
		
		return "result";
	}
	
	@RequestMapping(value = "/iuploadform", method = RequestMethod.GET)
	public void iuploadform() {
		
		
		
	}
	
}
