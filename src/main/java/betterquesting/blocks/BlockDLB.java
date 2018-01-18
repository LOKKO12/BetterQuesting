package betterquesting.blocks;

import betterquesting.commands.BQ_CommandAdmin;
import betterquesting.commands.admin.QuestCommandDefaults;
import betterquesting.core.BetterQuesting;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCommandBlock;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockDLB
extends BlockCommandBlock {
    public BlockDLB() {
        this.setHardness(1.0f);
        this.setBlockName("betterquesting.DLB");
        this.setBlockTextureName("command_block");
        this.setCreativeTab(BetterQuesting.tabQuesting);
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            new QuestCommandDefaults().runCommand((CommandBase)new BQ_CommandAdmin(), (ICommandSender)player, new String[]{"default", "load"});
        }
        return true;
    }
}
