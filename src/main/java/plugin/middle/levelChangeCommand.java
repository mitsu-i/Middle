package plugin.middle;

import java.util.Random;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class levelChangeCommand implements CommandExecutor {

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (sender instanceof Player player){
      Random random = new Random();
      int intRandom = random.nextInt(100);
      player.setLevel(intRandom);
    }
    return false;
  }
}