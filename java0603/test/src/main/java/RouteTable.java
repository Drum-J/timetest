public class RouteTable {
    public int Id;
    private String GateWay;
    public String subnetList;

    public RouteTable(){

    }
    public RouteTable(int Id,String GateWay,String subnetList ){
        this.Id = Id;
        this.GateWay = GateWay;
        this.subnetList = subnetList;

    }

    public void setGateWay(String gateWay) {
        this.GateWay = gateWay;
    }

    public String getGateWay() {
        return this.GateWay=GateWay;
    }

}
