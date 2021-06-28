package com.ensah.core.services;

import javax.servlet.http.HttpServletRequest;

import com.ensah.core.bo.BlockIP;

public interface IBlockIPService {
	public void blockip(HttpServletRequest request);
	public void reset(HttpServletRequest request);
}
