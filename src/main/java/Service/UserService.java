package Service;
import com.example.model.User;

public class UserService {
    public boolean isAdmin(User user) {
        return "Admin".equalsIgnoreCase(user.getRole());
    }}