package cn.xumob.pagehelperdemo1.controller;

import cn.xumob.pagehelperdemo1.entity.Emp;
import cn.xumob.pagehelperdemo1.service.EmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    private final EmpService empService;

    public EmpController(EmpService empService) {
        this.empService = empService;
    }

    @GetMapping("/")
    public PageInfo<Emp> list(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Emp> partEmp = empService.getPartEmp();
        return new PageInfo<>(partEmp, 5);
    }
}
