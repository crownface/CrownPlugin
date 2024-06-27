package me.crownface.crownplugin;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 *
 * It uses Foundation for fast and efficient development process.
 */
public final class CrownPlugin extends SimplePlugin {

	int apple = 5;

	/**
	* Automatically perform login ONCE when the plugin starts.
	*/
	@Override
	protected void onPluginStart() {

		String hello = "Hello hi" +
				" hellooooo";

		boolean isAlive = true;

		isAlive = false;

		// Hello this is a test
		System.out.println(1);
		System.out.println("Skittles");
		System.out.println("Skittles " + (2+2) + " Skittles");
		System.out.println("Skittles");

	}

	/*
	 * Test
	 * Test
	 */

	/**
	 * Automatically perform login when the plugin starts and each time it is reloaded.
	 */
	@Override
	protected void onReloadablesStart() {

		// You can check for necessary plugins and disable loading if they are missing
		//Valid.checkBoolean(HookManager.isVaultLoaded(), "You need to install Vault so that we can work with packets, offline player data, prefixes and groups.");

		// Uncomment to load variables
		// Variable.loadVariables();

		//
		// Add your own plugin parts to load automatically here
		// Please see @AutoRegister for parts you do not have to register manually
		//
	}

	@Override
	protected void onPluginPreReload() {

		// Close your database here if you use one
		//YourDatabase.getInstance().close();
	}

	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	/**
	 * An example event that checks if the right clicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param event the click entity method
	 */
	@EventHandler
	public void onRightClick(final PlayerInteractEntityEvent event) {

		int apple = 5;

		if (event.getRightClicked().getType() == EntityType.ARMADILLO)
			event.getRightClicked().setFireTicks(20);

		if (event.getRightClicked().getType() == EntityType.ARMADILLO)
			event.getRightClicked().setGlowing(true);

		if (event.getRightClicked().getType() == EntityType.WARDEN)
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 50);
	}

	/* ------------------------------------------------------------------------------- */
	/* Static */
	/* ------------------------------------------------------------------------------- */

	/**
	 * Return the instance of this plugin, which simply refers to a static
	 * field already created for you in SimplePlugin but casts it to your
	 * specific plugin instance for your convenience.
	 *
	 * @return
	 */
	public static CrownPlugin getInstance() {
		return (CrownPlugin) SimplePlugin.getInstance();
	}
}

