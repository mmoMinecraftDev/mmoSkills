/*
 * This file is part of mmoSkills <http://github.com/mmoMinecraftDev/mmoSkills>.
 *
 * mmoSkills is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package mmo.Skills;

import mmo.Core.SkillAPI.MMOSkillEvent;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class Skills implements Listener {
	@EventHandler
	public void onMMOSkill(MMOSkillEvent event) {
		Player player = event.getPlayer();
		if (event.hasSkill("invis") && event.isRunning()) {

		}
	}
}
