package com.xworkz.user.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.user.dto.UserDTO;
import com.xworkz.user.service.UserService;

@MultipartConfig
@Controller
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private UserService userService;

	public UserController() {

		System.out.println("Calling Default  Constructor Of:" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onSave(UserDTO userDTO, Model model, @RequestParam("file") MultipartFile file)
			throws IOException {
		System.out.println("Calling onSave Method");
		byte[] bytes = file.getBytes();
		String string = System.currentTimeMillis()+"_"+file.getOriginalFilename();
		Path path = Paths.get("D://temp-files/" + string);
		Files.write(path, bytes);
		userDTO.setFileName(string);
		Boolean validateAndSave = userService.validateAndSave(userDTO);
		System.out.println("UserData Entered Are" + userDTO);
		if (validateAndSave) {
			System.out.println("Data Entered is Valid");
			model.addAttribute("Mesg", "Record Save, Click to enter Next Criminal Detail");
			return "index";
		} else {
			System.out.println("Data Entered Are InValid");
			return "index";
		}

	}

	@GetMapping({"**/image"})
	public void sendFile(@RequestParam String fileName, HttpServletResponse response) throws IOException {
		System.out.println("running sendFile..." + fileName);
		File file = new File("D://temp-files//" + fileName);
		String mimeType = URLConnection.guessContentTypeFromName(file.getName());
		response.setContentType(mimeType);
		try (OutputStream stream = response.getOutputStream()) {
			stream.write(Files.readAllBytes(file.toPath()));
		}
	}

	@GetMapping
	public String readAll(Model model) {
		System.out.println("Calling Display Method");
		List<UserDTO> user = userService.findAll();
//		if(user != null && user.isEmpty()) {
		model.addAttribute("userData", user);
		model.addAttribute("mesg", "No Data Found");

		return "ShowUserData";
  }
	
	@GetMapping("/getByName")
		public String findByName(HttpServletRequest request, Model model) {
			String name = request.getParameter("userName");
			List<UserDTO> userDTO = userService.findByName(name);
			if(userDTO != null & !userDTO.isEmpty()) {
				System.out.println("The records Are Found"+userDTO.size());
				System.out.println("The Details Are:"+userDTO);
				model.addAttribute("userData", userDTO);
				model.addAttribute("RecordCount","No Of Records Found"+userDTO.size());
			}
			else {
				System.out.println("No Records Are Found");
			}
			
			
			return "ShowUserData";
		}
		
	}

