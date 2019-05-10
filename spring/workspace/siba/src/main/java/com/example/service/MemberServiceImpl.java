package com.example.service;
 
import java.util.List;
 
import javax.inject.Inject;
 
import org.springframework.stereotype.Service;
 
import com.example.dao.MemberDAO;
import com.example.dto.JwVO;
import com.example.dto.LstmVO;
import com.example.dto.MemberVO;
 
@Service
public class MemberServiceImpl implements MemberService {
 
    @Inject
    private MemberDAO dao;
    
    @Override
    public List<JwVO> selectMember() throws Exception {
 
        return dao.selectMember();
    }
    
    @Override
    public List<LstmVO> selectLstm() throws Exception {
    	
    	return dao.selectLstm();
    }
 
}