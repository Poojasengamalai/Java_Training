package OOPs;
class Ticket{
    String passenger_name;
    String contact_no;
    int ticket_no;
    
    Ticket(String passenger_name,String contact_no,int ticket_no){
        this.passenger_name = passenger_name;
        this.contact_no = contact_no;
        this.ticket_no =  ticket_no;
    }
    
    void generateTicket(){
        System.out.println("Generating Tickets......");
    }
}

class BusTicket extends Ticket{
    String boarding_point;
    String destination_point;
    
    BusTicket(String p_name, String cont_no, int t_no, String b_point, String d_point){
        super(p_name,cont_no, t_no);
        boarding_point = b_point;
        destination_point = d_point;
    }
    @Override
    void generateTicket(){
        System.out.println("---------------Bus Ticket----------");
        System.out.println("Passenger Name :" + passenger_name);
        System.out.println("Contact number : "+contact_no);
        System.out.println("Ticket Number : " + ticket_no);
        System.out.println("Boarding point : "+boarding_point);
         System.out.println("Destination point : "+destination_point);
    }
}

class TrainTicket extends Ticket{
    String coachType;
    
    TrainTicket(String p_name, String cont_no, int t_no,String coachType){
        super(p_name,cont_no, t_no);
        this.coachType = coachType;
    }
    @Override
    void generateTicket(){
        System.out.println("-----------------Train Ticket--------------------");
        System.out.println("Passenger Name :" + passenger_name);
        System.out.println("Contact number : "+contact_no);
        System.out.println("Ticket Number : " + ticket_no);
        System.out.println("Coach Type : "+coachType);
    }
}
public class BookingSystem{
    public static void main (String[] args) {
        BusTicket bus = new BusTicket("Saran","+91 4567892121",345678,"Karur Bus Stand","Chennai");
        bus.generateTicket();
        
        TrainTicket  train = new TrainTicket("Siva","+91 8765432132",1234,"AC 1 Tier");
        train.generateTicket();
        
        Ticket []tickets = {new  BusTicket("Arun","+91 2345678976",65432,"MKCE","Banglore"),
                            new TrainTicket("Bala", "+91 6789543291",567867,"Sleeper coach")};
                            
        for(Ticket ticket : tickets){
            ticket.generateTicket();
        }
        
    }
}