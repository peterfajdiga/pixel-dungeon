package com.watabou.pixeldungeon.items.armor.glyphs;

import com.watabou.pixeldungeon.Dungeon;
import com.watabou.pixeldungeon.actors.Char;
import com.watabou.pixeldungeon.actors.hero.Hero;
import com.watabou.pixeldungeon.effects.Flare;
import com.watabou.pixeldungeon.items.armor.Armor;
import com.watabou.pixeldungeon.sprites.ItemSprite;
import com.watabou.utils.Random;

/**
 * Created by peter on 15.2.2018.
 */

public class GoldAbsorption extends Armor.Glyph {

    private static final String TXT_GOLD_ABSORPTION = "%s of gold absorption";

    private static ItemSprite.Glowing GRAY = new ItemSprite.Glowing( 0xCC8888 );

    private static final float UPGRADE_PROBABILITY = 0.03f;

    @Override
    public int proc(Armor armor, Char attacker, Char defender, int damage) {
        if (defender instanceof Hero && Dungeon.gold >= armor.tier) {
            Dungeon.gold -= armor.tier;
            if (Random.Float() < UPGRADE_PROBABILITY) {
                armor.upgrade();
                new Flare( 8, 32 ).color( 0x66FF66, true ).show( defender.sprite, 2f );
            }
        }
        return damage;
    }

    @Override
    public String name( String weaponName) {
        return String.format( TXT_GOLD_ABSORPTION, weaponName );
    }

    @Override
    public ItemSprite.Glowing glowing() {
        return GRAY;
    }
}
