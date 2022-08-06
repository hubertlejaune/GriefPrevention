package com.griefprevention.visualization;

import me.ryanhamshire.GriefPrevention.Claim;
import me.ryanhamshire.GriefPrevention.util.BoundingBox;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A data holder defining an area to be visualized.
 */
public final class Boundary
{
	private final @NotNull BoundingBox bounds;
	private final @NotNull VisualizationType type;
	private final @Nullable Claim claim;
	
	public Boundary(
	        @NotNull BoundingBox bounds,
	        @NotNull VisualizationType type,
	        @Nullable Claim claim)
	{
		this.bounds = bounds;
		this.type = type;
		this.claim = claim;
	}
	
	public @NotNull BoundingBox bounds() { return bounds; }
	public @NotNull VisualizationType type() { return type; }
	
    /**
     * Construct a new {@code Boundary} for a {@link BoundingBox} with the given visualization style.
     *
     * @param bounds the {@code BoundingBox}
     * @param type the {@link VisualizationType}
     */
    public Boundary(@NotNull BoundingBox bounds, @NotNull VisualizationType type)
    {
        this(bounds, type, null);
    }

    /**
     * Construct a new {@code Boundary} for a {@link Claim} with the given visualization style.
     *
     * @param claim the {@code Claim}
     * @param type the {@link VisualizationType}
     */
    public Boundary(@NotNull Claim claim, @NotNull VisualizationType type)
    {
        this(new BoundingBox(claim), type, claim);
    }

    /**
     * Get the {@link Claim} represented by the {@code Boundary}, if any.
     *
     * @return the {@code Claim} or {@code null} if not present
     */
    public @Nullable Claim claim()
    {
        return claim;
    }

}
