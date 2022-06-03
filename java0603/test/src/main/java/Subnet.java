public class Subnet {
    public int Id;
    public String Ip;
    public String local;


    public Subnet(){

    }
    public Subnet(int Id,String Ip,String local ){
        this.Id = Id;
        this.Ip = Ip;
        this.local = local;

    }

    public String transfer(String msg){
        return msg;
    }
}
