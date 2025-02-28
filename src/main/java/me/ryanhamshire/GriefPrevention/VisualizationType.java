/*
    GriefPrevention Server Plugin for Minecraft
    Copyright (C) 2012 Ryan Hamshire

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package me.ryanhamshire.GriefPrevention;

import org.bukkit.block.data.BlockData;

/**
 * @deprecated {@link com.griefprevention.visualization.VisualizationType}
 */
@Deprecated(forRemoval = true, since = "16.18")
public enum VisualizationType
{
    Claim,
    Subdivision,
    ErrorClaim,
    RestoreNature,
    AdminClaim;

    @Deprecated(forRemoval = true, since = "16.18")
    com.griefprevention.visualization.VisualizationType convert()
    {
        switch (this)
        {
            case Claim: return com.griefprevention.visualization.VisualizationType.CLAIM;
            case Subdivision: return com.griefprevention.visualization.VisualizationType.SUBDIVISION;
            case ErrorClaim: return com.griefprevention.visualization.VisualizationType.CONFLICT_ZONE;
            case RestoreNature: return com.griefprevention.visualization.VisualizationType.NATURE_RESTORATION_ZONE;
            case AdminClaim: return com.griefprevention.visualization.VisualizationType.ADMIN_CLAIM;
            default: return null;
        }
    }

    @Deprecated(forRemoval = true, since = "16.18")
    static com.griefprevention.visualization.VisualizationType ofBlockData(BlockData accent) {
        switch (accent.getMaterial()) {
            case WHITE_WOOL: return com.griefprevention.visualization.VisualizationType.SUBDIVISION;
            case NETHERRACK: return com.griefprevention.visualization.VisualizationType.CONFLICT_ZONE;
            case DIAMOND_BLOCK: return com.griefprevention.visualization.VisualizationType.NATURE_RESTORATION_ZONE;
            case PUMPKIN: return com.griefprevention.visualization.VisualizationType.ADMIN_CLAIM;
            default: return com.griefprevention.visualization.VisualizationType.CLAIM;
        }
    }

}
