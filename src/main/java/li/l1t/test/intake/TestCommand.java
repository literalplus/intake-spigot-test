package li.l1t.test.intake;

import com.sk89q.intake.Command;
import com.sk89q.intake.parametric.annotation.Optional;
import li.l1t.common.intake.provider.annotation.Merged;
import li.l1t.common.intake.provider.annotation.OnlineSender;
import li.l1t.common.intake.provider.annotation.Sender;
import org.bukkit.command.CommandSender;

/**
 * @author <a href="https://l1t.li/">Literallie</a>
 * @since 2018-01-14
 */
public class TestCommand {
    @Command(aliases = "", desc = "Default command")
    public void root(@Sender CommandSender sender, @Optional @Merged String text) {
        sender.sendMessage("You called the default command with " + text);
    }

    @Command(aliases = "poke", desc = "pokes somebody")
    public void poke(@Sender CommandSender sender, @OnlineSender CommandSender target) {
        sender.sendMessage("You poked "+target.getName());
        target.sendMessage("You were poked by "+sender.getName());
    }
}
