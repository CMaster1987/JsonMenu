package cl.c_master.jsonmenu;

import org.apache.logging.log4j.*;

import net.fabricmc.api.ClientModInitializer;

public class JsonMenuClient implements ClientModInitializer {

    public static final Logger LOG = LogManager.getLogger();

    @Override
    public void onInitializeClient()
    {
        LOG.debug("JsonMenu is initializing.");
    }
    
}
