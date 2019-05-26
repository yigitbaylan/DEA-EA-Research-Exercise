package hello.Service.DTO.Login;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Authorization implements Serializable {
	private String token;
	private String user;

	@JsonCreator
	public Authorization(final @JsonProperty("token") String token, final @JsonProperty("user") String user) {
		this.token = token;
		this.user = user;
	}

    public String getToken() {
        return token;
    }

    public String getUser() {
        return user;
    }
}
