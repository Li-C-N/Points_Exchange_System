package com.hoperun.pesystem.controller;

import com.hoperun.pesystem.dto.ResultDto;
import com.hoperun.pesystem.model.Activity;
import com.hoperun.pesystem.model.Goods;
import com.hoperun.pesystem.model.Study;
import com.hoperun.pesystem.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    private IndexService indexService;
    @PostMapping("/index")
    @ResponseBody
    public ResultDto<Map<String,Object>> indexInfo(){
        List<Activity> hotactivity=indexService.showHotInfoWithActivity();
        List<Goods> hotgoods= indexService.showHotInfoWithGoods();
        List<Study> hotstudy =indexService.showHotInfoWithStudy();
        Map<String,Object> map = new HashMap<>();
        map.put("热门活动",hotactivity);
        map.put("热门学堂",hotstudy);
        map.put("热门商品",hotgoods);
        return ResultDto.okOf(map);
    }
}
