package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenCreated {
    @JsonProperty("jwt")
    private String jwt;

    @JsonProperty("expires")
    private int expires;

    @JsonProperty("username")
    private String username;

    @JsonProperty("role")
    private String[] role;

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public int getExpires() {
        return expires;
    }

    public void setExpires(int expires) {
        this.expires = expires;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String[] getRole() {
        return role;
    }

    public void setRole(String[] role) {
        this.role = role;
    }
}
