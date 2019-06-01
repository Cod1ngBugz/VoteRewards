package com.GeorgeV22.VoteRewards.Title.Versions;

import net.minecraft.server.v1_9_R2.PacketPlayOutTitle;
import org.bukkit.craftbukkit.v1_9_R2.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_9_R2.util.CraftChatMessage;
import org.bukkit.entity.Player;

import com.GeorgeV22.VoteRewards.Title.Title;

public class Title_v1_9_R2 implements Title {

	@Override
	public void sendTitle(Player player, String string, String string2, int n, int n2, int n3) {
		PacketPlayOutTitle packetPlayOutTitle;
		if (string != null) {
			packetPlayOutTitle = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE,
					CraftChatMessage.fromString(string)[0]);
			((CraftPlayer) player).getHandle().playerConnection.sendPacket(packetPlayOutTitle);
		}
		if (string2 != null) {
			packetPlayOutTitle = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.SUBTITLE,
					CraftChatMessage.fromString(string2)[0]);
			((CraftPlayer) player).getHandle().playerConnection.sendPacket(packetPlayOutTitle);
		}
		packetPlayOutTitle = new PacketPlayOutTitle(n, n2, n3);
		((CraftPlayer) player).getHandle().playerConnection.sendPacket(packetPlayOutTitle);
	}
}