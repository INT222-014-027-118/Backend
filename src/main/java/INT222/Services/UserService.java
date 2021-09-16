//package INT222.Services;
//
//import INT222.Models.Role;
//import INT222.Models.User;
//import INT222.Repositories.RoleRepository;
//import INT222.Repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private RoleRepository roleRepository;
//
//
//    private PasswordEncoder passwordEncoder;
//
//    public User registerNewUser(User user) {
//        Role role = roleRepository.findById("User").get();
//        Set<Role> userRoles = new HashSet<>();
//        userRoles.add(role);
//        user.setRole((Role) userRoles);
//        user.setUserPassword(getEncodedPassword(user.getUserPassword()));
//
//        return userRepository.save(user);
//    }
//    public String getEncodedPassword(String password) {
//        return passwordEncoder.encode(password);
//    }
//}
