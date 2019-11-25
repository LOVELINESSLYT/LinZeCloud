package cn.lz.cloud.viewservicefeign.controller;

import cn.lz.cloud.viewservicefeign.service.BugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 *
 * @author NingZe
 * description:
 * path: LinZeCloud-cn.lz.cloud.viewservicefeign.controller-BugsController
 * date: 2019/11/14 0014 15:10
 * version: 02.06
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class BugsController {

    @Value("${server.port}")
    String port;

    @Autowired
    BugsService bs;

    @RequestMapping("bugs")
    public String bugs(Model model) {
        model.addAttribute("bugs", bs.listBugs());
        model.addAttribute("port", port);
        return "bugs";
    }

}