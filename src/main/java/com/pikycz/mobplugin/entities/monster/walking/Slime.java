package com.pikycz.mobplugin.entities.monster.walking;

import cn.nukkit.item.Item;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;
//import com.pikycz.mobplugin.entities.JumpingEntity;
import com.pikycz.mobplugin.entities.WalkingEntity;
import com.pikycz.mobplugin.entities.utils.Utils;

/**
 *
 * @author PikyCZ
 *
 */
public class Slime extends WalkingEntity {

    public static final int NETWORK_ID = 37;

    public Slime(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }
    
    @Override
    public float getWidth() {
        return 1.02f;
    }

    @Override
    public float getHeight() {
        return 1.02f;
    }

    @Override
    public int getNetworkId() {
        return NETWORK_ID;
    }

    @Override
    public void initEntity() {
        super.initEntity();

        this.setMaxHealth(4);
    }

    @Override
    public Item[] getDrops() {
        return new Item[]{Item.get(Item.SLIMEBALL)};
    }


    public int getKillExperience() {
        return Utils.rand(1, 4);
    }

}
