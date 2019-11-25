package cn.lz.cloud.publics.vo;

/**
 * Created by IntelliJ IDEA.
 *
 * @author NingZe
 * description:
 * path: LinZeCloud-cn.lz.cloud.publics.vo-Bugs
 * date: 2019/11/13 0013 15:11
 * version: 02.06
 * To change this template use File | Settings | File Templates.
 */
public class Bugs {

    private String bid;

    private String bname;

    private String bprice;

    private String bport;

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBprice() {
        return bprice;
    }

    public void setBprice(String bprice) {
        this.bprice = bprice;
    }

    public String getBport() {
        return bport;
    }

    public void setBport(String bport) {
        this.bport = bport;
    }

    public Bugs() {

    }

    public Bugs(String bid, String bname, String bprice, String bport) {
        this.bid = bid;
        this.bname = bname;
        this.bprice = bprice;
        this.bport = bport;
    }

}