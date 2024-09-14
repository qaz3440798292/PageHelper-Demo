package cn.xumob.pagehelperdemo1.service.impl;

import cn.xumob.pagehelperdemo1.entity.Emp;
import cn.xumob.pagehelperdemo1.mapper.EmpMapper;
import cn.xumob.pagehelperdemo1.service.EmpService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    private final EmpMapper empMapper;

    public EmpServiceImpl(EmpMapper empMapper) {
        this.empMapper = empMapper;
    }


    @Override
    public List<Emp> getPartEmp() {
        return empMapper.getPartEmp();
    }
}
