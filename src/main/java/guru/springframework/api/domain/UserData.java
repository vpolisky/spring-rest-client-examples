package guru.springframework.api.domain;

import java.util.List;
import java.util.Objects;

public class UserData {

    List<User> data;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserData)) return false;
        UserData userData = (UserData) o;
        return Objects.equals(getData(), userData.getData());
    }

    @Override
    public String toString() {
        return "UserData{" +
                "data=" + data +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getData());
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
