import java.util.ArrayList;

public class Dentist
{
    protected ArrayList<String[]> appointments = new ArrayList<>();
    protected String appointment = "-";

    public String getAppointments()
    {
        String output = "";
        for (int i = 0; i < appointments.size(); i++)
        {
            if (i == appointments.size() - 1)
            {
                output += appointments.get(i)[0];
                output += " ";
                output += appointments.get(i)[1];
            }
            else{
                output += appointments.get(i)[0];
                output += " ";
                output +=appointments.get(i)[1];
                output += "\r\n";
            }
        }
        return output;

    }
    public void newAppointment(String name)
    {
        String[] inner = new String[2];
        inner[0] = name;
        inner[1] = appointment;
        appointments.add(inner);
    }
    public void resign(String name)
    {
        for (int i = 0; i < appointments.size(); i++)
        {
            if (appointments.get(i)[0] == name)
            {
                appointments.remove(i);
            }
        }
    }
}
