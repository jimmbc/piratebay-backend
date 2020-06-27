package bo.edu.ucb.sis.piratebay.model;

public class ClientModel {
    private Integer clientId;
    private String first_name;
    private String second_name;
    private String first_surname;
    private String second_surname;
    private String address;

    public ClientModel() {
    }

    public ClientModel(Integer clientId, String first_name, String second_name, String first_surname, String second_surname, String address) {
        this.clientId = clientId;
        this.first_name = first_name;
        this.second_name = second_name;
        this.first_surname = first_surname;
        this.second_surname = second_surname;
        this.address = address;
    }
    @Override
    public String toString() {
        return "ClientModel{" +
                "clientId=" + clientId +
                ", first_name='" + first_name + '\'' +
                ", second_name='" + second_name + '\'' +
                ", first_surname='" + first_surname + '\'' +
                ", second_surname='" + second_surname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getFirst_surname() {
        return first_surname;
    }

    public void setFirst_surname(String first_surname) {
        this.first_surname = first_surname;
    }

    public String getSecond_surname() {
        return second_surname;
    }

    public void setSecond_surname(String second_surname) {
        this.second_surname = second_surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
