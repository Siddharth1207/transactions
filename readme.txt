We can turn a springboot project into transactions by using @Transactional in service method and @EnableTransactionManagement in application file. With help pf these files rollover of any transaction can be achieved.

example: 

@Transactional
    public BookingAcknoledgement bookFlghtTicket(FlightBookingRequest request) {

=========================================================================

@EnableTransactionManagement
public class TransactionsApplication {

