import java.time.LocalDateTime;
public class Test extends GateService{
  public static void main(String[] args) {
    System.out.println("Railway Ticketing System");
    GateService gate = new GateService();
    System.out.println(gate.verifyTicket(12354656));
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);
  }
}
