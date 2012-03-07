package com.cogito.bukkit.dev;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import org.bukkit.event.world.*;

/**
 * Handle all World related events
 */
public class DevWorldListener implements Listener {
    private final DevBukkit plugin;

    public DevWorldListener(DevBukkit instance) {
        plugin = instance;
    }

    @EventHandler
    public void onChunkLoad(ChunkLoadEvent event) {
        plugin.cancelEvent(event);
        plugin.debugMessage(event);
        plugin.godMode(event);
    }

    @EventHandler
    public void onChunkPopulate(ChunkPopulateEvent event) {
        plugin.cancelEvent(event);
        plugin.debugMessage(event);
        plugin.godMode(event);
    }

    @EventHandler
    public void onChunkUnload(ChunkUnloadEvent event) {
        plugin.cancelEvent(event);
        plugin.debugMessage(event);
        plugin.godMode(event);
    }

    @EventHandler
    public void onPortalCreate(PortalCreateEvent event) {
        plugin.cancelEvent(event);
        plugin.debugMessage(event);
        plugin.godMode(event);
    }

    @EventHandler
    public void onSpawnChange(SpawnChangeEvent event) {
        plugin.cancelEvent(event);
        plugin.debugMessage(event);
        plugin.godMode(event);
    }

    @EventHandler
    public void onWorldInit(WorldInitEvent event) {
        plugin.cancelEvent(event);
        plugin.debugMessage(event);
        plugin.godMode(event);
    }

    @EventHandler
    public void onWorldLoad(WorldLoadEvent event) {
        plugin.cancelEvent(event);
        plugin.debugMessage(event);
        plugin.godMode(event);
    }

    @EventHandler
    public void onWorldSave(WorldSaveEvent event) {
        plugin.cancelEvent(event);
        plugin.debugMessage(event);
        plugin.godMode(event);
    }

    @EventHandler
    public void onWorldUnload(WorldUnloadEvent event) {
        plugin.cancelEvent(event);
        plugin.debugMessage(event);
        plugin.godMode(event);
    }

    @EventHandler
    public void onStructureGrowEvent(StructureGrowEvent event) {
        plugin.cancelEvent(event);
        plugin.debugMessage(event);
        plugin.godMode(event);
    }
}
