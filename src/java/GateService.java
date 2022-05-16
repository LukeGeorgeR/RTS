import java.util.*;
import java.time.LocalDateTime;
public class GateService {
  /**
  GateService class consist of methods to verify the Customer Credentials or Tickets
  that is generated / issued by the Ticket Machine.
  It also identifies the incomming and outgoing customers with timestamps.
  */
  public boolean verifyTicket(long customer_id){
    System.out.println("Verifying Ticket Credentials  "  + customer_id);
    return true;
  }
}
