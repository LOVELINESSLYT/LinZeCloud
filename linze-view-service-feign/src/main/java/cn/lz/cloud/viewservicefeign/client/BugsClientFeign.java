package cn.lz.cloud.viewservicefeign.client;

import cn.lz.cloud.publics.vo.Bugs;
import cn.lz.cloud.viewservicefeign.client.impl.BugsClientFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author NingZe
 * description:
 * path: LinZeCloud-cn.lz.cloud.viewservicefeign.client-BugsClientFeign
 * date: 2019/11/11 0011 11:27
 * version: 02.06
 * To change this template use File | Settings | File Templates.
 */
@FeignClient(value = "LINZE-DATA-SERVICE", fallback = BugsClientFeignHystrix.class)
public interface BugsClientFeign {

    @GetMapping("bugs")
    List<Bugs> listBugs();

}