package User;
import java.util.*;
import java.util.stream.Collectors;


public  class UserApi {
    private static List<User> listUser = new ArrayList<User>();

    public static List<User> getListUser() {
        return listUser;
    }

    public static void setListUser(List<User> listUser) {
        listUser = listUser;
    }

    public static User findByName(String name) throws ClassNotFoundException{
        Optional<User> user2 = listUser.stream().filter(user -> name.equals(user.getNom())).findFirst();
        if(user2.isPresent()) {
            return user2.get();
        }
        throw new ClassNotFoundException("not found");
    }

    public static void addUser(User user) {
        listUser.add(user);
    }
}
