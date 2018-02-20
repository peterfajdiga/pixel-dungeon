package com.watabou.pixeldungeon;

/**
 * Created by peter on 14.2.2018.
 */

public final class Customization {

    private Customization() {}

    public static final boolean ITEM_DAMAGE_ENABLED = false;
    public static final boolean ALWAYS_NIGHT = false;  // takes precedence
    public static final boolean ALWAYS_DAY = true;
    public static final int DISMANTLE_UPGRADE_CAP = Integer.MAX_VALUE;  // default is 1
    public static final float LLOYDSBEACON_DROP_PROBABILITY = 0.333f;  // default is 0.333f
    public static final boolean LLOYDSBEACON_SHOP = true;
}
