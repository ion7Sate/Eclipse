import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class User {
    private String firstname;
    private String lastname;
    private int age;
    private String email;
    private Status status;
    private String timestamp;

    public User(String firstname, String lastname, int age, String email, Status status, String timestamp) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public Status getStatus() {
        return status;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "User{ " +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
    public int calculateDiferencesofDays(){

        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        String registerTime = getTimestamp();
        String curentDate = new SimpleDateFormat("dd MM yyyy").format(Calendar.getInstance().getTime());;
        int days=0;

        try {
            Date date1 = myFormat.parse(registerTime);
            Date date2 = myFormat.parse(curentDate);
            long diff = date2.getTime() - date1.getTime();
            days = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return days;

    }

         public void changeStatus(){
           if(calculateDiferencesofDays()> 1) {
           setStatus(Status.Active);
     }
        if(calculateDiferencesofDays()>=30){

           setStatus(Status.Blocked); }

       }

}

