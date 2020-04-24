package mediator_pattern;

public class TestMediator {

    public static void main(String[] args) {
        MediatorStructure ms = new MediatorStructure();
        HouseOwner houseOwner = new HouseOwner("zhang san", ms);
        Tenant tenant = new Tenant("li si", ms);
        ms.setHouseOwner(houseOwner);
        ms.setTenant(tenant);
        houseOwner.contract("who want zufang?");
        tenant.contract("wo bu zu");
    }
}
