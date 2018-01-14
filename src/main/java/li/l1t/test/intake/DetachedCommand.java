package li.l1t.test.intake;

import com.sk89q.intake.Command;
import com.sk89q.intake.parametric.annotation.Optional;
import li.l1t.common.intake.provider.annotation.Merged;
import li.l1t.common.intake.provider.annotation.Sender;
import org.bukkit.command.CommandSender;

/**
 * @author <a href="https://l1t.li/">Literallie</a>
 * @since 2018-01-14
 */
public class DetachedCommand {
    @Command(aliases = "", desc = "Detached command")
    public void executeTest(@Sender CommandSender sender, @Optional @Merged String text) {
        sender.sendMessage("You said: " + text);
    }
}
