package kr.goott.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CommandService {
	// String : view파일명을 리턴한다.
	public String process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException; 
}
