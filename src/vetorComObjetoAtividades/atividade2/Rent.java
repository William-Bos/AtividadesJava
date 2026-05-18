package vetorComObjetoAtividades.atividade2;

public class Rent {
    private String name;
    private String email;

    public Rent(String name, String email){

    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return name + "," + email + "]";
    }
}
