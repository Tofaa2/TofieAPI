package me.tofaa.tofaaapi;


import org.bukkit.plugin.java.JavaPlugin;


public final class TofaaAPI extends JavaPlugin {

    private final TofaaAPI TofaaAPI;

    public TofaaAPI(TofaaAPI tofaaAPI) {
        TofaaAPI = tofaaAPI;
    }


    @Override
    public void onEnable() {


    }

    @Override
    public void onDisable() {
    }

    public me.tofaa.tofaaapi.TofaaAPI getTofaaAPI() {
        return TofaaAPI;
    }
}
