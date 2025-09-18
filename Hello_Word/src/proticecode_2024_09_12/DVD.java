package proticecode_2024_09_12;

public class DVD extends Item{
    private String daoyan;
    private int dvdtime;
    private String dvdname;
    private String dshangtime;
    public DVD(String daoyan,int dvdtime,String dvdname,String dshangtime)
    {
        //super();
        this.daoyan = daoyan;
        this.dvdtime = dvdtime;
        this.dvdname = dvdname;
        this.dshangtime = dshangtime;
    }
    public void print()
    {
        System.out.println(dvdname + "  导演:" + daoyan);
    }
    public static void main(String[] args) {

    }
}
