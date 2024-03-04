package org.bukkit.craftbukkit.block.impl;

import io.papermc.paper.generated.GeneratedFrom;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.bukkit.block.data.type.SculkVein;
import org.bukkit.craftbukkit.block.data.CraftBlockData;

@GeneratedFrom("1.20.4")
@SuppressWarnings("unused")
public class CraftSculkVein extends CraftBlockData implements SculkVein {
    private static final BooleanProperty DOWN = BlockStateProperties.DOWN;

    private static final BooleanProperty EAST = BlockStateProperties.EAST;

    private static final BooleanProperty NORTH = BlockStateProperties.NORTH;

    private static final BooleanProperty SOUTH = BlockStateProperties.SOUTH;

    private static final BooleanProperty UP = BlockStateProperties.UP;

    private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    private static final BooleanProperty WEST = BlockStateProperties.WEST;

    public CraftSculkVein(BlockState state) {
        super(state);
    }

    public boolean getDown() {
        return this.get(DOWN);
    }

    public void setDown(final boolean down) {
        this.set(DOWN, down);
    }

    public boolean getEast() {
        return this.get(EAST);
    }

    public void setEast(final boolean east) {
        this.set(EAST, east);
    }

    public boolean getNorth() {
        return this.get(NORTH);
    }

    public void setNorth(final boolean north) {
        this.set(NORTH, north);
    }

    public boolean getSouth() {
        return this.get(SOUTH);
    }

    public void setSouth(final boolean south) {
        this.set(SOUTH, south);
    }

    public boolean isUp() {
        return this.get(UP);
    }

    public void setUp(final boolean up) {
        this.set(UP, up);
    }

    @Override
    public boolean isWaterlogged() {
        return this.get(WATERLOGGED);
    }

    @Override
    public void setWaterlogged(final boolean waterlogged) {
        this.set(WATERLOGGED, waterlogged);
    }

    public boolean getWest() {
        return this.get(WEST);
    }

    public void setWest(final boolean west) {
        this.set(WEST, west);
    }
}