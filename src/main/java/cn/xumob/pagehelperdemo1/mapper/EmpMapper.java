package cn.xumob.pagehelperdemo1.mapper;

import cn.xumob.pagehelperdemo1.entity.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {

    List<Emp> getPartEmp();

}
