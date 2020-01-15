package semc.nwp.Post.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import semc.nwp.Post.demo.service.PostService;

@RestController
@RequestMapping("post")
public class PostController {
	
	
	@Autowired
	PostService ps;

}
