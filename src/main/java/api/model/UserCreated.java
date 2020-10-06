package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class UserCreated {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("password")
    private String password;

    @JsonProperty("role")
    private String role;

    @JsonProperty("admin")
    private boolean admin;

    @JsonProperty("projectRole")
    private Map<String, String> projectRole;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Map<String, String> getProjectRole() {
        return projectRole;
    }

    public void setProjectRole(Map<String, String> projectRole) {
        this.projectRole = projectRole;
    }
}
