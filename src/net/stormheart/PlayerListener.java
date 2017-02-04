/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.Server
 *  org.bukkit.block.Block
 *  org.bukkit.block.BlockFace
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerMoveEvent
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.PlayerInventory
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.PluginManager
 *  org.bukkit.potion.PotionEffect
 *  org.bukkit.potion.PotionEffectType
 *  org.bukkit.util.Vector
 */
package net.stormheart;

import net.stormheart.drown;
import java.util.Random;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class PlayerListener
implements Listener {
    public PlayerListener(drown plugin) {
        plugin.getServer().getPluginManager().registerEvents((Listener)this, (Plugin)plugin);
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        if (event.getPlayer() instanceof Player) {
            Player p = event.getPlayer();
            if (p.getLocation().getBlock().getRelative(BlockFace.SELF).getType() == Material.STATIONARY_WATER) {
                Vector v;
                float jumpForce;
                Vector v1;
                if (p.getInventory().contains(Material.IRON_BOOTS)) {
                    jumpForce = -0.1f;
                    v1 = new Vector(0.0f, jumpForce, 0.0f);
                    v = p.getVelocity().add(v1);
                    p.setVelocity(v);
                }
                if (p.getInventory().contains(Material.IRON_CHESTPLATE)) {
                    jumpForce = -0.1f;
                    v1 = new Vector(0.0f, jumpForce, 0.0f);
                    v = p.getVelocity().add(v1);
                    p.setVelocity(v);
                }
                if (p.getInventory().contains(Material.IRON_LEGGINGS)) {
                    jumpForce = -0.1f;
                    v1 = new Vector(0.0f, jumpForce, 0.0f);
                    v = p.getVelocity().add(v1);
                    p.setVelocity(v);
                }
                if (p.getInventory().contains(Material.LEATHER_CHESTPLATE) && p.getInventory().getLeggings().getType().equals((Object)Material.LEATHER_LEGGINGS)) {
                    jumpForce = -0.1f;
                    v1 = new Vector(0.0f, jumpForce, 0.0f);
                    v = p.getVelocity().add(v1);
                    p.setVelocity(v);
                }
                if (p.getInventory().contains(Material.CHAINMAIL_CHESTPLATE)) {
                    jumpForce = -0.1f;
                    v1 = new Vector(0.0f, jumpForce, 0.0f);
                    v = p.getVelocity().add(v1);
                    p.setVelocity(v);
                }
                if (p.getInventory().contains(Material.CHAINMAIL_LEGGINGS)) {
                    jumpForce = -0.1f;
                    v1 = new Vector(0.0f, jumpForce, 0.0f);
                    v = p.getVelocity().add(v1);
                    p.setVelocity(v);
                }
                if (p.getInventory().contains(Material.CHAINMAIL_BOOTS)) {
                    jumpForce = -0.1f;
                    v1 = new Vector(0.0f, jumpForce, 0.0f);
                    v = p.getVelocity().add(v1);
                    p.setVelocity(v);
                }
                if (p.getInventory().getChestplate().getType().equals((Object)Material.IRON_CHESTPLATE)) {
                    jumpForce = -0.1f;
                    v1 = new Vector(0.0f, jumpForce, 0.0f);
                    v = p.getVelocity().add(v1);
                    p.setVelocity(v);
                }
                if (p.getInventory().contains(Material.LEATHER_CHESTPLATE) && p.getInventory().getLeggings().getType().equals((Object)Material.LEATHER_LEGGINGS)) {
                    jumpForce = -0.1f;
                    v1 = new Vector(0.0f, jumpForce, 0.0f);
                    v = p.getVelocity().add(v1);
                    p.setVelocity(v);
                }
                if (p.getInventory().getChestplate().getType().equals((Object)Material.LEATHER_CHESTPLATE)) {
                    jumpForce = -0.1f;
                    v1 = new Vector(0.0f, jumpForce, 0.0f);
                    v = p.getVelocity().add(v1);
                    p.setVelocity(v);
                }
                if (p.getInventory().getLeggings().getType().equals((Object)Material.IRON_LEGGINGS)) {
                    jumpForce = -0.1f;
                    v1 = new Vector(0.0f, jumpForce, 0.0f);
                    v = p.getVelocity().add(v1);
                    p.setVelocity(v);
                }
                if (p.getInventory().getLeggings().getType().equals((Object)Material.CHAINMAIL_LEGGINGS)) {
                    jumpForce = -0.1f;
                    v1 = new Vector(0.0f, jumpForce, 0.0f);
                    v = p.getVelocity().add(v1);
                    p.setVelocity(v);
                }
            }
            if (!p.isOp()) {
                if (p.getInventory().contains(Material.COBBLESTONE, 64)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 4));
                    Random random = new Random();
                    int Chance = random.nextInt(400);
                    if (Chance >= 390) {
                        p.sendMessage("You are carrying too many blocks.");
                    }
                }
                if (p.getInventory().contains(Material.COBBLESTONE, 128)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 5));
                }
                if (p.getInventory().contains(Material.COBBLESTONE, 64)) {
                    // empty if block
                }
                if (p.getInventory().contains(Material.STONE, 64)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 4));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 4));
                    Random random = new Random();
                    int Chance = random.nextInt(400);
                    if (Chance >= 390) {
                        p.sendMessage("You are carrying too many blocks.");
                    }
                }
                if (p.getInventory().contains(Material.STONE, 128)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 5));
                }
                if (p.getInventory().contains(Material.STONE, 64)) {
                    // empty if block
                }
                if (p.getInventory().contains(Material.SMOOTH_BRICK, 64)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 4));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 4));
                    Random random = new Random();
                    int Chance = random.nextInt(400);
                    if (Chance >= 390) {
                        p.sendMessage("You are carrying too many blocks.");
                    }
                }
                if (p.getInventory().contains(Material.SMOOTH_BRICK, 128)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 5));
                }
                if (p.getInventory().contains(Material.SMOOTH_BRICK, 64)) {
                    // empty if block
                }
                if (p.getInventory().contains(Material.SANDSTONE, 64)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 4));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 4));
                    Random random = new Random();
                    int Chance = random.nextInt(400);
                    if (Chance >= 390) {
                        p.sendMessage("You are carrying too many blocks.");
                    }
                }
                if (p.getInventory().contains(Material.SANDSTONE, 128)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 5));
                }
                if (p.getInventory().contains(Material.SANDSTONE, 64)) {
                    // empty if block
                }
                if (p.getInventory().contains(Material.END_BRICKS, 64)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 4));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 4));
                    Random random = new Random();
                    int Chance = random.nextInt(400);
                    if (Chance >= 390) {
                        p.sendMessage("You are carrying too many blocks.");
                    }
                }
                if (p.getInventory().contains(Material.END_BRICKS, 128)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 5));
                }
                if (p.getInventory().contains(Material.END_BRICKS, 64)) {
                    // empty if block
                }
                if (p.getInventory().contains(Material.WOOD, 128)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 4));
                }
                if (p.getInventory().contains(Material.WOOD, 64)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 5));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 4));
                    Random random = new Random();
                    int Chance = random.nextInt(400);
                    if (Chance >= 390) {
                        p.sendMessage("You are carrying too many blocks.");
                    }
                }
                if (p.getInventory().contains(Material.WOOD, 96)) {
                    // empty if block
                }
                if (p.getInventory().contains(Material.LOG, 64)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 4));
                }
                if (p.getInventory().contains(Material.LOG, 128)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 5));
                }
                if (p.getInventory().contains(Material.LOG, 64)) {
                    // empty if block
                }
                if (p.getInventory().contains(Material.DIRT, 64)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 4));
                }
                if (p.getInventory().contains(Material.DIRT, 128)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 5));
                }
                if (p.getInventory().contains(Material.DIRT, 64)) {
                    // empty if block
                }
                if (p.getInventory().contains(Material.GRAVEL, 64)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 4));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 4));
                    Random random = new Random();
                    int Chance = random.nextInt(400);
                    if (Chance >= 390) {
                        p.sendMessage("You are carrying too many blocks.");
                    }
                }
                if (p.getInventory().contains(Material.GRAVEL, 128)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 5));
                }
                if (p.getInventory().contains(Material.GRAVEL, 64)) {
                    // empty if block
                }
                if (p.getInventory().contains(Material.SAND, 64)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 4));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 4));
                    Random random = new Random();
                    int Chance = random.nextInt(400);
                    if (Chance >= 390) {
                        p.sendMessage("You are carrying too many blocks.");
                    }
                }
                if (p.getInventory().contains(Material.SAND, 128)) {
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 90, 5));
                }
                if (p.getInventory().contains(Material.SAND, 64)) {
                    // empty if block
                }
            }
        }
    }
}

