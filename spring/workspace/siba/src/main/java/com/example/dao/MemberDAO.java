package com.example.dao;
 
import java.util.List;

import com.example.dto.JwVO;
import com.example.dto.LstmVO;
import com.example.dto.MemberVO;
 
public interface MemberDAO {
    
    public List<JwVO> selectMember() throws Exception;
    
    public List<LstmVO> selectLstm() throws Exception;
    
}
