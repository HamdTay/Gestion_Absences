package com.ensah.core.services.Impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.LockedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.bo.BlockIP;
import com.ensah.core.dao.IBlockIPDao;
import com.ensah.core.services.IBlockIPService;

@Transactional
@Service
public class BlockIPServiceImpl implements IBlockIPService {

	
	@Autowired
	IBlockIPDao bipDao;
	

	@Override
	public void blockip(HttpServletRequest request) {
        
		
		
		final String xfHeader = request.getHeader("X-Forwarded-For");
        String ip = "";
        //fetch id
        if (xfHeader == null) {
            ip = request.getRemoteAddr();
        } else {
            ip = xfHeader.split(",")[0];
        }
		
		List<BlockIP> biplist =  bipDao.getEntityByColValue("BlockIP", "ip", ip);
		
		//check if size is larger than 2, if true block ip, else increment attempt count 
		System.out.println("biplist: "+biplist.toString());
		if(biplist == null || biplist.size() < 1) {
			System.out.println("biplist: "+biplist.toString());
			BlockIP blip = new BlockIP();
			blip.setIp(ip);
			blip.setNombreDelogin(1);
			bipDao.create(blip);
		}else {
			if(biplist.size() > 0 && biplist.get(0).getNombreDelogin() == 0) {
				biplist.get(0).setNombreDelogin(1);
				bipDao.update(biplist.get(0));
			}else if(biplist.size() > 0 && biplist.get(0).getNombreDelogin() == 1){
				biplist.get(0).setNombreDelogin(2);
				bipDao.update(biplist.get(0));
			}else if(biplist.size() > 0 && biplist.get(0).getNombreDelogin() == 2){
				biplist.get(0).setNombreDelogin(3);
				bipDao.update(biplist.get(0));
			}
		}
		
	}


	@Override
	public void reset(HttpServletRequest request) {
       
		final String xfHeader = request.getHeader("X-Forwarded-For");
        String ip = "";
        //fetch id
        if (xfHeader == null)
            ip = request.getRemoteAddr();
        else 
            ip = xfHeader.split(",")[0];
	
		List<BlockIP> bipo = bipDao.getEntityByColValue("BlockIP", "ip", ip);
        
        if(bipo == null || bipo.size() <1 )
        	return;
        else if(bipo.get(0).getNombreDelogin() > 2) {
        	throw new LockedException("votre ip est vérouillé");
        }
        	
        bipo.get(0).setNombreDelogin(0);
       
        
        //if user

	}
	
	


}
