package ru.arcanite.telegrambot.api.objects.sticker;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class MaskPosition implements BaseObject {

    private final String point;
    @SerializedName("x_shift")
    private final Float xShift;
    @SerializedName("y_shift")
    private final Float yShift;
    private final Float scale;

    public MaskPosition(final MaskPositionPoint point, final float xShift, final float yShift, final float scale) {
        this(point.name(), xShift, yShift, scale);
    }

    public MaskPosition(final String point, final float xShift, final float yShift, final float scale) {
        this.point = point;
        this.xShift = xShift;
        this.yShift = yShift;
        this.scale = scale;
    }
}