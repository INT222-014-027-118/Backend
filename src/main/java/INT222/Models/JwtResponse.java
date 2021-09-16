package INT222.Models;

public class JwtResponse {

    private Customers user;
    private String jwtToken;

    public JwtResponse(Customers user, String jwtToken) {
        this.user = user;
        this.jwtToken = jwtToken;
    }

    public Customers getUser() {
        return user;
    }

    public void setUser(Customers user) {
        this.user = user;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
