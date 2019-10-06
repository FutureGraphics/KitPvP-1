package repo.binarydctr.attacks;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import repo.binarydctr.attacks.activator.Activator;

/**
 * Created by Florian Hergenhahn at 2019-10-06 <br>
 *
 * @author Florian Hergenhahn
 */
public class StrengthAttack extends SpecialAttack {

    private final int duration;
    private final int amplifier;

    public StrengthAttack(Activator activator, int duration, int amplifier) {
        super(activator);
        this.duration = duration;
        this.amplifier = amplifier;
    }

    @Override
    public void activate(Activator activator, Event event) {

        if(!(event instanceof PlayerEvent))
            return;

        Player player = ((PlayerEvent) event).getPlayer();
        player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 3, 200));
        player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 3, 200));
        player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 3, 200));
    }
}