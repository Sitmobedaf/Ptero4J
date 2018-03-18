import com.stanjg.ptero4j.PteroAdminAPI;
import com.stanjg.ptero4j.PteroUserAPI;
import com.stanjg.ptero4j.entities.panel.admin.Server;
import com.stanjg.ptero4j.entities.panel.user.UserServer;
import com.stanjg.ptero4j.util.PteroUtils;
import util.Config;

public class Main {

    private static PteroAdminAPI api;

    public static void main(String[] args) {
        new Config();

        api = new PteroAdminAPI(Config.getBaseURL(), Config.getKey());

        for (Server server : api.getUsersController().getUser(22).getServers()) {
            PteroUtils.log(server.getName());
        }
    }

}