package cn.lz.cloud.dataservice.service;

import cn.lz.cloud.publics.vo.Bugs;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author NingZe
 * description:
 * path: LinZeCloud-cn.lz.cloud.dataservice.service-BugsService
 * date: 2019/11/13 0013 16:21
 * version: 02.06
 * To change this template use File | Settings | File Templates.
 */
@Service
public class BugsService {

    /**
     * 端口号，用于区分数据来源
     */
    @Value("${server.port}")
    String port;

    public List<Bugs> listBugs() {
        return new ArrayList<>() {{
            add(new Bugs("1", "无尽之刃", "3400", "" + port));
            add(new Bugs("2", "斯塔缇克电刃", "2600", "" + port));
            add(new Bugs("3", "无尽之刃", "3400", "" + port));
            add(new Bugs("4", "无尽之刃", "3400", "" + port));
            add(new Bugs("5", "饮血剑", "3700", "" + port));
            add(new Bugs("6", "多米尼克领主的致意", "2600", "" + port));
        }};
    }

}
