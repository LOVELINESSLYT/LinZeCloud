package cn.lz.cloud.viewservicefeign.service;

import cn.lz.cloud.publics.vo.Bugs;
import cn.lz.cloud.viewservicefeign.client.BugsClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author NingZe
 * description:
 * path: LinZeCloud-cn.lz.cloud.viewservicefeign.service-BugsService
 * date: 2019/11/14 0014 15:04
 * version: 02.06
 * To change this template use File | Settings | File Templates.
 */
@Service
public class BugsService {

    @Autowired
    BugsClientFeign bugsClientFeign;

    public List<Bugs> listBugs() {
        return bugsClientFeign.listBugs();
    }

}
