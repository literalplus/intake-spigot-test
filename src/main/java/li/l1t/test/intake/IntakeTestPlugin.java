package li.l1t.test.intake;

import li.l1t.common.intake.CommandsManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Locale;

/**
 * @author <a href="https://l1t.li/">Literallie</a>
 * @since 2018-01-14
 */
public class IntakeTestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();
    }

    //best time to call this is on enable
    private void registerCommands() {
        CommandsManager commandsManager = new CommandsManager(this);
        commandsManager.setLocale(Locale.ENGLISH);
        registerInjections();
        commandsManager.getBuilderFor("test")
                .withAliases("ptest")
                .withDispatcherFor(new TestCommand())
                .withSubHandler(new DetachedCommand(), "detached")
                .create()
                .register();
    }

    private void registerInjections() {
        // this space intentionally left blank
    }
}
