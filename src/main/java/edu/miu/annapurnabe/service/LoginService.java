package edu.miu.annapurnabe.service;

import edu.miu.annapurnabe.dto.request.LoginRequestDTO;
import javax.servlet.http.HttpServletRequest;

/**
 * @author bijayshrestha on 6/10/22
 * @project cs544-project
 */
public interface LoginService {

    String login(LoginRequestDTO requestDTO, HttpServletRequest request);
}
