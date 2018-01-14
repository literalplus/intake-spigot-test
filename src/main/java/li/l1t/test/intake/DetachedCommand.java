package li.l1t.test.intake;

import com.sk89q.intake.Command;
import com.sk89q.intake.parametric.annotation.Optional;
import li.l1t.common.intake.provider.annotation.Colored;
import li.l1t.common.intake.provider.annotation.ItemInHand;
import li.l1t.common.intake.provider.annotation.Merged;
import li.l1t.common.intake.provider.annotation.Sender;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;

/**
 * @author <a href="https://l1t.li/">Literallie</a>
 * @since 2018-01-14
 */
public class DetachedCommand {
    @Command(aliases = "", desc = "Detached command")
    public void executeTest(@Sender CommandSender sender, @Colored @Merged String text) {
        sender.sendMessage("You said: " + text);
    }

    @Command(aliases = "sub", desc = "sub command of a detached command")
    public void poke(@Sender CommandSender sender, @Optional @ItemInHand ItemStack itemInHand) {
        sender.sendMessage("You have " + itemInHand + " in your hand.");
    }
}
