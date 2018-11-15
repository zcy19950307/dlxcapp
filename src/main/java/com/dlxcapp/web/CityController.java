package com.dlxcapp.web;
import com.dlxcapp.core.Result;
import com.dlxcapp.core.ResultGenerator;
import com.dlxcapp.model.City;
import com.dlxcapp.service.CityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/11/14.
*/
@RestController
@RequestMapping("/city")
public class CityController {
    @Resource
    private CityService cityService;

    @PostMapping("/add")
    public Result add(City city) {
        cityService.save(city);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        cityService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(City city) {
        cityService.update(city);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        City city = cityService.findById(id);
        return ResultGenerator.genSuccessResult(city);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<City> list = cityService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
